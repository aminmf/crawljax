package photogallery_hp;

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
 * Generated @ Sat Jan 18 20:23:31 PST 2014
 */

public class GeneratedTestCase2 {

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
	public void method2(){
		try {
			driver.get(url);
			//From state 0 to state 32
			//Eventable{eventType=click, identification=text SlideShow, element=Element{node=[A: null], tag=A, text=SlideShow, attributes={href=.?feat=slideshow}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=32, name=state32}}
			mutateDOMTree();
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Admin Page"))); // generated assertion in case of actionable element
			}
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
			parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Stories"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("SlideShow"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.aThumb:nth-child(5) > center:nth-child(1) > a:nth-child(1)"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("IMG"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("SPAN"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("A"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
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
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			driver.findElement(By.linkText("SlideShow")).click();
			//From state 32 to state 33
			//Eventable{eventType=click, identification=id ss_playpause_link, element=Element{node=[A: null], tag=A, text=Pause it, attributes={class=q, id=ss_playpause_link, onclick=javascript:ss_playpause();}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=33, name=state33}}
			mutateDOMTree();
			assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$")); // original assertion
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.id("ss_playpause_link"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // reused assertion in case of ElementFullMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("SPAN"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // reused assertion in case of ElementFullMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("span#ss_n"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("A"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			driver.findElement(By.id("ss_playpause_link")).click();
			//From state 33 to state 36
			//Eventable{eventType=click, identification=text Smaller Size, element=Element{node=[A: null], tag=A, text=Smaller Size, attributes={class=q, id=ss_smaller_link, onclick=javascript:ss_toggleSmaller();}}, source=StateVertexImpl{id=33, name=state33}, target=StateVertexImpl{id=36, name=state36}}
			mutateDOMTree();
			assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
			childrenElements.clear();
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Next"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Smaller Size"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("SPAN"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("span#ss_n"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("A"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			driver.findElement(By.linkText("Smaller Size")).click();
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
	
	private boolean shouldRunAssertion(){
		return com.crawljax.plugins.testsuiteextension.TestSuiteExtension.shouldRunAssertionInExtendedSuite();
	}	

	private void mutateDOMTree(){
		// execute JavaScript code to mutate DOM
		String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode();
		if (code!= null){
			// saving the DOM before mutation
			DOM = driver.getPageSource();
			((JavascriptExecutor)driver).executeScript(code);
		}
	}
	private void restoreDOMTree() {
		// restoring the DOM after mutation in document.body.innerHTML
		if (DOM!= null){
			int start = DOM.indexOf("<body");
			int end = DOM.indexOf("</body");
			DOM = DOM.substring(start, end);
			start = DOM.indexOf(">") + 1;
			DOM = DOM.substring(start);
			DOM = DOM.replace("/", "\\/");
			DOM = DOM.replace("\n", "");
			DOM = DOM.replace("\r", "");
			DOM = DOM.replace("\"", "\\\"");
			DOM = DOM.replace("'", "\'");
			String code = "document.body.innerHTML=\"" + DOM + "\";";
			((JavascriptExecutor)driver).executeScript(code);
		}
	}
	private void verifyTrue(String assertionType, boolean assertionCondition){
		if (com.crawljax.plugins.testsuiteextension.TestSuiteExtension.shouldIgnoreAssertionFailure())
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.verifyTrue(assertionType, assertionCondition);
		else
			assertTrue(assertionCondition);
	}
	private void verifyEquals(String assertionType, String s1, String s2){
		if (com.crawljax.plugins.testsuiteextension.TestSuiteExtension.shouldIgnoreAssertionFailure())
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.verifyEquals(assertionType, s1, s2);
		else
			assertEquals(s1, s2);
	}	
	private void verifyNotNull(String assertionType, Object o){
		if (com.crawljax.plugins.testsuiteextension.TestSuiteExtension.shouldIgnoreAssertionFailure())
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.verifyNotNull(assertionType, o);
		else
			assertNotNull(o);
	}	
	private void verifyNull(String assertionType, Object o){
		if (com.crawljax.plugins.testsuiteextension.TestSuiteExtension.shouldIgnoreAssertionFailure())
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.verifyNull(assertionType, o);
		else
			assertNull(o);
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

}