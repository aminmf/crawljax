package com.crawljax.plugins.testsuiteextension.generated.photogallery_EP;

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
 * Generated @ Tue Apr 08 01:14:56 PDT 2014
 */

public class GeneratedTestCase24 {

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
		url = "http://localhost:8888/phormer331/";
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
	public void method24(){
		driver.get(url);
		//From state 0 to state 23
		//Eventable{eventType=click, identification=text Stories, element=Element{node=[A: null], tag=A, text=Stories, attributes={href=.?mode=stories}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=23, name=state23}}
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
		driver.findElement(By.linkText("Stories")).click();
		//From state 23 to state 24
		//Eventable{eventType=click, identification=partialText Default Category, element=Element{node=[A: null], tag=A, text=???Default Category[6], attributes={href=.?c=1, title=The default category }}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
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
		driver.findElement(By.partialLinkText("Default Category")).click();
		//From state 24 to state 68
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SPAN[3]/A[1], element=Element{node=[A: null], tag=A, text=Default Category, attributes={class=theTitleA, href=.?c=1}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=68, name=state68}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/SPAN[3]/A[1]")).click();
		//Sink node at state 68
		mutateDOMTree(68);
		checkState68_OriginalAssertions();
		checkState68_ReusedAssertions();
		checkState68_GeneratedAssertions();
		checkState68_LearnedAssertions();
		checkState68_AllAssertions();
		checkState68_RandAssertions1();
		checkState68_RandAssertions2();
		checkState68_RandAssertions3();
		checkState68_RandAssertions4();
		checkState68_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"photoBoxes\"","style=\"display: block;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\"","style=\"line-height: 150%\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"photoBoxes\"","style=\"display: block;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\"","style=\"line-height: 150%\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

	}

	public void checkState0_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[4]/SPAN/A/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[3]/CENTER/A/BR")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000002_ieqey_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?rpn=20\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion

	}

	public void checkState0_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[3]/A[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/CENTER/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","title=\"RSS Feed\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion

	}

	public void checkState0_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[2]/SPAN/A/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/BR[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion

	}

	public void checkState0_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000004_dzeck_3.jpg\"","width=\"75px\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion

	}

	public void checkState0_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/CENTER/A/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000001_xbudk_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion

	}

	public void checkState23_OriginalAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState23_ReusedAssertions(){
	}

	public void checkState23_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

	}

	public void checkState23_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState23_AllAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

	}

	public void checkState23_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[4]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/DIV[2]/DIV[2]/CENTER/A/BR")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState23_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[2]/SPAN/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[2]/A[5]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aStory\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState23_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[5]/SPAN/A/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"admin.php\"","title=\"Login to the Administration Region\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState23_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[6]/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aStory\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState23_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[2]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000001_xbudk_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState24_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState24_ReusedAssertions(){
	}

	public void checkState24_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState24_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState24_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState24_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[4]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[2]/SPAN/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState24_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[5]/SPAN/A/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"end\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState24_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/CENTER/A/DIV[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"admin.php\"","title=\"Login to the Administration Region\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"start\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState24_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[6]/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[5]/CENTER/A/DIV[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState24_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[3]/CENTER/A/BR")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[2]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincolinner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"start\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"end\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState68_OriginalAssertions(){
	}

	public void checkState68_ReusedAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState68_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState68_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState68_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState68_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[4]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[2]/SPAN/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState68_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"end\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState68_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[5]/SPAN/A/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/CENTER/A/DIV[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"admin.php\"","title=\"Login to the Administration Region\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"start\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState68_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[6]/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[3]/CENTER/A/BR")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState68_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[5]/CENTER/A/DIV[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[2]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincolinner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"start\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"end\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
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