package com.crawljax.core.plugin;

import com.crawljax.core.CrawlerContext;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.StateVertex;

/**
 * Plugin type that is called every time event that was requested to fire succeeded firing.
 */
public interface OnFireEventSucceededPlugin extends Plugin {

	/**
	 * Method that is called when an event that was requested to fire succeeded firing.
	 * <p>
	 * This method can be called from multiple threads with different {@link CrawlerContext}
	 * </p>
	 * 
	 * @param context
	 *            The per crawler context.
	 * @param eventable
	 *            the eventable that succeeded to execute
	 */
	void onFireEvent(CrawlerContext context, StateVertex stateBefore, Eventable e, StateVertex stateAfter);	
}
