package com.crawljax.plugins.testsuiteextension.generated.claroline_MP_orig;

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
 * Generated @ Sun Mar 09 15:53:04 PDT 2014
 */

public class GeneratedTestCase50 {

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
		url = "http://localhost:8888/claroline-1.11.7/index.php?logout=true";
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
	public void method50(){
		try {
			driver.get(url);
			//From state 0 to state 1
			//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			mutateDOMTree(0);
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			mutateDOMTree(1);
			driver.findElement(By.linkText("Platform administration")).click();
			//From state 2 to state 43
			//Eventable{eventType=click, identification=text Configuration, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			mutateDOMTree(2);
			driver.findElement(By.linkText("Configuration")).click();
			//From state 43 to state 53
			//Eventable{eventType=click, identification=text Assignments, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			mutateDOMTree(43);
			driver.findElement(By.linkText("Assignments")).click();
			//From state 53 to state 56
			//Eventable{eventType=click, identification=text Quota, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			mutateDOMTree(53);
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			driver.findElement(By.linkText("Quota")).click();
			//From state 56 to state 57
			//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			mutateDOMTree(56);
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			//From state 57 to state 60
			//Eventable{eventType=click, identification=text Submissions, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			mutateDOMTree(57);
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			driver.findElement(By.linkText("Submissions")).click();
			//From state 60 to state 61
			//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			mutateDOMTree(60);
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			//From state 61 to state 67
			//Eventable{eventType=click, identification=text View all, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			mutateDOMTree(61);
			driver.findElement(By.linkText("View all")).click();
			//Sink node at state 67
			mutateDOMTree(67);
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