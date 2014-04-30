package com.crawljax.plugins.testilizer.generated.claroline_INIT;

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

public class GeneratedTestCase45 {

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
		getCoverageReport = com.crawljax.plugins.testilizer.Testilizer.getCoverageReport();
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
	public void method45(){
		driver.get(url);
		//From state 0 to state 147
		//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=147, name=state147}}
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
		//From state 147 to state 2
		//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=147, name=state147}, target=StateVertexImpl{id=2, name=state2}}
		mutateDOMTree(147);
		checkState147_OriginalAssertions();
		checkState147_ReusedAssertions();
		checkState147_GeneratedAssertions();
		checkState147_LearnedAssertions();
		checkState147_AllAssertions();
		checkState147_RandAssertions1();
		checkState147_RandAssertions2();
		checkState147_RandAssertions3();
		checkState147_RandAssertions4();
		checkState147_RandAssertions5();
		driver.findElement(By.linkText("Platform administration")).click();
		//From state 2 to state 43
		//Eventable{eventType=click, identification=text Configuration, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
		mutateDOMTree(2);
		checkState2_OriginalAssertions();
		checkState2_ReusedAssertions();
		checkState2_GeneratedAssertions();
		checkState2_LearnedAssertions();
		checkState2_AllAssertions();
		checkState2_RandAssertions1();
		checkState2_RandAssertions2();
		checkState2_RandAssertions3();
		checkState2_RandAssertions4();
		checkState2_RandAssertions5();
		driver.findElement(By.linkText("Configuration")).click();
		//From state 43 to state 53
		//Eventable{eventType=click, identification=text Assignments, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
		mutateDOMTree(43);
		checkState43_OriginalAssertions();
		checkState43_ReusedAssertions();
		checkState43_GeneratedAssertions();
		checkState43_LearnedAssertions();
		checkState43_AllAssertions();
		checkState43_RandAssertions1();
		checkState43_RandAssertions2();
		checkState43_RandAssertions3();
		checkState43_RandAssertions4();
		checkState43_RandAssertions5();
		driver.findElement(By.linkText("Assignments")).click();
		//From state 53 to state 56
		//Eventable{eventType=click, identification=text Quota, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
		mutateDOMTree(53);
		checkState53_OriginalAssertions();
		checkState53_ReusedAssertions();
		checkState53_GeneratedAssertions();
		checkState53_LearnedAssertions();
		checkState53_AllAssertions();
		checkState53_RandAssertions1();
		checkState53_RandAssertions2();
		checkState53_RandAssertions3();
		checkState53_RandAssertions4();
		checkState53_RandAssertions5();
		driver.findElement(By.linkText("Quota")).click();
		//From state 56 to state 57
		//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
		mutateDOMTree(56);
		checkState56_OriginalAssertions();
		checkState56_ReusedAssertions();
		checkState56_GeneratedAssertions();
		checkState56_LearnedAssertions();
		checkState56_AllAssertions();
		checkState56_RandAssertions1();
		checkState56_RandAssertions2();
		checkState56_RandAssertions3();
		checkState56_RandAssertions4();
		checkState56_RandAssertions5();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		//From state 57 to state 60
		//Eventable{eventType=click, identification=text Submissions, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
		mutateDOMTree(57);
		checkState57_OriginalAssertions();
		checkState57_ReusedAssertions();
		checkState57_GeneratedAssertions();
		checkState57_LearnedAssertions();
		checkState57_AllAssertions();
		checkState57_RandAssertions1();
		checkState57_RandAssertions2();
		checkState57_RandAssertions3();
		checkState57_RandAssertions4();
		checkState57_RandAssertions5();
		driver.findElement(By.linkText("Submissions")).click();
		//From state 60 to state 61
		//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
		mutateDOMTree(60);
		checkState60_OriginalAssertions();
		checkState60_ReusedAssertions();
		checkState60_GeneratedAssertions();
		checkState60_LearnedAssertions();
		checkState60_AllAssertions();
		checkState60_RandAssertions1();
		checkState60_RandAssertions2();
		checkState60_RandAssertions3();
		checkState60_RandAssertions4();
		checkState60_RandAssertions5();
		driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
		driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		//From state 61 to state 67
		//Eventable{eventType=click, identification=text View all, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
		mutateDOMTree(61);
		checkState61_OriginalAssertions();
		checkState61_ReusedAssertions();
		checkState61_GeneratedAssertions();
		checkState61_LearnedAssertions();
		checkState61_AllAssertions();
		checkState61_RandAssertions1();
		checkState61_RandAssertions2();
		checkState61_RandAssertions3();
		checkState61_RandAssertions4();
		checkState61_RandAssertions5();
		driver.findElement(By.linkText("View all")).click();
		//From state 67 to state 14
		//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=67, name=state67}, target=StateVertexImpl{id=14, name=state14}}
		mutateDOMTree(67);
		checkState67_OriginalAssertions();
		checkState67_ReusedAssertions();
		checkState67_GeneratedAssertions();
		checkState67_LearnedAssertions();
		checkState67_AllAssertions();
		checkState67_RandAssertions1();
		checkState67_RandAssertions2();
		checkState67_RandAssertions3();
		checkState67_RandAssertions4();
		checkState67_RandAssertions5();
		driver.findElement(By.linkText("Logout")).click();
		//Sink node at state 14
		mutateDOMTree(14);
		checkState14_OriginalAssertions();
		checkState14_ReusedAssertions();
		checkState14_GeneratedAssertions();
		checkState14_LearnedAssertions();
		checkState14_AllAssertions();
		checkState14_RandAssertions1();
		checkState14_RandAssertions2();
		checkState14_RandAssertions3();
		checkState14_RandAssertions4();
		checkState14_RandAssertions5();
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

	public void checkState147_OriginalAssertions(){
	}

	public void checkState147_ReusedAssertions(){
	}

	public void checkState147_GeneratedAssertions(){
	}

	public void checkState147_LearnedAssertions(){
	}

	public void checkState147_AllAssertions(){
	}

	public void checkState147_RandAssertions1(){
	}

	public void checkState147_RandAssertions2(){
	}

	public void checkState147_RandAssertions3(){
	}

	public void checkState147_RandAssertions4(){
	}

	public void checkState147_RandAssertions5(){
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
	}

	public void checkState2_LearnedAssertions(){
	}

	public void checkState2_AllAssertions(){
	}

	public void checkState2_RandAssertions1(){
	}

	public void checkState2_RandAssertions2(){
	}

	public void checkState2_RandAssertions3(){
	}

	public void checkState2_RandAssertions4(){
	}

	public void checkState2_RandAssertions5(){
	}

	public void checkState43_OriginalAssertions(){
	}

	public void checkState43_ReusedAssertions(){
	}

	public void checkState43_GeneratedAssertions(){
	}

	public void checkState43_LearnedAssertions(){
	}

	public void checkState43_AllAssertions(){
	}

	public void checkState43_RandAssertions1(){
	}

	public void checkState43_RandAssertions2(){
	}

	public void checkState43_RandAssertions3(){
	}

	public void checkState43_RandAssertions4(){
	}

	public void checkState43_RandAssertions5(){
	}

	public void checkState53_OriginalAssertions(){
		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState53_ReusedAssertions(){
	}

	public void checkState53_GeneratedAssertions(){
	}

	public void checkState53_LearnedAssertions(){
	}

	public void checkState53_AllAssertions(){
		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState53_RandAssertions1(){
	}

	public void checkState53_RandAssertions2(){
	}

	public void checkState53_RandAssertions3(){
	}

	public void checkState53_RandAssertions4(){
	}

	public void checkState53_RandAssertions5(){
	}

	public void checkState56_OriginalAssertions(){
		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState56_ReusedAssertions(){
	}

	public void checkState56_GeneratedAssertions(){
	}

	public void checkState56_LearnedAssertions(){
	}

	public void checkState56_AllAssertions(){
		if(!(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState56_RandAssertions1(){
	}

	public void checkState56_RandAssertions2(){
	}

	public void checkState56_RandAssertions3(){
	}

	public void checkState56_RandAssertions4(){
	}

	public void checkState56_RandAssertions5(){
	}

	public void checkState57_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState57_ReusedAssertions(){
	}

	public void checkState57_GeneratedAssertions(){
	}

	public void checkState57_LearnedAssertions(){
	}

	public void checkState57_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState57_RandAssertions1(){
	}

	public void checkState57_RandAssertions2(){
	}

	public void checkState57_RandAssertions3(){
	}

	public void checkState57_RandAssertions4(){
	}

	public void checkState57_RandAssertions5(){
	}

	public void checkState60_OriginalAssertions(){
	}

	public void checkState60_ReusedAssertions(){
	}

	public void checkState60_GeneratedAssertions(){
	}

	public void checkState60_LearnedAssertions(){
	}

	public void checkState60_AllAssertions(){
	}

	public void checkState60_RandAssertions1(){
	}

	public void checkState60_RandAssertions2(){
	}

	public void checkState60_RandAssertions3(){
	}

	public void checkState60_RandAssertions4(){
	}

	public void checkState60_RandAssertions5(){
	}

	public void checkState61_OriginalAssertions(){
	}

	public void checkState61_ReusedAssertions(){
	}

	public void checkState61_GeneratedAssertions(){
	}

	public void checkState61_LearnedAssertions(){
	}

	public void checkState61_AllAssertions(){
	}

	public void checkState61_RandAssertions1(){
	}

	public void checkState61_RandAssertions2(){
	}

	public void checkState61_RandAssertions3(){
	}

	public void checkState61_RandAssertions4(){
	}

	public void checkState61_RandAssertions5(){
	}

	public void checkState67_OriginalAssertions(){
	}

	public void checkState67_ReusedAssertions(){
	}

	public void checkState67_GeneratedAssertions(){
	}

	public void checkState67_LearnedAssertions(){
	}

	public void checkState67_AllAssertions(){
	}

	public void checkState67_RandAssertions1(){
	}

	public void checkState67_RandAssertions2(){
	}

	public void checkState67_RandAssertions3(){
	}

	public void checkState67_RandAssertions4(){
	}

	public void checkState67_RandAssertions5(){
	}

	public void checkState14_OriginalAssertions(){
	}

	public void checkState14_ReusedAssertions(){
	}

	public void checkState14_GeneratedAssertions(){
	}

	public void checkState14_LearnedAssertions(){
	}

	public void checkState14_AllAssertions(){
	}

	public void checkState14_RandAssertions1(){
	}

	public void checkState14_RandAssertions2(){
	}

	public void checkState14_RandAssertions3(){
	}

	public void checkState14_RandAssertions4(){
	}

	public void checkState14_RandAssertions5(){
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
	String code = com.crawljax.plugins.testilizer.Testilizer.mutateDOMTreeCode(stateID);
		if (code!= null){
			long RandomlySelectedDOMElementID = (long) ((JavascriptExecutor)driver).executeScript(code);
			int MutationOperatorCode = com.crawljax.plugins.testilizer.Testilizer.MutationOperatorCode;
			int StateToBeMutated = com.crawljax.plugins.testilizer.Testilizer.StateToBeMutated;	
			com.crawljax.plugins.testilizer.Testilizer.SelectedRandomElementInDOM[MutationOperatorCode][StateToBeMutated]
					= (int) RandomlySelectedDOMElementID;
		}
	}
 

}
