package com.crawljax.plugins.testilizer.generated.claroline_RAND;

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
 * Generated @ Fri Apr 18 00:45:06 PDT 2014
 */

public class GeneratedTestCase22 {

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
		getCoverageReport = com.crawljax.plugins.testilizer.Testilizer.getCoverageReport();
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
	public void method22(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1]")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 2 to state 12
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[6], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={atusa=id11874169_0, type=submit, value=Ok}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=12, name=state12}}
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
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[6]")).click();
		//From state 12 to state 43
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=43, name=state43}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/UL[1]/LI[2]/SPAN[1]/A[1]")).click();
		//From state 43 to state 47
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=My User Account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=47, name=state47}}
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
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1]")).click();
		//From state 47 to state 65
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=http://localhost:8888/claroline-1.11.7/claroline/auth/profile.php}}, source=StateVertexImpl{id=47, name=state47}, target=StateVertexImpl{id=65, name=state65}}
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
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1]")).click();
		//Sink node at state 65
		mutateDOMTree(65);
		checkState65_OriginalAssertions();
		checkState65_ReusedAssertions();
		checkState65_GeneratedAssertions();
		checkState65_LearnedAssertions();
		checkState65_AllAssertions();
		checkState65_RandAssertions1();
		checkState65_RandAssertions2();
		checkState65_RandAssertions3();
		checkState65_RandAssertions4();
		checkState65_RandAssertions5();
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
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("217"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("221"); // Random element assertion
		element = new DOMElement("LI", "Humanities", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Humanities", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("226"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("231"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[[class=\"spacer\"]")))) System.out.println("232"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("DD", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("242"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
childrenElements.add(new DOMElement("#comment", "PlatformBanner", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPlatformBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofUserBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "BreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofBreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("263"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/FORM[@action=\"/claroline-1.11.7/index.php?logout=true\" and @method=\"post\"]")))) System.out.println("264"); // Random element assertion
		element = new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("269"); // Random element assertion
		element = new DOMElement("H3", "Rootcategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Rootcategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("274"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("281"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
childrenElements.add(new DOMElement("H3", "Authentication", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("294"); // Random element assertion
		element = new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhwP2xvZ291dD10cnVl\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("299"); // Random element assertion
		element = new DOMElement("BUTTON", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("tabindex=\"3\"","type=\"submit\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Enter", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("304"); // Random element assertion
		element = new DOMElement("H4", "Subcategories", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Subcategories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("309"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\" and @type=\"text/javascript\"]")))) System.out.println("313"); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("320"); // Random element assertion
		element = new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\""))));
