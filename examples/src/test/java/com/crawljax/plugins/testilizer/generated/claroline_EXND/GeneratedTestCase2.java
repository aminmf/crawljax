package com.crawljax.plugins.testilizer.generated.claroline_EXND;

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
 * Generated @ Fri Apr 18 05:52:44 PDT 2014
 */

public class GeneratedTestCase2 {

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
	public void method2(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.linkText("Platform administration")).click();
		//From state 2 to state 164
		//Eventable{eventType=click, identification=text Manage user desktop, element=Element{node=[A: null], tag=A, text=Manage user desktop, attributes={href=../desktop/config.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=164, name=state164}}
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
		driver.findElement(By.linkText("Manage user desktop")).click();
		//From state 164 to state 87
		//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=164, name=state164}, target=StateVertexImpl{id=87, name=state87}}
		mutateDOMTree(164);
		checkState164_OriginalAssertions();
		checkState164_ReusedAssertions();
		checkState164_GeneratedAssertions();
		checkState164_LearnedAssertions();
		checkState164_AllAssertions();
		checkState164_RandAssertions1();
		checkState164_RandAssertions2();
		checkState164_RandAssertions3();
		checkState164_RandAssertions4();
		checkState164_RandAssertions5();
		driver.findElement(By.linkText("Logout")).click();
		//Sink node at state 87
		mutateDOMTree(87);
		checkState87_OriginalAssertions();
		checkState87_ReusedAssertions();
		checkState87_GeneratedAssertions();
		checkState87_LearnedAssertions();
		checkState87_AllAssertions();
		checkState87_RandAssertions1();
		checkState87_RandAssertions2();
		checkState87_RandAssertions3();
		checkState87_RandAssertions4();
		checkState87_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
	}

	public void checkState0_ReusedAssertions(){
		if(!(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState0_GeneratedAssertions(){
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
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState0_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		if(!(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

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
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState0_RandAssertions1(){
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Phone:7788814476", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/CREDITS.txt\" and @rel=\"Author\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI/SPAN/A[@href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhwP2xvZ291dD10cnVl\" and @target=\"_top\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
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
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BR[[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("H3", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[23[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[79[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[21[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[89[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhwP2xvZ291dD10cnVl\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[71[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H3", "Rootcategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Rootcategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[80[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock[class=\"toolTitleBlock\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "TitleVisibilityOrder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

	}

	public void checkState1_LearnedAssertions(){
		element = new DOMElement("SPAN", "Email-", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "Administrativecode-", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administrativecode", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"managerString\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "Phone7788814476", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "Phone", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "7788814476", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState1_AllAssertions(){
		element = new DOMElement("SPAN", "Email-", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "Administrativecode-", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administrativecode", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"managerString\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "Phone7788814476", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "Phone", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "7788814476", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState1_RandAssertions1(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/profile.css?1311598020\"","media=\"all\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT/IMG[@alt=\"Access allowed to anybody (even without login)\" and @@class=\"qtip iconDefinitionList \" and @src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Logout", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Edittextzone", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_top.authenticated.inc.html\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Edittextzone", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState1_RandAssertions2(){
		element = new DOMElement("TR", "HellonainymmThursdayApril17,2014", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Hello", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "nainymm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "ThursdayApril17,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H3", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"userName\""))));
childrenElements.add(new DOMElement("SPAN", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "Mydesktop", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("H1", "Mydesktop", new ArrayList<String>(Arrays.asList("class=\"toolTitle mainTitle\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Newitemstoanotherdate", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/notification_date.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"New items\"","class=\"iconDefinitionList\"","src=\"/claroline-1.11.7/web/img/hot.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Newitemstoanotherdate", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState1_RandAssertions3(){
		element = new DOMElement("SPAN", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_062\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Enrolonanewcourse", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Enrolonanewcourse", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "Managemyaccount", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroCmd\"","href=\"/claroline-1.11.7/claroline/auth/profile.php\""))));
childrenElements.add(new DOMElement("A", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Managemyaccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/profile.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState1_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DD[9]/SPAN/A[href=\"mailto:\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/H1[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Coursecreated:ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=1705&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Viewmystatistics", new ArrayList<String>(Arrays.asList("class=\"claroCmd\"","href=\"/claroline-1.11.7/claroline/tracking/userReport.php?userId=1\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Statistics\"","src=\"/claroline-1.11.7/web/img/statistics.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Viewmystatistics", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState1_RandAssertions5(){
		element = new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_009\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "A7-ComputerScience", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Createacoursesite", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/course/create.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/courseadd.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Createacoursesite", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"userName\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "Claroline>Mydesktop", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("#text", ">", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[10]/SPAN/IMG[@alt=\"You are manager of this course\" and @@class=\"qtip role \" and @src=\"/claroline-1.11.7/web/img/manager.png?1232379976\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock[class=\"toolTitleBlock\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.claroDialogBox.boxWarning[class=\"claroDialogBox boxWarning\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState2_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Administration", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TABLE", "Administration", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgWarning\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState2_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Administration", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TABLE", "Administration", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgWarning\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState2_RandAssertions1(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "Courselist", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Courselist", new ArrayList<String>(Arrays.asList("href=\"admin_courses.php\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("UL", "Claroline>Administration", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline>", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Addauserlist", new ArrayList<String>(Arrays.asList("href=\"../user/addcsvusers.php?AddType=adminTool\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Addauserlist", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState2_RandAssertions2(){
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "Userlist", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminUser\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Userlist", new ArrayList<String>(Arrays.asList("href=\"admin_users.php\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301589033\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Phone:7788814476", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState2_RandAssertions3(){
		element = new DOMElement("A", "Manageadministratoremailnotifications", new ArrayList<String>(Arrays.asList("href=\"adminmailsystem.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Manageadministratoremailnotifications", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H2", "Courses", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/course.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Courses", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[2]/A[href=\"managing/editFile.php\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Mergeuseraccounts", new ArrayList<String>(Arrays.asList("href=\"adminmergeuser.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Mergeuseraccounts", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState2_RandAssertions4(){
		element = new DOMElement("LI", "Createcourse", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Createcourse", new ArrayList<String>(Arrays.asList("href=\"../course/create.php?adminContext=1\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TR", "Administration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Manageclasses", new ArrayList<String>(Arrays.asList("href=\"admin_class.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Manageclasses", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Mymessages", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState2_RandAssertions5(){
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H2", "Platform'configuration", new ArrayList<String>(Arrays.asList("class=\"adminPlatform\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminUser\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LI", "SearchforauserAdvanced", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Userlist", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Sendamessagetoallusers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Createuser", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Addauserlist", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Manageclasses", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Rightprofilelist", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Manageuserdesktop", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Mergeuseraccounts", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Advanced", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Go\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_users.php\"","method=\"get\"","name=\"searchUser\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Advanced", new ArrayList<String>(Arrays.asList("href=\"advanced_user_search.php\"")));
		parentElement = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Advanced", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState164_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*My course list[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState164_ReusedAssertions(){
	}

	public void checkState164_GeneratedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "TitleVisibilityOrder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock[class=\"toolTitleBlock\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine[border=\"0\"][cellspacing=\"2\"][class=\"claroTable emphaseLine\"][width=\"100%\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState164_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"","onload=\"claro_session_loss_countdown(1440);\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
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
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "Manageuserdesktop", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState164_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*My course list[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "TitleVisibilityOrder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainyPhone:7788814476", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState164_RandAssertions1(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"User picture\"","class=\"userPicture\"","src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DD[14]/SPAN[class=\"managerString\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_063\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState164_RandAssertions2(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/H2[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[3]/TD[4]/A/IMG[@alt=\"Move down\" and @src=\"/claroline-1.11.7/web/img/move_down.png?1232379976\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "Mycalendar", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/config.php?label=CLCAL_Portlet&cmd=exDown\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[12[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState164_RandAssertions3(){
		element = new DOMElement("SPAN", "Email-", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Email", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TBODY", "Manageuserdesktop", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TR", "Manageuserdesktop", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Createacoursesite", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/course/create.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/courseadd.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Createacoursesite", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Mymessages", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState164_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[2]/TD[[align=\"center\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/claroline.js?1368605938\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxWarning\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgWarning\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TH", "TitleVisibilityOrder", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("align=\"center\"","valign=\"top\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Visibility", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState164_RandAssertions5(){
		element = new DOMElement("SPAN", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_063\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfile\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"User picture\"","class=\"userPicture\"","src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "Mycourselist", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/config.php?label=mycourselist&cmd=exUp\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "Filesstatistics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminTechnical\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Filesstatistics", new ArrayList<String>(Arrays.asList("href=\"technical/files_stats.php\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[20[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState87_OriginalAssertions(){
		if(!(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState87_ReusedAssertions(){
	}

	public void checkState87_GeneratedAssertions(){
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
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState87_LearnedAssertions(){
	}

	public void checkState87_AllAssertions(){
		if(!(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

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
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState87_RandAssertions1(){
	}

	public void checkState87_RandAssertions2(){
	}

	public void checkState87_RandAssertions3(){
	}

	public void checkState87_RandAssertions4(){
	}

	public void checkState87_RandAssertions5(){
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
