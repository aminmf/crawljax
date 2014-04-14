package com.crawljax.plugins.testsuiteextension.generated.eshop2_EP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
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
 * Generated @ Sun Apr 13 16:50:16 PDT 2014
 */

public class GeneratedTestCase0 {

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
		url = "https://localhost:9443/store/login";
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
	public void method0() throws InterruptedException{
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath //button[@type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={class=btn btn-large pull-right, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=cssSelector .search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1), element=Element{node=[A: null], tag=A, text=, attributes={class=dropdown-toggle, data-toggle=dropdown, href=/store/assets/gadget}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		//From state 2 to state 3
		//Eventable{eventType=click, identification=cssSelector #assets-container a, element=Element{node=[A: null], tag=A, text=, attributes={href=/store/assets/gadget/f76c59df-a7fa-416e-a9df-7e339e69d71e}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
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
		driver.findElement(By.cssSelector("#assets-container a")).click();
		driver.findElement(By.id("btn-add-gadget")).click();
		//From state 3 to state 5
		//Eventable{eventType=click, identification=cssSelector .nav-separator > a:nth-child(1), element=Element{node=[A: null], tag=A, text=My Items, attributes={href=/store/dashboard}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=5, name=state5}}
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
		driver.findElement(By.cssSelector(".nav-separator > a:nth-child(1)")).click();
		driver.findElement(By.linkText("My Items")).click();
		//From state 5 to state 7
		//Eventable{eventType=click, identification=cssSelector a.btn:nth-child(3) > i:nth-child(1), element=Element{node=[I: null], tag=I, text=, attributes={class=icon-remove}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=7, name=state7}}
		mutateDOMTree(5);
		checkState5_OriginalAssertions();
		checkState5_ReusedAssertions();
		checkState5_GeneratedAssertions();
		checkState5_LearnedAssertions();
		checkState5_AllAssertions();
		checkState5_RandAssertions1();
		checkState5_RandAssertions2();
		checkState5_RandAssertions3();
		checkState5_RandAssertions4();
		checkState5_RandAssertions5();
		driver.findElement(By.cssSelector("a.btn:nth-child(3) > i:nth-child(1)")).click();
		//From state 7 to state 8
		//Eventable{eventType=click, identification=cssSelector .search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1), element=Element{node=[A: null], tag=A, text=, attributes={class=dropdown-toggle, data-toggle=dropdown, href=/store/assets/gadget}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
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
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
		//From state 8 to state 9
		//Eventable{eventType=click, identification=text wso2, element=Element{node=[A: null], tag=A, text=wso2, attributes={href=/store/assets/gadget/?tag=wso2}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=9, name=state9}}
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
		driver.findElement(By.linkText("wso2")).click();
		Thread.sleep(3000);
		//From state 9 to state 10
		//Eventable{eventType=click, identification=cssSelector .nav > li:nth-child(2) > a:nth-child(1), element=Element{node=[A: null], tag=A, text=admin, attributes={class=dropdown-toggle, data-toggle=dropdown, href=#}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=10, name=state10}}
		mutateDOMTree(9);
		checkState9_OriginalAssertions();
		checkState9_ReusedAssertions();
		checkState9_GeneratedAssertions();
		checkState9_LearnedAssertions();
		checkState9_AllAssertions();
		checkState9_RandAssertions1();
		checkState9_RandAssertions2();
		checkState9_RandAssertions3();
		checkState9_RandAssertions4();
		checkState9_RandAssertions5();
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		//From state 10 to state 11
		//Eventable{eventType=click, identification=text Sign out, element=Element{node=[A: null], tag=A, text=Sign out, attributes={href=/store/logout}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}}
		mutateDOMTree(10);
		checkState10_OriginalAssertions();
		checkState10_ReusedAssertions();
		checkState10_GeneratedAssertions();
		checkState10_LearnedAssertions();
		checkState10_AllAssertions();
		checkState10_RandAssertions1();
		checkState10_RandAssertions2();
		checkState10_RandAssertions3();
		checkState10_RandAssertions4();
		checkState10_RandAssertions5();
		driver.findElement(By.linkText("Sign out")).click();
		//From state 11 to state 16
		//Eventable{eventType=click, identification=text Sign in, element=Element{node=[A: null], tag=A, text=Sign in, attributes={href=/store/login}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=16, name=state16}}
		mutateDOMTree(11);
		checkState11_OriginalAssertions();
		checkState11_ReusedAssertions();
		checkState11_GeneratedAssertions();
		checkState11_LearnedAssertions();
		checkState11_AllAssertions();
		checkState11_RandAssertions1();
		checkState11_RandAssertions2();
		checkState11_RandAssertions3();
		checkState11_RandAssertions4();
		checkState11_RandAssertions5();
		driver.findElement(By.linkText("Sign in")).click();
		//From state 16 to state 17
		//Eventable{eventType=click, identification=cssSelector a[href*='publisher'], element=Element{node=[A: null], tag=A, text=Publisher, attributes={href=/publisher}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
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
		driver.findElement(By.cssSelector("a[href*='publisher']")).click();
		//From state 17 to state 18
		//Eventable{eventType=click, identification=xpath //button[@type='submit'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={class=btn btn-large pull-right, type=submit}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
		mutateDOMTree(17);
		checkState17_OriginalAssertions();
		checkState17_ReusedAssertions();
		checkState17_GeneratedAssertions();
		checkState17_LearnedAssertions();
		checkState17_AllAssertions();
		checkState17_RandAssertions1();
		checkState17_RandAssertions2();
		checkState17_RandAssertions3();
		checkState17_RandAssertions4();
		checkState17_RandAssertions5();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//From state 18 to state 19
		//Eventable{eventType=click, identification=cssSelector ul.nav:nth-child(1) > li:nth-child(1) > a:nth-child(1), element=Element{node=[A: null], tag=A, text=Add gadget, attributes={href=/publisher/asset/gadget}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
		mutateDOMTree(18);
		checkState18_OriginalAssertions();
		checkState18_ReusedAssertions();
		checkState18_GeneratedAssertions();
		checkState18_LearnedAssertions();
		checkState18_AllAssertions();
		checkState18_RandAssertions1();
		checkState18_RandAssertions2();
		checkState18_RandAssertions3();
		checkState18_RandAssertions4();
		checkState18_RandAssertions5();
		driver.findElement(By.cssSelector("ul.nav:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
		//From state 19 to state 20
		//Eventable{eventType=click, identification=id btn-create-asset, element=Element{node=[BUTTON: null], tag=BUTTON, text=Create, attributes={class=btn btn-primary, id=btn-create-asset, name=addNewAssetButton}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}}
		mutateDOMTree(19);
		checkState19_OriginalAssertions();
		checkState19_ReusedAssertions();
		checkState19_GeneratedAssertions();
		checkState19_LearnedAssertions();
		checkState19_AllAssertions();
		checkState19_RandAssertions1();
		checkState19_RandAssertions2();
		checkState19_RandAssertions3();
		checkState19_RandAssertions4();
		checkState19_RandAssertions5();
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1");
		driver.findElement(By.id("overview_name")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("overview_name")).sendKeys(RandValue);
		driver.findElement(By.id("overview_version")).clear();
		driver.findElement(By.id("overview_version")).sendKeys("1.2.3");
		driver.findElement(By.id("overview_url")).clear();
		driver.findElement(By.id("overview_url")).sendKeys("http://example.com/gadget.xml");
		driver.findElement(By.id("token-input-tag-container")).clear();
		driver.findElement(By.id("token-input-tag-container")).sendKeys("data,");
		driver.findElement(By.id("btn-create-asset")).click();
		//From state 20 to state 21
		//Eventable{eventType=click, identification=cssSelector .table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2), element=Element{node=[TD: null], tag=TD, text=RNDQtUR, attributes={class=asset-listing-name}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=21, name=state21}}
		mutateDOMTree(20);
		checkState20_OriginalAssertions();
		checkState20_ReusedAssertions();
		checkState20_GeneratedAssertions();
		checkState20_LearnedAssertions();
		checkState20_AllAssertions();
		checkState20_RandAssertions1();
		checkState20_RandAssertions2();
		checkState20_RandAssertions3();
		checkState20_RandAssertions4();
		checkState20_RandAssertions5();
		driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")).click();
		//From state 21 to state 22
		//Eventable{eventType=click, identification=text Edit, element=Element{node=[A: null], tag=A, text=Edit, attributes={href=/publisher/asset/operations/edit/gadget/516c6738-2532-4c78-aa7d-67f18a80388f}}, source=StateVertexImpl{id=21, name=state21}, target=StateVertexImpl{id=22, name=state22}}
		mutateDOMTree(21);
		checkState21_OriginalAssertions();
		checkState21_ReusedAssertions();
		checkState21_GeneratedAssertions();
		checkState21_LearnedAssertions();
		checkState21_AllAssertions();
		checkState21_RandAssertions1();
		checkState21_RandAssertions2();
		checkState21_RandAssertions3();
		checkState21_RandAssertions4();
		checkState21_RandAssertions5();
		driver.findElement(By.linkText("Edit")).click();
		//From state 22 to state 23
		//Eventable{eventType=click, identification=id editAssetButton, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary, id=editAssetButton, name=editAssetButton, type=button, value=Update}}, source=StateVertexImpl{id=22, name=state22}, target=StateVertexImpl{id=23, name=state23}}
		mutateDOMTree(22);
		checkState22_OriginalAssertions();
		checkState22_ReusedAssertions();
		checkState22_GeneratedAssertions();
		checkState22_LearnedAssertions();
		checkState22_AllAssertions();
		checkState22_RandAssertions1();
		checkState22_RandAssertions2();
		checkState22_RandAssertions3();
		checkState22_RandAssertions4();
		checkState22_RandAssertions5();
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1 + added description");
		driver.findElement(By.id("editAssetButton")).click();
		//From state 23 to state 24
		//Eventable{eventType=click, identification=cssSelector a.dropdown-toggle, element=Element{node=[A: null], tag=A, text=admin, attributes={class=dropdown-toggle, data-toggle=dropdown, href=#}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
		mutateDOMTree(23);
		checkState23_OriginalAssertions();
		checkState23_ReusedAssertions();
		checkState23_GeneratedAssertions();
		checkState23_LearnedAssertions();
		checkState23_AllAssertions();
		checkState23_RandAssertions1();
		checkState23_RandAssertions2();
		checkState23_RandAssertions3();
		checkState23_RandAssertions4();
		checkState23_RandAssertions5();
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		//From state 24 to state 25
		//Eventable{eventType=click, identification=text Sign out, element=Element{node=[A: null], tag=A, text=Sign out, attributes={href=#, onclick=window.location.href='/publisher/logout'}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
		mutateDOMTree(24);
		checkState24_OriginalAssertions();
		checkState24_ReusedAssertions();
		checkState24_GeneratedAssertions();
		checkState24_LearnedAssertions();
		checkState24_AllAssertions();
		checkState24_RandAssertions1();
		checkState24_RandAssertions2();
		checkState24_RandAssertions3();
		checkState24_RandAssertions4();
		checkState24_RandAssertions5();
		driver.findElement(By.linkText("Sign out")).click();
		//Sink node at state 25
		mutateDOMTree(25);
		checkState25_OriginalAssertions();
		checkState25_ReusedAssertions();
		checkState25_GeneratedAssertions();
		checkState25_LearnedAssertions();
		checkState25_AllAssertions();
		checkState25_RandAssertions1();
		checkState25_RandAssertions2();
		checkState25_RandAssertions3();
		checkState25_RandAssertions4();
		checkState25_RandAssertions5();
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
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // original assertion

	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState1_LearnedAssertions(){
	}

	public void checkState1_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // original assertion

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState1_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/top-assets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState1_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
		//assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch
	}

	public void checkState2_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState2_LearnedAssertions(){
	}

	public void checkState2_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

//		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState2_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState2_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/bootstrap.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState3_OriginalAssertions(){
		assertEquals("Bookmarked", driver.findElement(By.id("btn-add-gadget")).getText()); // original assertion

	}

	public void checkState3_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState3_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState3_LearnedAssertions(){
	}

	public void checkState3_AllAssertions(){
		assertEquals("Bookmarked", driver.findElement(By.id("btn-add-gadget")).getText()); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState3_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState3_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState3_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState3_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jquery.rating.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState3_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState5_OriginalAssertions(){
		assertEquals("by admin", driver.findElement(By.cssSelector("div.store-my-item .bookmark-assert-provider")).getText()); // original assertion

	}

	public void checkState5_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState5_GeneratedAssertions(){
		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState5_LearnedAssertions(){
	}

	public void checkState5_AllAssertions(){
		assertEquals("by admin", driver.findElement(By.cssSelector("div.store-my-item .bookmark-assert-provider")).getText()); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("class=\"bookmark-assert-provider\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"store-my-item-info\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState5_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState5_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/top-assets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState5_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/userAssets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState5_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState5_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jquery.rating.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_OriginalAssertions(){
		assertTrue(driver.findElement(By.id("no-data-my-items")).getText().contains("You still haven't any bookmarks from the Store.")); // original assertion

	}

	public void checkState7_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState7_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"no-data\"","id=\"no-data-my-items\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-inbox\""))));
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"no-data\"","id=\"no-data-my-items\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-inbox\""))));
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState7_LearnedAssertions(){
	}

	public void checkState7_AllAssertions(){
		assertTrue(driver.findElement(By.id("no-data-my-items")).getText().contains("You still haven't any bookmarks from the Store.")); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"no-data\"","id=\"no-data-my-items\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-inbox\""))));
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState7_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/top-assets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/userAssets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState8_OriginalAssertions(){
	}

	public void checkState8_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