childrenElements.add(new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("327"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[[]")))) System.out.println("328"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("335"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("343"); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("347"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("362"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("366"); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("370"); // Random element assertion
	}

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
	}

	public void checkState1_LearnedAssertions(){
	}

	public void checkState1_AllAssertions(){
	}

	public void checkState1_RandAssertions1(){
		element = new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("393"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("398"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("403"); // Random element assertion
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("407"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("id=\"leftContent\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("424"); // Random element assertion
	}

	public void checkState1_RandAssertions2(){
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("434"); // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/inscription.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Createuseraccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("439"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("444"); // Random element assertion
		element = new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList("type=\"submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Search", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("449"); // Random element assertion
		element = new DOMElement("BR", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("453"); // Random element assertion
	}

	public void checkState1_RandAssertions3(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("461"); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("465"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]")))) System.out.println("466"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("491"); // Random element assertion
		element = new DOMElement("DL", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Renderthecourseanditschildren", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DT", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DD", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("504"); // Random element assertion
	}

	public void checkState1_RandAssertions4(){
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("512"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]")))) System.out.println("513"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("519"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("525"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("529"); // Random element assertion
	}

	public void checkState1_RandAssertions5(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("536"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[[id=\"leftContent\"]")))) System.out.println("537"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("541"); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("548"); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("552"); // Random element assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
	}

	public void checkState2_LearnedAssertions(){
	}

	public void checkState2_AllAssertions(){
	}

	public void checkState2_RandAssertions1(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("574"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("579"); // Random element assertion
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("590"); // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("595"); // Random element assertion
		element = new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("600"); // Random element assertion
	}

	public void checkState2_RandAssertions2(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("607"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("611"); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("616"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("620"); // Random element assertion
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("631"); // Random element assertion
	}

	public void checkState2_RandAssertions3(){
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("649"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]")))) System.out.println("650"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("654"); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("658"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("662"); // Random element assertion
	}

	public void checkState2_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/claroline/../favicon.ico\" and @rel=\"shortcut icon\"]")))) System.out.println("666"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[@href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\" and @@media=\"screen, projection, tv\" and @@rel=\"stylesheet\" and @type=\"text/css\"]")))) System.out.println("667"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("692"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("697"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("702"); // Random element assertion
	}

	public void checkState2_RandAssertions5(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("709"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("714"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN[class=\"poweredBy\"]")))) System.out.println("715"); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("720"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("724"); // Random element assertion
	}

	public void checkState12_OriginalAssertions(){
	}

	public void checkState12_ReusedAssertions(){
	}

	public void checkState12_GeneratedAssertions(){
	}

	public void checkState12_LearnedAssertions(){
	}

	public void checkState12_AllAssertions(){
	}

	public void checkState12_RandAssertions1(){
		element = new DOMElement("A", "Edittextzone", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Edittextzone", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("749"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[6]/SPAN/A[href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_006\"]")))) System.out.println("750"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[class=\"spacer\"]")))) System.out.println("751"); // Random element assertion
		element = new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=13&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("757"); // Random element assertion
		element = new DOMElement("TR", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Hello", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "nainymm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "ThursdayApril10,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("770"); // Random element assertion
	}

	public void checkState12_RandAssertions2(){
		element = new DOMElement("P", "Viewmystatistics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroCmd\"","href=\"/claroline-1.11.7/claroline/tracking/userReport.php?userId=1\""))));
childrenElements.add(new DOMElement("A", "Viewmystatistics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("780"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("784"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[4]/DIV/TABLE/TBODY/TR[3]/TD[[]")))) System.out.println("785"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/DIV/DIV[id=\"userPicture\"]")))) System.out.println("786"); // Random element assertion
		element = new DOMElement("IMG", "Allplatformcourses", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/course.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/course/platform_courses.php\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("790"); // Random element assertion
	}

	public void checkState12_RandAssertions3(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("797"); // Random element assertion
		element = new DOMElement("TD", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "nainymm", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("802"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[7]/SPAN[]")))) System.out.println("803"); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=14&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hello", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("808"); // Random element assertion
		element = new DOMElement("A", "Logout", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Logout", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("813"); // Random element assertion
	}

	public void checkState12_RandAssertions4(){
		element = new DOMElement("IMG", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"iconDefinitionList\"","src=\"/claroline-1.11.7/claroline/announcements/img/announcement.png?1213169582\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("820"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBoxDock\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "userProfileBox", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofuserProfileBox", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("829"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"userCommands\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("H2", "Managemycourses", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("835"); // Random element assertion
		element = new DOMElement("TD", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=12&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("841"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("846"); // Random element assertion
	}

	public void checkState12_RandAssertions5(){
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"99%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\""))));
childrenElements.add(new DOMElement("TR", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\""))));
childrenElements.add(new DOMElement("TR", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("864"); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("869"); // Random element assertion
		element = new DOMElement("TR", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Hello", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "nainymm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "ThursdayApril10,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("882"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/H1[]")))) System.out.println("883"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/DIV/DIV/DL[class=\"calendarDetails\"]")))) System.out.println("884"); // Random element assertion
	}

	public void checkState43_OriginalAssertions(){
	}

	public void checkState43_ReusedAssertions(){
	}

	public void checkState43_GeneratedAssertions(){
	}

	public void checkState43_LearnedAssertions(){
	}

	public void checkState43_AllAssertions(){
	}

	public void checkState43_RandAssertions1(){
		element = new DOMElement("DIV", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("909"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET/DL/DD[4]/INPUT[@id=\"picture\" and @@name=\"picture\" and @type=\"file\"]")))) System.out.println("910"); // Random element assertion
		element = new DOMElement("A", "MyUserAccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/profile.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "MyUserAccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("915"); // Random element assertion
		element = new DOMElement("TABLE", "MyUserAccountViewmystatistics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "MyUserAccountViewmystatistics", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("920"); // Random element assertion
		element = new DOMElement("OPTION", "clarolinedisabledtemp", new ArrayList<String>(Arrays.asList("value=\"temp\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"authSourceSelector\"","name=\"authSource\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "temp", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("925"); // Random element assertion
	}

	public void checkState43_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[[class=\"claroDialogBox boxInfo\"]")))) System.out.println("929"); // Random element assertion
		element = new DOMElement("LABEL", "Oldpassword", new ArrayList<String>(Arrays.asList("for=\"old_password\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Oldpassword", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("934"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("938"); // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"password_conf\"","name=\"password_conf\"","type=\"password\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("945"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("956"); // Random element assertion
	}

	public void checkState43_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DL/DD[3]/INPUT[@id=\"skype\" and @@name=\"skype\" and @@type=\"text\" and @value=\"\"]")))) System.out.println("960"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("964"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/claroline-1.11.7/index.php?cidReq=&gidReq=\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='http://localhost:8888/claroline-1.11.7/index.php?cidReq=&gidReq=';return false\"","type=\"button\"","value=\"Cancel\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("969"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/index.php\" and @@rel=\"top\" and @title=\"\"]")))) System.out.println("970"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("983"); // Random element assertion
	}

	public void checkState43_RandAssertions4(){
		element = new DOMElement("TD", "MyUserAccountViewmystatistics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("H1", "MyUserAccount", new ArrayList<String>(Arrays.asList("class=\"toolTitle mainTitle\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("992"); // Random element assertion
		element = new DOMElement("LABEL", "Followcourses(student)", new ArrayList<String>(Arrays.asList("for=\"student\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Followcourses(student)", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("997"); // Random element assertion
		element = new DOMElement("SPAN", "Mydesktop", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Mydesktop", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1002"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1007"); // Random element assertion
		element = new DOMElement("UL", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"userName\""))));
childrenElements.add(new DOMElement("LI", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Logout", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "userBannerRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofuserBannerRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1022"); // Random element assertion
	}

	public void checkState43_RandAssertions5(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/claroline-1.11.7/index.php?cidReq=&gidReq=\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='http://localhost:8888/claroline-1.11.7/index.php?cidReq=&gidReq=';return false\"","type=\"button\"","value=\"Cancel\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1030"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[2]/DL/DT[5]/LABEL[for=\"password\"]")))) System.out.println("1031"); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1038"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[[]")))) System.out.println("1039"); // Random element assertion
		element = new DOMElement("INPUT", "maxsize150x200,102400bytes", new ArrayList<String>(Arrays.asList("id=\"picture\"","name=\"picture\"","type=\"file\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1043"); // Random element assertion
	}

	public void checkState47_OriginalAssertions(){
	}

	public void checkState47_ReusedAssertions(){
	}

	public void checkState47_GeneratedAssertions(){
	}

	public void checkState47_LearnedAssertions(){
	}

	public void checkState47_AllAssertions(){
	}

	public void checkState47_RandAssertions1(){
		element = new DOMElement("LABEL", "Administrativecode", new ArrayList<String>(Arrays.asList("for=\"officialCode\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administrativecode", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1066"); // Random element assertion
		element = new DOMElement("LI", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Mydesktop", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1071"); // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"student\"","name=\"platformRole\"","type=\"radio\"","value=\"student\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("for=\"student\""))));
childrenElements.add(new DOMElement("LABEL", "Followcourses(student)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("id=\"courseManager\"","name=\"platformRole\"","type=\"radio\"","value=\"courseManager\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"courseManager\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Createcourses(teacher)", new ArrayList<String>(Arrays.asList("class=\"adminControl\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "Manageplatform(administrator)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1086"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgInfo\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxInfo\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1093"); // Random element assertion
		element = new DOMElement("DIV", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1100"); // Random element assertion
	}

	public void checkState47_RandAssertions2(){
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("class=\"userName\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1108"); // Random element assertion
		element = new DOMElement("DIV", "Claroline>MyUserAccount", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1113"); // Random element assertion
		element = new DOMElement("SPAN", "maxsize150x200,102400bytes", new ArrayList<String>(Arrays.asList("class=\"notice\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "maxsize150x200,102400bytes", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1118"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/CREDITS.txt\" and @rel=\"Author\"]")))) System.out.println("1119"); // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"student\"","name=\"platformRole\"","type=\"radio\"","value=\"student\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("for=\"student\""))));
childrenElements.add(new DOMElement("LABEL", "Followcourses(student)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("id=\"courseManager\"","name=\"platformRole\"","type=\"radio\"","value=\"courseManager\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"courseManager\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Createcourses(teacher)", new ArrayList<String>(Arrays.asList("class=\"adminControl\""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "Manageplatform(administrator)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1134"); // Random element assertion
	}

	public void checkState47_RandAssertions3(){
		element = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DT", "Platformrole", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1146"); // Random element assertion
		element = new DOMElement("LABEL", "Authenticationsource", new ArrayList<String>(Arrays.asList("for=\"authSource\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Authenticationsource", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1151"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DL/DD[]")))) System.out.println("1152"); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1157"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET/DL/DD[2]/INPUT[@id=\"firstname\" and @@name=\"firstname\" and @@type=\"text\" and @value=\"mm\"]")))) System.out.println("1158"); // Random element assertion
	}

	public void checkState47_RandAssertions4(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1165"); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"csrf_token\"","name=\"csrf_token\"","type=\"hidden\"","value=\"c6ccd1af2e99e85dafd774309c7e0508\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/profile.php\"","enctype=\"multipart/form-data\"","id=\"userSettings\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1169"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/INPUT[[@id=\"csrf_token\" and @@name=\"csrf_token\" and @@type=\"hidden\" and @value=\"c6ccd1af2e99e85dafd774309c7e0508\"]")))) System.out.println("1170"); // Random element assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"applyChange\"","name=\"applyChange\"","type=\"submit\"","value=\"Ok\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/claroline-1.11.7/claroline/auth/profile.php\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1179"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1183"); // Random element assertion
	}

	public void checkState47_RandAssertions5(){
		element = new DOMElement("DT", "EmailPhoneSkypeaccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"email\""))));
