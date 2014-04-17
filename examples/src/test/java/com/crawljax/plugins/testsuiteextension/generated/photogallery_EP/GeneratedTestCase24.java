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
 * Generated @ Wed Apr 16 20:43:32 PDT 2014
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
		//From state 24 to state 25
		//Eventable{eventType=click, identification=partialText Default Story, element=Element{node=[A: null], tag=A, text=???Default Story[6], attributes={href=.?s=1, title=The default story [2006/04/01]}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
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
		driver.findElement(By.partialLinkText("Default Story")).click();
		//From state 25 to state 26
		//Eventable{eventType=click, identification=text SlideShow, element=Element{node=[A: null], tag=A, text=SlideShow, attributes={href=.?feat=slideshow&s=1&n=30}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=26, name=state26}}
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
		driver.findElement(By.linkText("SlideShow")).click();
		//From state 26 to state 50
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[2]/A[1], element=Element{node=[A: null], tag=A, text=Smaller Size, attributes={class=q, id=ss_smaller_link, onclick=javascript:ss_toggleSmaller();}}, source=StateVertexImpl{id=26, name=state26}, target=StateVertexImpl{id=50, name=state50}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[2]/A[1]")).click();
		//Sink node at state 50
		mutateDOMTree(50);
		checkState50_OriginalAssertions();
		checkState50_ReusedAssertions();
		checkState50_GeneratedAssertions();
		checkState50_LearnedAssertions();
		checkState50_AllAssertions();
		checkState50_RandAssertions1();
		checkState50_RandAssertions2();
		checkState50_RandAssertions3();
		checkState50_RandAssertions4();
		checkState50_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))) System.out.println("167"); // original assertion

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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("183"); // generated assertion in case of AEP for Original

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("188"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("194"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("200"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"photoBoxes\"","style=\"display: block;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
childrenElements.add(new DOMElement("DIV", "PhotoNotesNoDescripton.", new ArrayList<String>(Arrays.asList("class=\"photoBox\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\"","style=\"line-height: 150%\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("212"); // generated assertion in case of RegionTagMatch

	}

	public void checkState0_LearnedAssertions(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("225"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("232"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("238"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("246"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("252"); // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))) System.out.println("257"); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("267"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("277"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("284"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("290"); // predicted region assertion

	}

	public void checkState0_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[[class=\"end\"]")))) System.out.println("295"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[6]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("300"); // Random element assertion
		element = new DOMElement("SPAN", "MyLinks", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("305"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\""))));
childrenElements.add(new DOMElement("SPAN", "[SlideShow]", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "RecentlyAddedPhotos", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("316"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[2]/CENTER/A/BR[]")))) System.out.println("317"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("325"); // Random element assertion
		element = new DOMElement("DIV", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("332"); // Random element assertion
		element = new DOMElement("A", "100_0760November9tho12", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000003_ncupw_3.jpg\"","width=\"75px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
childrenElements.add(new DOMElement("DIV", "100_0760", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("344"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?rpn=10\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("349"); // Random element assertion
		element = new DOMElement("DIV", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0773November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("356"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("364"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\""))));
childrenElements.add(new DOMElement("DIV", "Photos:6", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "TodayHits:3", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "ThisMonth:3", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PhotoHits:11,410", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("385"); // Random element assertion
		element = new DOMElement("SPAN", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("390"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[[class=\"item\"]")))) System.out.println("391"); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0758November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("398"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("BR", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1440 hits and rated 1 by 3 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("405"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[class=\"item\"]")))) System.out.println("406"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("411"); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0758November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("418"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/CENTER/A/IMG[@height=\"75px\" and @@src=\"images/000006_rryky_3.jpg\" and @width=\"75px\"]")))) System.out.println("419"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=2\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("427"); // Random element assertion
		element = new DOMElement("DIV", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("432"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/BR[]")))) System.out.println("433"); // Random element assertion
		element = new DOMElement("A", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000003_ncupw_3.jpg\"","width=\"75px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
childrenElements.add(new DOMElement("DIV", "2monthsago", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("445"); // Random element assertion
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("DIV", "Stories", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("454"); // Random element assertion
	}

	public void checkState23_OriginalAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))) System.out.println("458"); // original assertion

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("474"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("476"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("481"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("487"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("493"); // generated assertion in case of RegionTagMatch

	}

	public void checkState23_LearnedAssertions(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("506"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("513"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("519"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("527"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("533"); // predicted region assertion

	}

	public void checkState23_AllAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))) System.out.println("538"); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("548"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("558"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("565"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("571"); // predicted region assertion

	}

	public void checkState23_RandAssertions1(){
		element = new DOMElement("CENTER", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "100_0773November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("582"); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","target=\"_blank\"","title=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("587"); // Random element assertion
		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("592"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[[class=\"submenu\"]")))) System.out.println("593"); // Random element assertion
		element = new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=2\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "flowers", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("601"); // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("DIV", "Statistics", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("613"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("618"); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("624"); // Random element assertion
		element = new DOMElement("BR", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("628"); // Random element assertion
		element = new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "flowers", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("636"); // Random element assertion
	}

	public void checkState23_RandAssertions3(){
		element = new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "flowers", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("647"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aStory\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("DIV", "DefaultStorysinceApril1sto06:Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"end\"","style=\"text-align: right;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "[Viewall6photosofDefaultStory]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("658"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("663"); // Random element assertion
		element = new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("670"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=20\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "20", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("675"); // Random element assertion
	}

	public void checkState23_RandAssertions4(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("683"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[class=\"titlepart\"]")))) System.out.println("684"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV/A[href=\".?mode=stories\"]")))) System.out.println("685"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[2]/A[[href=\".?mode=stories&rsn=100\"]")))) System.out.println("686"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[class=\"titlepart\"]")))) System.out.println("687"); // Random element assertion
	}

	public void checkState23_RandAssertions5(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
childrenElements.add(new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\""))));
childrenElements.add(new DOMElement("#text", "ispoweredby", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Phormer,version3.31", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\""))));
childrenElements.add(new DOMElement("#text", ".", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Me", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ".", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("705"); // Random element assertion
		element = new DOMElement("DIV", "Phorm", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("A", "Phorm", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org\"","target=\"_blank\"","title=\"Another Phormation\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("711"); // Random element assertion
		element = new DOMElement("A", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "DefaultCategory", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("719"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[3]/SPAN[class=\"dot\"]")))) System.out.println("720"); // Random element assertion
		element = new DOMElement("A", "Phormer3.31", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"","title=\"Rephorm Your Phormer Pharm!\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phormer3.31", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("725"); // Random element assertion
	}

	public void checkState24_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))) System.out.println("729"); // original assertion

	}

	public void checkState24_ReusedAssertions(){
	}

	public void checkState24_GeneratedAssertions(){
		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("743"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("753"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("761"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("763"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo[class=\"midInfo\"]")))) System.out.println("765"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState24_LearnedAssertions(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("778"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("785"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("791"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("799"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("805"); // predicted region assertion

	}

	public void checkState24_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))) System.out.println("810"); // original assertion

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("818"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("828"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("836"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("846"); // predicted region assertion

	}

	public void checkState24_RandAssertions1(){
		element = new DOMElement("TITLE", "\"DefaultCategory\"CategoryofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "\"DefaultCategory\"CategoryofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("855"); // Random element assertion
		element = new DOMElement("SPAN", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("860"); // Random element assertion
		element = new DOMElement("DIV", "Statistics", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Statistics", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("866"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?c=1&n=50\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "50", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("871"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[class=\"part\"]")))) System.out.println("872"); // Random element assertion
	}

	public void checkState24_RandAssertions2(){
		element = new DOMElement("DIV", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("881"); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("886"); // Random element assertion
		element = new DOMElement("DIV", "Phorm", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("A", "Phorm", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org\"","target=\"_blank\"","title=\"Another Phormation\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("892"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/SPAN/A/SPAN[[class=\"categinfo\"]")))) System.out.println("893"); // Random element assertion
		element = new DOMElement("DIV", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0772", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("898"); // Random element assertion
	}

	public void checkState24_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
childrenElements.add(new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\""))));
childrenElements.add(new DOMElement("#text", "ispoweredby", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Phormer,version3.31", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\""))));
childrenElements.add(new DOMElement("#text", ".", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Me", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ".", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("916"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("925"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/CENTER/A/BR[]")))) System.out.println("926"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[2]/SPAN[class=\"dot\"]")))) System.out.println("927"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/CENTER/A/DIV[[class=\"thumbDate\"]")))) System.out.println("928"); // Random element assertion
	}

	public void checkState24_RandAssertions4(){
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","target=\"_blank\"","title=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("936"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("941"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("946"); // Random element assertion
		element = new DOMElement("DIV", "100_0760November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0760November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("953"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("960"); // Random element assertion
	}

	public void checkState24_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[id=\"sidecol\"]")))) System.out.println("964"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[class=\"titlepart\"]")))) System.out.println("965"); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","target=\"_blank\"","title=\"\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("971"); // Random element assertion
		element = new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("976"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"end\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("981"); // Random element assertion
	}

	public void checkState25_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"))) System.out.println("985"); // original assertion

	}

	public void checkState25_ReusedAssertions(){
	}

	public void checkState25_GeneratedAssertions(){
		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("999"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1009"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1017"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1019"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo[class=\"midInfo\"]")))) System.out.println("1021"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState25_LearnedAssertions(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1034"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1041"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1047"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1055"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1061"); // predicted region assertion

	}

	public void checkState25_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"))) System.out.println("1066"); // original assertion

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1074"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1084"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1092"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1102"); // predicted region assertion

	}

	public void checkState25_RandAssertions1(){
		element = new DOMElement("DIV", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Stories:2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1112"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[6]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1117"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\""))));
childrenElements.add(new DOMElement("DIV", "Photos:6", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "TodayHits:4", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "ThisMonth:4", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PhotoHits:11,409", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1138"); // Random element assertion
		element = new DOMElement("TITLE", "\"DefaultStory\"StoryofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "\"DefaultStory\"StoryofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1143"); // Random element assertion
		element = new DOMElement("DIV", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Stories:2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1149"); // Random element assertion
	}

	public void checkState25_RandAssertions2(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1157"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1161"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[[style=\"clear:both;\"]")))) System.out.println("1162"); // Random element assertion
		element = new DOMElement("DIV", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1167"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=2\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1172"); // Random element assertion
	}

	public void checkState25_RandAssertions3(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1180"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/SPAN/A/SPAN[class=\"dot\"]")))) System.out.println("1181"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=20\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "20", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1186"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[6]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1191"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1198"); // Random element assertion
	}

	public void checkState25_RandAssertions4(){
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"font-size: 1em; padding-right: 4px;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1206"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[4]/CENTER/A[@href=\".?p=3\" and @title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"]")))) System.out.println("1207"); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"headerDot\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1218"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[[style=\"clear:both;\"]")))) System.out.println("1219"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1234"); // Random element assertion
	}

	public void checkState25_RandAssertions5(){
		element = new DOMElement("SPAN", "Photos:6", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1242"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1247"); // Random element assertion
		element = new DOMElement("SPAN", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1252"); // Random element assertion
		element = new DOMElement("IMG", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000006_rryky_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1256"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[[class=\"submenu\"]")))) System.out.println("1257"); // Random element assertion
	}

	public void checkState26_OriginalAssertions(){
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))) System.out.println("1261"); // original assertion

	}

	public void checkState26_ReusedAssertions(){
		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1266"); // reused assertion in case of ElementFullMatch
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1267"); // reused assertion in case of ElementFullMatch
	}

	public void checkState26_GeneratedAssertions(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1274"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1280"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1286"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1288"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]")))) System.out.println("1290"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState26_LearnedAssertions(){
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1303"); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1309"); // predicted region assertion

		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1317"); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1325"); // predicted region assertion

		element = new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=30\""))));