//		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch
	}

	public void checkState8_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState8_LearnedAssertions(){
	}

	public void checkState8_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

//		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState8_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState8_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState8_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState8_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState8_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_OriginalAssertions(){
		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // original assertion

	}

	public void checkState9_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState9_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState9_LearnedAssertions(){
	}

	public void checkState9_AllAssertions(){
		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState9_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/img/apple-touch-icon-114-precomposed.png\"","rel=\"apple-touch-icon-precomposed\"","sizes=\"114x114\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState10_OriginalAssertions(){
	}

	public void checkState10_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch
	}

	public void checkState10_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState10_LearnedAssertions(){
	}

	public void checkState10_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 asset\"","data-id=\"493fe1f2-921e-4e05-99e7-d2e2b73470ef\"","data-type=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/assets/gadget/493fe1f2-921e-4e05-99e7-d2e2b73470ef\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"asset-details\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState10_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState10_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState10_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState10_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/store/dashboard\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"nav-separator\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"open\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState10_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI[2]/UL/LI/A"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState11_OriginalAssertions(){
		assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed()); // original assertion

		assertTrue(driver.findElement(By.linkText("Register")).isDisplayed()); // original assertion

	}

	public void checkState11_ReusedAssertions(){
	}

	public void checkState11_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState11_LearnedAssertions(){
	}

	public void checkState11_AllAssertions(){
		assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed()); // original assertion

		assertTrue(driver.findElement(By.linkText("Register")).isDisplayed()); // original assertion

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState11_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container affix-top\"","id=\"container-search\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState11_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/top-assets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState11_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState11_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/HR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/H2"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/jslider.round.plastic.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12 search-bar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span9\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState11_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		element = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","id=\"form-register\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"register-alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-username-register\"","name=\"username\"","placeholder=\"Enter a Username\"","type=\"text\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-register\"","name=\"password\"","placeholder=\"Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span3 required\"","id=\"inp-password-confirm\"","name=\"password\"","placeholder=\"Confirm Password\"","type=\"password\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"emboss\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary btn-large\"","href=\"#\"","id=\"btn-register-submit\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/bootstrap.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_OriginalAssertions(){
	}

	public void checkState16_ReusedAssertions(){
	}

	public void checkState16_GeneratedAssertions(){
	}

	public void checkState16_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState16_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState16_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/A/I"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/FIELDSET/DIV"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-th-large\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"help-inline\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/navigation.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-remove\"")));
		parentElement = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"close\"","data-dismiss=\"modal\"","type=\"button\"")));
		childrenElements.clear();
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/top-assets.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"","id=\"form-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 offset2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span8\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[4]/LABEL"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-check-sign\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV/FORM/H2"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"brand\"","href=\"/store/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"nav menu pull-right\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/store/themes/store/css/font-awesome-ie7.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[5]/INPUT"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"checkbox\"","value=\"remember-me\"")));
		parentElement = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox lblRemember\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"views/css/bootstrap.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_OriginalAssertions(){
	}

	public void checkState17_ReusedAssertions(){
	}

	public void checkState17_GeneratedAssertions(){
	}

	public void checkState17_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState17_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState17_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"sessionDataKey\"","type=\"hidden\"","value=\"288ad0e5-dc57-4aba-a1ed-d7176dc73c0f\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wso2.com\"","id=\"logo-wso2\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"","id=\"form-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 offset2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span8\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-th-large\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-th-large\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-check-sign\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[4]/LABEL"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"regFormError\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-success\"","id=\"regFormSuc\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-large btn-primary pull-right\"","id=\"registrationSubmit\"","type=\"button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"input-block-level\"","id=\"password\"","name=\"password\"","type=\"password\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"views/css/bootstrap.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV/FORM/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"input-block-level\"","id=\"username\"","name=\"username\"","type=\"text\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"views/css/font-awesome.min.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"regFormError\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-success\"","id=\"regFormSuc\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-large btn-primary pull-right\"","id=\"registrationSubmit\"","type=\"button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_OriginalAssertions(){
	}

	public void checkState18_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
