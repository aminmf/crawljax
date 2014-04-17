package com.crawljax.plugins.testsuiteextension.generated.photogallery_EP.copy;

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
 * Generated @ Wed Apr 16 20:43:33 PDT 2014
 */

public class GeneratedTestCase35 {

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
	public void method35(){
		driver.get(url);
		//From state 0 to state 32
		//Eventable{eventType=click, identification=text SlideShow, element=Element{node=[A: null], tag=A, text=SlideShow, attributes={href=.?feat=slideshow}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=32, name=state32}}
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
		driver.findElement(By.linkText("SlideShow")).click();
		//From state 32 to state 33
		//Eventable{eventType=click, identification=id ss_playpause_link, element=Element{node=[A: null], tag=A, text=Pause it, attributes={class=q, id=ss_playpause_link, onclick=javascript:ss_playpause();}}, source=StateVertexImpl{id=32, name=state32}, target=StateVertexImpl{id=33, name=state33}}
		mutateDOMTree(32);
		checkState32_OriginalAssertions();
		checkState32_ReusedAssertions();
		checkState32_GeneratedAssertions();
		checkState32_LearnedAssertions();
		checkState32_AllAssertions();
		checkState32_RandAssertions1();
		checkState32_RandAssertions2();
		checkState32_RandAssertions3();
		checkState32_RandAssertions4();
		checkState32_RandAssertions5();
		driver.findElement(By.id("ss_playpause_link")).click();
		//From state 33 to state 34
		//Eventable{eventType=click, identification=text Next, element=Element{node=[A: null], tag=A, text=Next, attributes={class=q, onclick=javascript:ss_next();}}, source=StateVertexImpl{id=33, name=state33}, target=StateVertexImpl{id=34, name=state34}}
		mutateDOMTree(33);
		checkState33_OriginalAssertions();
		checkState33_ReusedAssertions();
		checkState33_GeneratedAssertions();
		checkState33_LearnedAssertions();
		checkState33_AllAssertions();
		checkState33_RandAssertions1();
		checkState33_RandAssertions2();
		checkState33_RandAssertions3();
		checkState33_RandAssertions4();
		checkState33_RandAssertions5();
		driver.findElement(By.linkText("Next")).click();
		//From state 34 to state 76
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=.?p=5, id=ss_link2, style=display:inline;}}, source=StateVertexImpl{id=34, name=state34}, target=StateVertexImpl{id=76, name=state76}}
		mutateDOMTree(34);
		checkState34_OriginalAssertions();
		checkState34_ReusedAssertions();
		checkState34_GeneratedAssertions();
		checkState34_LearnedAssertions();
		checkState34_AllAssertions();
		checkState34_RandAssertions1();
		checkState34_RandAssertions2();
		checkState34_RandAssertions3();
		checkState34_RandAssertions4();
		checkState34_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[3]/A[1]")).click();
		//Sink node at state 76
		mutateDOMTree(76);
		checkState76_OriginalAssertions();
		checkState76_ReusedAssertions();
		checkState76_GeneratedAssertions();
		checkState76_LearnedAssertions();
		checkState76_AllAssertions();
		checkState76_RandAssertions1();
		checkState76_RandAssertions2();
		checkState76_RandAssertions3();
		checkState76_RandAssertions4();
		checkState76_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion

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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState0_RandAssertions1(){
		element = new DOMElement("SPAN", "Poweredby", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Etc", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[4]/DIV[5]/DIV/SPAN[class=\"dot\"]"))); // Random element assertion
		element = new DOMElement("A", "Email", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[id=\"sidecol\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[3]/CENTER/A/IMG[@height=\"75px\" and @@src=\"images/000005_jfaji_3.jpg\" and @width=\"75px\"]"))); // Random element assertion
		element = new DOMElement("A", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "DefaultStory", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?rpn=50\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "50", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1440 hits and rated 1 by 3 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0759", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/SPAN[class=\"headerDot\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"end\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?rpn=5\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "5", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "AdminPage", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","target=\"_blank\"","title=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"clear:both;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0772November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000003_ncupw_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "11monthsago", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[3]/A[href=\".?rpn=5\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[4]/DIV[2]/SPAN[class=\"reddot\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV[3]/CENTER/A[@href=\".?p=4\" and @title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"]"))); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "11monthsago", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV/A[href=\".\"]"))); // Random element assertion
	}

	public void checkState32_OriginalAssertions(){
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$")); // original assertion

	}

	public void checkState32_ReusedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // reused assertion in case of ElementFullMatch
		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // reused assertion in case of ElementFullMatch
	}

	public void checkState32_GeneratedAssertions(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState32_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState32_AllAssertions(){
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$")); // original assertion

		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // reused assertion in case of ElementFullMatch

		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // reused assertion in case of ElementFullMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

	}

	public void checkState32_RandAssertions1(){
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[SmallerSize]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_smaller_link\"","onclick=\"javascript:ss_toggleSmaller();\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SmallerSize", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState32_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[3]/A/IMG[@id=\"ss_photo\" and @@onload=\"javscript:ss_loaddone();\" and @src=\"images/000006_rryky_0.jpg\"]"))); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[@class=\"titlepart\" and @style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/A[[href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"]"))); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"2000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2Sec", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState32_RandAssertions3(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("id=\"ss_date\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"end\"","style=\"padding-top: 0px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Friday,Nov9tho2012", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[@class=\"partmain\" and @id=\"slideShow\"]"))); // Random element assertion
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"divClear\""))));
childrenElements.add(new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/SPAN[[class=\"dt\"]"))); // Random element assertion
	}

	public void checkState32_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD/A[@class=\"q\" and @onclick=\"javascript:ss_prev();\"]"))); // Random element assertion
		element = new DOMElement("A", "[SmallerSize]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_smaller_link\"","onclick=\"javascript:ss_toggleSmaller();\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SmallerSize", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"clear:both;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState32_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[@class=\"titlepart\" and @style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV[class=\"footer\"]"))); // Random element assertion
		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_prev();\""))));
