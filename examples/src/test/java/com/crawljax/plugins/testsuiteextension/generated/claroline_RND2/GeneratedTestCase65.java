package com.crawljax.plugins.testsuiteextension.generated.claroline_RND2;

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
 * Generated @ Fri Apr 18 01:30:05 PDT 2014
 */

public class GeneratedTestCase65 {

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
	public void method65(){
		driver.get(url);
		//From state 0 to state 14
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=14, name=state14}}
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
		//From state 14 to state 34
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={href=/claroline-1.11.7/claroline/messaging, target=_top}}, source=StateVertexImpl{id=14, name=state14}, target=StateVertexImpl{id=34, name=state34}}
		mutateDOMTree(14);
		checkState14_OriginalAssertions();
		checkState14_ReusedAssertions();
		checkState14_GeneratedAssertions();
		checkState14_LearnedAssertions();
		checkState14_AllAssertions();
		checkState14_RandAssertions1();
		checkState14_RandAssertions2();
		checkState14_RandAssertions3();
		checkState14_RandAssertions4();
		checkState14_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1]")).click();
		//From state 34 to state 68
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={href=/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=StateVertexImpl{id=34, name=state34}, target=StateVertexImpl{id=68, name=state68}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1]")).click();
		//From state 68 to state 74
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1], element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen, href=javascript:;, id=textContent_fontselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=StateVertexImpl{id=68, name=state68}, target=StateVertexImpl{id=74, name=state74}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[1]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/SPAN[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/A[1]")).click();
		//Sink node at state 74
		mutateDOMTree(74);
		checkState74_OriginalAssertions();
		checkState74_ReusedAssertions();
		checkState74_GeneratedAssertions();
		checkState74_LearnedAssertions();
		checkState74_AllAssertions();
		checkState74_RandAssertions1();
		checkState74_RandAssertions2();
		checkState74_RandAssertions3();
		checkState74_RandAssertions4();
		checkState74_RandAssertions5();
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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI/SPAN[]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[type=\"text/javascript\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[[id=\"toolViewOption\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/A[[href=\"/claroline-1.11.7/claroline/auth/inscription.php\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[class=\"breadCrumbsNode lastBreadCrumbsNode\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]"))); // Random element assertion
		element = new DOMElement("H3", "Rootcategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Rootcategory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[[id=\"breadcrumbLine\"]"))); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState14_OriginalAssertions(){
	}

	public void checkState14_ReusedAssertions(){
	}

	public void checkState14_GeneratedAssertions(){
	}

	public void checkState14_LearnedAssertions(){
	}

	public void checkState14_AllAssertions(){
	}

	public void checkState14_RandAssertions1(){
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Claroline>Mydesktop", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Mydesktop", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[class=\"portlet collapsible  collapsed\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/web/css/desktop.css?1337869520\" and @@media=\"all\" and @@rel=\"stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"portletMycalendar\""))));
childrenElements.add(new DOMElement("DIV", "Noeventtodisplay", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState14_RandAssertions2(){
		element = new DOMElement("TD", "HellonainymmThursdayApril10,2014", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ThursdayApril10,2014", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TH", "SubjectSenderDate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("align=\"center\"","valign=\"top\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Sender", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("HR", "Claroline>Lostpassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL[class=\"commandList\"]"))); // Random element assertion
	}

	public void checkState14_RandAssertions3(){
		element = new DOMElement("B", "textzone_top.authenticated.inc.html", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "textzone_top.authenticated.inc.html", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"iconDefinitionList\"","src=\"/claroline-1.11.7/claroline/announcements/img/announcement.png?1213169582\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/FORM/BR[[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[3]/IMG[@alt=\"Access allowed to anybody (even without login)\" and @@class=\"qtip iconDefinitionList \" and @src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"]"))); // Random element assertion
	}

	public void checkState14_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DD[4]/SPAN/A[href=\"mailto:m@ga.com\"]"))); // Random element assertion
		element = new DOMElement("TH", "SubjectSenderDate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("align=\"center\"","valign=\"top\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Date", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("P", "Managemyaccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroCmd\"","href=\"/claroline-1.11.7/claroline/auth/profile.php\""))));
