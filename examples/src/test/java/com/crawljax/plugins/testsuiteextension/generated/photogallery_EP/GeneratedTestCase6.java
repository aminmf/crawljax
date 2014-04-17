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
 * Generated @ Wed Apr 16 20:43:31 PDT 2014
 */

public class GeneratedTestCase6 {

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
	public void method6(){
		driver.get(url);
		//From state 0 to state 6
		//Eventable{eventType=click, identification=text Admin Page, element=Element{node=[A: null], tag=A, text=Admin Page, attributes={href=admin.php, title=Login to the Administration Region}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}}
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
		//From state 6 to state 7
		//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Login   }}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=7, name=state7}}
		mutateDOMTree(6);
		checkState6_OriginalAssertions();
		checkState6_ReusedAssertions();
		checkState6_GeneratedAssertions();
		checkState6_LearnedAssertions();
		checkState6_AllAssertions();
		checkState6_RandAssertions1();
		checkState6_RandAssertions2();
		checkState6_RandAssertions3();
		checkState6_RandAssertions4();
		checkState6_RandAssertions5();
		driver.findElement(By.id("loginAdminPass")).clear();
		driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
		driver.findElement(By.cssSelector("input.submit")).click();
		//From state 7 to state 8
		//Eventable{eventType=click, identification=text Manage Categories, element=Element{node=[A: null], tag=A, text=Manage Categories, attributes={href=?page=categories}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
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
		driver.findElement(By.linkText("Manage Categories")).click();
		//From state 8 to state 11
		//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Add Category   }}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=11, name=state11}}
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
		driver.findElement(By.name("desc")).clear();
		driver.findElement(By.name("desc")).sendKeys("contains photos of all the flowers !");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("flowers");
		driver.findElement(By.cssSelector("input.submit")).click();
		//From state 11 to state 12
		//Eventable{eventType=click, identification=cssSelector a[title="Log Out"], element=Element{node=[A: null], tag=A, text=, attributes={href=?page=logout, title=Log Out}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
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
		driver.findElement(By.cssSelector("a[title=\"Log Out\"]")).click();
		//Sink node at state 12
		mutateDOMTree(12);
		checkState12_OriginalAssertions();
		checkState12_ReusedAssertions();
		checkState12_GeneratedAssertions();
		checkState12_LearnedAssertions();
		checkState12_AllAssertions();
		checkState12_RandAssertions1();
		checkState12_RandAssertions2();
		checkState12_RandAssertions3();
		checkState12_RandAssertions4();
		checkState12_RandAssertions5();
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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[2]/CENTER/A/DIV[[class=\"thumbDate\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[6]/CENTER/A[@href=\".?p=2\" and @title=\"100_0759: 29 KB, 1440 hits and rated 1 by 3 person\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Photos:6", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Photos:6", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\""))));
childrenElements.add(new DOMElement("DIV", "Statistics", new ArrayList<String>(Arrays.asList("class=\"submenu\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[class=\"titlepart\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000004_dzeck_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000004_dzeck_3.jpg\"","width=\"75px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
childrenElements.add(new DOMElement("DIV", "100_0773", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=3\"","title=\"contains photos of all the flowers ! \""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?trn=10#tr\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[4]/CENTER/A/IMG[@height=\"75px\" and @@src=\"images/000004_dzeck_3.jpg\" and @width=\"75px\"]"))); // Random element assertion
		element = new DOMElement("LINK", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"css.php?theme=white\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000005_jfaji_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("BR", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[[class=\"item\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("SPAN", "ThisMonth:3", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/A[[href=\"http://p.horm.org/er\"]"))); // Random element assertion
		element = new DOMElement("DIV", "TodayHits:3", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "TodayHits:3", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV[5]/CENTER/A/BR[]"))); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_OriginalAssertions(){
	}

	public void checkState6_ReusedAssertions(){
	}

	public void checkState6_GeneratedAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState6_LearnedAssertions(){
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

	public void checkState6_AllAssertions(){
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

	public void checkState6_RandAssertions1(){
		element = new DOMElement("INPUT", "Administrator'spassword:", new ArrayList<String>(Arrays.asList("class=\"submit\"","type=\"submit\"","value=\"   Login   \"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "PHP", new ArrayList<String>(Arrays.asList("href=\"http://php.net\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "PHP", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "Administrator'spassword:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[[id=\"Granny\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/help.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"fieldCont\"","style=\"margin-bottom: -1px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","colspan=\"2\"","width=\"295px\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/FORM/CENTER/BR[[]"))); // Random element assertion
	}

	public void checkState6_RandAssertions3(){
		element = new DOMElement("A", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogintoYourPhormer", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LEGEND", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"helpBoxLegend\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("onclick=\"HideHelp();\""))));
childrenElements.add(new DOMElement("A", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@language=\"javascript\" and @@src=\"files/adminfiles/help.js\" and @type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"text-align: left; background: #E8F0F8\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "UpdateYourPhormer", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/skeleton.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions4(){
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onblur=\"javascript:blured=true;\"","onfocus=\"javascript:if(blured){try{dg('loginAdminPass').focus();blured=false;}catch(e){}}\"","onload=\"javascript:PrepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\""))));
childrenElements.add(new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "[Dismiss]", new ArrayList<String>(Arrays.asList("height=\"1px\"","width=\"10px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[2]/DIV/SPAN[style=\"color: #060;\"]"))); // Random element assertion
	}

	public void checkState6_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/FORM/CENTER/INPUT[[@class=\"submit\" and @@type=\"submit\" and @value=\"   Login   \"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[@class=\"method\" and @style=\"text-align: left\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]"))); // Random element assertion
		element = new DOMElement("A", "PHP", new ArrayList<String>(Arrays.asList("href=\"http://php.net\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "PHP", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #060;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; font-size: 1.0em; margin: 0px 0px 8px; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Great!You'rerunninglastversionof", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\""))));
childrenElements.add(new DOMElement("A", "Phormer", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ",whichis3.31!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState7_OriginalAssertions(){
	}

	public void checkState7_ReusedAssertions(){
	}

	public void checkState7_GeneratedAssertions(){
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

	public void checkState7_LearnedAssertions(){
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

	public void checkState7_AllAssertions(){
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

	public void checkState7_RandAssertions1(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_drafts.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=drafts\"","title=\"Manage Drafts\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[id=\"headerBar\"]"))); // Random element assertion
		element = new DOMElement("TITLE", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"","style=\"color: black\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState7_RandAssertions2(){
		element = new DOMElement("SCRIPT", "AdministrationRegionofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/help.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "TechnicalSettings:", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV/SPAN/SPAN[class=\"topHeadAround\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Advanced Configurations', event, 'en');\"","title=\"Help on \"Advanced Configurations', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE/TBODY[]"))); // Random element assertion
	}

	public void checkState7_RandAssertions3(){
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\""))));
childrenElements.add(new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		element = new DOMElement("A", "(?)", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Categories', event, 'en');\"","title=\"Help on \"Manage Categories', eve\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "?", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Upload]", new ArrayList<String>(Arrays.asList("href=\"?page=drafts&cmd=doUpload\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Upload", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Dismiss]", new ArrayList<String>(Arrays.asList("onclick=\"HideHelp();\"")));
		parentElement = new DOMElement("LEGEND", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState7_RandAssertions4(){
		element = new DOMElement("A", "AdministrationRegion(?)", new ArrayList<String>(Arrays.asList("href=\"?page=welcome\"","style=\"color: white\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"","title=\"XML Editor\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_xml.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE[@cellpadding=\"0\" and @@cellspacing=\"0\" and @@style=\"position: relative;\" and @width=\"100%\"]"))); // Random element assertion
		element = new DOMElement("IMG", "ManageDrafts", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_drafts.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=drafts\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("valign=\"top\"","width=\"49%\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("valign=\"top\"","width=\"49%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState7_RandAssertions5(){
		element = new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("id=\"helpBoxInner\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "[Add]", new ArrayList<String>(Arrays.asList("href=\"?page=photos&cmd=doAdd\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Add", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE/TBODY/TR/TD/DIV/A/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_photos.gif\" and @width=\"20px\"]"))); // Random element assertion
		element = new DOMElement("A", "(?)", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Manage Comments', event, 'en');\"","title=\"Help on \"Manage Comments', eve\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "?", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR/TD/DIV/FIELDSET/LEGEND[]"))); // Random element assertion
	}

	public void checkState8_OriginalAssertions(){
	}

	public void checkState8_ReusedAssertions(){
	}

	public void checkState8_GeneratedAssertions(){
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

	public void checkState8_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "CurrentCategoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=1#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=1\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
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

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=4#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=4\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState8_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "CurrentCategoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=1#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=1\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
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

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=4#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=4\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState8_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR[4]/TD[[width=\"285px\"]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","height=\"55px\"","width=\"10px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[@class=\"Helping\" and @@id=\"helpBoxContainer\" and @style=\"\"]"))); // Random element assertion
		element = new DOMElement("TD", "Visibility(?):ListedNotListed", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"margin-left: 5px\""))));
