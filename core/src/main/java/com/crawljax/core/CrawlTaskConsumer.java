package com.crawljax.core;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crawljax.core.state.StateFlowGraph;
import com.crawljax.core.state.StateVertex;
import com.google.inject.Inject;

/**
 * Consumes {@link StateVertex}s it gets from the {@link UnfiredCandidateActions}. It delegates the actual
 * browser interactions to a {@link Crawler} whom it has a 1 to 1 relation with.
 */
public class CrawlTaskConsumer implements Callable<Void> {

	private static final Logger LOG = LoggerFactory.getLogger(CrawlTaskConsumer.class);

	private final AtomicInteger runningConsumers;

	private final Crawler crawler;

	private final UnfiredCandidateActions candidates;

	private final ExitNotifier exitNotifier;

	private ArrayList<Integer> manualTestStateIDs = new ArrayList<Integer>(); 

	//Amin: One should only be true
	private boolean alternativePathStrategy = false;  // highest priority to manual-test staes
	private boolean randomStrategy = true; // this is for RND method
	private boolean codeCoverageStrategy = false;
	

	@Inject
	CrawlTaskConsumer(UnfiredCandidateActions candidates,
			ExitNotifier exitNotifier, Crawler crawler) {
		this.candidates = candidates;
		this.exitNotifier = exitNotifier;
		this.crawler = crawler;
		this.runningConsumers = new AtomicInteger(0);

	}

	@Override
	public Void call() {
		try {
			//Amin: Getting list of manual-test states
			StateFlowGraph sfg = crawler.getContext().getSession().getStateFlowGraph();
			for (StateVertex s: sfg.getAllStates())
				manualTestStateIDs.add(s.getId());

			System.out.println(manualTestStateIDs);

			while (!Thread.interrupted()) {
				if (runningConsumers.get() == 0 && candidates.isEmpty()) {
					LOG.debug("No consumers active and the cache is empty. Crawl is done. Shutting down...");
					exitNotifier.signalCrawlExhausted();
					break;
				}
				pollAndHandleCrawlTasks();
				runningConsumers.decrementAndGet();
			}
			crawler.close();
		} catch (InterruptedException e) {
			LOG.debug("Consumer interrupted");
			crawler.close();
		} catch (RuntimeException e) {
			LOG.error("Unexpected error " + e.getMessage(), e);
			throw e;
		}
		return null;
	}

	private void pollAndHandleCrawlTasks() throws InterruptedException {
		try {
			LOG.debug("Awaiting task");

			StateVertex crawlTask = null;

			boolean useFeedEx = true;
			// Amin: selecting the next state to be expanded
			if (!useFeedEx)
				//original version
				crawlTask = candidates.awaitNewTask();
			else {
				int stateId = getNextStateIdToCrawl();
				crawlTask = candidates.awaitSelectedNewTask(stateId);
			}

			System.out.println("crawlTask: " + crawlTask);

			int activeConsumers = runningConsumers.incrementAndGet();
			LOG.debug("There are {} active consumers", activeConsumers);
			handleTask(crawlTask);
		} catch (RuntimeException e) {
			LOG.error("Cound not complete state crawl: " + e.getMessage(), e);
		}
	}

	// Amin: Implementing Feedex
	private int getNextStateIdToCrawl() {
		int numberOfStatesWithCandidates = candidates.getNumberOfStatesWithCandidates();
		LOG.info("There are {} states with unfired actions", numberOfStatesWithCandidates);
		int selectedStateId = 0;



		if (randomStrategy){
			Random randomGenerator = new Random();
			selectedStateId = candidates.getStatesWithCandidates().get(randomGenerator.nextInt(numberOfStatesWithCandidates));		
		}else if (codeCoverageStrategy){
			// using js statement coverage impact to choose next to explore
			StateFlowGraph sfg = crawler.getContext().getSession().getStateFlowGraph();

			if (numberOfStatesWithCandidates==0)
				return -1;

			double coverageIncrease, winnerCoverageIncrease = -100.0;

			for (int i=0; i < numberOfStatesWithCandidates; i++){
				coverageIncrease = sfg.getCoverageIncrease(sfg.getById(candidates.getStatesWithCandidates().get(i)));

				if (coverageIncrease >= winnerCoverageIncrease){
					winnerCoverageIncrease = coverageIncrease;
					selectedStateId = candidates.getStatesWithCandidates().get(i);
				}
			}
			LOG.info("The winner state is state " +  selectedStateId + " with coverageIncrease "  + winnerCoverageIncrease);
		}else if (alternativePathStrategy){
			// consider manual-test states first
			StateFlowGraph sfg = crawler.getContext().getSession().getStateFlowGraph();

			if (numberOfStatesWithCandidates==0)
				return -1;

			// refine the manualTestStateIDs if a state is fully expanded
			for (int i=0; i<manualTestStateIDs.size(); i++)
				if (!candidates.getStatesWithCandidates().contains(manualTestStateIDs.get(i))){
					LOG.info("State with id " + manualTestStateIDs.get(i) + " among manual-test states is now fully expanded!");
					manualTestStateIDs.remove(i);
					break;
				}

			// if we still have manual-test states, randomly select among them
			if (manualTestStateIDs.size()!=0){
				do{
					Random randomGenerator = new Random();
					selectedStateId = manualTestStateIDs.get(randomGenerator.nextInt(manualTestStateIDs.size()));
				}while (!candidates.getStatesWithCandidates().contains(selectedStateId));
				for (int id: manualTestStateIDs)
					if (!candidates.getStatesWithCandidates().contains(selectedStateId)){
						selectedStateId = id;
						LOG.info("State with id " + selectedStateId + " among manual-test states was selected as the nextStateToCrawl");
						return selectedStateId;
					}
			}else{
				// if all manual-test states were considered, randomly among candidates
				Random randomGenerator = new Random();
				selectedStateId = candidates.getStatesWithCandidates().get(randomGenerator.nextInt(numberOfStatesWithCandidates));		
				LOG.info("Satet with id " + selectedStateId + " was randomly selected as the nextStateToCrawl");
			}
		}


		LOG.info("Satet with id " + selectedStateId + " was selected as the nextStateToCrawl");

		return selectedStateId;
	}

	private void handleTask(StateVertex state) {
		LOG.debug("Going to handle tasks in {}", state);
		crawler.execute(state);
		LOG.debug("Task executed. Returning to queue polling");
	}

	/**
	 * This method calls the index state. It should be called once in order to setup the crawl.
	 * 
	 * @return The initial state.
	 */
	public StateVertex crawlIndex() {
		return crawler.crawlIndex();
	}

	public CrawlerContext getContext() {
		return crawler.getContext();
	}


	/**
	 * Amin: Getting the crawler
	 * 
	 * @return The crawler.
	 */
	public Crawler getCrawler() {
		return crawler;
	}

}
