package claroline_hp;

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
 * Generated @ Sat Jan 18 21:11:05 PST 2014
 */

public class GeneratedTestCase58 {

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
		url = "http://localhost:8888/claroline-1.11.7/index.php";
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
	public void method58(){
		try {
			driver.get(url);
			//From state 0 to state 1
			//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			mutateDOMTree();
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("button[type=\"submit\"]"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // reused assertion in case of ElementFullMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
			childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
			childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch
			}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			mutateDOMTree();
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Platform administration"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Create a course site"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			driver.findElement(By.linkText("Platform administration")).click();
			//From state 2 to state 152
			//Eventable{eventType=click, identification=text Right profile list, element=Element{node=[A: null], tag=A, text=Right profile list, attributes={href=right/profile_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=152, name=state152}}
			mutateDOMTree();
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Manage course categories"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Claroline.net news"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Manage classes"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Create user"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Configuration"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Edit text zones"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Manage administrator email notifications"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Modules"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Send a message to all users"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Support forum"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("User list"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Right profile list"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Manage user desktop"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			driver.findElement(By.linkText("Right profile list")).click();
			//From state 152 to state 153
			//Eventable{eventType=click, identification=xpath (//img[@alt='Edit'])[6], element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit, src=/claroline-1.11.7/web/img/settings.png?1232379976}}, source=StateVertexImpl{id=152, name=state152}, target=StateVertexImpl{id=153, name=state153}}
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Course member \\(the user is actually enrolled in the course\\)[\\s\\S]*$")); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.xpath("(//img[@alt='Edit'])[6]"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			driver.findElement(By.xpath("(//img[@alt='Edit'])[6]")).click();
			//From state 153 to state 154
			//Eventable{eventType=click, identification=cssSelector a > span, element=Element{node=[SPAN: null], tag=SPAN, text=No access, attributes={style=font-size: smaller;}}, source=StateVertexImpl{id=153, name=state153}, target=StateVertexImpl{id=154, name=state154}}
			mutateDOMTree();
			assertEquals("Claroline", driver.getTitle()); // original assertion
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("a > span"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion in case of ElementTagAttMatch
			}
			driver.findElement(By.cssSelector("a > span")).click();
			//From state 154 to state 163
			//Eventable{eventType=click, identification=text View all right profile, element=Element{node=[A: null], tag=A, text=View all right profile, attributes={href=/claroline-1.11.7/claroline/admin/right/profile.php?display_profile=all}}, source=StateVertexImpl{id=154, name=state154}, target=StateVertexImpl{id=163, name=state163}}
			mutateDOMTree();
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("a > span"))); // generated assertion in case of actionable element
			}
			assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Access allowed[\\s\\S]*$")); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"claroTable emphaseLine\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("View all right profile"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion in case of ElementTagAttMatch
			}
			driver.findElement(By.linkText("View all right profile")).click();
			//From state 163 to state 164
			//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=163, name=state163}, target=StateVertexImpl{id=164, name=state164}}
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Edition allowed[\\s\\S]*$")); // original assertion
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"claroTable emphaseLine\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of OriginalAssertedElemet
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.linkText("Logout"))); // generated assertion in case of actionable element
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion in case of ElementTagMatch
			}
			if (shouldRunAssertion()){
			element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
			parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
			childrenElements.clear();
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
			childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
			assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch
			}
			if (shouldRunAssertion()){
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion in case of ElementTagAttMatch
			}
			driver.findElement(By.linkText("Logout")).click();
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