childrenElements.add(new DOMElement("A", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState14_RandAssertions5(){
		element = new DOMElement("TITLE", "Lostpassword-Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword-Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "LatestannouncementsNoannouncementtodisplay", new ArrayList<String>(Arrays.asList("class=\"portlet CLANN_Portlet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"desktopRightContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H1", "Latestannouncements", new ArrayList<String>(Arrays.asList("class=\"content\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[[class=\"claroDialogMsg msgForm\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/DIV/DIV[[id=\"userDetails\"]"))); // Random element assertion
		element = new DOMElement("TD", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "FridayApril11,2014", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_OriginalAssertions(){
	}

	public void checkState34_ReusedAssertions(){
	}

	public void checkState34_GeneratedAssertions(){
	}

	public void checkState34_LearnedAssertions(){
	}

	public void checkState34_AllAssertions(){
	}

	public void checkState34_RandAssertions1(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=10\"","onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=10')\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"im_list_action\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user-trash-full.gif?1232379976\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[[class=\"breadCrumbsNode lastBreadCrumbsNode\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgForm\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "HellommnainyApril10,2014at05:45PM", new ArrayList<String>(Arrays.asList("class=\"im_list_action\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=5\"","onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=5')\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions2(){
		element = new DOMElement("IMG", "Chat", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/module/CLCHAT/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/module/CLCHAT/index.php?cidReset=true&cidReq=AAOC112\"","id=\"CLCHAT\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "EngineeringGraphicsAAOC112mmnainy", new ArrayList<String>(Arrays.asList("class=\"clearer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseInfos\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=15&userId=1&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hello", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Forums", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/phpbb/index.php?cidReset=true&cidReq=AAOC112\"","id=\"CLFRM\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/phpbb/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Forums", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "HellommnainyApril10,2014at05:45PM", new ArrayList<String>(Arrays.asList("class=\"im_list_action\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=6\"","onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=6')\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[id=\"claroPage\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Inbox(7)OutboxTrashbox", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"navlist\""))));
childrenElements.add(new DOMElement("UL", "Inbox(7)OutboxTrashbox", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Users", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Users", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/user/user.php?cidReset=true&cidReq=AAOC112\"","id=\"CLUSR\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Platformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Platformadministration", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/\"","target=\"_top\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=4\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=4&userId=1&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions4(){
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"readmessage.php?messageId=11&userId=1&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hello", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Agenda", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Agenda", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/calendar/agenda.php?cidReset=true&cidReq=AAOC112\"","id=\"CLCAL\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TITLE", "AAOC112-Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AAOC112-Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState34_RandAssertions5(){
		element = new DOMElement("A", "Platformadministration", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Platformadministration", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD/A/IMG[@alt=\"Unread\" and @src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"]"))); // Random element assertion
		element = new DOMElement("TD", "April10,2014at06:05PM", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "April10,2014at06:05PM", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "AAOC112mmnainy", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Mymessages", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroTable emphaseLine\"","width=\"100%\""))));
childrenElements.add(new DOMElement("P", "Edittextzone", new ArrayList<String>(Arrays.asList("id=\"im_paging\""))));
childrenElements.add(new DOMElement("DIV", "Inbox(7)OutboxTrashbox", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "12", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_OriginalAssertions(){
	}

	public void checkState68_ReusedAssertions(){
	}

	public void checkState68_GeneratedAssertions(){
	}

	public void checkState68_LearnedAssertions(){
	}

	public void checkState68_AllAssertions(){
	}

	public void checkState68_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[class=\"breadcrumbTrails\"]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Edit\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_inscription.inc.html\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Viewplatformstatistics", new ArrayList<String>(Arrays.asList("href=\"userReport.php?cidReset=true&userId=1\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Viewplatformstatistics", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Insert/EditImage", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_claroimage_voice\"","class=\"mceButton mceButtonEnabled mce_claroimage\"","href=\"javascript:;\"","id=\"textContent_claroimage\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Edit Image\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_claroimage\""))));
childrenElements.add(new DOMElement("SPAN", "Insert/EditImage", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_claroimage_voice\"","style=\"display: none;\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Messagedisplayedonthefileuploadpages", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_upload_file_disclaimer.inc.html\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_RandAssertions2(){
		element = new DOMElement("TR", "Textdisplayedifausertriestoenrolinalockedcourse", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Textdisplayedifausertriestoenrolinalockedcourse", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/profile.css?1311601620\"","media=\"all\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Preview\"","src=\"/claroline-1.11.7/web/img/preview.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_inscription.inc.html\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "InsertColumnBefore", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_col_before_voice\"","class=\"mceButton mce_col_before mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_col_before\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert Column Before\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_col_before\""))));
childrenElements.add(new DOMElement("SPAN", "InsertColumnBefore", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_col_before_voice\"","style=\"display: none;\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Insert/EditEmbeddedMedia", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_media_voice\"","class=\"mceButton mceButtonEnabled mce_media\"","href=\"javascript:;\"","id=\"textContent_media\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Edit Embedded Media\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_media\""))));
childrenElements.add(new DOMElement("SPAN", "Insert/EditEmbeddedMedia", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_media_voice\"","style=\"display: none;\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN/A[@href=\"http://www.claroline.net\" and @target=\"_blank\"]"))); // Random element assertion
		element = new DOMElement("TD", "SelectBackgroundColor", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("DIV", "SelectBackgroundColor", new ArrayList<String>(Arrays.asList("aria-haspopup=\"true\"","aria-labelledby=\"textContent_backcolor_voice\"","id=\"textContent_backcolor\"","role=\"button\"","tabindex=\"-1\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline>MyUserAccount>Statistics", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "AlignLeft", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "AlignLeft", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_justifyleft_voice\"","class=\"mceButton mceButtonEnabled mce_justifyleft\"","href=\"javascript:;\"","id=\"textContent_justifyleft\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Align Left\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/DIV/DIV/IMG[@alt=\"User picture\" and @@class=\"userPicture\" and @src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\"]"))); // Random element assertion
	}

	public void checkState68_RandAssertions4(){
		element = new DOMElement("INPUT", "Chooseacourse:ComputerScienceEngineeringGraphics", new ArrayList<String>(Arrays.asList("id=\"buttonOK\"","style=\"display: none;\"","type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Underline(Ctrl+U)", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_underline\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_underline_voice\"","class=\"mceButton mceButtonEnabled mce_underline\"","href=\"javascript:;\"","id=\"textContent_underline\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Underline (Ctrl+U)\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Messagedisplayedintheinternalmessaging", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Messagedisplayedintheinternalmessaging", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TBODY", "FormatFormat", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellpadding=\"0\"","cellspacing=\"0\"","class=\"mceListBox mceListBoxEnabled mce_formatselect\"","id=\"textContent_formatselect\"","role=\"presentation\"","tabindex=\"-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "FormatFormat", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[3]/TBODY/TR/TD[class=\"mceToolbarStart mceToolbarStartButton mceFirst\"]"))); // Random element assertion
	}

	public void checkState68_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY[]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_inscription_form.inc.html\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Edit\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Welcometextdisplayedtoauthenticatedusers", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Welcometextdisplayedtoauthenticatedusers", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"mceToolbarStart\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Viewplatformstatistics", new ArrayList<String>(Arrays.asList("href=\"userReport.php?cidReset=true&userId=1\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Viewplatformstatistics", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState74_OriginalAssertions(){
	}

	public void checkState74_ReusedAssertions(){
	}

	public void checkState74_GeneratedAssertions(){
	}

	public void checkState74_LearnedAssertions(){
	}

	public void checkState74_AllAssertions(){
	}

	public void checkState74_RandAssertions1(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/claroline-1.11.7/claroline/editor/tiny_mce/tiny_mce/themes/advanced/skins/default/ui.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "ComicSansMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"mceMenuItem mceMenuItemEnabled\"","id=\"mce_17\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "ComicSansMS", new ArrayList<String>(Arrays.asList("aria-checked=\"false\"","aria-disabled=\"false\"","aria-pressed=\"false\"","href=\"javascript:;\"","id=\"mce_17_aria\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"option\"","tabindex=\"-1\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "Impact", new ArrayList<String>(Arrays.asList("class=\"mceMenuItem mceMenuItemEnabled\"","id=\"mce_21\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Impact", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "[Advanced]", new ArrayList<String>(Arrays.asList("id=\"toAdvancedSearch\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "[", new ArrayList<String>(Arrays.asList("href=\"#\""))));
childrenElements.add(new DOMElement("A", "Advanced", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "]", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"mceToolbarEnd mceToolbarEndButton mceLast\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#comment", "IE", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState74_RandAssertions2(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_inscription_form.inc.html\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Preview\"","src=\"/claroline-1.11.7/web/img/preview.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"mceOpen\"","href=\"javascript:;\"","id=\"textContent_fontselect_open\"","onclick=\"return false;\"","onmousedown=\"return false;\"","tabindex=\"-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("aria-hidden=\"true\"","class=\"mceIconOnly\"","style=\"display:none;\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Bold(Ctrl+B)", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_bold_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_bold_voice\"","class=\"mceButton mceButtonEnabled mce_bold\"","href=\"javascript:;\"","id=\"textContent_bold\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Bold (Ctrl+B)\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Bold(Ctrl+B)", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/TABLE/TBODY/TR[11]/TD/A[@aria-checked=\"false\" and @@aria-disabled=\"false\" and @@aria-pressed=\"false\" and @@href=\"javascript:;\" and @@id=\"mce_22_aria\" and @@onclick=\"return false;\" and @@onmousedown=\"return false;\" and @@role=\"option\" and @tabindex=\"-1\"]"))); // Random element assertion
		element = new DOMElement("A", "Outbox", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=outbox\"","id=\"outbox\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Outbox", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState74_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[3]/TD[2]/A[href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.authenticated.inc.html\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "DeleteColumn", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_delete_col_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_delete_col_voice\"","class=\"mceButton mce_delete_col mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_delete_col\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Delete Column\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "DeleteColumn", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Unread\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=13\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Welcometextdisplayedtoanonymoususers", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Welcometextdisplayedtoanonymoususers", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "Arial", new ArrayList<String>(Arrays.asList("class=\"mceMenuItem mceMenuItemEnabled\"","id=\"mce_14\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Arial", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState74_RandAssertions4(){
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("align=\"\"","aria-disabled=\"false\"","aria-pressed=\"false\"","cellpadding=\"0\"","cellspacing=\"0\"","class=\"mceToolbar mceToolbarRow3 Enabled\"","id=\"textContent_toolbar3\"","role=\"presentation\"","tabindex=\"-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=5\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Unread\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Unread\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exMarkRead&messageId=9\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "InsertColumnBefore", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_col_before_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_col_before_voice\"","class=\"mceButton mce_col_before mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_col_before\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert Column Before\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "InsertColumnBefore", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"im_list_action\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=rqDeleteMessage&messageId=10\"","onclick=\"return deleteMessage('/claroline-1.11.7/claroline/messaging/messagebox.php?box=inbox&SelectorReadStatus=all&cmd=exDeleteMessage&messageId=10')\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState74_RandAssertions5(){
		element = new DOMElement("THEAD", "SubjectSenderDate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TR", "SubjectSenderDate", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Edit\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[3]/A[href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=exView&file=textzone_inscription_form.inc.html\"]"))); // Random element assertion
		element = new DOMElement("TR", "Textdisplayedonthe\"Createuseraccount\"page", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Textdisplayedonthe\"Createuseraccount\"page", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[class=\"breadcrumbTrails\"]"))); // Random element assertion
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