//		assertTrue(driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()); // reused assertion in case of ElementFullMatch
	}

	public void checkState18_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState18_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState18_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

//		assertTrue(driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState18_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[15]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[11]/TD[5]/SPAN"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/100db1b2-dd59-4e80-b9de-8fbe2bc6d2ab\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD/IMG"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[15]/TD[6]/SMALL"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/86208692-782d-4f18-8ad0-a961fbf37d0f\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/07b94a19-2247-4c6d-96b6-063bfa14db01\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"\"","src=\"/publisher/storage/gadget/6ca297c0-ffc2-4b61-b6d0-45efe032eb5a/a8bae979-7045-4d49-94e9-a302f56dda2b/thumbnail.jpg\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[30]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[20]/TD[4]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/fdeb209f-f56a-4e1d-8797-f1aee004f253\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"\"","src=\"/publisher/storage/gadget/83a872a9-f641-4f26-87f6-31e29306bd96/2749b0ae-48bd-4ddc-94d5-328532e2f9da/thumbnail.jpg\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/eb42a78f-bcd1-4dca-8c10-5ab5847fffb9\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[11]/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[9]/TD[6]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/823b745b-6188-4d51-99ff-0174bf1bb545\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://docs.wso2.org/display/ES100/WSO2+Enterprise+Store\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[32]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[23]/TD[5]/SPAN"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/28b215cf-0029-427e-9723-81ef003b7aa9\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/8bdfd5b9-cc55-4a17-bec3-6ed4775b9916\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/6ca297c0-ffc2-4b61-b6d0-45efe032eb5a\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_OriginalAssertions(){
	}

	public void checkState19_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState19_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState19_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState19_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState19_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav nav-list \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/statistics/gadget/\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"back-office-label\"","href=\"/publisher/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 publisher-left\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"sidebar-nav\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control-group\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumb-separator\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-breadcrumb\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-area-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container-assets container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumb-separator\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-breadcrumb\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-div\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"modal-loading\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget wlightblue\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pull-left\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState20_OriginalAssertions(){
