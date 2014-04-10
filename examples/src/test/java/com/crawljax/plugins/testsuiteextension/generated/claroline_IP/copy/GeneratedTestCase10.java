package com.crawljax.plugins.testsuiteextension.generated.claroline_IP.copy;

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
 * Generated @ Tue Apr 08 22:59:20 PDT 2014
 */

public class GeneratedTestCase10 {

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
	public void method10(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
		mutateDOMTree(0);
		checkState0_OriginalAssertions();
		checkState0_ReusedAssertions();
		checkState0_GeneratedAssertions();
		checkState0_LearnedAssertions();
		checkState0_AllAssertions();
		checkState0_RandAssertions1();
		checkState0_RandAssertions2();
		checkState0_RandAssertions3();
		checkState0_RandAssertions4();
		checkState0_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		//From state 1 to state 142
		//Eventable{eventType=click, identification=text Create a course site, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=142, name=state142}}
		mutateDOMTree(1);
		checkState1_OriginalAssertions();
		checkState1_ReusedAssertions();
		checkState1_GeneratedAssertions();
		checkState1_LearnedAssertions();
		checkState1_AllAssertions();
		checkState1_RandAssertions1();
		checkState1_RandAssertions2();
		checkState1_RandAssertions3();
		checkState1_RandAssertions4();
		checkState1_RandAssertions5();
		driver.findElement(By.linkText("Create a course site")).click();
		//From state 142 to state 143
		//Eventable{eventType=click, identification=text Advanced options, element=Element{node=[A: null], tag=A, text=Advanced options, attributes={class=doCollapse, href=#}}, source=StateVertexImpl{id=142, name=state142}, target=StateVertexImpl{id=143, name=state143}}
		mutateDOMTree(142);
		checkState142_OriginalAssertions();
		checkState142_ReusedAssertions();
		checkState142_GeneratedAssertions();
		checkState142_LearnedAssertions();
		checkState142_AllAssertions();
		checkState142_RandAssertions1();
		checkState142_RandAssertions2();
		checkState142_RandAssertions3();
		checkState142_RandAssertions4();
		checkState142_RandAssertions5();
		driver.findElement(By.id("course_title")).clear();
		driver.findElement(By.id("course_title")).sendKeys("Computer Science");
		driver.findElement(By.id("course_officialCode")).clear();
		driver.findElement(By.id("course_officialCode")).sendKeys("A7");
		driver.findElement(By.linkText("Advanced options")).click();
		//From state 143 to state 144
		//Eventable{eventType=click, identification=id course_status_date, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=course_status_date, name=course_status_selection, type=radio, value=date}}, source=StateVertexImpl{id=143, name=state143}, target=StateVertexImpl{id=144, name=state144}}
		mutateDOMTree(143);
		checkState143_OriginalAssertions();
		checkState143_ReusedAssertions();
		checkState143_GeneratedAssertions();
		checkState143_LearnedAssertions();
		checkState143_AllAssertions();
		checkState143_RandAssertions1();
		checkState143_RandAssertions2();
		checkState143_RandAssertions3();
		checkState143_RandAssertions4();
		checkState143_RandAssertions5();
		driver.findElement(By.id("course_title")).clear();
		driver.findElement(By.id("course_title")).sendKeys("Computer Science");
		driver.findElement(By.id("course_officialCode")).clear();
		driver.findElement(By.id("course_officialCode")).sendKeys("A7");
		driver.findElement(By.id("course_status_date")).click();
		//From state 144 to state 145
		//Eventable{eventType=click, identification=name changeProperties, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=144, name=state144}, target=StateVertexImpl{id=145, name=state145}}
		mutateDOMTree(144);
		checkState144_OriginalAssertions();
		checkState144_ReusedAssertions();
		checkState144_GeneratedAssertions();
		checkState144_LearnedAssertions();
		checkState144_AllAssertions();
		checkState144_RandAssertions1();
		checkState144_RandAssertions2();
		checkState144_RandAssertions3();
		checkState144_RandAssertions4();
		checkState144_RandAssertions5();
		driver.findElement(By.id("course_title")).clear();
		driver.findElement(By.id("course_title")).sendKeys("Computer Science");
		driver.findElement(By.id("course_officialCode")).clear();
		driver.findElement(By.id("course_officialCode")).sendKeys("A7");
		driver.findElement(By.name("changeProperties")).click();
		//From state 145 to state 87
		//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=145, name=state145}, target=StateVertexImpl{id=87, name=state87}}
		mutateDOMTree(145);
		checkState145_OriginalAssertions();
		checkState145_ReusedAssertions();
		checkState145_GeneratedAssertions();
		checkState145_LearnedAssertions();
		checkState145_AllAssertions();
		checkState145_RandAssertions1();
		checkState145_RandAssertions2();
		checkState145_RandAssertions3();
		checkState145_RandAssertions4();
		checkState145_RandAssertions5();
		driver.findElement(By.linkText("Logout")).click();
		//Sink node at state 87
		mutateDOMTree(87);
		checkState87_OriginalAssertions();
		checkState87_ReusedAssertions();
		checkState87_GeneratedAssertions();
		checkState87_LearnedAssertions();
		checkState87_AllAssertions();
		checkState87_RandAssertions1();
		checkState87_RandAssertions2();
		checkState87_RandAssertions3();
		checkState87_RandAssertions4();
		checkState87_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
	}