childrenElements.add(new DOMElement("LABEL", "Listed", new ArrayList<String>(Arrays.asList("for=\"listRadioYe\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"margin-left: 42px\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("for=\"listRadioNo\""))));
childrenElements.add(new DOMElement("LABEL", "NotListed", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"categdesc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState8_RandAssertions2(){
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"285px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[6]/TD[2]/SELECT/OPTION[[value=\"2\"]"))); // Random element assertion
		element = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","name=\"sub\"","type=\"text\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"-1\""))));
childrenElements.add(new DOMElement("OPTION", "NoInheritance", new ArrayList<String>(Arrays.asList("value=\"1\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"2\""))));
childrenElements.add(new DOMElement("OPTION", "1:DefaultCategory", new ArrayList<String>(Arrays.asList("value=\"3\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"4\""))));
childrenElements.add(new DOMElement("OPTION", "2:flowers", new ArrayList<String>(Arrays.asList("value=\"5\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "3:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "4:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "5:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","colspan=\"2\"","width=\"295px\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=basis\"","title=\"Adjust Preferences\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_preferences.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState8_RandAssertions3(){
		element = new DOMElement("TR", "Name(?):", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Name(?):", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("OPTION", "5:flowers", new ArrayList<String>(Arrays.asList("value=\"5\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","name=\"sub\"","type=\"text\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "5:flowers", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Privacy(?):PublicPassworded", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Privacy", new ArrayList<String>(Arrays.asList("style=\"color: #789\""))));
childrenElements.add(new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ":", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[7]/TD[@colspan=\"2\" and @style=\"text-align: center\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=1#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=1\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState8_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/SPAN[]"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"submit\"","type=\"submit\"","value=\"   Add Category   \"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","style=\"text-align: center\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"reset\"","type=\"Reset\"","value=\"   Reset Changes   \"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"","style=\"text-align: center\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=3\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Privacy(?):PublicPassworded", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"margin-left: 5px\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("for=\"public\""))));
childrenElements.add(new DOMElement("LABEL", "Public", new ArrayList<String>(Arrays.asList("style=\"margin-left: 42px\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"passworded\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Passworded", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState8_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[2]/DIV/DIV[4]/SPAN/A[href=\"?page=categories&cmd=doEdt&cid=4#add\"]"))); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "[Dismiss]", new ArrayList<String>(Arrays.asList("colspan=\"2\"","rowspan=\"2\"","style=\"background-color: #F9F9F9; \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Password:", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("id=\"passwordRow\"","style=\"display: none\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","class=\"text\"","id=\"password\"","name=\"pass\"","size=\"20\"","type=\"text\"","value=\"\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "AddanewCategory", new ArrayList<String>(Arrays.asList("href=\"?page=categories\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AddanewCategory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[5]/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_comments.gif\" and @width=\"20px\"]"))); // Random element assertion
	}

	public void checkState11_OriginalAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$")); // original assertion

	}

	public void checkState11_ReusedAssertions(){
	}

	public void checkState11_GeneratedAssertions(){
		element = new DOMElement("DIV", "Category\"flowers\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Category\"flowers\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"note_valid\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

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

	public void checkState11_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "CurrentCategoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=1#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=1\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("TABLE", "[Dismiss]", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
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

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=4#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=4\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState11_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$")); // original assertion

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$")); // original assertion

		element = new DOMElement("DIV", "Category\"flowers\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Category\"flowers\"addedsuccesfully!", new ArrayList<String>(Arrays.asList("class=\"note_valid\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "CurrentCategoriesList[5][10][20][50][100]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"padding-left: 30px\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"position: relative;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=1#add\""))));
childrenElements.add(new DOMElement("A", "Editit", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doDel&cid=1\""))));
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Delete/Clear", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState11_RandAssertions1(){
		element = new DOMElement("TR", "Visibility(?):ListedNotListed", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Visibility(?):", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "ListedNotListed", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[4]/CENTER/FORM/TABLE/TBODY/TR[3]/TD[2]/LABEL[for=\"listRadioYe\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[2]/DIV/DIV[4]/A[@href=\"./?c=4\" and @name=\"4\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/DIV/DIV/SPAN/A[href=\"?page=categories&cmd=doEdt&cid=1#add\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[4]/CENTER/FORM/TABLE/TBODY/TR[3]/TD[2]/LABEL/INPUT[@checked=\"checked\" and @@class=\"radio\" and @@id=\"listRadioYe\" and @@name=\"list\" and @@type=\"radio\" and @value=\"list\"]"))); // Random element assertion
	}

	public void checkState11_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[2]/SPAN/SPAN/A[[href=\"admin.php?page=categories&n=50\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[4]/TD[2]/LABEL[[for=\"passworded\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "Privacy(?):", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('Container Privacy', event, 'en');\"","title=\"Help on \"Container Privacy', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "ListedNotListed", new ArrayList<String>(Arrays.asList("for=\"listRadioNo\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"radio\"","id=\"listRadioNo\"","name=\"list\"","type=\"radio\"","value=\"hide\""))));
