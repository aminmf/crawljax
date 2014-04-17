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

public class GeneratedTestCase23 {

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
	public void method23(){
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
		//From state 26 to state 54
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text="Default Story", attributes={href=.?feat=slideshow&s=1}}, source=StateVertexImpl{id=26, name=state26}, target=StateVertexImpl{id=54, name=state54}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/A[1]")).click();
		//Sink node at state 54
		mutateDOMTree(54);
		checkState54_OriginalAssertions();
		checkState54_ReusedAssertions();
		checkState54_GeneratedAssertions();
		checkState54_LearnedAssertions();
		checkState54_AllAssertions();
		checkState54_RandAssertions1();
		checkState54_RandAssertions2();
		checkState54_RandAssertions3();
		checkState54_RandAssertions4();
		checkState54_RandAssertions5();
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
		element = new DOMElement("CENTER", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("301"); // Random element assertion
		element = new DOMElement("A", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000006_rryky_3.jpg\"","width=\"75px\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\""))));
childrenElements.add(new DOMElement("DIV", "11monthsago", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("313"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "flowers[0]", new ArrayList<String>(Arrays.asList("href=\".?c=5\"","title=\"contains photos of all the flowers ! \""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("318"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0794", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("323"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[6]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("328"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"maincolinner\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("338"); // Random element assertion
		element = new DOMElement("BR", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("342"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("347"); // Random element assertion
		element = new DOMElement("SPAN", "MyLinks", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("352"); // Random element assertion
		element = new DOMElement("SPAN", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Photos[0]", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("357"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[5]/DIV[3]/SPAN[class=\"reddot\"]")))) System.out.println("361"); // Random element assertion
		element = new DOMElement("LINK", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"css.php?theme=white\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("365"); // Random element assertion
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "11monthsago", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("370"); // Random element assertion
		element = new DOMElement("DIV", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0772November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("377"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("382"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("SPAN", "Phormer3.31", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("390"); // Random element assertion
		element = new DOMElement("DIV", "EmailRSSAdminPage", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"admin.php\"","title=\"Login to the Administration Region\""))));
childrenElements.add(new DOMElement("A", "AdminPage", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("397"); // Random element assertion
		element = new DOMElement("CENTER", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("404"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[3]/BR[]")))) System.out.println("405"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("410"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".?mode=stories\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Stories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("421"); // Random element assertion
		element = new DOMElement("A", "Photos[0]", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Photos", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("429"); // Random element assertion
		element = new DOMElement("DIV", "11monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("434"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DefaultStory[6]", new ArrayList<String>(Arrays.asList("href=\".?s=1\"","title=\"The default story [2006/04/01]\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("439"); // Random element assertion
		element = new DOMElement("DIV", "2monthsagoNovember9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=3\"","title=\"100_0760: 26 KB, 1480 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2monthsago", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("444"); // Random element assertion
	}

	public void checkState23_OriginalAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))) System.out.println("448"); // original assertion

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("464"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("466"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("471"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("477"); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("483"); // generated assertion in case of RegionTagMatch

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("496"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("503"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("509"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("517"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("523"); // predicted region assertion

	}

	public void checkState23_AllAssertions(){
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))) System.out.println("528"); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("538"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("548"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("555"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("561"); // predicted region assertion

	}

	public void checkState23_RandAssertions1(){
		element = new DOMElement("SPAN", "ThisMonth:2", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("570"); // Random element assertion
		element = new DOMElement("SPAN", "RecentStories[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=5\""))));
childrenElements.add(new DOMElement("A", "5", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=10\""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=20\""))));
childrenElements.add(new DOMElement("A", "10", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=50\""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList("href=\".?mode=stories&rsn=100\""))));
childrenElements.add(new DOMElement("A", "20", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "50", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "][", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "100", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("585"); // Random element assertion
		element = new DOMElement("SPAN", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("590"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV[2]/SPAN[class=\"categeach\"]")))) System.out.println("591"); // Random element assertion
		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("597"); // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/DIV[2]/DIV/CENTER[]")))) System.out.println("601"); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("606"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aStory\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("DIV", "100_0760November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0773November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("619"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[4]/DIV[3]/DIV/A[@href=\".\" and @@target=\"_blank\" and @title=\"\"]")))) System.out.println("620"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[class=\"topPhorm\"]")))) System.out.println("621"); // Random element assertion
	}

	public void checkState23_RandAssertions3(){
		element = new DOMElement("BR", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("628"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("633"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=2\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("638"); // Random element assertion
		element = new DOMElement("SPAN", "ThisMonth:2", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("643"); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("648"); // Random element assertion
	}

	public void checkState23_RandAssertions4(){
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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("662"); // Random element assertion
		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("671"); // Random element assertion
		element = new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"categinfo\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=4\"","title=\"contains photos of all the flowers ! \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[0]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("676"); // Random element assertion
		element = new DOMElement("DIV", "DefaultStorysinceApril1sto06:Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aStory\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dot\"","style=\"font-size: 14px;\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".?s=1\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "DefaultStorysinceApril1sto06:Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("685"); // Random element assertion
		element = new DOMElement("DIV", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"topPhormAbout\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "...containsmyphotos!", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("690"); // Random element assertion
	}

	public void checkState23_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV/SPAN[class=\"reddot\"]")))) System.out.println("694"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[class=\"titlepart\"]")))) System.out.println("695"); // Random element assertion
		element = new DOMElement("BR", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("699"); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("704"); // Random element assertion
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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("719"); // Random element assertion
	}

	public void checkState24_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))) System.out.println("723"); // original assertion

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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("737"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("747"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("755"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("757"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo[class=\"midInfo\"]")))) System.out.println("759"); // generated assertion in case of ElementTagAttMatch

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("772"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("779"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("785"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("793"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("799"); // predicted region assertion

	}

	public void checkState24_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))) System.out.println("804"); // original assertion

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("812"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("822"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("830"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("840"); // predicted region assertion

	}

	public void checkState24_RandAssertions1(){
		element = new DOMElement("CENTER", "100_0759November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=2\"","title=\"100_0759: 29 KB, 1439 hits and rated 1 by 2 person\""))));
childrenElements.add(new DOMElement("A", "100_0759November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("851"); // Random element assertion
		element = new DOMElement("DIV", "MyLinksMyPhotoGalleryOtherLinksPhorm", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("858"); // Random element assertion
		element = new DOMElement("BR", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("862"); // Random element assertion
		element = new DOMElement("SPAN", "Photos:6", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("867"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("874"); // Random element assertion
	}

	public void checkState24_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[2]/DIV[2]/DIV/SPAN[class=\"categeach\"]")))) System.out.println("878"); // Random element assertion
		element = new DOMElement("IMG", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000006_rryky_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("882"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[4]/SPAN/A/SPAN[class=\"dot\"]")))) System.out.println("883"); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("888"); // Random element assertion
		element = new DOMElement("A", "RSS", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","title=\"RSS Feed\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RSS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("893"); // Random element assertion
	}

	public void checkState24_RandAssertions3(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","rel=\"alternate\"","title=\"RSS\"","type=\"application/rss+xml\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("900"); // Random element assertion
		element = new DOMElement("SCRIPT", "varDarkenVal=60", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "varDarkenVal=60", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("905"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("910"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/BR[]")))) System.out.println("911"); // Random element assertion
		element = new DOMElement("SPAN", "Photos:6", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("916"); // Random element assertion
	}

	public void checkState24_RandAssertions4(){
		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Etc", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("925"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecolinner\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("932"); // Random element assertion
		element = new DOMElement("SPAN", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"font-size: 1em; padding-right: 4px;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("937"); // Random element assertion
		element = new DOMElement("SPAN", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Photos[0]", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("942"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[4]/DIV[5]/DIV/SPAN[class=\"dot\"]")))) System.out.println("943"); // Random element assertion
	}

	public void checkState24_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/CENTER[]")))) System.out.println("947"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?c=1&n=20\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "20", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("952"); // Random element assertion
		element = new DOMElement("SPAN", "LastUpdate:12monthsago", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"","style=\"line-height: 130%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("957"); // Random element assertion
		element = new DOMElement("SPAN", "Phorm", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("962"); // Random element assertion
		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("969"); // Random element assertion
	}

	public void checkState25_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"))) System.out.println("973"); // original assertion

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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("987"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("997"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1005"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1007"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.midInfo[class=\"midInfo\"]")))) System.out.println("1009"); // generated assertion in case of ElementTagAttMatch

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1022"); // predicted region assertion

		element = new DOMElement("DIV", "EtcEmailRSSAdminPagePoweredbyPhormer3.31", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\""))));
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1029"); // predicted region assertion

		element = new DOMElement("SPAN", "RSS", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1035"); // predicted region assertion

		element = new DOMElement("DIV", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("CENTER", "100_0794November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1043"); // predicted region assertion

		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbNameLine\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "100_0758", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1049"); // predicted region assertion

	}

	public void checkState25_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"))) System.out.println("1054"); // original assertion

		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1062"); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sidecol\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"maincol\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1072"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "Thedefaultcategory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultcategory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1080"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "StoriesPhotos[0]DefaultStory[6]", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("DIV", "Photos[0]", new ArrayList<String>(Arrays.asList("class=\"item\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "DefaultStory[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1090"); // predicted region assertion

	}

	public void checkState25_RandAssertions1(){
		element = new DOMElement("DIV", "TodayHits:4", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "TodayHits:4", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1100"); // Random element assertion
		element = new DOMElement("DIV", "ThisMonth:4", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "ThisMonth:4", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1106"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV[3]/DIV[2]/DIV[4]/SPAN[class=\"dot\"]")))) System.out.println("1107"); // Random element assertion
		element = new DOMElement("BR", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1111"); // Random element assertion
		element = new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categeach\""))));
childrenElements.add(new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1118"); // Random element assertion
	}

	public void checkState25_RandAssertions2(){
		element = new DOMElement("A", "Email", new ArrayList<String>(Arrays.asList("href=\"mailto:myemail[at]mydomain[dot]com?subject=My%20PhotoGallery%20Photos\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1126"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/A[href=\".\"]")))) System.out.println("1127"); // Random element assertion
		element = new DOMElement("SPAN", "Stories:2", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1132"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[2]/DIV[5]/SPAN[class=\"categeach\"]")))) System.out.println("1133"); // Random element assertion
		element = new DOMElement("A", "Photos[0]", new ArrayList<String>(Arrays.asList("href=\".?s=2\"","title=\"Greenery !! [2014/01/16]\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "Photos", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1141"); // Random element assertion
	}

	public void checkState25_RandAssertions3(){
		element = new DOMElement("SPAN", "Poweredby", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1149"); // Random element assertion
		element = new DOMElement("DIV", "Thedefaultstory", new ArrayList<String>(Arrays.asList("class=\"midInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thedefaultstory", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1156"); // Random element assertion
		element = new DOMElement("DIV", "flowers[0]", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"submenu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"categeach\""))));
childrenElements.add(new DOMElement("SPAN", "flowers[0]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1163"); // Random element assertion
		element = new DOMElement("DIV", "100_0758November9tho12", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=1\"","title=\"100_0758: 25 KB, 3681 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "November9tho12", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1168"); // Random element assertion
		element = new DOMElement("A", "[5][10][20][50][100]", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=5\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"thumbcntarr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "5", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1173"); // Random element assertion
	}

	public void checkState25_RandAssertions4(){
		element = new DOMElement("SPAN", "MyLinks", new ArrayList<String>(Arrays.asList("class=\"reddot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1181"); // Random element assertion
		element = new DOMElement("SPAN", "Email", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1186"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/DIV/DIV[[class=\"submenu\"]")))) System.out.println("1187"); // Random element assertion
		element = new DOMElement("SPAN", "Phormer3.31", new ArrayList<String>(Arrays.asList("class=\"dot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1192"); // Random element assertion
		element = new DOMElement("A", "DefaultCategory[6]", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","title=\"The default category \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"categeach\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dot\""))));
childrenElements.add(new DOMElement("#text", "DefaultCategory", new ArrayList<String>(Arrays.asList("class=\"categinfo\""))));
childrenElements.add(new DOMElement("SPAN", "[6]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1200"); // Random element assertion
	}

	public void checkState25_RandAssertions5(){
		element = new DOMElement("BR", "100_0772November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=5\"","title=\"100_0772: 41 KB, 1341 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1207"); // Random element assertion
		element = new DOMElement("IMG", "100_0794November9tho12", new ArrayList<String>(Arrays.asList("height=\"75px\"","src=\"images/000006_rryky_3.jpg\"","width=\"75px\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1211"); // Random element assertion
		element = new DOMElement("CENTER", "100_0773November9tho12", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\".?p=4\"","title=\"100_0773: 62 KB, 1367 hits and rated 0 by 0 person\""))));
childrenElements.add(new DOMElement("A", "100_0773November9tho12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1218"); // Random element assertion
		element = new DOMElement("A", "RSS", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","title=\"RSS Feed\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"item\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RSS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1223"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV[2]/DIV/DIV[@class=\"partmain\" and @id=\"slideShow\"]")))) System.out.println("1224"); // Random element assertion
	}

	public void checkState26_OriginalAssertions(){
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))) System.out.println("1228"); // original assertion

	}

	public void checkState26_ReusedAssertions(){
		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1233"); // reused assertion in case of ElementFullMatch
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1234"); // reused assertion in case of ElementFullMatch
	}

	public void checkState26_GeneratedAssertions(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1241"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1247"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1253"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1255"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]")))) System.out.println("1257"); // generated assertion in case of ElementTagAttMatch

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1270"); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1276"); // predicted region assertion

		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1284"); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1292"); // predicted region assertion

		element = new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=30\""))));
