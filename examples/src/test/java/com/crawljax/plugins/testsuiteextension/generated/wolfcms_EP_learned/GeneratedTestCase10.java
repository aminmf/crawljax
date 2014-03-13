package com.crawljax.plugins.testsuiteextension.generated.wolfcms_EP_learned;

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
 * Generated @ Tue Mar 11 11:20:02 PDT 2014
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
	public void method10(){
		try {
			driver.get(url);
			//From state 0 to state 12
			//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=12, name=state12}}
			mutateDOMTree(0);
			assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion
			assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion
			driver.findElement(By.id("login-username")).clear();
			driver.findElement(By.id("login-username")).sendKeys("admin");
			driver.findElement(By.id("login-password")).clear();
			driver.findElement(By.id("login-password")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			//From state 12 to state 13
			//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			mutateDOMTree(12);
			assertEquals("Pages | Wolf CMS", driver.getTitle()); // original assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/4\"","title=\"4 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/5\"","title=\"5 | rnd-uomj\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-5\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/9\"","title=\"9 | rnd-lrva\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/3\"","title=\"3 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/5\"","title=\"5 | rnd-uomj\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-6\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/7\"","title=\"7 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/2\"","title=\"2 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/4\"","title=\"4 | \""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-4\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/8\"","title=\"8 | rndvrdk\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/2\"","title=\"2 | \""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-2\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/3\"","title=\"3 | \""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-3\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			driver.findElement(By.linkText("Users")).click();
			//From state 13 to state 14
			//Eventable{eventType=click, identification=xpath //div[@id='sidebar']/p/a[text()=' New User'], element=Element{node=[A: null], tag=A, text=New User, attributes={href=http://localhost:8888/wolfcms/?/admin/user/add}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=14, name=state14}}
			mutateDOMTree(13);
			assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion
			driver.findElement(By.xpath("//div[@id='sidebar']/p/a[text()=' New User']")).click();
			//From state 14 to state 90
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/FORM[1]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Cancel, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=14, name=state14}, target=StateVertexImpl{id=90, name=state90}}
			mutateDOMTree(14);
			assertEquals("Users - Add | Wolf CMS", driver.getTitle()); // original assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
			parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"user_role-administrator\"","name=\"user_role[administrator]\"","type=\"checkbox\"","value=\"1\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-administrator\""))));
			childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
			parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"user_role-editor\"","name=\"user_role[editor]\"","type=\"checkbox\"","value=\"3\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-editor\""))));
			childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion
			driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/FORM[1]/P[1]/A[1]")).click();
			//Sink node at state 90
			mutateDOMTree(90);
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