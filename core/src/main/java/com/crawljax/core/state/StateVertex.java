package com.crawljax.core.state;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.crawljax.util.AssertedElementPattern;
import com.crawljax.util.ElementFeatures;
import com.google.common.collect.ImmutableList;

/**
 * A vertex in the {@link StateFlowGraph} representing a state in the web appliction.
 */
public interface StateVertex extends Serializable {

	/**
	 * The {@link #getId()} of the Index state.
	 */
	public static final int INDEX_ID = (int) 0;

	/**
	 * Retrieve the name of the StateVertex.
	 * 
	 * @return the name of the StateVertex
	 */
	String getName();

	/**
	 * Retrieve the DOM String.
	 * 
	 * @return the dom for this state
	 */
	String getDom();

	/**
	 * @return the stripped dom by the oracle comparators
	 */
	String getStrippedDom();

	/**
	 * @return the url
	 */
	String getUrl();

	/**
	 * @return the id. This is guaranteed to be unique per state.
	 */
	int getId();

	/**
	 * @return a Document instance of the dom string.
	 * @throws IOException
	 *             if an exception is thrown.
	 */
	Document getDocument() throws IOException;

	ImmutableList<Eventable> getUsedEventables();
	
	//Amin: Assertions on DOM state
	boolean addAssertedElementPattern(AssertedElementPattern aep);
	void addElementFeatures(ElementFeatures ef);
	ArrayList<String> getAssertions();
	ArrayList<AssertedElementPattern> getAssertedElementPatters();
	HashSet<ElementFeatures> getElementFeatures();

	void addElementTagAttAssertion(String assertion);
	void addPatternTagAssertion(String assertion);
	void addPatternFullAssertion(String assertion);
	
	public HashSet<String> getElementTagAttAssertions();
	public HashSet<String> getPatternTagAssertions();
	public HashSet<String> getPatternFullAssertions();

	void clearElementTagAttAssertions();
	void clearPatternTagAssertions();
	void clearPatternFullAssertions();

}
