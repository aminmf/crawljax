package com.crawljax.core.plugin;

import com.crawljax.core.CrawlTaskConsumer;
import com.crawljax.core.CrawlerContext;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.state.StateVertex;

/**
 * Plugin type that is called every time a new state is found by Crawljax. This also happens for the
 * Index State. Example: DOM validation.
 */
public interface ExecuteInitialPathsPlugin extends Plugin {

	/**
	 * Method that is called after the index state was added. It helps executing Selenium test cases as initial paths to the SFG.
	 * @param config 
	 * 
	 * @param context
	 *            the current context.
	 * @param newState
	 *            The new state. Equivalent to {@link CrawlerContext#getCurrentState()}.
	 */
	void initialPathExecution(CrawljaxConfiguration config, CrawlTaskConsumer firstConsumer);

}
