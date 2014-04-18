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
 * Generated @ Wed Apr 16 20:43:33 PDT 2014
 */

public class GeneratedTestCase40 {

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
	public void method40(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=text Admin Page, element=Element{node=[A: null], tag=A, text=Admin Page, attributes={href=admin.php, title=Login to the Administration Region}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.linkText("Admin Page")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=??????Login??????}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.id("loginAdminPass")).clear();
		driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
		driver.findElement(By.cssSelector("input.submit")).click();
		//From state 2 to state 3
		//Eventable{eventType=click, identification=text Manage Stories, element=Element{node=[A: null], tag=A, text=Manage Stories, attributes={href=?page=stories}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
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
		driver.findElement(By.linkText("Manage Stories")).click();
		//From state 3 to state 4
		//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=??????Add Story??????}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
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
		driver.findElement(By.name("desc")).clear();
		driver.findElement(By.name("desc")).sendKeys("Greenery !!");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Photos");
		driver.findElement(By.cssSelector("input.submit")).click();
		//From state 4 to state 5
		//Eventable{eventType=click, identification=cssSelector a[title="Log Out"], element=Element{node=[A: null], tag=A, text=, attributes={href=?page=logout, title=Log Out}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=5, name=state5}}
		mutateDOMTree(4);
		checkState4_OriginalAssertions();
		checkState4_ReusedAssertions();
		checkState4_GeneratedAssertions();
		checkState4_LearnedAssertions();
		checkState4_AllAssertions();
		checkState4_RandAssertions1();
		checkState4_RandAssertions2();
		checkState4_RandAssertions3();
		checkState4_RandAssertions4();
		checkState4_RandAssertions5();
		driver.findElement(By.cssSelector("a[title=\"Log Out\"]")).click();
		//Sink node at state 5
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
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

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
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

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
		element = new DOMElement("CENTER", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "100_0772November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("CENTER", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1440 hits and rated 1 by 3 person\""))));
childrenElements.add(new DOMElement("A", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("CENTER", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN/A[href=\".?feat=slideshow\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[5]/CENTER/A/DIV[[class=\"thumbDate\"]"))); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?rpn=100\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?trn=10#tr\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[2]/CENTER[]"))); // Random element assertion
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1440 hits and rated 1 by 3 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0773", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Etc", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[[class=\"titlepart\"]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[7]/SPAN[class=\"dot\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/A[name=\"tr\"]"))); // Random element assertion
		element = new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("DIV", "MyLinks", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "OtherLinks", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Phorm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"headerDot\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "TodayHits:3", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("SPAN", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Photos[0]", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"headerDot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[@class=\"aThumb\" and @@onmouseout=\"javascript: DarkenIt(this);\" and @@onmouseover=\"javascript: LightenIt(this);\" and @style=\"-moz-opacity:0.6;\"]"))); // Random element assertion
	}

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState1_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Granny", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left; background: #E8F0F8\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("style=\"text-align: center; font-size: 1.0em; margin: 0px 0px 8px; \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState1_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Granny", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left; background: #E8F0F8\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("style=\"text-align: center; font-size: 1.0em; margin: 0px 0px 8px; \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState1_RandAssertions1(){
		element = new DOMElement("BR", "Administrator'spassword:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Update Message', event, 'en');\"","title=\"Help on \"Update Message', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onblur=\"javascript:blured=true;\"","onfocus=\"javascript:if(blured){try{dg('loginAdminPass').focus();blured=false;}catch(e){}}\"","onload=\"javascript:PrepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\""))));
