package com.crawljax.plugins.testsuiteextension.generated.photogallery_EP_all;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.crawljax.forms.RandomInputValueGenerator;
import com.crawljax.util.DomUtils;

/*
 * Generated @ Fri Mar 07 15:51:25 PST 2014
 */

public class GeneratedTestCase9 {

	private WebDriver driver;
	private String url;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	private DOMElement element;
	private DOMElement parentElement;
	private ArrayList<DOMElement> childrenElements = new ArrayList<DOMElement>();
	private String DOM = null;

	boolean getCoverageReport = false;

	@Before
	public void setUp() throws Exception {
		// Setting the JavaScript code coverage switch
		getCoverageReport = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.getCoverageReport();
	    if (getCoverageReport)
	    	driver = new FirefoxDriver(getProfile());
	    else
			driver = new FirefoxDriver();
		url = "http://localhost:8888/phormer331/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static FirefoxProfile getProfile() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.http", "localhost");
		profile.setPreference("network.proxy.http_port", 3128);
		profile.setPreference("network.proxy.type", 1);
		/* use proxy for everything, including localhost */
		profile.setPreference("network.proxy.no_proxies_on", "");
		return profile;
	}	

	@After
	public void tearDown() throws Exception {
	    if (getCoverageReport)
	    	((JavascriptExecutor) driver).executeScript(" if (window.jscoverage_report) {return jscoverage_report('CodeCoverageReport');}");
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


	/*
	 * Test Cases
	 */
	 
	@Test
	public void method9(){
		try {
			driver.get(url);
			//From state 0 to state 1
			//Eventable{eventType=click, identification=text Admin Page, element=Element{node=[A: null], tag=A, text=Admin Page, attributes={href=admin.php, title=Login to the Administration Region}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			mutateDOMTree(0);
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"photoBoxes\"","style=\"display: block;\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\"","style=\"line-height: 150%\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.linkText("Admin Page")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Login   }}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			mutateDOMTree(1);
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch

			driver.findElement(By.id("loginAdminPass")).clear();
			driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
			driver.findElement(By.cssSelector("input.submit")).click();
			//From state 2 to state 3
			//Eventable{eventType=click, identification=text Manage Stories, element=Element{node=[A: null], tag=A, text=Manage Stories, attributes={href=?page=stories}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			mutateDOMTree(2);
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.cssSelector("div.method"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.linkText("Manage Stories")).click();
			//From state 3 to state 4
			//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Add Story   }}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			mutateDOMTree(3);
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.cssSelector("div.method"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.name("desc")).clear();
			driver.findElement(By.name("desc")).sendKeys("Greenery !!");
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys("Photos");
			driver.findElement(By.cssSelector("input.submit")).click();
			//From state 4 to state 41
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Add a New Story, attributes={href=#add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=41, name=state41}}
			mutateDOMTree(4);
			assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Story \"Photos\" added succesfully![\\s\\S]*$")); // original assertion
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"note_valid\""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.cssSelector("div.method"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[2]/A[1]")).click();
			//Sink node at state 41
			mutateDOMTree(41);
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Story \"Photos\" added succesfully![\\s\\S]*$")); // reused assertion in case of ElementFullMatch
			assertTrue(isElementPresent(By.cssSelector("div.method"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}



	/*
	 * Auxiliary methods 
	 */

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


	private boolean isElementPatternTagPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);

				// check parent node's tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parentTagName.equals(parent.getTagName()))
					continue;
		
				// check children nodes' tags
				HashSet<String> childrenTagNameFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagNameFromDOM.add(sourceElement.getChildNodes().item(j).getNodeName());
				HashSet<String> childrenTagNameToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTagNameToTest.add(children.get(k).getTagName());
				if (!childrenTagNameToTest.equals(childrenTagNameFromDOM))
					continue;

				return true;		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


	private boolean isElementPatternFullPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				// check node's attributes
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);
				NamedNodeMap elementAttList = sourceElement.getAttributes();
				HashSet<String> elemetAtts = new HashSet<String>();
				for (int j = 0; j < elementAttList.getLength(); j++)
					elemetAtts.add(elementAttList.item(j).getNodeName() + "=\"" + elementAttList.item(j).getNodeValue() + "\"");
				if (!element.getAttributes().equals(elemetAtts))
					continue;
				
				// check parent node's tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parentTagName.equals(parent.getTagName()))
					continue;
				NamedNodeMap parentAttList = sourceElement.getParentNode().getAttributes();
				HashSet<String> parentAtts = new HashSet<String>();
				for (int j = 0; j < parentAttList.getLength(); j++)
					parentAtts.add(parentAttList.item(j).getNodeName() + "=\"" + parentAttList.item(j).getNodeValue() + "\"");
				if (!parent.getAttributes().equals(parentAtts))
					continue;
		
				// check children nodes' tags
				HashSet<String> childrenTagNameFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagNameFromDOM.add(sourceElement.getChildNodes().item(j).getNodeName());
				HashSet<String> childrenTagNameToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTagNameToTest.add(children.get(k).getTagName());
				if (!childrenTagNameToTest.equals(childrenTagNameFromDOM))
					continue;
				
				// check children nodes' attributes
				HashSet<HashSet<String>> childrenAttsFromDOM = new HashSet<HashSet<String>>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++){
					NamedNodeMap childAttListFromDOM = sourceElement.getChildNodes().item(j).getAttributes();
					HashSet<String> childAtts = new HashSet<String>();
					if (childAttListFromDOM!=null)
						for (int k = 0; k < childAttListFromDOM.getLength(); k++)
							childAtts.add(childAttListFromDOM.item(k).getNodeName() + "=\"" + childAttListFromDOM.item(k).getNodeValue() + "\"");
					childrenAttsFromDOM.add(childAtts);
				}
				HashSet<HashSet<String>> childrenAttsToTest = new HashSet<HashSet<String>>();				
				for (int k=0; k<children.size();k++)
					childrenAttsToTest.add(children.get(k).getAttributes());
				
				if (!childrenAttsToTest.equals(childrenAttsFromDOM))
					continue;
				
				return true;		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

	public class DOMElement {
		private String tagName;
		private String textContent;
		private HashSet<String> attributes = new HashSet<String>();

		public DOMElement(String tagName, String textContent, ArrayList<String> attributes){
			this.tagName = tagName;
			this.textContent = textContent;
			
			if (attributes.get(0)!="")
				for (int i=0; i<attributes.size();i++)
					this.attributes.add(attributes.get(i));
		}

		public String getTagName() {
			return tagName;
		}

		public String getTextContent() {
			return textContent;
		}

		public HashSet<String> getAttributes() {
			return attributes;
		}
	}
	
	private void mutateDOMTree(int stateID){
	// execute JavaScript code to mutate DOM
	String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode(stateID);
		if (code!= null){
			long RandomlySelectedDOMElementID = (long) ((JavascriptExecutor)driver).executeScript(code);
			int MutationOperatorCode = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.MutationOperatorCode;
			int StateToBeMutated = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.StateToBeMutated;	
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.SelectedRandomElementInDOM[MutationOperatorCode][StateToBeMutated]
					= (int) RandomlySelectedDOMElementID;
		}
	}
 

}