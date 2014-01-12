package com.crawljax.util;

import java.io.Serializable;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.crawljax.core.configuration.CrawlElement;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.util.DomUtils;
import com.crawljax.util.XPathHelper;

/**
 * AssertedElementPattern is used to store informations about a DOM element accessed pattern in a Selenium assertion.
 * This pattern contains: The asserted element node, its parent node, its children nodes, its previous state id, and its associated assertion
 * 
 * @author Amin Milani Fard
 */
public class AssertedElementPattern implements Serializable{
	
	private static final long serialVersionUID = -6419315357887813412L;
	
	org.w3c.dom.Element sourceElement = null;
	// node info
	private String tagName = "";
	private String textContent = "";
	public String getTextContent() {
		return textContent;
	}

	private ArrayList<String> attributes = new ArrayList<String>();
	public ArrayList<String> getAttributes() {
		return attributes;
	}

	// parent node info
	private String parentTagName = "";
	public String getParentTagName() {
		return parentTagName;
	}

	private String parentTextContent = "";
	public String getParentTextContent() {
		return parentTextContent;
	}

	private ArrayList<String> parentAttributes = new ArrayList<String>();
	public ArrayList<String> getParentAttributes() {
		return parentAttributes;
	}

	// children nodes info
	private ArrayList<String> childrenTagName = new ArrayList<String>();
	public ArrayList<String> getChildrenTagName() {
		return childrenTagName;
	}

	private ArrayList<String> childrenTextContent = new ArrayList<String>();
	public ArrayList<String> getChildrenTextContent() {
		return childrenTextContent;
	}

	private ArrayList<ArrayList<String>> childrenAttributes = new ArrayList<ArrayList<String>>();

	public ArrayList<ArrayList<String>> getChildrenAttributes() {
		return childrenAttributes;
	}

	// assertion associated to this element
	private String assertion = "";
	private String assertionType = "";
	private String assertedElementLocator = "";
	
	private String assertionOrigin = "";
	
	public String getAssertionOrigin() {
		return assertionOrigin;
	}


	public void setAssertionOrigin(String assertionOrigin) {
		this.assertionOrigin = assertionOrigin;
	}


	public AssertedElementPattern(org.w3c.dom.Element sourceElement, String assertion, String assertedElementLocator){
		// assertion info
		this.assertedElementLocator = assertedElementLocator;
		this.assertion = assertion;
		this.assertionType  = null;

		if (assertion.contains(".getText()"))
			this.assertionType = "getText";
		else if (assertion.contains(".getTitle()"))
			this.assertionType = "getTitle";
		else 
			this.assertionType = "others";
		
		this.sourceElement = sourceElement;
		if (sourceElement==null)
			return;
		
		// node info
		tagName = sourceElement.getTagName();
		textContent = sourceElement.getTextContent().replace("\n", "").replace("\r", "").replace(" ", "");
		for (int i=0; i<sourceElement.getAttributes().getLength();i++)
			attributes.add(sourceElement.getAttributes().item(i).toString());
		
		// parent node info
		parentTagName = sourceElement.getParentNode().getNodeName();
		parentTextContent = sourceElement.getParentNode().getTextContent().replace("\n", "").replace("\r", "").replace(" ", "");
		for (int i=0; i<sourceElement.getParentNode().getAttributes().getLength();i++)
			parentAttributes.add(sourceElement.getParentNode().getAttributes().item(i).toString());

		// children nodes info
		ArrayList<String> childAttributes = new ArrayList<String>();
		for (int i=0; i<sourceElement.getChildNodes().getLength();i++){
			childrenTagName.add(sourceElement.getChildNodes().item(i).getNodeName());
			childrenTextContent.add(sourceElement.getChildNodes().item(i).getTextContent().replace("\n", "").replace("\r", "").replace(" ", ""));
			if (sourceElement.getChildNodes().item(i).getAttributes()!=null){
				for (int j=0; j<sourceElement.getChildNodes().item(i).getAttributes().getLength();j++)
					childAttributes.add(sourceElement.getChildNodes().item(i).getAttributes().item(j).toString());
				childrenAttributes.add(childAttributes);
			}
			childAttributes.clear();
		}
		
	}
	

	public String getAssertedElementLocator() {
		return assertedElementLocator;
	}


	public org.w3c.dom.Element getSourceElement() {
		return sourceElement;
	}

	public String getAssertionType() {
		return this.assertionType;
	}

	/*public void addAssertion(String assertion){
		this.assertion = assertion;
	}*/
	
	public String getAssertion(){
		return this.assertion;
	}
	
	public void setAssertion(String assertion){
		this.assertion = assertion;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssertedElementPattern)) return false;

        AssertedElementPattern aep = (AssertedElementPattern) o;

        if (!aep.tagName.equals(this.tagName) || !aep.parentTagName.equals(this.parentTagName) || !aep.childrenTagName.equals(this.childrenTagName)
        		|| !aep.assertion.equals(this.assertion)) {  
            return false;
        } 
            
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

	@Override
	public String toString() {
		return "AssertedElementPattern [tagName=" + tagName //+ ", textContent=" + textContent
				+ ", attributes=" + attributes + ", parentTagName="
				+ parentTagName //+ ", parentTextContent=" + parentTextContent
				+ ", parentAttributes=" + parentAttributes
				+ ", childrenTagName=" + childrenTagName
				//+ ", childrenTextContent=" + childrenTextContent
				+ ", childrenAttributes=" + childrenAttributes + ", assertion=" + assertion + "]";
	}
	
	
	/*
	public boolean findAssertedElementPattern(Document dom, CrawljaxConfiguration config){
		// finding the pattern of this object in the DOM using Crawljax configuration  
		for (CrawlElement crawlTag : config.getCrawlRules().getAllCrawlElements()) {
			// checking all tags defined in the crawlRules
			NodeList nodeList = dom.getElementsByTagName(crawlTag.getTagName());
				String xpath = null;
				org.w3c.dom.Element sourceElement = null;
				for (int k = 0; k < nodeList.getLength(); k++){
					sourceElement = (org.w3c.dom.Element) nodeList.item(k);
					AssertedElementPattern aep = new AssertedElementPattern(sourceElement, "");
					// check if aep equals this object
					if (this.equals(aep)){
						System.out.println("sourceElement:" + sourceElement + " in the DOM has an AssertedElementPattern: " + this);
						return true;
					}
				}
		}
		return false;
	}
	*/
	

	public String getHowPatternMatch(AssertedElementPattern aep){
		if (aep.tagName.equals(this.tagName) && aep.parentTagName.equals(this.parentTagName) && aep.childrenTagName.equals(this.childrenTagName)) {  
			if (aep.attributes.equals(this.attributes) && aep.parentAttributes.equals(this.parentAttributes) && aep.childrenAttributes.equals(this.childrenAttributes))
				if (aep.textContent.equals(this.textContent) && aep.parentTextContent.equals(this.parentTextContent) && aep.childrenTextContent.equals(this.childrenTextContent))
					return "PatternFullTextMatch";
				else
					return "PatternFullMatch";
			return "PatternTagMatch";
		}
        return "NoMatch";
	}

	public String getHowElementMatch(AssertedElementPattern aep){
		if (aep.tagName.equals(this.tagName)){
        	if (aep.attributes.equals(this.attributes))
				if (aep.textContent.equals(this.textContent))
	        		return "ElementFullTextMatch";
				else
					return "ElementFullMatch";
    		return "ElementTagMatch";
        }
        return "NoMatch";
	}
	
	public String getTagName() {
		return tagName;
	}

}