childrenElements.add(new DOMElement("A", "Back", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1333"); // predicted region assertion

	}

	public void checkState26_AllAssertions(){
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))) System.out.println("1338"); // original assertion

		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1340"); // reused assertion in case of ElementFullMatch

		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1342"); // reused assertion in case of ElementFullMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1347"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1353"); // generated assertion in case of RegionTagAttMatch

	}

	public void checkState26_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[@class=\"partmain\" and @id=\"slideShow\"]")))) System.out.println("1358"); // Random element assertion
		element = new DOMElement("SPAN", "100_0794", new ArrayList<String>(Arrays.asList("id=\"ss_title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0794", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1363"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/SELECT/OPTION[[@selected=\"selected\" and @value=\"10000\"]")))) System.out.println("1364"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[class=\"topPhorm\"]")))) System.out.println("1365"); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1370"); // Random element assertion
	}

	public void checkState26_RandAssertions2(){
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1379"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[[@class=\"end\" and @style=\"padding-top: 0px\"]")))) System.out.println("1380"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/SPAN[class=\"dt\"]")))) System.out.println("1381"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/SELECT/OPTION[[@selected=\"selected\" and @value=\"10000\"]")))) System.out.println("1382"); // Random element assertion
		element = new DOMElement("TR", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\""))));
