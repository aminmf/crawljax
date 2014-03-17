package com.crawljax.core.plugin;

import com.crawljax.core.CrawlerContext;
import com.crawljax.core.state.StateVertex;


public interface OnCloneStateDetectedPlugin extends Plugin {

	/**
	 * Method that is called when a clone state is found while adding states to the SFG.
	 * <p>
	 * This method can be called from multiple threads with different {@link CrawlerContext}
	 * </p>
	 * 
	 * @param context
	 *            the current context.
	 * @param cloneState
	 *            The clone state.
	 */
	void onCloneState(CrawlerContext context, StateVertex cloneState);

}