childrenElements.add(new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/admin.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState1_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/SPAN[class=\"name\"]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/FORM/CENTER/INPUT[[@class=\"submit\" and @@type=\"submit\" and @value=\"??????Login??????\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/help.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("id=\"helpBoxInner\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "LogintoYourPhormerAdministrator'spassword:", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState1_RandAssertions3(){
		element = new DOMElement("A", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Granny", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER[]"))); // Random element assertion
		element = new DOMElement("DIV", "LogintoYourPhormerAdministrator'spassword:", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("action=\"admin.php\"","method=\"post\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "Administrator'spassword:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/skeleton.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState1_RandAssertions4(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[[@class=\"method\" and @style=\"text-align: left; background: #E8F0F8\"]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/BR[]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]"))); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[[class=\"inside\"]"))); // Random element assertion
	}

	public void checkState1_RandAssertions5(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR[[]"))); // Random element assertion
		element = new DOMElement("CENTER", "Administrator'spassword:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin.php\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administrator'spassword:", new ArrayList<String>(Arrays.asList("style=\"margin-bottom: 10px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"text\"","id=\"loginAdminPass\"","name=\"passwd\"","size=\"12\"","style=\"font-size: 2em; font-family: courier new, tahoma, helvetica, serif; font-weight: bold;\"","type=\"password\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"submit\"","type=\"submit\"","value=\"??????Login??????\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","colspan=\"2\"","width=\"295px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Update Message', event, 'en');\"","title=\"Help on \"Update Message', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.method[class=\"method\"]"))); // generated assertion in case of ElementTagAttMatch

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

	}

	public void checkState2_LearnedAssertions(){
		element = new DOMElement("SPAN", "ManageWorks:", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Drafts', event, 'en');\"","title=\"Help on \"Manage Drafts', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "::::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Granny", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState2_AllAssertions(){
		element = new DOMElement("SPAN", "ManageWorks:", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Drafts', event, 'en');\"","title=\"Help on \"Manage Drafts', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"shortCuts\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "::::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Granny", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState2_RandAssertions1(){
		element = new DOMElement("A", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: snow;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[4]/BR[]"))); // Random element assertion
		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Drafts', event, 'en');\"","title=\"Help on \"Manage Drafts', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE/TBODY/TR/TD[@valign=\"top\" and @width=\"49%\"]"))); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=configs\"","title=\"Advanced Configurations\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_configs.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/NOSCRIPT[]"))); // Random element assertion
		element = new DOMElement("A", "AdministrationRegion(?)", new ArrayList<String>(Arrays.asList("href=\"?page=welcome\"","style=\"color: white\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "[Add]", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\"?page=photos&cmd=doAdd\""))));
childrenElements.add(new DOMElement("A", "Add", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD[@colspan=\"2\" and @@rowspan=\"2\" and @style=\"background-color: #F9F9F9; \"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("valign=\"top\"","width=\"49%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "TechnicalSettings:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("href=\"?page=basis\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("A", "AdjustPreferences", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=configs\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("A", "AdvancedConfigurations", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px;\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("href=\"?page=logout\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "XMLEditor", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_RandAssertions3(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[[@href=\"?page=logout\" and @title=\"Log Out\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/admin.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ViewGallery>>", new ArrayList<String>(Arrays.asList("class=\"back2mainR\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "ViewGallery>>", new ArrayList<String>(Arrays.asList("href=\".\"","target=\"_blank\""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","style=\"margin-top: 18px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("NOSCRIPT", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","style=\"position: relative;\"","width=\"100%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_RandAssertions4(){
		element = new DOMElement("A", "(?)", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Advanced Configurations', event, 'en');\"","title=\"Help on \"Advanced Configurations', eve\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "?", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE/TBODY[]"))); // Random element assertion
		element = new DOMElement("IMG", "ManageStories", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_stories.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=stories\"")));
		childrenElements.clear();
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_preferences.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=basis\"","title=\"Adjust Preferences\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV[@class=\"fieldCont\" and @style=\"margin-bottom: -1px;\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('XML Editor', event, 'en');\"","title=\"Help on \"XML Editor', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "ManageCategories", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_categs.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "(?)", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Photos', event, 'en');\"","title=\"Help on \"Manage Photos', eve\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "?", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState3_OriginalAssertions(){
	}

	public void checkState3_ReusedAssertions(){
	}

	public void checkState3_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.method[class=\"method\"]"))); // generated assertion in case of ElementTagAttMatch

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

	}

	public void checkState3_LearnedAssertions(){
		element = new DOMElement("SPAN", "YesNo", new ArrayList<String>(Arrays.asList("style=\"margin-left: 5px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "NoInheritance1:DefaultStory2:Photos", new ArrayList<String>(Arrays.asList("style=\"margin-left: 10px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("DIV", "ManageStories(?):", new ArrayList<String>(Arrays.asList("class=\"inside\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "AddaNewStoryAddaNewStory", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AddaNewStory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState3_AllAssertions(){
		element = new DOMElement("SPAN", "YesNo", new ArrayList<String>(Arrays.asList("style=\"margin-left: 5px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "NoInheritance1:DefaultStory2:Photos", new ArrayList<String>(Arrays.asList("style=\"margin-left: 10px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("DIV", "ManageStories(?):", new ArrayList<String>(Arrays.asList("class=\"inside\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "AddaNewStoryAddaNewStory", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AddaNewStory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState3_RandAssertions1(){
		element = new DOMElement("TD", "Password:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("id=\"passwordRow\"","style=\"display: none\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password:", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[[@href=\"?page=editxml\" and @title=\"XML Editor\"]"))); // Random element assertion
		element = new DOMElement("TD", "Date:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Date:", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"text\"","id=\"date\"","name=\"date\"","size=\"32\"","type=\"text\"","value=\"2014/04/17\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV/FIELDSET/LEGEND/A[onclick=\"HideHelp();\"]"))); // Random element assertion
	}

	public void checkState3_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[2]/TD/SPAN[style=\"color: #789\"]"))); // Random element assertion
		element = new DOMElement("TR", "GetComments:YesNo", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "GetComments:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "YesNo", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[5]/TD/SPAN/A[@class=\"q\" and @@onclick=\"ShowHelp('Container Visibility', event, 'en');\" and @title=\"Help on \"Container Visibility', eve\"\"]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[5]/TD[2]/LABEL[for=\"listRadioYe\"]"))); // Random element assertion
	}

	public void checkState3_RandAssertions3(){
		element = new DOMElement("A", "AddanewStory", new ArrayList<String>(Arrays.asList("href=\"?page=stories\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AddanewStory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"method\""))));
childrenElements.add(new DOMElement("DIV", "AddaNewStoryAddaNewStory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"method\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("name=\"add\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"margin-top: 25px;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "GetComments:YesNo", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "GetComments:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "YesNo", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Password:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("id=\"passwordRow\"","style=\"display: none\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password:", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[[@class=\"method\" and @style=\"margin-top: 25px;\"]"))); // Random element assertion
	}

	public void checkState3_RandAssertions4(){
		element = new DOMElement("SPAN", "Visibility(?):", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Container Visibility', event, 'en');\"","title=\"Help on \"Container Visibility', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[9]/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_logout.gif\" and @width=\"20px\"]"))); // Random element assertion
		element = new DOMElement("TR", "Date:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Date:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Date:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Date:", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=categories\"","title=\"Manage Categories\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_categs.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState3_RandAssertions5(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "(?)", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Container Description', event, 'en');\"","title=\"Help on \"Container Description', eve\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "?", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "PublicPassworded", new ArrayList<String>(Arrays.asList("for=\"passworded\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"radio\"","id=\"passworded\"","name=\"passRadio\"","onclick=\"javascript:checkPrivacyRow();\"","type=\"radio\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "Passworded", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"reset\"","type=\"Reset\"","value=\"??????Reset Changes??????\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","style=\"text-align: center\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellpadding=\"5\"","style=\"position: relative; text-align: left; \"","width=\"70%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "Name(?):", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Description(?):", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Date:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "GetComments:YesNo", new ArrayList<String>(Arrays.asList("id=\"passwordRow\"","style=\"display: none\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Visibility(?):ListedNotListed", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Privacy(?):PublicPassworded", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Password:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "Childof(?):NoInheritance1:DefaultStory2:Photos", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState4_OriginalAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Story \"Photos\" added succesfully![\\s\\S]*$")); // original assertion

	}

	public void checkState4_ReusedAssertions(){
	}

	public void checkState4_GeneratedAssertions(){
		element = new DOMElement("DIV", "Story\"Photos\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Story\"Photos\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"note_valid\""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.cssSelector("div.method[class=\"method\"]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState4_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\"./?s=3\"","name=\"3\""))));
