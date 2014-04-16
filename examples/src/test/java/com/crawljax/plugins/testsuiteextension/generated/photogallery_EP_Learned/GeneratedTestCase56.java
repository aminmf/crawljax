package com.crawljax.plugins.testsuiteextension.generated.photogallery_EP_Learned;

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
 * Generated @ Tue Apr 15 12:25:05 PDT 2014
 */

public class GeneratedTestCase56 {

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
	public void method56(){
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
		//From state 34 to state 47
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=100_0772, attributes={href=.?p=5, id=ss_link1, style=letter-spacing: 5px;}}, source=StateVertexImpl{id=34, name=state34}, target=StateVertexImpl{id=47, name=state47}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/CENTER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]")).click();
		//Sink node at state 47
		mutateDOMTree(47);
		checkState47_OriginalAssertions();
		checkState47_ReusedAssertions();
		checkState47_GeneratedAssertions();
		checkState47_LearnedAssertions();
		checkState47_AllAssertions();
		checkState47_RandAssertions1();
		checkState47_RandAssertions2();
		checkState47_RandAssertions3();
		checkState47_RandAssertions4();
		checkState47_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("div#Granny"))); // original assertion

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

	public void checkState32_OriginalAssertions(){
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$")); // original assertion

	}

	public void checkState32_ReusedAssertions(){
	}

	public void checkState32_GeneratedAssertions(){
	}

	public void checkState32_LearnedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState32_AllAssertions(){
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$")); // original assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState32_RandAssertions1(){
	}

	public void checkState32_RandAssertions2(){
	}

	public void checkState32_RandAssertions3(){
	}

	public void checkState32_RandAssertions4(){
	}

	public void checkState32_RandAssertions5(){
	}

	public void checkState33_OriginalAssertions(){
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // original assertion

		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

	}

	public void checkState33_ReusedAssertions(){
	}

	public void checkState33_GeneratedAssertions(){
	}

	public void checkState33_LearnedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState33_AllAssertions(){
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo"))); // original assertion

		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState33_RandAssertions1(){
	}

	public void checkState33_RandAssertions2(){
	}

	public void checkState33_RandAssertions3(){
	}

	public void checkState33_RandAssertions4(){
	}

	public void checkState33_RandAssertions5(){
	}

	public void checkState34_OriginalAssertions(){
		assertEquals("2", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

	}

	public void checkState34_ReusedAssertions(){
	}

	public void checkState34_GeneratedAssertions(){
	}

	public void checkState34_LearnedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"\"","id=\"ss_theend\"","style=\"display: none; margin: 10em 0em;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"text-align: center; margin: 15px 0px 10px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("B", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState34_AllAssertions(){
		assertEquals("2", driver.findElement(By.cssSelector("span#ss_n")).getText()); // original assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 1em auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"ss_desc\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"midInfo\"","id=\"ss_info\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin: 0px auto 5px; width: 90%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"partmain\"","id=\"slideShow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 100%\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState34_RandAssertions1(){
	}

	public void checkState34_RandAssertions2(){
	}

	public void checkState34_RandAssertions3(){
	}

	public void checkState34_RandAssertions4(){
	}

	public void checkState34_RandAssertions5(){
	}

	public void checkState47_OriginalAssertions(){
	}

	public void checkState47_ReusedAssertions(){
	}

	public void checkState47_GeneratedAssertions(){
	}

	public void checkState47_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=photos&cmd=del&pid=5\"","onclick=\"return confirmDelete('Photo #5')\"","target=\"_top\"","title=\"Delete this photo in the Administration Area\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=photos&cmd=doEdt&pid=5\"","target=\"_top\"","title=\"Edit this photo in the Administration Area\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"javascript:toggleInfo();\"","target=\"_top\"","title=\"Show/Hide additional info and de/centralize the photo\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","target=\"_top\"","title=\"Navigate to container Category (Default Category)\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dt\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\"","style=\"text-align: right\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"bottitle\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"darkdot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"","style=\"text-align: center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState47_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"pvTitleInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=photos&cmd=del&pid=5\"","onclick=\"return confirmDelete('Photo #5')\"","target=\"_top\"","title=\"Delete this photo in the Administration Area\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"admin.php?page=photos&cmd=doEdt&pid=5\"","target=\"_top\"","title=\"Edit this photo in the Administration Area\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"javascript:toggleInfo();\"","target=\"_top\"","title=\"Show/Hide additional info and de/centralize the photo\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?c=1\"","target=\"_top\"","title=\"Navigate to container Category (Default Category)\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"dt\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pvTitle\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"thumbDate\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\".?p=6\"","title=\"100_0794: 91 KB, 2101 hits and rated 0 by 0 person\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"navigation\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"Granny\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\"","style=\"text-align: right\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"aThumb\"","onmouseout=\"javascript: DarkenIt(this);\"","onmouseover=\"javascript: LightenIt(this);\"","style=\"-moz-opacity:0.6;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"bottitle\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"darkdot\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"","style=\"text-align: center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState47_RandAssertions1(){
	}

	public void checkState47_RandAssertions2(){
	}

	public void checkState47_RandAssertions3(){
	}

	public void checkState47_RandAssertions4(){
	}

	public void checkState47_RandAssertions5(){
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