childrenElements.add(new DOMElement("A", "Back", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1300"); // predicted region assertion

	}

	public void checkState26_AllAssertions(){
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))) System.out.println("1305"); // original assertion

		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1307"); // reused assertion in case of ElementFullMatch

		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1309"); // reused assertion in case of ElementFullMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1314"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1320"); // generated assertion in case of RegionTagAttMatch

	}

	public void checkState26_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"index.xml\" and @@rel=\"alternate\" and @@title=\"RSS\" and @type=\"application/rss+xml\"]")))) System.out.println("1325"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1329"); // Random element assertion
		element = new DOMElement("TITLE", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1334"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER[]")))) System.out.println("1335"); // Random element assertion
		element = new DOMElement("A", "Phormer,version3.31", new ArrayList<String>(Arrays.asList("href=\"http://p.horm.org/er\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Phormer,version3.31", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1340"); // Random element assertion
	}

	public void checkState26_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/BR[[]")))) System.out.println("1344"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[[@class=\"end\" and @style=\"padding-top: 0px\"]")))) System.out.println("1345"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/SELECT/OPTION[[value=\"20000\"]")))) System.out.println("1346"); // Random element assertion
		element = new DOMElement("A", "[SmallerSize]", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_smaller_link\"","onclick=\"javascript:ss_toggleSmaller();\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SmallerSize", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1351"); // Random element assertion
		element = new DOMElement("LINK", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("href=\"index.xml\"","rel=\"alternate\"","title=\"RSS\"","type=\"application/rss+xml\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1355"); // Random element assertion
	}

	public void checkState26_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[class=\"topPhormAbout\"]")))) System.out.println("1359"); // Random element assertion
		element = new DOMElement("A", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("href=\".\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyPhotoGallery", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1364"); // Random element assertion
		element = new DOMElement("SELECT", "[Pauseit]1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"1000\""))));