childrenElements.add(new DOMElement("A", "Photos", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categdesc\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Greenery!!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("DIV", "ManageStories(?):", new ArrayList<String>(Arrays.asList("class=\"inside\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "CurrentStoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "CurrentStoriesList", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"","style=\"color: #666\""))));
childrenElements.add(new DOMElement("SPAN", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "CurrentStoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState4_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Story \"Photos\" added succesfully![\\s\\S]*$")); // original assertion

		element = new DOMElement("DIV", "Story\"Photos\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Story\"Photos\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"note_valid\""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\"./?s=3\"","name=\"3\""))));
childrenElements.add(new DOMElement("A", "Photos", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categdesc\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Greenery!!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("DIV", "ManageStories(?):", new ArrayList<String>(Arrays.asList("class=\"inside\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState4_RandAssertions1(){
		element = new DOMElement("LABEL", "ListedNotListed", new ArrayList<String>(Arrays.asList("for=\"listRadioNo\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"radio\"","id=\"listRadioNo\"","name=\"list\"","type=\"radio\"","value=\"hide\""))));
childrenElements.add(new DOMElement("#text", "NotListed", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD[[@height=\"1px\" and @width=\"10px\"]"))); // Random element assertion
		element = new DOMElement("TD", "Visibility(?):ListedNotListed", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Visibility", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ":", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_comments.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=comments\"","title=\"Manage Comments\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","class=\"text\"","id=\"password\"","name=\"pass\"","size=\"20\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState4_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE[@cellpadding=\"0\" and @@cellspacing=\"0\" and @@id=\"helpBox\" and @@ondblclick=\"HideHelp();\" and @onmouseup=\"DontHideHelp();\"]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/DIV/DIV[2]/SPAN/A[[href=\"?page=stories&cmd=doDel&sid=2\"]"))); // Random element assertion
		element = new DOMElement("INPUT", "YesNo", new ArrayList<String>(Arrays.asList("class=\"radio\"","name=\"getcmnts\"","type=\"radio\"","value=\"yes\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("href=\"?page=stories&cmd=doEdt&sid=2#add\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Editit", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Photos", new ArrayList<String>(Arrays.asList("href=\"./?s=3\"","name=\"3\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Photos", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState4_RandAssertions3(){
		element = new DOMElement("SPAN", "Visibility(?):", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Container Visibility', event, 'en');\"","title=\"Help on \"Container Visibility', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[4]/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_stories.gif\" and @width=\"20px\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "YesNo", new ArrayList<String>(Arrays.asList("style=\"margin-left: 5px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"285px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState4_RandAssertions4(){
		element = new DOMElement("A", "Photos", new ArrayList<String>(Arrays.asList("href=\"./?s=2\"","name=\"2\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Photos", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "AddaNewStoryAddaNewStory", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/DIV/DIV[[style=\"position: relative;\"]"))); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\""))));
childrenElements.add(new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: snow;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"285px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState4_RandAssertions5(){
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","class=\"text\"","id=\"name\"","name=\"name\"","size=\"32\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "Name(?):", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Name(?):", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Description(?):", new ArrayList<String>(Arrays.asList("valign=\"top\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Description", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ":", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "PHP", new ArrayList<String>(Arrays.asList("href=\"http://php.net\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "PHP", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_categs.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories\"","title=\"Manage Categories\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState5_OriginalAssertions(){
	}

	public void checkState5_ReusedAssertions(){
	}

	public void checkState5_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

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

		element = new DOMElement("SPAN", "Yourratingsaved!", new ArrayList<String>(Arrays.asList("id=\"rateStatus\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Yourratingsaved!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState5_LearnedAssertions(){
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"note_valid\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Feelfreetoback,anytimeyouwished!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "I'mwaitingforyoutorephormme,again!;)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "PS.Backupcaught!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "::::", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState5_AllAssertions(){
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"note_valid\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Feelfreetoback,anytimeyouwished!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "I'mwaitingforyoutorephormme,again!;)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "PS.Backupcaught!", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "::::", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState5_RandAssertions1(){
		element = new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\""))));
childrenElements.add(new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: snow;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV/FIELDSET[]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[[@href=\"?page=logout\" and @title=\"Log Out\"]"))); // Random element assertion
		element = new DOMElement("A", "[Dismiss]", new ArrayList<String>(Arrays.asList("onclick=\"HideHelp();\"")));
		parentElement = new DOMElement("LEGEND", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[[@href=\"?page=configs\" and @title=\"Advanced Configurations\"]"))); // Random element assertion
	}

	public void checkState5_RandAssertions2(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV/FIELDSET/LEGEND/SPAN[id=\"helpBoxLegend\"]"))); // Random element assertion
		element = new DOMElement("A", "Welcome!", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: white\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Welcome!", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","height=\"55px\"","width=\"10px\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"submit\"","type=\"submit\"","value=\"??????Login??????\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV/FORM/CENTER/DIV[[style=\"margin-bottom: 10px;\"]"))); // Random element assertion
	}

	public void checkState5_RandAssertions3(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_xml.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"","title=\"XML Editor\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"files/adminfiles/admin.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV/FIELDSET[]"))); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"285px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=basis\"","title=\"Adjust Preferences\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_preferences.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState5_RandAssertions4(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/SPAN[]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV/FORM/CENTER/DIV/BR[]"))); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\""))));
childrenElements.add(new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: snow;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".\""))));
childrenElements.add(new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\""))));
childrenElements.add(new DOMElement("#text", "ispoweredby", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Phormer", new ArrayList<String>(Arrays.asList("href=\"http://php.net\""))));
childrenElements.add(new DOMElement("#text", ",", new ArrayList<String>(Arrays.asList("href=\"http://gnu.org/licenses/gpl.txt\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "asimple", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "PHP", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "PhotoGalleryManager,under", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "GPL", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ".", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"","title=\"XML Editor\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_xml.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState5_RandAssertions5(){
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("action=\"admin.php\"","method=\"post\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD[[@height=\"1px\" and @width=\"10px\"]"))); // Random element assertion
		element = new DOMElement("A", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Phormer", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #060;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phormer", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