	public void checkState0_RandAssertions1(){
	}

	public void checkState0_RandAssertions2(){
	}

	public void checkState0_RandAssertions3(){
	}

	public void checkState0_RandAssertions4(){
	}

	public void checkState0_RandAssertions5(){
	}

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
	}

	public void checkState1_LearnedAssertions(){
	}

	public void checkState1_AllAssertions(){
	}

	public void checkState1_RandAssertions1(){
	}

	public void checkState1_RandAssertions2(){
	}

	public void checkState1_RandAssertions3(){
	}

	public void checkState1_RandAssertions4(){
	}

	public void checkState1_RandAssertions5(){
	}

	public void checkState142_OriginalAssertions(){
	}

	public void checkState142_ReusedAssertions(){
	}

	public void checkState142_GeneratedAssertions(){
	}

	public void checkState142_LearnedAssertions(){
	}

	public void checkState142_AllAssertions(){
	}

	public void checkState142_RandAssertions1(){
	}

	public void checkState142_RandAssertions2(){
	}

	public void checkState142_RandAssertions3(){
	}

	public void checkState142_RandAssertions4(){
	}

	public void checkState142_RandAssertions5(){
	}

	public void checkState143_OriginalAssertions(){
	}

	public void checkState143_ReusedAssertions(){
	}

	public void checkState143_GeneratedAssertions(){
	}

	public void checkState143_LearnedAssertions(){
	}

	public void checkState143_AllAssertions(){
	}

	public void checkState143_RandAssertions1(){
	}

	public void checkState143_RandAssertions2(){
	}

	public void checkState143_RandAssertions3(){
	}

	public void checkState143_RandAssertions4(){
	}

	public void checkState143_RandAssertions5(){
	}

	public void checkState144_OriginalAssertions(){
	}

	public void checkState144_ReusedAssertions(){
	}

	public void checkState144_GeneratedAssertions(){
	}

	public void checkState144_LearnedAssertions(){
	}

	public void checkState144_AllAssertions(){
	}

	public void checkState144_RandAssertions1(){
	}

	public void checkState144_RandAssertions2(){
	}

	public void checkState144_RandAssertions3(){
	}

	public void checkState144_RandAssertions4(){
	}

	public void checkState144_RandAssertions5(){
	}

	public void checkState145_OriginalAssertions(){
	}

	public void checkState145_ReusedAssertions(){
	}

	public void checkState145_GeneratedAssertions(){
	}

	public void checkState145_LearnedAssertions(){
	}

	public void checkState145_AllAssertions(){
	}

	public void checkState145_RandAssertions1(){
	}

	public void checkState145_RandAssertions2(){
	}

	public void checkState145_RandAssertions3(){
	}

	public void checkState145_RandAssertions4(){
	}

	public void checkState145_RandAssertions5(){
	}

	public void checkState87_OriginalAssertions(){
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // original assertion

	}

	public void checkState87_ReusedAssertions(){
	}

	public void checkState87_GeneratedAssertions(){
	}

	public void checkState87_LearnedAssertions(){
	}

	public void checkState87_AllAssertions(){
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // original assertion

	}

	public void checkState87_RandAssertions1(){
	}

	public void checkState87_RandAssertions2(){
	}

	public void checkState87_RandAssertions3(){
	}

	public void checkState87_RandAssertions4(){
	}

	public void checkState87_RandAssertions5(){
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