package com.crawljax.plugins.testsuiteextension.generated.wolfcms_EP_generated;

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
 * Generated @ Tue Mar 11 11:18:49 PDT 2014
 */

public class GeneratedTestCase5 {

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
	public void method5(){
		try {
			driver.get(url);
			//From state 0 to state 48
			//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=48, name=state48}}
			mutateDOMTree(0);
			assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion
			assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion
			element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

			assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("snippet_content")).clear();
			driver.findElement(By.id("snippet_content")).sendKeys("Just a Selenium test snippet.");
			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("login-username")).clear();
			driver.findElement(By.id("login-username")).sendKeys("admin");
			driver.findElement(By.id("login-password")).clear();
			driver.findElement(By.id("login-password")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			//From state 48 to state 49
			//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=49, name=state49}}
			mutateDOMTree(48);
			element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			assertTrue(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
			parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/17\"","title=\"17 | \"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("snippet_content")).clear();
			driver.findElement(By.id("snippet_content")).sendKeys("Just a Selenium test snippet.");
			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.linkText("Users")).click();
			//From state 49 to state 50
			//Eventable{eventType=click, identification=partialText RND, element=Element{node=[A: null], tag=A, text=RNDUserBxum, attributes={href=http://localhost:8888/wolfcms/?/admin/user/edit/4}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=50, name=state50}}
			mutateDOMTree(49);
			assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion
			assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("snippet_content")).clear();
			driver.findElement(By.id("snippet_content")).sendKeys("Just a Selenium test snippet.");
			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.partialLinkText("RND")).click();
			//From state 50 to state 51
			//Eventable{eventType=click, identification=name commit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=button, name=commit, type=submit, value=Save}}, source=StateVertexImpl{id=50, name=state50}, target=StateVertexImpl{id=51, name=state51}}
			mutateDOMTree(50);
			assertEquals("Users - Edit | Wolf CMS", driver.getTitle()); // original assertion
			element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("snippet_content")).clear();
			driver.findElement(By.id("snippet_content")).sendKeys("Just a Selenium test snippet.");
			driver.findElement(By.id("part_0_content")).clear();
			driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
			driver.findElement(By.id("user_name")).clear();
			String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
			driver.findElement(By.id("user_name")).sendKeys(RandValue);
			driver.findElement(By.id("user_email")).clear();
			driver.findElement(By.id("user_email")).sendKeys("test1@example.com");
			driver.findElement(By.id("user_username")).clear();
			String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
			driver.findElement(By.id("user_username")).sendKeys(RandValue);
			driver.findElement(By.id("user_password")).clear();
			driver.findElement(By.id("user_password")).sendKeys("pswpsw");
			driver.findElement(By.id("user_confirm")).clear();
			driver.findElement(By.id("user_confirm")).sendKeys("pswpsw");
			driver.findElement(By.name("commit")).click();
			//From state 51 to state 76
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=http://localhost:8888/wolfcms/?/admin/user/delete/4?csrf_token=799a26ef8e73bb2620c1825bd8f4d08a5a28fed1cae1546d9f2e36131aa15ddd, onclick=return confirm('Are you sure you wish to delete RNDKKxI?');}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=76, name=state76}}
			mutateDOMTree(51);
			assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion
			assertEquals("User has been saved!", driver.findElement(By.xpath("//div[@class='message']")).getText()); // original assertion
			assertTrue(isElementPresent(By.xpath("//div[text()='User has been saved!']"))); // original assertion
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"opacity: 1;\"")));
			parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

			assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[@class='message']"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"opacity: 1;\"")));
			parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			assertTrue(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[4]/A[1]")).click();
			//Sink node at state 76
			mutateDOMTree(76);
			assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
			childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

			assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[@class='message']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[text()='User has been saved!']"))); // generated assertion in case of ElementTagAttMatch

			assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

			element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
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