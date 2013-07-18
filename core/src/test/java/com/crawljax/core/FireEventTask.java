package com.crawljax.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crawljax.browser.EmbeddedBrowser;
import com.crawljax.condition.browserwaiter.WaitConditionChecker;
import com.crawljax.core.configuration.CrawlRules;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.state.Element;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.Eventable.EventType;
import com.crawljax.core.state.Identification;
import com.crawljax.util.ElementResolver;
import com.crawljax.util.UrlUtils;
import com.google.inject.assistedinject.Assisted;

public class FireEventTask implements Callable<Boolean> {

	private static final Logger LOG = LoggerFactory.getLogger(FireEventTask.class);

	private final Eventable eventable;
	private final EmbeddedBrowser browser;
	private final CrawlRules crawlRules;
	private final WaitConditionChecker waitConditionChecker;

	@Inject
	public FireEventTask(CrawljaxConfiguration config,
	        WaitConditionChecker waitConditionChecker,
	        @Assisted Eventable eventable,
	        @Assisted EmbeddedBrowser browser) {
		this.waitConditionChecker = waitConditionChecker;
		this.eventable = eventable;
		this.browser = browser;
		this.crawlRules = config.getCrawlRules();
	}

	@Override
	public Boolean call() throws Exception {
		Eventable eventToFire = eventable;
		if (eventable.getIdentification().getHow().toString().equals("xpath")
		        && eventable.getRelatedFrame().equals("")) {
			eventToFire = resolveByXpath(eventable, eventToFire);
		}
		boolean isFired = false;
		try {
			isFired = browser.fireEventAndWait(eventToFire);
		} catch (ElementNotVisibleException | NoSuchElementException e) {
			if (crawlRules.isCrawlHiddenAnchors() && eventToFire.getElement() != null
			        && "A".equals(eventToFire.getElement().getTag())) {
				isFired = visitAnchorHrefIfPossible(eventToFire);
			} else {
				LOG.debug("Ignoring invisble element {}", eventToFire.getElement());
			}
		} catch (InterruptedException e) {
			LOG.debug("Interrupted during fire event");
			Thread.currentThread().interrupt();
			return false;
		}
		LOG.debug("Event fired={} for eventable {}", isFired, eventable);

		if (isFired) {
			waitConditionChecker.wait(browser);
			browser.closeOtherWindows();
		}

		return isFired;
	}

	private Eventable resolveByXpath(Eventable eventable, Eventable eventToFire) {
		// The path in the page to the 'clickable' (link, div, span, etc)
		String xpath = eventable.getIdentification().getValue();

		// The type of event to execute on the 'clickable' like onClick,
		// mouseOver, hover, etc
		EventType eventType = eventable.getEventType();

		// Try to find a 'better' / 'quicker' xpath
		String newXPath = new ElementResolver(eventable, browser).resolve();
		if (newXPath != null && !xpath.equals(newXPath)) {
			LOG.debug("XPath changed from {} to {} relatedFrame: {}", xpath, newXPath,
			        eventable.getRelatedFrame());
			eventToFire =
			        new Eventable(new Identification(Identification.How.xpath, newXPath),
			                eventType);
		}
		return eventToFire;
	}

	private boolean visitAnchorHrefIfPossible(Eventable eventable) {
		Element element = eventable.getElement();
		String href = element.getAttributeOrNull("href");
		if (href == null) {
			LOG.info("Anchor {} has no href and is invisble so it will be ignored", element);
		} else {
			LOG.info("Found an invisible link with href={}", href);
			try {
				URL url = UrlUtils.extractNewUrl(browser.getCurrentUrl(), href);
				browser.goToUrl(url);
				return true;
			} catch (MalformedURLException e) {
				LOG.info("Could not visit invisible illegal URL {}", e.getMessage());
			}
		}
		return false;
	}

}