//		assertTrue(driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()); // original assertion

		assertTrue(driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")).getText().contains("RND")); // original assertion

	}

	public void checkState20_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState20_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

	}

	public void checkState20_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState20_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()); // original assertion

		assertTrue(driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")).getText().contains("RND")); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState20_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[15]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[11]/TD[5]/SPAN"))); // Random element assertion
		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/100db1b2-dd59-4e80-b9de-8fbe2bc6d2ab\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span10\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-ok-circle\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState20_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[15]/TD[6]/SMALL"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav nav-list \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/statistics/gadget/\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/86208692-782d-4f18-8ad0-a961fbf37d0f\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TH", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?sortby=name&sort=asc\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState20_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD/IMG"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-being-added\"","style=\"display: block;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span9 publisher-right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/fdeb209f-f56a-4e1d-8797-f1aee004f253\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-caret-down\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?sortby=version&sort=asc\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/07b94a19-2247-4c6d-96b6-063bfa14db01\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState20_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[11]/TD"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState20_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[9]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[7]/TD[6]/SMALL"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/gadget/735a4471-74bd-453b-a5fb-6ed348c79881\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"asset-listing-name\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState21_OriginalAssertions(){
	}

	public void checkState21_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState21_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState21_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"table table-bordered asset-view-table widget-table\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-content\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState21_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState21_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/A/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-retweet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/lifecycle/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState21_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/view/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"prominent-link\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-list-alt\""))));
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState21_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[2]/TABLE/TBODY/TR[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/DIV/INPUT[2]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/edit/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-edit\""))));
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version-control-group\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState21_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"modal-loading\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-area-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container-assets container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState21_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV[2]/TABLE"))); // Random element assertion
		element = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-signout\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","onclick=\"window.location.href='/publisher/logout'\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn-group context_menu left\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState22_OriginalAssertions(){
	}

	public void checkState22_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState22_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState22_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"tbl-upload-inner\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"table tbl-upload\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState22_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState22_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/A/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-retweet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/lifecycle/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control-group\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState22_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version-control-group\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState22_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/DIV/INPUT[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget wlightblue\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pull-left\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState22_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV[2]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"modal-loading\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-area-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container-assets container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn-group context_menu left\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState22_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV/UL/LI[3]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav nav-list \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"sidebar-nav\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"prominent-link\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState23_OriginalAssertions(){
		assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Asset updated successfully")); // original assertion

	}

	public void checkState23_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState23_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"msg-container-recent-activity\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"close\"","data-dismiss=\"alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"msg-container-recent-activity\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"close\"","data-dismiss=\"alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState23_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"tbl-upload-inner\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"table tbl-upload\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState23_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Asset updated successfully")); // original assertion

		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"msg-container-recent-activity\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"close\"","data-dismiss=\"alert\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState23_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/A/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-retweet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/lifecycle/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control-group\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState23_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version-control-group\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState23_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/DIV/INPUT[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget wlightblue\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pull-left\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState23_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV[2]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"modal-loading\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-area-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container-assets container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"dLabel\"","class=\"dropdown-menu dropdown-account\"","role=\"menu\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn-group context_menu left\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState23_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV/UL/LI[3]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav nav-list \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"sidebar-nav\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"prominent-link\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState24_OriginalAssertions(){
	}

	public void checkState24_ReusedAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch
		assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Asset updated successfully")); // reused assertion in case of ElementFullMatch
	}

	public void checkState24_GeneratedAssertions(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"","href=\"/store/login\"","id=\"btn-register\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.cssSelector("ul.nav li a.dropdown-toggle"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState24_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"tbl-upload-inner\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"table tbl-upload\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState24_AllAssertions(){
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText()); // reused assertion in case of ElementFullMatch

		assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Asset updated successfully")); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-toggle\"","data-toggle=\"dropdown\"","href=\"#\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-user\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"caret\""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"btn disabled\"","data-aid=\"f76c59df-a7fa-416e-a9df-7e339e69d71e\"","data-toggle=\"modal\"","data-type=\"gadget\"","href=\"#modal-add-gadget\"","id=\"btn-add-gadget\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"asset-introduction-box\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store/login\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState24_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/A/SPAN"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-retweet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/asset/operations/lifecycle/gadget/516c6738-2532-4c78-aa7d-67f18a80388f\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control-group\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid ribbon\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"search-button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"search-prefix\"","type=\"hidden\"","value=\"gadget\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState24_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL/LI/UL/LI/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version-control-group\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState24_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/DIV/INPUT[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inp-ribbon span12\"","id=\"inp_searchAsset\"","placeholder=\"Search..\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span3 pull-right control-search\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-cog\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/gadget/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/themes/default/css/bootstrap.min.css\"","media=\"screen\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget-head\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"widget wlightblue\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pull-left\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearfix\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState24_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV/DIV/UL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-body\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","aria-labelledby=\"myModalLabel\"","class=\"modal hide fade\"","id=\"modal-redirect\"","role=\"dialog\"","tabindex=\"-1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"modal-loading\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content-area-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"container-assets container\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid content-area\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"dropdown-menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn-group context_menu left\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar-inner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navbar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"container\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState24_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/DIV/DIV/DIV/UL/LI[3]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"nav nav-list \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"sidebar-nav\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"prominent-link\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-primary\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modal-footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-site\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher/assets/site/\"","target=\"_self\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version\"","placeholder=\"New version\"","style=\"margin: 0px; width: 81px;\"","type=\"text\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"asset-new-version-control-group\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState25_OriginalAssertions(){
	}

	public void checkState25_ReusedAssertions(){
	}

	public void checkState25_GeneratedAssertions(){
	}

	public void checkState25_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState25_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState25_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL/LI[2]/A/I"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wso2.com\"","id=\"logo-wso2\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"","id=\"form-cont\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 offset2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"span8\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-th-large\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState25_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/store\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-th-large\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("I", "", new ArrayList<String>(Arrays.asList("class=\"icon-check-sign\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/publisher\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState25_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV[2]/UL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV[2]/FORM/DIV[4]/LABEL"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"regFormError\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-success\"","id=\"regFormSuc\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-large btn-primary pull-right\"","id=\"registrationSubmit\"","type=\"button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("src=\"views/img/logo-banner.png\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span8 form-header\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState25_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span12\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer row-fluid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"row-fluid\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"input-block-level\"","id=\"password\"","name=\"password\"","type=\"password\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"views/css/bootstrap.min.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState25_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV/FORM/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/DIV/DIV/DIV/DIV/DIV"))); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"checkbox lblRemember\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("name=\"sessionDataKey\"","type=\"hidden\"","value=\"4ba06fa5-9a63-418d-bc4a-eb49e31fcb3f\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-large pull-right\"","type=\"submit\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/admin/commonauth\"","id=\"loginForm\"","method=\"POST\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"input-block-level\"","id=\"username\"","name=\"username\"","type=\"text\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"views/css/font-awesome.min.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("id=\"registerForm\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"span6\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-signin-heading\""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-error\"","id=\"regFormError\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"alert alert-success\"","id=\"regFormSuc\"","style=\"display:none\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"control\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"btn btn-large btn-primary pull-right\"","id=\"registrationSubmit\"","type=\"button\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BUTTON", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
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