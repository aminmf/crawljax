package com.crawljax.util;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * ElementFeatures is used to store features of a DOM element to be used for asserted element learning
 * 
 * @author Amin Milani Fard
 */
public class ElementFeatures implements Serializable{

	private static final long serialVersionUID = 2807808630564748091L;

	private String xpath;
	private int textImportance; // 1: true and 0:false
	private double normalBlockWidth, normalBlockHeight, normalBlockCenterX, normalBlockCenterY, innerHtmlDensity, linkDensity, blockDensity, normalNumOfChildren;
	private int classLabel; // 1 = the element is a checked element (training), -1 = invariant element (training), 0 = just added to be used for prediction

	private int count = 0; // this is to keep the frequency (count of appearance of the element)

	private String elementRegionAssertion = null;


	public int getCount() {
		return count;
	}


	public void increaseCount() {
		this.count++;
	}


	public ElementFeatures(String xpath, int freshness, int textImportance,
			double normalBlockWidth, double normalBlockHeight,
			double normalBlockCenterX, double normalBlockCenterY,
			double innerHtmlDensity, double linkDensity, double blockDensity,
			double normalNumOfChildren,
			int classLabel) {
		super();
		this.xpath = xpath;
		this.textImportance = textImportance;
		this.normalBlockWidth = normalBlockWidth;
		this.normalBlockHeight = normalBlockHeight;
		this.normalBlockCenterX = normalBlockCenterX;
		this.normalBlockCenterY = normalBlockCenterY;
		this.innerHtmlDensity = innerHtmlDensity;
		this.linkDensity = linkDensity;
		this.blockDensity = blockDensity;
		this.normalNumOfChildren = normalNumOfChildren;
		this.classLabel = classLabel;

	
		if (this.normalBlockWidth > 1)
			this.normalBlockWidth = 1;
		if (this.normalBlockHeight > 1)
			this.normalBlockHeight = 1;
		if (this.normalBlockCenterX > 1)
			this.normalBlockCenterX = 1;
		if (this.normalBlockCenterY > 1)
			this.normalBlockCenterY = 1;
		if (this.innerHtmlDensity > 1)
			this.innerHtmlDensity = 1;
		if (this.linkDensity > 1)
			this.linkDensity = 1;
		if (this.blockDensity > 1)
			this.blockDensity = 1;
		if (this.normalNumOfChildren > 1)
			this.normalNumOfChildren = 1;
	
	}

	public int getTextImportance() {
		return textImportance;
	}

	public void setTextImportance(int textImportance) {
		this.textImportance = textImportance;
	}

	public double getNormalBlockWidth() {
		return normalBlockWidth;
	}

	public void setNormalBlockWidth(double normalBlockWidth) {
		this.normalBlockWidth = normalBlockWidth;
	}

	public double getNormalBlockHeight() {
		return normalBlockHeight;
	}

	public void setNormalBlockHeight(double normalBlockHeight) {
		this.normalBlockHeight = normalBlockHeight;
	}

	public double getNormalBlockCenterX() {
		return normalBlockCenterX;
	}

	public void setNormalBlockCenterX(double normalBlockCenterX) {
		this.normalBlockCenterX = normalBlockCenterX;
	}

	public double getNormalBlockCenterY() {
		return normalBlockCenterY;
	}

	public void setNormalBlockCenterY(double normalBlockCenterY) {
		this.normalBlockCenterY = normalBlockCenterY;
	}

	public double getInnerHtmlDensity() {
		return innerHtmlDensity;
	}

	public void setInnerHtmlDensity(double innerHtmlDensity) {
		this.innerHtmlDensity = innerHtmlDensity;
	}

	public double getLinkDensity() {
		return linkDensity;
	}

	public void setLinkDensity(double linkDensity) {
		this.linkDensity = linkDensity;
	}

	public double getBlockDensity() {
		return blockDensity;
	}

	public void setBlockDensity(double blockDensity) {
		this.blockDensity = blockDensity;
	}

	public int getClassLabel() {
		return classLabel;
	}

	public void setClassLabel(int classLabel) {
		this.classLabel = classLabel;
	}

