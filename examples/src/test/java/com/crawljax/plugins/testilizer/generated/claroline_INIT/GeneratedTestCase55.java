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

public class GeneratedTestCase55 {

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
	public void method55(){
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
		//From state 2 to state 3
		//Eventable{eventType=click, identification=text Manage course categories, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
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
		driver.findElement(By.linkText("Manage course categories")).click();
		//From state 3 to state 4
		//Eventable{eventType=click, identification=text Create a category, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
		mutateDOMTree(3);
		checkState3_OriginalAssertions();
		checkState3_ReusedAssertions();
		checkState3_GeneratedAssertions();
		checkState3_LearnedAssertions();
		checkState3_AllAssertions();
		checkState3_RandAssertions1();
		checkState3_RandAssertions2();
		checkState3_RandAssertions3();
		checkState3_RandAssertions4();
		checkState3_RandAssertions5();
		driver.findElement(By.linkText("Create a category")).click();
		//From state 4 to state 7
		//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=7, name=state7}}
		mutateDOMTree(4);
		checkState4_OriginalAssertions();
		checkState4_ReusedAssertions();
		checkState4_GeneratedAssertions();
		checkState4_LearnedAssertions();
		checkState4_AllAssertions();
		checkState4_RandAssertions1();
		checkState4_RandAssertions2();
		checkState4_RandAssertions3();
		checkState4_RandAssertions4();
		checkState4_RandAssertions5();
		driver.findElement(By.id("category_name")).clear();
		driver.findElement(By.id("category_name")).sendKeys("Software Eng");
		driver.findElement(By.id("category_code")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("category_code")).sendKeys(RandValue);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		//From state 7 to state 8
		//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
		mutateDOMTree(7);
		checkState7_OriginalAssertions();
		checkState7_ReusedAssertions();
		checkState7_GeneratedAssertions();
		checkState7_LearnedAssertions();
		checkState7_AllAssertions();
		checkState7_RandAssertions1();
		checkState7_RandAssertions2();
		checkState7_RandAssertions3();
		checkState7_RandAssertions4();
		checkState7_RandAssertions5();
		driver.findElement(By.linkText("Logout")).click();
		//Sink node at state 8
		mutateDOMTree(8);
		checkState8_OriginalAssertions();
		checkState8_ReusedAssertions();
		checkState8_GeneratedAssertions();
		checkState8_LearnedAssertions();
		checkState8_AllAssertions();
		checkState8_RandAssertions1();
		checkState8_RandAssertions2();
		checkState8_RandAssertions3();
		checkState8_RandAssertions4();
		checkState8_RandAssertions5();
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

	public void checkState3_OriginalAssertions(){
	}

	public void checkState3_ReusedAssertions(){
	}

	public void checkState3_GeneratedAssertions(){
	}

	public void checkState3_LearnedAssertions(){
	}

	public void checkState3_AllAssertions(){
	}

	public void checkState3_RandAssertions1(){
	}

	public void checkState3_RandAssertions2(){
	}

	public void checkState3_RandAssertions3(){
	}

	public void checkState3_RandAssertions4(){
	}

	public void checkState3_RandAssertions5(){
	}

	public void checkState4_OriginalAssertions(){
	}

	public void checkState4_ReusedAssertions(){
	}

	public void checkState4_GeneratedAssertions(){
	}

	public void checkState4_LearnedAssertions(){
	}

	public void checkState4_AllAssertions(){
	}

	public void checkState4_RandAssertions1(){
	}

	public void checkState4_RandAssertions2(){
	}

	public void checkState4_RandAssertions3(){
	}

	public void checkState4_RandAssertions4(){
	}

	public void checkState4_RandAssertions5(){
	}

	public void checkState7_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState7_ReusedAssertions(){
	}

	public void checkState7_GeneratedAssertions(){
	}

	public void checkState7_LearnedAssertions(){
	}

	public void checkState7_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState7_RandAssertions1(){
	}

	public void checkState7_RandAssertions2(){
	}

	public void checkState7_RandAssertions3(){
	}

	public void checkState7_RandAssertions4(){
	}

	public void checkState7_RandAssertions5(){
	}

	public void checkState8_OriginalAssertions(){
	}

	public void checkState8_ReusedAssertions(){
	}

	public void checkState8_GeneratedAssertions(){
	}

	public void checkState8_LearnedAssertions(){
	}

	public void checkState8_AllAssertions(){
	}

	public void checkState8_RandAssertions1(){
	}

	public void checkState8_RandAssertions2(){
	}

	public void checkState8_RandAssertions3(){
	}

	public void checkState8_RandAssertions4(){
	}

	public void checkState8_RandAssertions5(){
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