childrenElements.add(new DOMElement("OPTION", "1Sec", new ArrayList<String>(Arrays.asList("value=\"2000\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"5000\""))));
childrenElements.add(new DOMElement("OPTION", "2Sec", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"10000\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"20000\""))));
childrenElements.add(new DOMElement("OPTION", "5Sec", new ArrayList<String>(Arrays.asList("value=\"30000\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"60000\""))));
childrenElements.add(new DOMElement("OPTION", "10Sec", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "20Sec", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "30Sec", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "60Sec", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1383"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1390"); // Random element assertion
		element = new DOMElement("TD", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_playpause_link2\"","onclick=\"javascript:ss_playpause();\""))));
childrenElements.add(new DOMElement("A", "Pauseit", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1397"); // Random element assertion
	}

	public void checkState26_RandAssertions4(){
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
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1411"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1415"); // Random element assertion
		element = new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1420"); // Random element assertion
		element = new DOMElement("A", "[Pauseit]1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("class=\"q\"","id=\"ss_playpause_link\"","onclick=\"javascript:ss_playpause();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pauseit", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1425"); // Random element assertion
		element = new DOMElement("A", "[Next]", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_next();\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Next", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1430"); // Random element assertion
	}

	public void checkState26_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"index.xml\" and @@rel=\"alternate\" and @@title=\"RSS\" and @type=\"application/rss+xml\"]")))) System.out.println("1434"); // Random element assertion
		element = new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1439"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("language=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1444"); // Random element assertion
		element = new DOMElement("TR", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\""))));
