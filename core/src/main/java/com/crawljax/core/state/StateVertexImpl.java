package com.crawljax.core.state;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.w3c.dom.Document;

import com.crawljax.util.AssertedElementPattern;
import com.crawljax.util.DomUtils;
import com.crawljax.util.ElementFeatures;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;

/**
 * The state vertex class which represents a state in the browser. When iterating over the possible
 * candidate elements every time a candidate is returned its removed from the list so it is a one
 * time only access to the candidates.
 */
class StateVertexImpl implements StateVertex {

	private static final long serialVersionUID = 123400017983488L;

	private final Collection<Eventable> foundEventables;
	private int id;
	private final String dom;
	private final String strippedDom;
	private final String url;
	private String name;
	
	//Amin: Assertions on DOM state
	private ArrayList<AssertedElementPattern> assertedElementPatterns = new ArrayList<AssertedElementPattern>();
	private HashSet<ElementFeatures> elementFeatures = new HashSet<ElementFeatures>();

	private HashSet<String> elementTagAttAssertions = new HashSet<String>();
	public HashSet<String> getElementTagAttAssertions() {
		return elementTagAttAssertions;
	}

	private HashSet<String> patternTagAssertions = new HashSet<String>();
	public HashSet<String> getPatternTagAssertions() {
		return patternTagAssertions;
	}

	private HashSet<String> patternFullAssertions = new HashSet<String>();
	public HashSet<String> getPatternFullAssertions() {
		return patternFullAssertions;
	}

	/**
	 * Creates a current state without an url and the stripped dom equals the dom.
	 * 
	 * @param name
	 *            the name of the state
	 * @param dom
	 *            the current DOM tree of the browser
	 */
	@VisibleForTesting
	StateVertexImpl(int id, String name, String dom) {
		this(id, null, name, dom, dom);
	}

	/**
	 * Defines a State.
	 * 
	 * @param url
	 *            the current url of the state
	 * @param name
	 *            the name of the state
	 * @param dom
	 *            the current DOM tree of the browser
	 * @param strippedDom
	 *            the stripped dom by the OracleComparators
	 */
	public StateVertexImpl(int indexId, String url, String name, String dom, String strippedDom) {
		this.id = indexId;
		this.url = url;
		this.name = name;
		this.dom = dom;
		this.strippedDom = strippedDom;
		foundEventables = Queues.newConcurrentLinkedQueue();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDom() {
		return dom;
	}

	@Override
	public String getStrippedDom() {
		return strippedDom;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(strippedDom);
		
		// Amin: Previously For Testex
		//return Objects.hashCode(dom);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof StateVertex) {
			StateVertex that = (StateVertex) object;
			return Objects.equal(this.strippedDom, that.getStrippedDom());

			// Amin: Previously For Testex
			//return Objects.equal(this.dom, that.getDom());
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
		        .add("id", id)
		        .add("name", name)
		        .toString();
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public Document getDocument() throws IOException {
		return DomUtils.asDocument(this.dom);
	}

	/**
	 * @param eventable
	 *            The eventable that was clicked in this state.
	 */
	public void registerEventable(Eventable eventable) {
		foundEventables.add(eventable);
	}

	@Override
	public ImmutableList<Eventable> getUsedEventables() {
		return ImmutableList.copyOf(this.foundEventables);
	}

	@Override
	//Amin: adding assertion on DOM state
	public boolean addAssertedElementPattern(AssertedElementPattern aep) {
		if(aep==null){
			//System.out.println("Assertion is not usefull to be added to state " + this.name);
			return false;
		}
		if(getAssertions().contains(aep.getAssertion())){
			//System.out.println("Assertion already exists in state " + this.name);
			return false;
		}
		//System.out.println("Assertion " + aep.getAssertion() + " is added to state " + this.name);
		assertedElementPatterns.add(aep);
		return true;
	}

	@Override
	public ArrayList<AssertedElementPattern> getAssertedElementPatters() {
		return assertedElementPatterns;
	}
	
	@Override
	//Amin
	public ArrayList<String> getAssertions() {
		ArrayList<String> assertions = new ArrayList<String>();
		for (AssertedElementPattern aep: assertedElementPatterns)
			assertions.add(aep.getAssertion());
		return assertions;
	}

	@Override
	//Amin
	public void addElementFeatures(ElementFeatures ef) {
		if(ef==null){
			System.out.println("ElementFeatures is null!!");
			return;
		}
		elementFeatures.add(ef);
	}
	
	@Override
	//Amin
	public HashSet<ElementFeatures> getElementFeatures() {
		return elementFeatures;
	}

	@Override
	public void addElementTagAttAssertion(String assertion) {
		elementTagAttAssertions.add(assertion);
	}

	@Override
	public void addPatternTagAssertion(String assertion) {
		patternTagAssertions.add(assertion);
	}

	@Override
	public void addPatternFullAssertion(String assertion) {
		patternFullAssertions.add(assertion);
	}

	@Override
	public void clearElementTagAttAssertions() {
		elementTagAttAssertions.clear();
	}

	@Override
	public void clearPatternTagAssertions() {
		patternTagAssertions.clear();
	}

	@Override
	public void clearPatternFullAssertions() {
		patternFullAssertions.clear();
	}
		
}
