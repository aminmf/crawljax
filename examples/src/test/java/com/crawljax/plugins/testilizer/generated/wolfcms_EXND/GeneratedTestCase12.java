package com.crawljax.plugins.testilizer.generated.wolfcms_EXND;

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
 * Generated @ Thu Apr 17 14:40:20 PDT 2014
 */

public class GeneratedTestCase12 {

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
		url = "http://localhost:8888/wolfcms/?/admin/";
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
	public void method12(){
		driver.get(url);
		//From state 0 to state 35
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=35, name=state35}}
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
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//From state 35 to state 36
		//Eventable{eventType=click, identification=partialText RND, element=Element{node=[A: null], tag=A, text=RND-lSps, attributes={class=edit-link, href=http://localhost:8888/wolfcms/?/admin/page/edit/15, title=15 | rnd-lsps}}, source=StateVertexImpl{id=35, name=state35}, target=StateVertexImpl{id=36, name=state36}}
		mutateDOMTree(35);
		checkState35_OriginalAssertions();
		checkState35_ReusedAssertions();
		checkState35_GeneratedAssertions();
		checkState35_LearnedAssertions();
		checkState35_AllAssertions();
		checkState35_RandAssertions1();
		checkState35_RandAssertions2();
		checkState35_RandAssertions3();
		checkState35_RandAssertions4();
		checkState35_RandAssertions5();
		driver.findElement(By.partialLinkText("RND")).click();
		//From state 36 to state 37
		//Eventable{eventType=click, identification=text Settings, element=Element{node=[A: null], tag=A, text=Settings, attributes={href=#settings}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=37, name=state37}}
		mutateDOMTree(36);
		checkState36_OriginalAssertions();
		checkState36_ReusedAssertions();
		checkState36_GeneratedAssertions();
		checkState36_LearnedAssertions();
		checkState36_AllAssertions();
		checkState36_RandAssertions1();
		checkState36_RandAssertions2();
		checkState36_RandAssertions3();
		checkState36_RandAssertions4();
		checkState36_RandAssertions5();
		driver.findElement(By.id("part_0_content")).clear();
		driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
		driver.findElement(By.id("page_title")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("page_title")).sendKeys(RandValue);
		driver.findElement(By.linkText("Settings")).click();
		//From state 37 to state 39
		//Eventable{eventType=click, identification=name commit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=button, name=commit, type=submit, value=Save and Close}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=39, name=state39}}
		mutateDOMTree(37);
		checkState37_OriginalAssertions();
		checkState37_ReusedAssertions();
		checkState37_GeneratedAssertions();
		checkState37_LearnedAssertions();
		checkState37_AllAssertions();
		checkState37_RandAssertions1();
		checkState37_RandAssertions2();
		checkState37_RandAssertions3();
		checkState37_RandAssertions4();
		checkState37_RandAssertions5();
		driver.findElement(By.name("commit")).click();
		//Sink node at state 39
		mutateDOMTree(39);
		checkState39_OriginalAssertions();
		checkState39_ReusedAssertions();
		checkState39_GeneratedAssertions();
		checkState39_LearnedAssertions();
		checkState39_AllAssertions();
		checkState39_RandAssertions1();
		checkState39_RandAssertions2();
		checkState39_RandAssertions3();
		checkState39_RandAssertions4();
		checkState39_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
		element = new DOMElement("LABEL", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState0_LearnedAssertions(){
		element = new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
childrenElements.add(new DOMElement("A", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		element = new DOMElement("LABEL", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
childrenElements.add(new DOMElement("A", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState0_RandAssertions1(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/P/A[href=\"http://localhost:8888/wolfcms/\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery-1.6.2.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TITLE", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "website:WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[id=\"login-username-div\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\""))));
childrenElements.add(new DOMElement("DIV", "Username:", new ArrayList<String>(Arrays.asList("id=\"login-password-div\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"clean\""))));
childrenElements.add(new DOMElement("DIV", "Password:", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[[id=\"login-password-div\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("DIV", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/themes/brown_and_green/login.css\"","id=\"css_theme\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Password:", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
childrenElements.add(new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("DIV", "Password:", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
childrenElements.add(new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","id=\"login-remember-me\"","name=\"login[remember]\"","type=\"checkbox\"","value=\"checked\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("for=\"login-password\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password:", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/themes/brown_and_green/login.css\"","id=\"css_theme\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H1", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[2]/LABEL[for=\"login-password\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState35_OriginalAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState35_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState35_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span[class=\"title\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "RNDDZRW", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/16\"","title=\"16 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDDZRW", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

	}

	public void checkState35_LearnedAssertions(){
		element = new DOMElement("SPAN", "RND-ysXV", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RND-ysXV", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RND-ExEx11Draft", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-exex11.html\"","target=\"_blank\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-zsxv.html\"","target=\"_blank\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDEKTmDraft", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/2\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/2?csrf_token=7b0ee0beeacd41ffc3d3b6ddb300bb12238bb17c077689a7c014c168b44d4115\"","onclick=\"return confirm('Are you sure you wish to delete RNDEKTm and its underlying pages?');\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-2\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "RND-MlYU", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RND-MlYU", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState35_AllAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		element = new DOMElement("SPAN", "RND-ysXV", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RND-ysXV", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RND-ExEx11Draft", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-exex11.html\"","target=\"_blank\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState35_RandAssertions1(){
		element = new DOMElement("LI", "RND-EoSmPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_14\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "RND-EoSmPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/12\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("for=\"login-password\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password:", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Administration", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/setting\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administration", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState35_RandAssertions2(){
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/admin/javascripts/jquery-ui-1.8.5.custom.min.js\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_8\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-2\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RND-SalbPublished", new ArrayList<String>(Arrays.asList("class=\"status published-status\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Published", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState35_RandAssertions3(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN/DIV/SPAN/A[@class=\"edit-link\" and @@href=\"http://localhost:8888/wolfcms/?/admin/page/edit/13\" and @title=\"13 | \"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RND-lSpsPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-lsps.html\"","target=\"_blank\""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "HomePage", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page/edit/1\"","title=\"/\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "HomePage", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/13?csrf_token=439551393ffe3a98a3bb7ed39525fc924d448e5b356f0497bb874fbd8ffa4b0e\"","onclick=\"return confirm('Are you sure you wish to delete RND-Salb and its underlying pages?');\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-0\"","id=\"page-0\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_15\""))));
childrenElements.add(new DOMElement("LI", "RND-lSpsPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_14\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_13\""))));
childrenElements.add(new DOMElement("LI", "RND-EoSmPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_12\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_11\""))));
childrenElements.add(new DOMElement("LI", "RND-SalbPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_10\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_9\""))));
childrenElements.add(new DOMElement("LI", "RND-MlYUPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_8\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_7\""))));
childrenElements.add(new DOMElement("LI", "RND-jNtzPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_6\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_5\""))));
childrenElements.add(new DOMElement("LI", "RND-txLEPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_4\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_3\""))));
childrenElements.add(new DOMElement("LI", "RND-lYxCPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_2\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-cvyHPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-ysXVPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-MaAXPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-ExEx13Draft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RND-ExEx11Draft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "RNDEKTmDraft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState35_RandAssertions4(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-13\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/11\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[8]/SPAN/DIV[4]/A[2]/IMG[@align=\"middle\" and @@alt=\"Remove page\" and @@src=\"/wolfcms/wolf/admin/images/icon-remove.gif\" and @title=\"Remove page\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-zsxv.html\"","target=\"_blank\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"View Page\"","src=\"/wolfcms/wolf/admin/images/magnify.png\"","title=\"View Page\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState35_RandAssertions5(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"View Page\"","src=\"/wolfcms/wolf/admin/images/magnify.png\"","title=\"View Page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI/SPAN/DIV/SPAN/A[@class=\"edit-link\" and @@href=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\" and @title=\"15 | rnd-lsps\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-2\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/3?csrf_token=d19163953dcf5b088e7e4cfdaf385f7e5454ca28064d3786810f4c93c0426ab7\"","onclick=\"return confirm('Are you sure you wish to delete RND-ExEx11 and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RND-lSps", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-15\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState36_OriginalAssertions(){
//		if(!helper.equals("Pages - Edit - Home Page | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState36_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState36_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

	}

	public void checkState36_LearnedAssertions(){
		element = new DOMElement("P", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","id=\"part-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"part_0_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"part_0_filter_id\"","name=\"part[0][filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "Viewthispage", new ArrayList<String>(Arrays.asList("style=\"float: right;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Viewthispage", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-lsps.html\"","id=\"site-view-page\"","onclick=\"target='_blank'\"","onkeypress=\"target='_blank'\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("TABLE", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"div-metadata\"","title=\"Metadata\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState36_AllAssertions(){
//		if(!helper.equals("Pages - Edit - Home Page | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		element = new DOMElement("P", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","id=\"part-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"part_0_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"part_0_filter_id\"","name=\"part[0][filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState36_RandAssertions1(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV/UL[class=\"tabNavigation\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Users", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Users", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"page_title\"","maxlength=\"255\"","name=\"page[title]\"","size=\"255\"","type=\"text\"","value=\"RND-lSps\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"title\"","id=\"div-title\"","title=\"Page Title\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV/UL/LI[[class=\"tab\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState36_RandAssertions2(){
		element = new DOMElement("TD", "LayoutinheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_layout_id\"","name=\"page[layout_id]\""))));
childrenElements.add(new DOMElement("SELECT", "inheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_edit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
childrenElements.add(new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[4]/DIV/DIV/DIV/P/LABEL[for=\"part_0_filter_id\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"metainfo-content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"pagetitle\"","style=\"display: block;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"metadata\"","style=\"display: none;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"settings\"","style=\"display: none;\""))));
childrenElements.add(new DOMElement("DIV", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Administrator", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState36_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"part-index-field\"","name=\"part[index]\"","type=\"hidden\"","value=\"2\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"part-name-field\"","maxlength=\"100\"","name=\"part[name]\"","type=\"text\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"add-part-button\"","name=\"commit\"","type=\"submit\"","value=\"Add\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Documentation", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("OPTION", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"part_0_filter_id\"","name=\"part[0][filter_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "none", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/admin/javascripts/cp-datepicker.js\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV[class=\"form-area\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState36_RandAssertions4(){
		element = new DOMElement("TD", "LayoutinheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Layout", new ArrayList<String>(Arrays.asList("for=\"page_layout_id\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TR", "Validuntildate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"label\""))));
childrenElements.add(new DOMElement("TD", "Validuntildate", new ArrayList<String>(Arrays.asList("class=\"field\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"main\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"content\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"page_tags\"","maxlength=\"255\"","name=\"page_tag[tags]\"","size=\"255\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState36_RandAssertions5(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mask\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_edit\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"metadata\"","style=\"display: none;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"metainfo-content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"div-metadata\"","title=\"Metadata\""))));
childrenElements.add(new DOMElement("DIV", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "PageTitleMetadataSettings", new ArrayList<String>(Arrays.asList("class=\"tab\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"tabNavigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Metadata", new ArrayList<String>(Arrays.asList("href=\"#metadata\""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H1", "EditPage", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "EditPage", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"add-part\"","title=\"Add Tab\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tab_toolbar\"","id=\"tab-toolbar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Add Tab icon\"","src=\"/wolfcms/wolf/admin/images/plus.png\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState37_OriginalAssertions(){
	}

	public void checkState37_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState37_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

	}

	public void checkState37_LearnedAssertions(){
		element = new DOMElement("P", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","id=\"part-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"part_0_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"part_0_filter_id\"","name=\"part[0][filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "Viewthispage", new ArrayList<String>(Arrays.asList("style=\"float: right;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Viewthispage", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-lsps.html\"","id=\"site-view-page\"","onclick=\"target='_blank'\"","onkeypress=\"target='_blank'\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("TABLE", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"div-metadata\"","title=\"Metadata\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TBODY", "SlugBreadcrumbKeywordsDescriptionTags", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState37_AllAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		element = new DOMElement("P", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","id=\"part-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"part_0_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"part_0_filter_id\"","name=\"part[0][filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "Viewthispage", new ArrayList<String>(Arrays.asList("style=\"float: right;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Viewthispage", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-lsps.html\"","id=\"site-view-page\"","onclick=\"target='_blank'\"","onkeypress=\"target='_blank'\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState37_RandAssertions1(){
		element = new DOMElement("DIV", "asasas", new ArrayList<String>(Arrays.asList("class=\"tab_toolbar\"","id=\"tab-toolbar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content tabs\"","id=\"part-tabs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"add-part\"","title=\"Add Tab\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"delete-part\"","title=\"Remove Tab\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[3]/DIV/TABLE/TBODY/TR[4]/TD[2]/INPUT[[@id=\"page_created_on_time\" and @@maxlength=\"8\" and @@name=\"page[created_on_time]\" and @@size=\"8\" and @@type=\"text\" and @value=\"21:19:48\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H1", "EditPage", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "EditPage", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV/UL[class=\"tabNavigation\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState37_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_edit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
childrenElements.add(new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[[@class=\"pages\" and @id=\"metainfo-content\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[id=\"mask\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[[@class=\"pages\" and @id=\"part-content\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Feedback", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState37_RandAssertions3(){
		element = new DOMElement("TITLE", "Pages-Edit-RND-lSps|WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pages-Edit-RND-lSps|WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "Breadcrumb", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"page_breadcrumb\"","maxlength=\"160\"","name=\"page[breadcrumb]\"","size=\"160\"","type=\"text\"","value=\"RND-lSps\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H1", "EditPage", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "EditPage", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"float: right;\""))));
childrenElements.add(new DOMElement("#comment", "content", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\"","id=\"page_edit_form\"","method=\"post\""))));
childrenElements.add(new DOMElement("SPAN", "Viewthispage", new ArrayList<String>(Arrays.asList("id=\"boxes\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("H1", "EditPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Demodialog[x]Thisisjustademo.AddPart[x]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endcontent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState37_RandAssertions4(){
		element = new DOMElement("INPUT", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("id=\"part_0_id\"","name=\"part[0][id]\"","type=\"hidden\"","value=\"21\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"part\"","id=\"part-1\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("OPTION", "nonePagenotfound", new ArrayList<String>(Arrays.asList("value=\"page_not_found\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"page_behavior_id\"","name=\"page[behavior_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pagenotfound", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[3]/DIV/TABLE/TBODY/TR/TD[2]/INPUT[@class=\"textbox\" and @@disabled=\"disabled\" and @@id=\"page_id\" and @@maxlength=\"100\" and @@name=\"unused\" and @@size=\"100\" and @@type=\"text\" and @value=\"15\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[2]/DIV/TABLE/TBODY/TR[4]/TD[class=\"label optional\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[3]/DIV/TABLE/TBODY/TR[3]/TD/LABEL[for=\"page_behavior_id\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState37_RandAssertions5(){
		element = new DOMElement("LI", "asasas", new ArrayList<String>(Arrays.asList("class=\"tab\"","id=\"part-1-tab\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"tabNavigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "asasas", new ArrayList<String>(Arrays.asList("class=\"here\"","href=\"#part-1-content\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "asasas", new ArrayList<String>(Arrays.asList("class=\"content tabs\"","id=\"part-tabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"tab_toolbar\"","id=\"tab-toolbar\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tabNavigation\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "asasas", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=92b2d67e5984175bacf8a64aa198688b54946e21ace5102ca0ef2602faadce93\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogOut", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[6]/A[href=\"http://localhost:8888/wolfcms/?/admin/user\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/plugins/file_manager/file_manager.js\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState39_OriginalAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState39_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
		if(!(driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")).getText() != "")){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
		if(!helper.equals("Page has been saved!", driver.findElement(By.xpath("//div[@class='message']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
		if(!(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!']")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState39_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thankyouforusing", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("#text", "0.7.8|", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Feedback", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

		element = new DOMElement("DIV", "Pagehasbeensaved!", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"opacity: 1;\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pagehasbeensaved!", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//div[text()='User has been added!' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

//		if(!(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span[class=\"title\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

//		if(!(isElementPresent(By.xpath("//div[@class='message' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState39_LearnedAssertions(){
		element = new DOMElement("SPAN", "RND-ysXV", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RND-ysXV", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-zsxv.html\"","target=\"_blank\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RND-ExEx11Draft", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-exex11.html\"","target=\"_blank\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("SPAN", "RND-MlYU", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RND-MlYU", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
childrenElements.add(new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState39_AllAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!(driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")).getText() != "")){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!helper.equals("Page has been saved!", driver.findElement(By.xpath("//div[@class='message']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!']")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

	}

	public void checkState39_RandAssertions1(){
		element = new DOMElement("DIV", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"part-content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"part-1-content\"","style=\"display: block;\""))));
childrenElements.add(new DOMElement("DIV", "FilternoneTextileMarkdownJustaseleniumtestpage.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI/UL/LI[4]/SPAN/DIV/SPAN[class=\"w1\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"part-index-field\"","name=\"part[index]\"","type=\"hidden\"","value=\"2\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"part-name-field\"","maxlength=\"100\"","name=\"part[name]\"","type=\"text\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"add-part-button\"","name=\"commit\"","type=\"submit\"","value=\"Add\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RND-Zsxv", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/8\"","title=\"8 | rnd-zsxv\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("SPAN", "RND-Zsxv", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "content", new ArrayList<String>(Arrays.asList("id=\"site-map-def\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-map-root\""))));
childrenElements.add(new DOMElement("H1", "Pages", new ArrayList<String>(Arrays.asList("type=\"text/css\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("DIV", "Page(reorder)StatusViewModify", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("STYLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endcontent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState39_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mask\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("OPTION", "inheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList("value=\"2\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"page_layout_id\"","name=\"page[layout_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Wolf", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI/UL/LI[8]/SPAN/DIV[4]/A[[@class=\"remove\" and @@href=\"http://localhost:8888/wolfcms/?/admin/page/delete/8?csrf_token=c0e4188a48cb565b698cee6056363df678e66769730423bc40c1f7d3d04cc93b\" and @onclick=\"return confirm('Are you sure you wish to delete RND-Zsxv and its underlying pages?');\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RNDEKTmDraft", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState39_RandAssertions3(){
		element = new DOMElement("DIV", "RND-MaAXPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV/SPAN/IMG[[@align=\"middle\" and @@alt=\"Drag to Copy\" and @@class=\"handle_copy\" and @src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI/UL[@class=\"sortable tree-root ui-sortable ui-sortable-disabled\" and @id=\"site-map\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RND-MaAXPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_5\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "RND-MaAXPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState39_RandAssertions4(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Remove Tab icon\"","src=\"/wolfcms/wolf/admin/images/minus.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"delete-part\"","title=\"Remove Tab\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LABEL", "Pageid", new ArrayList<String>(Arrays.asList("for=\"page_id\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Pageid", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RND-txLE", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/10\"","title=\"10 | \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("SPAN", "RND-txLE", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/5?csrf_token=4c1d533a0c3e127a275a3e1dbc5b1656bc35e8eecb6c3a493f75b5e033121686\"","onclick=\"return confirm('Are you sure you wish to delete RND-MaAX and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "RND-ExEx11Draft", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_3\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
childrenElements.add(new DOMElement("DIV", "RND-ExEx11", new ArrayList<String>(Arrays.asList("class=\"status draft-status\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
childrenElements.add(new DOMElement("DIV", "Draft", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState39_RandAssertions5(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-4\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "RNDDZRWPublished", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_15\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
childrenElements.add(new DOMElement("DIV", "RNDDZRW", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
childrenElements.add(new DOMElement("DIV", "Published", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI/UL/LI[6]/SPAN/DIV[[class=\"modify\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "HomePage", new ArrayList<String>(Arrays.asList("class=\"page\"","style=\"padding-left: 4px\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-0\"","id=\"page-0\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"w1\""))));
childrenElements.add(new DOMElement("SPAN", "HomePage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-15\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
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
