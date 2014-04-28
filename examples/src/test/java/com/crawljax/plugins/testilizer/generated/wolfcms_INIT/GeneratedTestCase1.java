package com.crawljax.plugins.testilizer.generated.wolfcms_INIT;

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
 * Generated @ Sun Apr 06 00:02:15 PDT 2014
 */

public class GeneratedTestCase1 {

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
		url = "http://localhost:8888/wolfcms/?/admin/";
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
	public void method1(){
		driver.get(url);
		//From state 0 to state 12
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=12, name=state12}}
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
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//From state 12 to state 13
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
		mutateDOMTree(12);
		checkState12_OriginalAssertions();
		checkState12_ReusedAssertions();
		checkState12_GeneratedAssertions();
		checkState12_LearnedAssertions();
		checkState12_AllAssertions();
		checkState12_RandAssertions1();
		checkState12_RandAssertions2();
		checkState12_RandAssertions3();
		checkState12_RandAssertions4();
		checkState12_RandAssertions5();
		driver.findElement(By.linkText("Users")).click();
		//From state 13 to state 14
		//Eventable{eventType=click, identification=xpath //div[@id='sidebar']/p/a[text()=' New User'], element=Element{node=[A: null], tag=A, text=New User, attributes={href=http://localhost:8888/wolfcms/?/admin/user/add}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=14, name=state14}}
		mutateDOMTree(13);
		checkState13_OriginalAssertions();
		checkState13_ReusedAssertions();
		checkState13_GeneratedAssertions();
		checkState13_LearnedAssertions();
		checkState13_AllAssertions();
		checkState13_RandAssertions1();
		checkState13_RandAssertions2();
		checkState13_RandAssertions3();
		checkState13_RandAssertions4();
		checkState13_RandAssertions5();
		driver.findElement(By.xpath("//div[@id='sidebar']/p/a[text()=' New User']")).click();
		//From state 14 to state 16
		//Eventable{eventType=click, identification=name commit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=button, name=commit, type=submit, value=Save}}, source=StateVertexImpl{id=14, name=state14}, target=StateVertexImpl{id=16, name=state16}}
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
		driver.findElement(By.id("user_name")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_name")).sendKeys(RandValue);
		driver.findElement(By.id("user_email")).clear();
		RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4) + "@example.com";
		driver.findElement(By.id("user_email")).sendKeys(RandValue);
		driver.findElement(By.id("user_username")).clear();
		RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_username")).sendKeys(RandValue);
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("pswpsw");
		driver.findElement(By.id("user_confirm")).clear();
		driver.findElement(By.id("user_confirm")).sendKeys("pswpsw");
		driver.findElement(By.id("user_role-editor")).click();
		driver.findElement(By.name("commit")).click();
		//Sink node at state 16
		mutateDOMTree(16);
		checkState16_OriginalAssertions();
		checkState16_ReusedAssertions();
		checkState16_GeneratedAssertions();
		checkState16_LearnedAssertions();
		checkState16_AllAssertions();
		checkState16_RandAssertions1();
		checkState16_RandAssertions2();
		checkState16_RandAssertions3();
		checkState16_RandAssertions4();
		checkState16_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

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

	public void checkState12_OriginalAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState12_ReusedAssertions(){
	}

	public void checkState12_GeneratedAssertions(){
	}

	public void checkState12_LearnedAssertions(){
	}

	public void checkState12_AllAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState12_RandAssertions1(){
	}

	public void checkState12_RandAssertions2(){
	}

	public void checkState12_RandAssertions3(){
	}

	public void checkState12_RandAssertions4(){
	}

	public void checkState12_RandAssertions5(){
	}

	public void checkState13_OriginalAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState13_ReusedAssertions(){
	}

	public void checkState13_GeneratedAssertions(){
	}

	public void checkState13_LearnedAssertions(){
	}

	public void checkState13_AllAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState13_RandAssertions1(){
	}

	public void checkState13_RandAssertions2(){
	}

	public void checkState13_RandAssertions3(){
	}

	public void checkState13_RandAssertions4(){
	}

	public void checkState13_RandAssertions5(){
	}

	public void checkState14_OriginalAssertions(){
		if(!helper.equals("Users - Add | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState14_ReusedAssertions(){
	}

	public void checkState14_GeneratedAssertions(){
	}

	public void checkState14_LearnedAssertions(){
	}

	public void checkState14_AllAssertions(){
		if(!helper.equals("Users - Add | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

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

	public void checkState16_OriginalAssertions(){
		//if(!helper.equals("Users | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(isElementPresent(By.xpath("//div[text()='User has been added!']")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState16_ReusedAssertions(){
	}

	public void checkState16_GeneratedAssertions(){
	}

	public void checkState16_LearnedAssertions(){
	}

	public void checkState16_AllAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(isElementPresent(By.xpath("//div[text()='User has been added!']")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState16_RandAssertions1(){
	}

	public void checkState16_RandAssertions2(){
	}

	public void checkState16_RandAssertions3(){
	}

	public void checkState16_RandAssertions4(){
	}

	public void checkState16_RandAssertions5(){
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