childrenElements.add(new DOMElement("#text", "NotListed", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"","style=\"margin-top: 25px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"name\""))));
childrenElements.add(new DOMElement("SPAN", "AddanewCategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState11_RandAssertions3(){
		element = new DOMElement("LEGEND", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"helpBoxLegend\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("onclick=\"HideHelp();\""))));
childrenElements.add(new DOMElement("A", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/BR[[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[4]/CENTER/FORM/TABLE/TBODY/TR[6]/TD/SPAN/A[@class=\"q\" and @@onclick=\"ShowHelp('Container Inheritance', event, 'en');\" and @title=\"Help on \"Container Inheritance', eve\"\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[4]/CENTER/FORM/TABLE/TBODY/TR[6]/TD[2]/SELECT/OPTION[[value=\"2\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[4]/CENTER/FORM/TABLE/TBODY/TR[2]/TD/SPAN[style=\"color: #789\"]"))); // Random element assertion
	}

	public void checkState11_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/TABLE/TBODY/TR[4]/TD[2]/LABEL[2]/INPUT[@class=\"radio\" and @@id=\"passworded\" and @@name=\"passRadio\" and @@onclick=\"javascript:checkPrivacyRow();\" and @@type=\"radio\" and @value=\"\"]"))); // Random element assertion
		element = new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"dotbgful\"","colspan=\"2\"","width=\"295px\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","name=\"sub\"","type=\"text\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"-1\""))));
