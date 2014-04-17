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
	public void method10(){
		driver.get(url);
		//From state 0 to state 69
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[5]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=???flowers[0], attributes={href=.?c=3, title=contains photos of all the flowers ! }}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=69, name=state69}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[5]/SPAN[1]/A[1]")).click();
		//Sink node at state 69
		mutateDOMTree(69);
		checkState69_OriginalAssertions();
		checkState69_ReusedAssertions();
		checkState69_GeneratedAssertions();
		checkState69_LearnedAssertions();
		checkState69_AllAssertions();
		checkState69_RandAssertions1();
		checkState69_RandAssertions2();
		checkState69_RandAssertions3();
		checkState69_RandAssertions4();
		checkState69_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))) System.out.println("111"); // original assertion

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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("127"); // generated assertion in case of AEP for Original

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("132"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("138"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("144"); // generated assertion in case of RegionTagMatch

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
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("156"); // generated assertion in case of RegionTagMatch

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("169"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("176"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("182"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("190"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("196"); // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div#Granny")))) System.out.println("201"); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("211"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("221"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("228"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("234"); // predicted region assertion

	}

	public void checkState0_RandAssertions1(){
		element = new DOMElement("LINK", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","rel=\"alternate\"","title=\"RSS\"","type=\"application/rss+xml\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("242"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("247"); // Random element assertion
		element = new DOMElement("DIV", "EmailRSSAdminPage", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\""))));
childrenElements.add(new DOMElement("A", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("254"); // Random element assertion
		element = new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "flowers", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("262"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("269"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?rpn=10\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("277"); // Random element assertion
		element = new DOMElement("BR", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("281"); // Random element assertion
		element = new DOMElement("BR", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("285"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("294"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV/A[href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"]")))) System.out.println("295"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "11monthsago", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("303"); // Random element assertion
		element = new DOMElement("A", "Phorm", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org\"","target=\"_blank\"","title=\"Another Phormation\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phorm", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("308"); // Random element assertion
		element = new DOMElement("DIV", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Stories:2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("314"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[4]/CENTER/A/IMG[@height=\"75px\" and @@src=\"images/000004_dzeck_3.jpg\" and @width=\"75px\"]")))) System.out.println("315"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV[2]/DIV[3]/CENTER/A/IMG[@height=\"75px\" and @@src=\"images/000005_jfaji_3.jpg\" and @width=\"75px\"]")))) System.out.println("316"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV[class=\"footer\"]")))) System.out.println("320"); // Random element assertion
		element = new DOMElement("IMG", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000005_jfaji_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("324"); // Random element assertion
		element = new DOMElement("CENTER", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("331"); // Random element assertion
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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("352"); // Random element assertion
		element = new DOMElement("A", "Email", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("357"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV/SPAN[class=\"dot\"]")))) System.out.println("361"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("365"); // Random element assertion
		element = new DOMElement("BR", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("369"); // Random element assertion
		element = new DOMElement("A", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThisPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("374"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[2]/DIV[3]/A[@href=\"admin.php\" and @title=\"Login to the Administration Region\"]")))) System.out.println("375"); // Random element assertion
	}

	public void checkState69_OriginalAssertions(){
	}

	public void checkState69_ReusedAssertions(){
	}

	public void checkState69_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("393"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("401"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("409"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("411"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo[class=\"midInfo\"]")))) System.out.println("413"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState69_LearnedAssertions(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("426"); // predicted region assertion

		element = new DOMElement("DIV", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("433"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("440"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("446"); // predicted region assertion

		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("452"); // predicted region assertion

	}

	public void checkState69_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("465"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("473"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("481"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("491"); // predicted region assertion

		element = new DOMElement("DIV", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "VisitorsOnline:1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("498"); // predicted region assertion

	}

	public void checkState69_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[6]/A[[href=\".?c=3&n=100\"]")))) System.out.println("503"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("508"); // Random element assertion
		element = new DOMElement("A", "Phormer3.31", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"","title=\"Rephorm Your Phormer Pharm!\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phormer3.31", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("513"); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("518"); // Random element assertion
		element = new DOMElement("SPAN", "[SlideShow][Edit]flowers[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"","style=\"position: relative; top: -8px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=categories&cmd=doEdt&cid=3#add\""))));
childrenElements.add(new DOMElement("A", "Edit", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("525"); // Random element assertion
	}

	public void checkState69_RandAssertions2(){
		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("533"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[3]/DIV[3]/DIV[2]/TABLE/TBODY/TR/TD/DIV/A[4]/IMG[@class=\"logo\" and @@height=\"20px\" and @@src=\"files/adminfiles/logo_stories.gif\" and @width=\"20px\"]")))) System.out.println("534"); // Random element assertion
		element = new DOMElement("SPAN", "[SlideShow][Edit]flowers[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".?c=3&n=5\""))));
childrenElements.add(new DOMElement("A", "5", new ArrayList<String>(Arrays.asList("href=\".?c=3&n=10\""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList("href=\".?c=3&n=20\""))));
childrenElements.add(new DOMElement("A", "10", new ArrayList<String>(Arrays.asList("href=\".?c=3&n=50\""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList("href=\".?c=3&n=100\""))));
childrenElements.add(new DOMElement("A", "20", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "50", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "100", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("549"); // Random element assertion
		element = new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("554"); // Random element assertion
		element = new DOMElement("A", "ManageComments", new ArrayList<String>(Arrays.asList("href=\"?page=comments\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_comments.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("#text", "ManageComments", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("560"); // Random element assertion
	}

	public void checkState69_RandAssertions3(){
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("568"); // Random element assertion
		element = new DOMElement("A", "::::", new ArrayList<String>(Arrays.asList("href=\"?page=drafts\"","title=\"Manage Drafts\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"shortCuts\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_drafts.gif\"","width=\"20px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("574"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV[2]/DIV[2]/A[[@href=\"?page=configs\" and @title=\"Advanced Configurations\"]")))) System.out.println("575"); // Random element assertion
		element = new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=2\"","title=\"contains photos of all the flowers ! \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "flowers", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("583"); // Random element assertion
		element = new DOMElement("SPAN", "MyPhotoGallery", new ArrayList<String>(Arrays.asList("class=\"topHeadAround\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"VeryTitle\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("588"); // Random element assertion
	}

	public void checkState69_RandAssertions4(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_drafts.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=drafts\"","title=\"Manage Drafts\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("595"); // Random element assertion
		element = new DOMElement("IMG", "LogOut", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_logout.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=logout\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("599"); // Random element assertion
		element = new DOMElement("IMG", "XMLEditor", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_xml.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=editxml\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("603"); // Random element assertion
		element = new DOMElement("SPAN", "(?)", new ArrayList<String>(Arrays.asList("style=\"color: #789\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"method\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"ShowHelp('XML Editor', event, 'en');\"","title=\"Help on \"XML Editor', eve\"\""))));
childrenElements.add(new DOMElement("A", "?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("610"); // Random element assertion
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
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("625"); // Random element assertion
	}

	public void checkState69_RandAssertions5(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_stories.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=stories\"","title=\"Manage Stories\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("632"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"logo\"","height=\"20px\"","src=\"files/adminfiles/logo_preferences.gif\"","width=\"20px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?page=basis\"","title=\"Adjust Preferences\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("636"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[3]/SPAN[class=\"categeach\"]")))) System.out.println("637"); // Random element assertion
		element = new DOMElement("BR", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("641"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"inside\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","style=\"margin-top: 18px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("NOSCRIPT", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","style=\"position: relative;\"","width=\"100%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("650"); // Random element assertion
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