childrenElements.add(new DOMElement("A", "Previous", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Pauseit]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_playpause_link2\"","onclick=\"javascript:ss_playpause();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pauseit", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState33_OriginalAssertions(){
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // original assertion

		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

	}

	public void checkState33_ReusedAssertions(){
	}

	public void checkState33_GeneratedAssertions(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState33_LearnedAssertions(){
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\""))));
childrenElements.add(new DOMElement("SPAN", "[SmallerSize]", new ArrayList<String>(Arrays.asList("href=\".?feat=slideshow\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_n\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\""))));
childrenElements.add(new DOMElement("#text", "SlideShowof", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "\"RecentPhotos\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "::Slide", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "of6", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0794", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"clear:both;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState33_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // original assertion

		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

	}

	public void checkState33_RandAssertions1(){
		element = new DOMElement("TD", "[Previous][Playit][Next]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_playpause_link2\"","onclick=\"javascript:ss_playpause();\""))));
childrenElements.add(new DOMElement("A", "Playit", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[id=\"headSlideshow\"]"))); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[SmallerSize]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_smaller_link\"","onclick=\"javascript:ss_toggleSmaller();\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SmallerSize", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[3]/A[@class=\"q\" and @onclick=\"javascript:ss_next();\"]"))); // Random element assertion
	}

	public void checkState33_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("id=\"ss_date\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "[Previous][Playit][Next]", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"end\"","style=\"padding-top: 0px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Friday,Nov9tho2012", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".&n=30\""))));
