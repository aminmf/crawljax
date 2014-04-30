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
	public void method24(){
		driver.get(url);
		//From state 0 to state 12
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=12, name=state12}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1]")).click();
		//From state 12 to state 23
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={href=/claroline-1.11.7/claroline/messaging, target=_top}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=23, name=state23}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1]")).click();
		//From state 23 to state 67
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={href=/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=67, name=state67}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1]")).click();
		//Sink node at state 67
		mutateDOMTree(67);
		checkState67_OriginalAssertions();
		checkState67_ReusedAssertions();
		checkState67_GeneratedAssertions();
		checkState67_LearnedAssertions();
		checkState67_AllAssertions();
		checkState67_RandAssertions1();
		checkState67_RandAssertions2();
		checkState67_RandAssertions3();
		checkState67_RandAssertions4();
		checkState67_RandAssertions5();
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
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("161"); // Random element assertion
		element = new DOMElement("BR", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("165"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("172"); // Random element assertion
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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("185"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net/documentation.htm\" and @rel=\"Help\"]")))) System.out.println("186"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("193"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[[]")))) System.out.println("194"); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("199"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[type=\"text/javascript\"]")))) System.out.println("200"); // Random element assertion
		element = new DOMElement("P", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\""))));
childrenElements.add(new DOMElement("#comment", "\"LostPassword\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/inscription.php\""))));
childrenElements.add(new DOMElement("A", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "\"CreateuserAccount\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Createuseraccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("215"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[[class=\"spacer\"]")))) System.out.println("219"); // Random element assertion
		element = new DOMElement("H3", "Rootcategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Rootcategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("224"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("228"); // Random element assertion
		element = new DOMElement("LABEL", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("233"); // Random element assertion
		element = new DOMElement("FORM", "Search", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php?logout=true\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"coursesearchbox_keyword\"","name=\"coursesearchbox_keyword\"","type=\"text\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("242"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\" and @type=\"text/javascript\"]")))) System.out.println("246"); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Humanities", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("269"); // Random element assertion
		element = new DOMElement("H3", "Rootcategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Rootcategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("274"); // Random element assertion
		element = new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login\""))));
childrenElements.add(new DOMElement("LABEL", "Username", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("for=\"password\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Password", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("tabindex=\"3\"","type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Enter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("297"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("308"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("315"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("320"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("325"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("329"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterRight\"]")))) System.out.println("330"); // Random element assertion
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
		element = new DOMElement("DIV", "LatestannouncementsNoannouncementtodisplay", new ArrayList<String>(Arrays.asList("class=\"portlet CLANN_Portlet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"desktopRightContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H1", "Latestannouncements", new ArrayList<String>(Arrays.asList("class=\"content\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("357"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "Edittextzone", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("369"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"desktopRightContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H1", "Mycalendar", new ArrayList<String>(Arrays.asList("class=\"content\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("378"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("382"); // Random element assertion
		element = new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"managerString\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("387"); // Random element assertion
	}

	public void checkState12_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/A[href=\"mailto:m@ga.com?subject=[Claroline]\"]")))) System.out.println("391"); // Random element assertion
		element = new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=16&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("397"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[id=\"claroPage\"]")))) System.out.println("398"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("403"); // Random element assertion
		element = new DOMElement("P", "Edittextzone", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html\""))));
childrenElements.add(new DOMElement("A", "Edittextzone", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("410"); // Random element assertion
	}

	public void checkState12_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfile\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"User picture\"","class=\"userPicture\"","src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("420"); // Random element assertion
		element = new DOMElement("P", "Managemyaccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroCmd\"","href=\"/claroline-1.11.7/claroline/auth/profile.php\""))));
childrenElements.add(new DOMElement("A", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("427"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[4]/DIV/TABLE/TBODY/TR[2]/TD[[]")))) System.out.println("428"); // Random element assertion
		element = new DOMElement("A", "Enrolonanewcourse", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Enrolonanewcourse", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("434"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DD[7]/SPAN[class=\"managerString\"]")))) System.out.println("435"); // Random element assertion
	}

	public void checkState12_RandAssertions4(){
		element = new DOMElement("SPAN", "Logout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Logout", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php?logout=true\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("443"); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("448"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[[class=\"portlet mymessages\"]")))) System.out.println("449"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"portletMycalendar\""))));