childrenElements.add(new DOMElement("LABEL", "Email", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1193"); // Random element assertion
		element = new DOMElement("A", "Platformadministration", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Platformadministration", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1198"); // Random element assertion
		element = new DOMElement("LABEL", "Email", new ArrayList<String>(Arrays.asList("for=\"email\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1203"); // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1207"); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Logout", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1212"); // Random element assertion
	}

	public void checkState65_OriginalAssertions(){
	}

	public void checkState65_ReusedAssertions(){
	}

	public void checkState65_GeneratedAssertions(){
	}

	public void checkState65_LearnedAssertions(){
	}

	public void checkState65_AllAssertions(){
	}

	public void checkState65_RandAssertions1(){
		element = new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1235"); // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"old_password\"","name=\"old_password\"","type=\"password\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1242"); // Random element assertion
		element = new DOMElement("A", "Platformadministration", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Platformadministration", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1247"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"courseToolListBlock\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"toolList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1256"); // Random element assertion
		element = new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_002\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "A7-ComputerScience", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1261"); // Random element assertion
	}

	public void checkState65_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[2]/SPAN/IMG[@alt=\"You are manager of this course\" and @@class=\"qtip role \" and @src=\"/claroline-1.11.7/web/img/manager.png?1232379976\"]")))) System.out.println("1265"); // Random element assertion
		element = new DOMElement("TH", "SubjectSenderDate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("align=\"center\"","valign=\"top\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Subject", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1270"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1274"); // Random element assertion
		element = new DOMElement("IMG", "Assignments", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/work/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/work/work.php?cidReset=true&cidReq=AAOC112\"","id=\"CLWRK\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1278"); // Random element assertion
		element = new DOMElement("H4", "Subcategories", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Subcategories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1283"); // Random element assertion
	}

	public void checkState65_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[]")))) System.out.println("1287"); // Random element assertion
		element = new DOMElement("BR", "AAOC112mmnainy", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1291"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL[class=\"commandList\"]")))) System.out.println("1292"); // Random element assertion
		element = new DOMElement("DIV", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("id=\"userBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1299"); // Random element assertion
		element = new DOMElement("OPTION", "clarolinedisabledtemp", new ArrayList<String>(Arrays.asList("value=\"temp\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"authSourceSelector\"","name=\"authSource\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "temp", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1304"); // Random element assertion
	}

	public void checkState65_RandAssertions4(){
		element = new DOMElement("DT", "Platformrole", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Platformrole", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1312"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[[]")))) System.out.println("1313"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1322"); // Random element assertion
		element = new DOMElement("LABEL", "Createcourses(teacher)", new ArrayList<String>(Arrays.asList("for=\"courseManager\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Createcourses(teacher)", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1327"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/SCRIPT[type=\"text/javascript\"]")))) System.out.println("1328"); // Random element assertion
	}

	public void checkState65_RandAssertions5(){
		element = new DOMElement("P", "EngineeringGraphicsAAOC112mmnainy", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseInfos\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1339"); // Random element assertion
		element = new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList("type=\"submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php?logout=true\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Search", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1344"); // Random element assertion
		element = new DOMElement("SPAN", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_005\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1352"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1356"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[4]/DL/DD/INPUT[[@id=\"courseManager\" and @@name=\"platformRole\" and @@type=\"radio\" and @value=\"courseManager\"]")))) System.out.println("1357"); // Random element assertion
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
	String code = com.crawljax.plugins.testilizer.Testilizer.mutateDOMTreeCode(stateID);
		if (code!= null){
			long RandomlySelectedDOMElementID = (long) ((JavascriptExecutor)driver).executeScript(code);
			int MutationOperatorCode = com.crawljax.plugins.testilizer.Testilizer.MutationOperatorCode;
			int StateToBeMutated = com.crawljax.plugins.testilizer.Testilizer.StateToBeMutated;	
			com.crawljax.plugins.testilizer.Testilizer.SelectedRandomElementInDOM[MutationOperatorCode][StateToBeMutated]
					= (int) RandomlySelectedDOMElementID;
		}
	}
 

}