childrenElements.add(new DOMElement("A", "Back", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"1000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1Sec", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState33_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[6]/SPAN[id=\"ss_desc\"]"))); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"5000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "5Sec", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "\"RecentPhotos\"", new ArrayList<String>(Arrays.asList("href=\".?feat=slideshow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "\"RecentPhotos\"", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Next]", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_next();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Next", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState33_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/A[href=\".?feat=slideshow\"]"))); // Random element assertion
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"divClear\""))));
childrenElements.add(new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[3]/A[@href=\".?p=6\" and @@id=\"ss_link2\" and @style=\"display:inline;\"]"))); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState33_RandAssertions5(){
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[3]/DIV/BR[[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[[id=\"ss_date\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","rel=\"alternate\"","title=\"RSS\"","type=\"application/rss+xml\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_OriginalAssertions(){
		assertEquals("2", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

	}

	public void checkState34_ReusedAssertions(){
	}

	public void checkState34_GeneratedAssertions(){
		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState34_LearnedAssertions(){
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "100_0772", new ArrayList<String>(Arrays.asList("id=\"ss_title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0772", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"clear:both;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "100_0772", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\""))));
childrenElements.add(new DOMElement("A", "100_0772", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState34_AllAssertions(){
		assertEquals("2", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "100_0772", new ArrayList<String>(Arrays.asList("id=\"ss_title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0772", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState34_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[[style=\"clear:both;\"]"))); // Random element assertion
		element = new DOMElement("TD", "[Next]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_next();\""))));
childrenElements.add(new DOMElement("A", "Next", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000005_jfaji_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"divClear\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"30000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "30Sec", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[class=\"topPhorm\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[id=\"Granny\"]"))); // Random element assertion
		element = new DOMElement("A", "Phormer,version3.31", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phormer,version3.31", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000005_jfaji_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[3]/DIV/B[]"))); // Random element assertion
	}

	public void checkState34_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/SELECT/OPTION[[@selected=\"selected\" and @value=\"10000\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "varDarkenVal=60", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","id=\"ss_link2\"","style=\"display:inline;\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"divClear\""))));
childrenElements.add(new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "[Previous][Playit][Next]", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_prev();\""))));
childrenElements.add(new DOMElement("A", "Previous", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions4(){
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/SPAN[2]/A[@class=\"q\" and @@id=\"ss_smaller_link\" and @onclick=\"javascript:ss_toggleSmaller();\"]"))); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"1000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1Sec", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "[Previous][Playit][Next]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\""))));
childrenElements.add(new DOMElement("TD", "[Playit]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/SPAN[[@class=\"reddot\" and @style=\"padding: 0px 10px;\"]"))); // Random element assertion
	}

	public void checkState34_RandAssertions5(){
		element = new DOMElement("A", "[Next]", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_next();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Next", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@lanugage=\"javascript\" and @type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("language=\"javascript\"","type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[@href=\"css.php?theme=white\" and @@rel=\"stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
	}

	public void checkState76_OriginalAssertions(){
	}

	public void checkState76_ReusedAssertions(){
		assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed() == false); // reused assertion in case of ElementFullMatch
	}

	public void checkState76_GeneratedAssertions(){
		element = new DOMElement("A", "[Showinfo][Up]", new ArrayList<String>(Arrays.asList("href=\"javascript:toggleInfo();\"","target=\"_top\"","title=\"Show/Hide additional info and de/centralize the photo\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"hin\""))));