childrenElements.add(new DOMElement("TD", "[Pauseit]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1453"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1460"); // Random element assertion
	}

	public void checkState54_OriginalAssertions(){
	}

	public void checkState54_ReusedAssertions(){
		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1467"); // reused assertion in case of ElementFullMatch
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1468"); // reused assertion in case of ElementFullMatch
	}

	public void checkState54_GeneratedAssertions(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1475"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1481"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1487"); // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div#Granny[id=\"Granny\"]")))) System.out.println("1489"); // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("span#ss_n[id=\"ss_n\"]")))) System.out.println("1491"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState54_LearnedAssertions(){
		element = new DOMElement("DIV", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1504"); // predicted region assertion

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1510"); // predicted region assertion

		element = new DOMElement("DIV", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1518"); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1526"); // predicted region assertion

		element = new DOMElement("SPAN", "[Back]", new ArrayList<String>(Arrays.asList("class=\"leaveReply\"","style=\"padding-right: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\".?s=1&n=30\""))));
childrenElements.add(new DOMElement("A", "Back", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1534"); // predicted region assertion

	}

	public void checkState54_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("img#ss_photo")))) System.out.println("1539"); // reused assertion in case of ElementFullMatch

		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())) System.out.println("1541"); // reused assertion in case of ElementFullMatch

		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1546"); // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1552"); // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("SPAN", "2", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "2", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1558"); // generated assertion in case of RegionTagAttMatch

	}

	public void checkState54_RandAssertions1(){
		element = new DOMElement("SPAN", "MyPhotoGallery...containsmyphotos!", new ArrayList<String>(Arrays.asList("class=\"headerDot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"topPhorm\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1567"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		parentElement = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1574"); // Random element assertion
		element = new DOMElement("SPAN", "1", new ArrayList<String>(Arrays.asList("id=\"ss_n\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1579"); // Random element assertion
		element = new DOMElement("CENTER", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("onload=\"prepareBody();\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1585"); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"1000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "1Sec", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1590"); // Random element assertion
	}

	public void checkState54_RandAssertions2(){
		element = new DOMElement("A", "100_0794", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "100_0794", new ArrayList<String>(Arrays.asList("id=\"ss_title\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1598"); // Random element assertion
		element = new DOMElement("BR", "ThisistheendofSlideShow.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1602"); // Random element assertion
		element = new DOMElement("DIV", "100_0794", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\""))));
childrenElements.add(new DOMElement("A", "100_0794", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1613"); // Random element assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1618"); // Random element assertion
		element = new DOMElement("SCRIPT", "varDarkenVal=60SlideShow::MyPhotoGallery", new ArrayList<String>(Arrays.asList("lanugage=\"javascript\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "varDarkenVal=60", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1623"); // Random element assertion
	}

	public void checkState54_RandAssertions3(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1630"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("id=\"ss_photo\"","onload=\"javscript:ss_loaddone();\"","src=\"images/000006_rryky_0.jpg\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link2\"","style=\"display:inline;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1634"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[@language=\"javascript\" and @@src=\"files/phorm.js\" and @type=\"text/javascript\"]")))) System.out.println("1635"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV[4]/TABLE/TBODY/TR/TD[[@style=\"text-align: right\" and @width=\"25%\"]")))) System.out.println("1636"); // Random element assertion
		element = new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("class=\"q\"","onclick=\"javascript:ss_prev();\""))));