childrenElements.add(new DOMElement("TD", "[Pauseit]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1391"); // Random element assertion
	}

	public void checkState26_RandAssertions3(){
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"30000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "30Sec", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1399"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\""))));
childrenElements.add(new DOMElement("SPAN", "[SmallerSize]", new ArrayList<String>(Arrays.asList("href=\".?feat=slideshow&s=1\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\""))));
childrenElements.add(new DOMElement("#text", "SlideShowof", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "\"DefaultStory\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "::Slide", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "of6", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0794", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1416"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/SELECT[@class=\"rate\" and @@id=\"ss_refresh\" and @style=\"position: relative; top: 6px;\"]")))) System.out.println("1417"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\""))));
childrenElements.add(new DOMElement("SPAN", "[SmallerSize]", new ArrayList<String>(Arrays.asList("href=\".?feat=slideshow&s=1\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\""))));
childrenElements.add(new DOMElement("#text", "SlideShowof", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "\"DefaultStory\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "::Slide", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "of6", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0794", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1434"); // Random element assertion
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"divClear\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1438"); // Random element assertion
	}

	public void checkState26_RandAssertions4(){
		element = new DOMElement("A", "\"DefaultStory\"", new ArrayList<String>(Arrays.asList("href=\".?feat=slideshow&s=1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "\"DefaultStory\"", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1446"); // Random element assertion
		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1453"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/SPAN[[id=\"ss_n\"]")))) System.out.println("1454"); // Random element assertion
		element = new DOMElement("A", "[Pauseit]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_playpause_link2\"","onclick=\"javascript:ss_playpause();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pauseit", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1459"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1466"); // Random element assertion
	}

	public void checkState26_RandAssertions5(){
		element = new DOMElement("A", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1476"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("language=\"javascript\"","type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1485"); // Random element assertion
		element = new DOMElement("SCRIPT", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/phorm.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1489"); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1495"); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1500"); // Random element assertion
	}

	public void checkState50_OriginalAssertions(){
	}

	public void checkState50_ReusedAssertions(){
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1507"); // reused assertion in case of ElementFullMatch
	}

	public void checkState50_GeneratedAssertions(){
		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1515"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1521"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1523"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]")))) System.out.println("1525"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1530"); // generated assertion in case of RegionTagMatch

	}

	public void checkState50_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1538"); // predicted region assertion

		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1548"); // predicted region assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1554"); // predicted region assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1560"); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1566"); // predicted region assertion

	}

	public void checkState50_AllAssertions(){
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1571"); // reused assertion in case of ElementFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1577"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1583"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1588"); // predicted region assertion

		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1598"); // predicted region assertion

	}

	public void checkState50_RandAssertions1(){
		element = new DOMElement("IMG", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000005_jfaji_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1606"); // Random element assertion
		element = new DOMElement("BR", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1610"); // Random element assertion
		element = new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "OtherLinks", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1616"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/SPAN[class=\"categeach\"]")))) System.out.println("1617"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1624"); // Random element assertion
	}

	public void checkState50_RandAssertions2(){
		element = new DOMElement("DIV", "Phormer3.31", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"","title=\"Rephorm Your Phormer Pharm!\""))));