childrenElements.add(new DOMElement("DIV", "Noeventtodisplay", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("457"); // Random element assertion
		element = new DOMElement("TD", "Mydesktop", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("H1", "Mydesktop", new ArrayList<String>(Arrays.asList("class=\"toolTitle mainTitle\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("463"); // Random element assertion
	}

	public void checkState12_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[]")))) System.out.println("467"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[[]")))) System.out.println("468"); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=15&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hello", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("473"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net\" and @rel=\"Copyright\"]")))) System.out.println("474"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/desktop.css?1337869520\"","media=\"all\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("478"); // Random element assertion
	}

	public void checkState23_OriginalAssertions(){
	}

	public void checkState23_ReusedAssertions(){
	}

	public void checkState23_GeneratedAssertions(){
	}

	public void checkState23_LearnedAssertions(){
	}

	public void checkState23_AllAssertions(){
	}

	public void checkState23_RandAssertions1(){
		element = new DOMElement("TD", "HellommnainyApril11,2014at07:20PM", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=14\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=14&userId=1&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("504"); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("509"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user-trash-full.gif?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=6\"","onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=6')\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("513"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[4]/TD[4]/A[@href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=13\" and @onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=13')\"]")))) System.out.println("514"); // Random element assertion
		element = new DOMElement("OPTION", "All(Readornot)OnlyreadOnlynotread", new ArrayList<String>(Arrays.asList("value=\"read\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"SelectorReadStatus\"","name=\"SelectorReadStatus\"","size=\"1\"","style=\"display: none;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Onlyread", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("519"); // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		element = new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=10\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=10&userId=1&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("530"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("536"); // Random element assertion
		element = new DOMElement("LI", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Mydesktop", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("541"); // Random element assertion
		element = new DOMElement("A", "Outbox", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=outbox\"","id=\"outbox\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Outbox", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("546"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("550"); // Random element assertion
	}

	public void checkState23_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[9]/TD[2]/IMG[@alt=\"\" and @src=\"/claroline-1.11.7/web/img/platformadmin.png?1232379976\"]")))) System.out.println("554"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/HR[]")))) System.out.println("555"); // Random element assertion
		element = new DOMElement("SPAN", "Mydesktop", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Mydesktop", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("560"); // Random element assertion
		element = new DOMElement("LI", "Inbox(7)OutboxTrashbox", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Inbox(7)", new ArrayList<String>(Arrays.asList("class=\"current\"","href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox\"","id=\"inbox\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("565"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[class=\"breadCrumbsNode firstBreadCrumbsNode\"]")))) System.out.println("566"); // Random element assertion
	}

	public void checkState23_RandAssertions4(){
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"im_list_action\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "April10,2014at05:47PM", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("582"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[3]/A[@href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=trashbox\" and @id=\"trashbox\"]")))) System.out.println("583"); // Random element assertion
		element = new DOMElement("TABLE", "Mymessages", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "Mymessages", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("588"); // Random element assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"im_list_action\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "April10,2014at05:43PM", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("601"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterRight\"]")))) System.out.println("602"); // Random element assertion
	}

	public void checkState23_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/A[href=\"mailto:m@ga.com?subject=[Claroline]\"]")))) System.out.println("606"); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=9\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Unread\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("611"); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=5&userId=1&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hello", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("616"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/P/A[href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html\"]")))) System.out.println("617"); // Random element assertion
		element = new DOMElement("SELECT", "All(Readornot)OnlyreadOnlynotread", new ArrayList<String>(Arrays.asList("id=\"SelectorReadStatus\"","name=\"SelectorReadStatus\"","size=\"1\"","style=\"display: none;\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"all\""))));
