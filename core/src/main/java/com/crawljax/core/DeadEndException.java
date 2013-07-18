package com.crawljax.core;

/**
 * Is thrown when the browser leaves the domain while crawling or walks into another dead end.
 */
@SuppressWarnings("serial")
public class DeadEndException extends CrawljaxException {

	public static DeadEndException leftDomain(String newUrl) {
		return new DeadEndException("Somehow we left the domain to " + newUrl);
	}

	public DeadEndException(String message) {
		super(message);
	}

}