childrenElements.add(new DOMElement("SPAN", "Show", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "info", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "Yourratingsaved!", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Yourratingsaved!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("span#rateStatus[id=\"rateStatus\"]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState76_LearnedAssertions(){
		element = new DOMElement("DIV", "CommentsContracted", new ArrayList<String>(Arrays.asList("class=\"bcell\"","id=\"contractComments\"","style=\"display: none; text-align: center\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Commenting\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "CommentsContracted", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\""))));
childrenElements.add(new DOMElement("DIV", "[Delete][Edit][Showinfo][Up]100_0772", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"divClear\""))));
childrenElements.add(new DOMElement("DIV", "Prev.100_0773November9tho12", new ArrayList<String>(Arrays.asList("name=\"cmnts\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Next100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "Next100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState76_AllAssertions(){
		assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed() == false); // reused assertion in case of ElementFullMatch

		element = new DOMElement("A", "[Showinfo][Up]", new ArrayList<String>(Arrays.asList("href=\"javascript:toggleInfo();\"","target=\"_top\"","title=\"Show/Hide additional info and de/centralize the photo\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"hin\""))));
childrenElements.add(new DOMElement("SPAN", "Show", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "info", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "Yourratingsaved!", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Yourratingsaved!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "CommentsContracted", new ArrayList<String>(Arrays.asList("class=\"bcell\"","id=\"contractComments\"","style=\"display: none; text-align: center\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Commenting\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "CommentsContracted", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\""))));
childrenElements.add(new DOMElement("DIV", "[Delete][Edit][Showinfo][Up]100_0772", new ArrayList<String>(Arrays.asList("class=\"wholePhoto\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"navigation\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"divClear\""))));
childrenElements.add(new DOMElement("DIV", "Prev.100_0773November9tho12", new ArrayList<String>(Arrays.asList("name=\"cmnts\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Next100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState76_RandAssertions1(){
		element = new DOMElement("CENTER", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\""))));
childrenElements.add(new DOMElement("A", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Original", new ArrayList<String>(Arrays.asList("href=\"images/000005_jfaji_9.jpg\"","title=\"Photo 5 :: 3664x2442 :: 1930KB\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"photoBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Original", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000001_xbudk_3.jpg\"","width=\"75px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
childrenElements.add(new DOMElement("DIV", "100_0758", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0758November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "ReplytoComment:[ViewThat][NewThread]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("id=\"ComReplyTR\"","style=\"display: none;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px\""))));
childrenElements.add(new DOMElement("SPAN", "[ViewThat][NewThread]", new ArrayList<String>(Arrays.asList("id=\"cmntReply\"","name=\"reply\"","size=\"4\"","type=\"text\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState76_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[4]/DIV[4]/CENTER/A/DIV[class=\"thumbNameLine\"]"))); // Random element assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","style=\"text-align: center\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("NOSCRIPT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Delete][Edit][Showinfo][Up]", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=photos&cmd=del&pid=5\"","onclick=\"return confirmDelete('Photo #5')\"","target=\"_top\"","title=\"Delete this photo in the Administration Area\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Delete", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"bottitle\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Commenting\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState76_RandAssertions3(){
		element = new DOMElement("DIV", "100_0760November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[4]/DIV/SPAN[[class=\"darkdot\"]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"   Submit Comment   \"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","style=\"text-align: center\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60\"100_0772\"ofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "\"100_0772\"ofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "varDarkenVal=60\"100_0772\"ofMyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"css.php?theme=white\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState76_RandAssertions4(){
		element = new DOMElement("INPUT", "AsAdmin", new ArrayList<String>(Arrays.asList("checked=\"checked\"","class=\"radio\"","id=\"ComIsAdminYe\"","name=\"byadmin\"","onclick=\"javascript:hideElem('ComNameTR');hideElem('ComEmailTR');hideElem('ComWebTR');hideElem('ComWVTR');\"","type=\"radio\"","value=\"yes\"")));
		parentElement = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"ComIsAdminYe\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/CENTER/DIV/DIV/SPAN[[@class=\"reddot\" and @style=\"font-size: 14px\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/CENTER/DIV/DIV[6]/FORM/TABLE/TBODY/TR[[@id=\"ComReplyTR\" and @style=\"display: none;\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/CENTER/DIV/DIV[6]/FORM/TABLE/TBODY/TR[[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/CENTER/DIV/DIV/SPAN/A[@href=\"#hide\" and @onclick=\"toggle('allComments', 'contractComments', this);\"]"))); // Random element assertion
	}

	public void checkState76_RandAssertions5(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"theImage\"","style=\"float: none; margin-right: 55px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"photoTheImg\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"images/000005_jfaji_9.jpg\"","title=\"Click to view original size :: 3664x2442 :: 1930KB\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"divClear\"","style=\"width: 300px;\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"name\"","size=\"20\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"60%\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[3]/DIV[class=\"title\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellpadding=\"2\"","cellspacing=\"2\"","width=\"60%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "AsAdminAsOther", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ComNameTR\"","style=\"display: none ;\""))));
childrenElements.add(new DOMElement("TR", "Name:", new ArrayList<String>(Arrays.asList("id=\"ComEmailTR\"","style=\"display: none ;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"ComWebTR\"","style=\"display: none ;\""))));
childrenElements.add(new DOMElement("TR", "Email:", new ArrayList<String>(Arrays.asList("id=\"ComReplyTR\"","style=\"display: none;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Webpage:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "ReplytoComment:[ViewThat][NewThread]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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