childrenElements.add(new DOMElement("OPTION", "All(Readornot)", new ArrayList<String>(Arrays.asList("value=\"read\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"unread\""))));
childrenElements.add(new DOMElement("OPTION", "Onlyread", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "Onlynotread", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("628"); // Random element assertion
	}

	public void checkState67_OriginalAssertions(){
	}

	public void checkState67_ReusedAssertions(){
	}

	public void checkState67_GeneratedAssertions(){
	}

	public void checkState67_LearnedAssertions(){
	}

	public void checkState67_AllAssertions(){
	}

	public void checkState67_RandAssertions1(){
		element = new DOMElement("A", "SelectTextColor", new ArrayList<String>(Arrays.asList("class=\"mceAction mce_forecolor\"","href=\"javascript:;\"","id=\"textContent_forecolor_action\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Select Text Color\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"mceFirst\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceAction mce_forecolor\""))));
childrenElements.add(new DOMElement("SPAN", "SelectTextColor", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_forecolor_voice\"","style=\"display:none;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"mceColorPreview\"","id=\"textContent_forecolor_preview\"","style=\"background-color: rgb(136, 136, 136);\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("653"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD[[]")))) System.out.println("654"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE/TBODY/TR/TD[6]/A/SPAN[[@class=\"mceVoiceLabel mceIconOnly\" and @@id=\"textContent_bold_voice\" and @style=\"display: none;\"]")))) System.out.println("655"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Edit\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.anonymous.inc.html\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("659"); // Random element assertion
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","class=\"mceLayout\"","id=\"textContent_tbl\"","role=\"presentation\"","style=\"width: 100%; height: 283px;\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_voice\"","class=\"mceEditor defaultSkin\"","id=\"textContent_parent\"","role=\"application\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("664"); // Random element assertion
	}

	public void checkState67_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[]")))) System.out.println("668"); // Random element assertion
		element = new DOMElement("TH", "DescriptionEditPreview", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Edit", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("673"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[2]/TBODY/TR/TD[21]/A/SPAN[[@class=\"mceVoiceLabel mceIconOnly\" and @@id=\"textContent_hr_voice\" and @style=\"display: none;\"]")))) System.out.println("674"); // Random element assertion
		element = new DOMElement("A", "Mydesktop", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Mydesktop", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("679"); // Random element assertion
		element = new DOMElement("TD", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "nainymm", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("684"); // Random element assertion
	}

	public void checkState67_RandAssertions3(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceOpen mce_forecolor\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"mceOpen mce_forecolor\"","href=\"javascript:;\"","id=\"textContent_forecolor_open\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Select Text Color\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"mceIconOnly\"","style=\"display:none;\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("692"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("696"); // Random element assertion
		element = new DOMElement("SPAN", "Redo(Ctrl+Y)", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_redo_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_redo_voice\"","class=\"mceButton mce_redo mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_redo\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Redo (Ctrl+Y)\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Redo(Ctrl+Y)", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("701"); // Random element assertion
		element = new DOMElement("TD", "Unlink", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Unlink", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_unlink_voice\"","class=\"mceButton mce_unlink mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_unlink\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Unlink\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("706"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[3]/TBODY/TR/TD[12]/A/SPAN[[@class=\"mceVoiceLabel mceIconOnly\" and @@id=\"textContent_col_after_voice\" and @style=\"display: none;\"]")))) System.out.println("707"); // Random element assertion
	}

	public void checkState67_RandAssertions4(){
		element = new DOMElement("A", "Help", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_help_voice\"","class=\"mceButton mceButtonEnabled mce_help\"","href=\"javascript:;\"","id=\"textContent_help\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Help\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_help\""))));
childrenElements.add(new DOMElement("SPAN", "Help", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_help_voice\"","style=\"display: none;\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("716"); // Random element assertion
		element = new DOMElement("A", "Strikethrough", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_strikethrough_voice\"","class=\"mceButton mceButtonEnabled mce_strikethrough\"","href=\"javascript:;\"","id=\"textContent_strikethrough\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Strikethrough\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_strikethrough\""))));
childrenElements.add(new DOMElement("SPAN", "Strikethrough", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_strikethrough_voice\"","style=\"display: none;\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("722"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("language=\"javascript\"","src=\"/claroline-1.11.7/claroline/editor/tiny_mce/advanced_users.conf.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/managing/editFile.php\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("726"); // Random element assertion
		element = new DOMElement("TD", "Path:", new ArrayList<String>(Arrays.asList("class=\"mceStatusbar mceFirst mceLast\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"mceLast\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Path:", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_path_voice\"","id=\"textContent_path_row\"","role=\"group\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"mceResize\"","href=\"javascript:;\"","id=\"textContent_resize\"","onclick=\"return false;\"","tabindex=\"-1\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("732"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[3]/SPAN/IMG[@alt=\"You are manager of this course\" and @@class=\"qtip role \" and @src=\"/claroline-1.11.7/web/img/manager.png?1232379976\"]")))) System.out.println("733"); // Random element assertion
	}

	public void checkState67_RandAssertions5(){
		element = new DOMElement("A", "Insert/EditImage", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_claroimage_voice\"","class=\"mceButton mceButtonEnabled mce_claroimage\"","href=\"javascript:;\"","id=\"textContent_claroimage\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Edit Image\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_claroimage\""))));
childrenElements.add(new DOMElement("SPAN", "Insert/EditImage", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_claroimage_voice\"","style=\"display: none;\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("742"); // Random element assertion
		element = new DOMElement("SPAN", "Path:", new ArrayList<String>(Arrays.asList("id=\"textContent_path\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_path_voice\"","id=\"textContent_path_row\"","role=\"group\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("746"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Preview\"","src=\"/claroline-1.11.7/web/img/preview.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=exView&file=course_subscription_locked.inc.html\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("750"); // Random element assertion
		element = new DOMElement("DIV", "Noeventtodisplay", new ArrayList<String>(Arrays.asList("id=\"portletMycalendar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "Noeventtodisplay", new ArrayList<String>(Arrays.asList("class=\"details\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("756"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR[3]/TD/DIV[@aria-labelledby=\"textContent_path_voice\" and @@id=\"textContent_path_row\" and @role=\"group\"]")))) System.out.println("757"); // Random element assertion
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