childrenElements.add(new DOMElement("A", "Previous", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1643"); // Random element assertion
	}

	public void checkState54_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[[style=\"width: 100%;\"]")))) System.out.println("1647"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"reddot\"","style=\"padding: 0px 10px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1652"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/CENTER/DIV/DIV/DIV/SPAN[[@class=\"reddot\" and @style=\"padding: 0px 10px;\"]")))) System.out.println("1653"); // Random element assertion
		element = new DOMElement("TR", "[Previous][Pauseit][Next]", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"text-align: left\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Previous]", new ArrayList<String>(Arrays.asList("style=\"text-align: center\"","width=\"50%\""))));
childrenElements.add(new DOMElement("TD", "[Pauseit]", new ArrayList<String>(Arrays.asList("style=\"text-align: right\"","width=\"25%\""))));
childrenElements.add(new DOMElement("TD", "[Next]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1662"); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"10000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "10Sec", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1667"); // Random element assertion
	}

	public void checkState54_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[class=\"topPhorm\"]")))) System.out.println("1671"); // Random element assertion
		element = new DOMElement("OPTION", "1Sec2Sec5Sec10Sec20Sec30Sec60Sec", new ArrayList<String>(Arrays.asList("value=\"5000\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"rate\"","id=\"ss_refresh\"","style=\"position: relative; top: 6px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "5Sec", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1676"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[[style=\"width: 100%;\"]")))) System.out.println("1677"); // Random element assertion
		element = new DOMElement("DIV", "100_0794", new ArrayList<String>(Arrays.asList("id=\"headSlideshow\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"titlepart\"","style=\"letter-spacing: 2px; padding-bottom: 1em; margin-bottom: 0px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","id=\"ss_link1\"","style=\"letter-spacing: 5px;\""))));
childrenElements.add(new DOMElement("A", "100_0794", new ArrayList<String>(Arrays.asList("class=\"dt\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1688"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/A[href=\".\"]")))) System.out.println("1689"); // Random element assertion
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