	@Override
	public String toString() {
		return "ElementFeatures [xpath=" + xpath + ", textImportance="
				+ textImportance + ", normalBlockWidth=" + normalBlockWidth
				+ ", normalBlockHeight=" + normalBlockHeight
				+ ", normalBlockCenterX=" + normalBlockCenterX
				+ ", normalBlockCenterY=" + normalBlockCenterY
				+ ", InnerHtmlDensity=" + innerHtmlDensity 
				+ ", linkDensity=" + linkDensity 
				+ ", blockDensity=" + blockDensity
				+ ", normalNumOfChildren=" + normalNumOfChildren
				+ ", classLabel=" + classLabel
				+ ", count=" + count
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(blockDensity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + classLabel;
		temp = Double.doubleToLongBits(innerHtmlDensity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(linkDensity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normalBlockCenterX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normalBlockCenterY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normalBlockHeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normalBlockWidth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normalNumOfChildren);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + textImportance;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementFeatures other = (ElementFeatures) obj;
		if (Double.doubleToLongBits(blockDensity) != Double
				.doubleToLongBits(other.blockDensity))
			return false;
		//if (classLabel != other.classLabel)
		//	return false;
		//if (!elementRegionAssertion.equals(other.elementRegionAssertion))
		//	return false;
		if (Double.doubleToLongBits(innerHtmlDensity) != Double
				.doubleToLongBits(other.innerHtmlDensity))
			return false;
		if (Double.doubleToLongBits(linkDensity) != Double
				.doubleToLongBits(other.linkDensity))
			return false;
		if (Double.doubleToLongBits(normalBlockCenterX) != Double
				.doubleToLongBits(other.normalBlockCenterX))
			return false;
		if (Double.doubleToLongBits(normalBlockCenterY) != Double
				.doubleToLongBits(other.normalBlockCenterY))
			return false;
		if (Double.doubleToLongBits(normalBlockHeight) != Double
				.doubleToLongBits(other.normalBlockHeight))
			return false;
		if (Double.doubleToLongBits(normalBlockWidth) != Double
				.doubleToLongBits(other.normalBlockWidth))
			return false;
		if (Double.doubleToLongBits(normalNumOfChildren) != Double
				.doubleToLongBits(other.normalNumOfChildren))
			return false;
		if (textImportance != other.textImportance)
			return false;
		return true;
	}


	public int compareTo(Object obj){
		ElementFeatures ef = (ElementFeatures)obj;
		return this.count - ef.getCount();
	}



	public double cosineSimilarity(ElementFeatures ef) 
	{
		double[] docVector1 = {(double) this.textImportance, this.normalBlockWidth, this.normalBlockHeight,
				this.normalBlockCenterX, this.normalBlockCenterY, this.innerHtmlDensity, this.linkDensity, this.blockDensity, this.normalNumOfChildren};
		double[] docVector2 = {(double) ef.textImportance, ef.normalBlockWidth, ef.normalBlockHeight,
				ef.normalBlockCenterX, ef.normalBlockCenterY, ef.innerHtmlDensity, ef.linkDensity, ef.blockDensity, ef.normalNumOfChildren};
		double dotProduct = 0.0;
		double magnitude1 = 0.0;
		double magnitude2 = 0.0;
		double cosineSimilarity = 0.0;

		for (int i = 0; i < docVector1.length; i++) //docVector1 and docVector2 must be of same length
		{
			dotProduct += docVector1[i] * docVector2[i];  //a.b
			magnitude1 += Math.pow(docVector1[i], 2);  //(a^2)
			magnitude2 += Math.pow(docVector2[i], 2); //(b^2)
		}

		magnitude1 = Math.sqrt(magnitude1);//sqrt(a^2)
		magnitude2 = Math.sqrt(magnitude2);//sqrt(b^2)

		if (magnitude1 != 0.0 | magnitude2 != 0.0)
		{
			cosineSimilarity = dotProduct / (magnitude1 * magnitude2);
		} 
		else 
		{
			return 0.0;
		}
		return cosineSimilarity;
	}


	public double getNormalNumOfChildren() {
		return normalNumOfChildren;
	}


	public void setNormalNumOfChildren(double normalNumOfChildren) {
		this.normalNumOfChildren = normalNumOfChildren;
	}


	public String getXpath() {
		return xpath;
	}


	public void setXpath(String xpath) {
		this.xpath = xpath;
	}


	// Adding elementRegionAssertion for a block DOM element
	public void addElementRegionAssertion(String elementRegionAssertion) {
		this.elementRegionAssertion = elementRegionAssertion;
	}

	public String getElementRegionAssertion() {
		return elementRegionAssertion;
	}

}