childrenElements.add(new DOMElement("OPTION", "NoInheritance", new ArrayList<String>(Arrays.asList("value=\"1\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"2\""))));
childrenElements.add(new DOMElement("OPTION", "1:DefaultCategory", new ArrayList<String>(Arrays.asList("value=\"3\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"4\""))));
childrenElements.add(new DOMElement("OPTION", "2:flowers", new ArrayList<String>(Arrays.asList("value=\"5\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "3:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "4:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "5:flowers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Editit::Delete/Clear", new ArrayList<String>(Arrays.asList("href=\"?page=categories&cmd=doEdt&cid=6#add\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("style=\"color: #333; position: absolute; top: 0px; right: 80px; \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Editit", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"back2mainR\""))));
childrenElements.add(new DOMElement("DIV", "ViewGallery>>", new ArrayList<String>(Arrays.asList("class=\"back2main\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"part\""))));
childrenElements.add(new DOMElement("DIV", "<<AdminPage", new ArrayList<String>(Arrays.asList("class=\"footnote\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState11_RandAssertions5(){
		element = new DOMElement("TD", "Name(?):", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","class=\"text\"","id=\"name\"","name=\"name\"","size=\"32\"","type=\"text\"","value=\"\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/DIV/DIV[6]/DIV[class=\"categdesc\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/DIV[3]/CENTER/FORM/INPUT[@name=\"cid\" and @@type=\"hidden\" and @value=\"6\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "ManageCategoriesofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/skeleton.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_logout.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=logout\"","title=\"Log Out\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_OriginalAssertions(){
	}

	public void checkState12_ReusedAssertions(){
	}

	public void checkState12_GeneratedAssertions(){
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

	public void checkState12_LearnedAssertions(){
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

	public void checkState12_AllAssertions(){
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

	public void checkState12_RandAssertions1(){
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=photos\"","title=\"Manage Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_photos.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "LoginPageofMyPhotoGallery", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"files/adminfiles/help.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_stories.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=stories\"","title=\"Manage Stories\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("width=\"10px\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions2(){
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TBODY", "[Dismiss]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","id=\"helpBox\"","ondblclick=\"HideHelp();\"","onmouseup=\"DontHideHelp();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "MyPhotoGalleryAdministrationRegion", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: snow;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headerBar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministrationRegion", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_configs.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=configs\"","title=\"Advanced Configurations\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "PHP", new ArrayList<String>(Arrays.asList("href=\"http://php.net\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footnote\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "PHP", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR[2]/TD[@class=\"dotbgful\" and @@height=\"55px\" and @width=\"10px\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]"))); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=logout\"","title=\"Log Out\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_logout.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"","title=\"XML Editor\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_xml.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[8]/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_xml.gif\" and @width=\"20px\"]"))); // Random element assertion
	}

	public void checkState12_RandAssertions4(){
		element = new DOMElement("DIV", "::::", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=photos\"","title=\"Manage Photos\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=drafts\"","title=\"Manage Drafts\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=categories\"","title=\"Manage Categories\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=stories\"","title=\"Manage Stories\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=comments\"","title=\"Manage Comments\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=basis\"","title=\"Adjust Preferences\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=configs\"","title=\"Advanced Configurations\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"","title=\"XML Editor\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?page=logout\"","title=\"Log Out\""))));
childrenElements.add(new DOMElement("SPAN", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "::", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/TABLE/TBODY/TR[3]/TD[[@class=\"dotbgful\" and @@colspan=\"2\" and @width=\"295px\"]"))); // Random element assertion
		element = new DOMElement("A", "UpdateYourPhormer(?)", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: black\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"name\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "UpdateYourPhormer", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Welcome!", new ArrayList<String>(Arrays.asList("href=\"?\"","style=\"color: white\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Welcome!", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onblur=\"javascript:blured=true;\"","onfocus=\"javascript:if(blured){try{dg('loginAdminPass').focus();blured=false;}catch(e){}}\"","onload=\"javascript:PrepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"Helping\"","id=\"helpBoxContainer\"","style=\"\""))));
childrenElements.add(new DOMElement("DIV", "[Dismiss]", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions5(){
		element = new DOMElement("A", "[Dismiss]", new ArrayList<String>(Arrays.asList("onclick=\"HideHelp();\"")));
		parentElement = new DOMElement("LEGEND", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[Dismiss]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "::::", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "::", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/SPAN[]"))); // Random element assertion
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