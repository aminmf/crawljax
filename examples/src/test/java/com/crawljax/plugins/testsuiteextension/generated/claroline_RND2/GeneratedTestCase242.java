package com.crawljax.plugins.testsuiteextension.generated.claroline_RND2;

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
 * Generated @ Sun Apr 13 19:52:01 PDT 2014
 */

public class GeneratedTestCase242 {

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
	public void method242(){
		driver.get(url);
		//From state 0 to state 26
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=NEWCODE        –        new course, attributes={href=/claroline-1.11.7/claroline/course/index.php?cid=NEWCODE_001}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=26, name=state26}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DL[1]/DT[1]/A[1]")).click();
		//From state 26 to state 89
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text= Agenda, attributes={class=item, href=/claroline-1.11.7/claroline/calendar/agenda.php?cidReset=true&cidReq=NEWCODE_001, id=CLCAL}}, source=StateVertexImpl{id=26, name=state26}, target=StateVertexImpl{id=89, name=state89}}
		mutateDOMTree(26);
		checkState26_OriginalAssertions();
		checkState26_ReusedAssertions();
		checkState26_GeneratedAssertions();
		checkState26_LearnedAssertions();
		checkState26_AllAssertions();
		checkState26_RandAssertions1();
		checkState26_RandAssertions2();
		checkState26_RandAssertions3();
		checkState26_RandAssertions4();
		checkState26_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[2]/A[1]")).click();
		//From state 89 to state 100
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1MMk5zWVhKdmJHbHVaUzB4TGpFeExqY3ZZMnhoY205c2FXNWxMMk5oYkdWdVpHRnlMMkZuWlc1a1lTNXdhSEElMkZZMmxrVW1WelpYUTlkSEoxWlNaamFXUlNaWEU5VGtWWFEwOUVSVjh3TURFJTNE, target=_top}}, source=StateVertexImpl{id=89, name=state89}, target=StateVertexImpl{id=100, name=state100}}
		mutateDOMTree(89);
		checkState89_OriginalAssertions();
		checkState89_ReusedAssertions();
		checkState89_GeneratedAssertions();
		checkState89_LearnedAssertions();
		checkState89_AllAssertions();
		checkState89_RandAssertions1();
		checkState89_RandAssertions2();
		checkState89_RandAssertions3();
		checkState89_RandAssertions4();
		checkState89_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 100 to state 143
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFNTWs1eldWaEtkbUpIYkhWYVV6QjRUR3BGZUV4cVkzWlpNbmhvWTIwNWMyRlhOV3hNTWs1b1lrZFdkVnBIUm5sTU1rWnVXbGMxYTFsVE5YZGhTRUVsTWtaWk1teHJWVzFXZWxwWVVUbGtTRW94V2xOYWFtRlhVbE5hV0VVNVZHdFdXRkV3T1VWU1ZqaDNUVVJGSlRORQ%3D%3D, target=_top}}, source=StateVertexImpl{id=100, name=state100}, target=StateVertexImpl{id=143, name=state143}}
		mutateDOMTree(100);
		checkState100_OriginalAssertions();
		checkState100_ReusedAssertions();
		checkState100_GeneratedAssertions();
		checkState100_LearnedAssertions();
		checkState100_AllAssertions();
		checkState100_RandAssertions1();
		checkState100_RandAssertions2();
		checkState100_RandAssertions3();
		checkState100_RandAssertions4();
		checkState100_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//Sink node at state 143
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

	public void checkState26_OriginalAssertions(){
	}

	public void checkState26_ReusedAssertions(){
	}

	public void checkState26_GeneratedAssertions(){
	}

	public void checkState26_LearnedAssertions(){
	}

	public void checkState26_AllAssertions(){
	}

	public void checkState26_RandAssertions1(){
	}

	public void checkState26_RandAssertions2(){
	}

	public void checkState26_RandAssertions3(){
	}

	public void checkState26_RandAssertions4(){
	}

	public void checkState26_RandAssertions5(){
	}

	public void checkState89_OriginalAssertions(){
	}

	public void checkState89_ReusedAssertions(){
	}

	public void checkState89_GeneratedAssertions(){
	}

	public void checkState89_LearnedAssertions(){
	}

	public void checkState89_AllAssertions(){
	}

	public void checkState89_RandAssertions1(){
	}

	public void checkState89_RandAssertions2(){
	}

	public void checkState89_RandAssertions3(){
	}

	public void checkState89_RandAssertions4(){
	}

	public void checkState89_RandAssertions5(){
	}

	public void checkState100_OriginalAssertions(){
	}

	public void checkState100_ReusedAssertions(){
	}

	public void checkState100_GeneratedAssertions(){
	}

	public void checkState100_LearnedAssertions(){
	}

	public void checkState100_AllAssertions(){
	}

	public void checkState100_RandAssertions1(){
	}

	public void checkState100_RandAssertions2(){
	}

	public void checkState100_RandAssertions3(){
	}

	public void checkState100_RandAssertions4(){
	}

	public void checkState100_RandAssertions5(){
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