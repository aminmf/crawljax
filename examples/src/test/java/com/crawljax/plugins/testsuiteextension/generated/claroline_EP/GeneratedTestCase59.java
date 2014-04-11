package com.crawljax.plugins.testsuiteextension.generated.claroline_EP;

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
 * Generated @ Wed Apr 09 21:06:31 PDT 2014
 */

public class GeneratedTestCase59 {

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
	public void method59(){
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
		//From state 1 to state 2
		//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState0_GeneratedAssertions(){
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

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // reused assertion in case of ElementFullMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

	public void checkState1_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState1_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState1_RandAssertions1(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=839&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]"))); // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("id=\"userProfile\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBoxDock\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/H1"))); // Random element assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"qtip iconDefinitionList \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content collapsible-wrapper\"","style=\"display: none;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet collapsible  collapsed\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H4", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions4(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[177]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions5(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[564]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"User picture\"","class=\"userPicture\"","src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxWarning"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState2_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState2_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxWarning"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState2_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[3]/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"adminCommunication\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"technical/phpInfo.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"adminmergeuser.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"advanced_course_search.php\"")));
		parentElement = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"../messaging/sendmessage.php?cmd=rqMessageToAllUsers\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[7]/A"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"search_course\"","name=\"search\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/exe.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/settings.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPlatform\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[4]/UL/LI[3]/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"advanced_course_search.php\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState43_OriginalAssertions(){
	}

	public void checkState43_ReusedAssertions(){
	}

	public void checkState43_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState43_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState43_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState43_RandAssertions1(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"config_edit.php?config_code=CLHOME\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=839&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"adminmergeuser.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState43_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"adminCommunication\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"technical/phpInfo.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState43_RandAssertions3(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/H1"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"search_course\"","name=\"search\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"../messaging/sendmessage.php?cmd=rqMessageToAllUsers\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState43_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[4]/UL/LI[3]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"advanced_course_search.php\"")));
		parentElement = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/exe.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState43_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[177]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content collapsible-wrapper\"","style=\"display: none;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet collapsible  collapsed\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H4", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/settings.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_OriginalAssertions(){
		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion

	}

	public void checkState53_ReusedAssertions(){
	}

	public void checkState53_GeneratedAssertions(){
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState53_LearnedAssertions(){
	}

	public void checkState53_AllAssertions(){
		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState53_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"technical/phpInfo.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"search_course\"","name=\"search\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_automatic_mail_notification_TRUE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_automatic_mail_notification_FALSE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_FALSE\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/exe.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/H1"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLANN\"","method=\"post\"","name=\"editConfClass\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"qtip iconDefinitionList \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"../user/addcsvusers.php?AddType=adminTool\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"userName\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[4]/UL/LI[3]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet mycourselist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"userCommands\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"userCourseList\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[177]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_clwrk_customTmpPath\"","name=\"property[clwrk_customTmpPath]\"","size=\"17\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"config_edit.php?config_code=CLPROFIL\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState56_OriginalAssertions(){
		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion

	}

	public void checkState56_ReusedAssertions(){
	}

	public void checkState56_GeneratedAssertions(){
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState56_LearnedAssertions(){
	}

	public void checkState56_AllAssertions(){
		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState56_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[6]/TD[2]/INPUT[2]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState56_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[11]/TD[2]/INPUT"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_confval_def_sub_vis_change_only_new_TRUE\"","name=\"property[confval_def_sub_vis_change_only_new]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_confval_def_sub_vis_change_only_new_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_confval_def_sub_vis_change_only_new_FALSE\"","name=\"property[confval_def_sub_vis_change_only_new]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_confval_def_sub_vis_change_only_new_FALSE\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_clwrk_customTmpPath\"","name=\"property[clwrk_customTmpPath]\"","size=\"17\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_automatic_mail_notification_TRUE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_automatic_mail_notification_FALSE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_FALSE\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState56_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[10]/TD[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[3]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_usersPerPage\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_max_file_size_per_works\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState56_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[8]/TD[2]/LABEL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]"))); // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_allow_download_all_submissions_TRUE\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_usersPerPage\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_clwrk_customTmpPath\"","name=\"property[clwrk_customTmpPath]\"","size=\"17\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState56_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[8]/TD[2]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_TRUE\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState57_OriginalAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion

	}

	public void checkState57_ReusedAssertions(){
		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState57_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState57_LearnedAssertions(){
	}

	public void checkState57_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState57_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState57_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_max_file_size_per_works\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState57_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD/LABEL"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("EM", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"configSectionDesc\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState57_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"50%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("EM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState57_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/tooltitle.js?1311692694\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='config_list.php';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"config_list.php\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState60_OriginalAssertions(){
	}

	public void checkState60_ReusedAssertions(){
	}

	public void checkState60_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState60_LearnedAssertions(){
	}

	public void checkState60_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState60_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState60_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_max_file_size_per_works\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState60_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD/LABEL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState60_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("EM", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"configSectionDesc\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState60_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"50%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("EM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState61_OriginalAssertions(){
	}

	public void checkState61_ReusedAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState61_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState61_LearnedAssertions(){
	}

	public void checkState61_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion in case of ElementFullMatch

		assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState61_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState61_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState61_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD/LABEL"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState61_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY"))); // Random element assertion
		element = new DOMElement("EM", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"configSectionDesc\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"50%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("EM", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState61_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[2]/TD"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/tooltitle.js?1311692694\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState67_OriginalAssertions(){
	}

	public void checkState67_ReusedAssertions(){
	}

	public void checkState67_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState67_LearnedAssertions(){
	}

	public void checkState67_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"main\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"config_code\"","type=\"hidden\"","value=\"CLWRK\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"section\"","type=\"hidden\"","value=\"quota\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"save\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"5\"","width=\"100%\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState67_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[17]/TD[2]/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState67_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[6]/TD[2]/INPUT[2]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_confval_def_sub_vis_change_only_new_TRUE\"","name=\"property[confval_def_sub_vis_change_only_new]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_confval_def_sub_vis_change_only_new_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_confval_def_sub_vis_change_only_new_FALSE\"","name=\"property[confval_def_sub_vis_change_only_new]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_confval_def_sub_vis_change_only_new_FALSE\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_clwrk_customTmpPath\"","name=\"property[clwrk_customTmpPath]\"","size=\"17\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_automatic_mail_notification_TRUE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_automatic_mail_notification_FALSE\"","name=\"property[automatic_mail_notification]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_automatic_mail_notification_FALSE\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState67_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[11]/TD[2]/INPUT"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_usersPerPage\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState67_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[10]/TD[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[3]"))); // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_usersPerPage\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_allow_download_all_submissions_TRUE\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_max_file_size_per_works\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState67_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK\"","method=\"post\"","name=\"editConfClass\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_allow_download_all_submissions_TRUE\"","name=\"property[allow_download_all_submissions]\"","type=\"radio\"","value=\"TRUE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_allow_download_all_submissions_TRUE\""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"label_allow_download_all_submissions_FALSE\"","name=\"property[allow_download_all_submissions]\"","type=\"radio\"","value=\"FALSE\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"label_allow_download_all_submissions_FALSE\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("style=\"vertical-align: top\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"label_clwrk_customTmpPath\"","name=\"property[clwrk_customTmpPath]\"","size=\"17\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"propUnit\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"propType\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("align=\"right\"","id=\"label_clwrk_endDateDelay\"","name=\"property[clwrk_endDateDelay]\"","size=\"17\"","type=\"text\"","value=\"365\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("nowrap=\"nowrap\"","width=\"25%\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_OriginalAssertions(){
	}

	public void checkState14_ReusedAssertions(){
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState14_GeneratedAssertions(){
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

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

	public void checkState14_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState14_AllAssertions(){
		assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // reused assertion in case of ElementFullMatch

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

		assertTrue(isElementPresent(By.id("claroBody"))); // generated assertion in case of ElementTagAttMatch

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

	public void checkState14_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337668864\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"keyword\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("type=\"submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php?logout=true\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[177]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[564]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[408]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[457]"))); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=NEWCODE_001\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=NEWCODE_001\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