childrenElements.add(new DOMElement("A", "Phormer3.31", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1634"); // Random element assertion
		element = new DOMElement("TD", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_next();\""))));
childrenElements.add(new DOMElement("A", "Next", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1641"); // Random element assertion
		element = new DOMElement("DIV", "Photos:6", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Photos:6", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1647"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=10\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1652"); // Random element assertion
		element = new DOMElement("SPAN", "April1st06", new ArrayList<String>(Arrays.asList("class=\"small\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "April1st06", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1657"); // Random element assertion
	}

	public void checkState50_RandAssertions3(){
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=50\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "50", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1665"); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"20000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "20Sec", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1670"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("DIV", "Categories", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1679"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1683"); // Random element assertion
		element = new DOMElement("BR", "100_0760November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1687"); // Random element assertion
	}

	public void checkState50_RandAssertions4(){
		element = new DOMElement("DIV", "Photos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categeach\""))));
childrenElements.add(new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1697"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[[@style=\"text-align: center\" and @width=\"50%\"]")))) System.out.println("1698"); // Random element assertion
		element = new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1705"); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1710"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[6]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1715"); // Random element assertion
	}

	public void checkState50_RandAssertions5(){
		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1725"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[4]/DIV[3]/DIV[class=\"item\"]")))) System.out.println("1726"); // Random element assertion
		element = new DOMElement("SCRIPT", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/phorm.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1730"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1737"); // Random element assertion
		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Email", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "RSS", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdminPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1748"); // Random element assertion
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


	private boolean isElementRegionTagPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
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


	private boolean isElementRegionTagAttPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
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


	private boolean isElementRegionFullPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				// check node's text and attributes
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);
				if (!element.getTextContent().equals(sourceElement.getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", "")))
					continue;
				NamedNodeMap elementAttList = sourceElement.getAttributes();
				HashSet<String> elemetAtts = new HashSet<String>();
				for (int j = 0; j < elementAttList.getLength(); j++)
					elemetAtts.add(elementAttList.item(j).getNodeName() + "=\"" + elementAttList.item(j).getNodeValue() + "\"");
				if (!element.getAttributes().equals(elemetAtts))
					continue;
				
				// check parent node's text, tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parent.getTextContent().equals(sourceElement.getParentNode().getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", "")))
					continue;
				if (!parentTagName.equals(parent.getTagName()))
					continue;
				NamedNodeMap parentAttList = sourceElement.getParentNode().getAttributes();
				HashSet<String> parentAtts = new HashSet<String>();
				for (int j = 0; j < parentAttList.getLength(); j++)
					parentAtts.add(parentAttList.item(j).getNodeName() + "=\"" + parentAttList.item(j).getNodeValue() + "\"");
				if (!parent.getAttributes().equals(parentAtts))
					continue;

	
				// check children nodes' text
				HashSet<String> childrenTextFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTextFromDOM.add(sourceElement.getChildNodes().item(j).getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", ""));
				HashSet<String> childrenTextToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTextToTest.add(children.get(k).getTextContent());
				if (!childrenTextToTest.equals(childrenTextFromDOM))
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
