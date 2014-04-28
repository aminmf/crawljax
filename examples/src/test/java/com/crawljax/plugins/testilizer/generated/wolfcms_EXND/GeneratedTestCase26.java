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

public class GeneratedTestCase26 {

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
	public void method26(){
		driver.get(url);
		//From state 0 to state 22
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=22, name=state22}}
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
		//From state 22 to state 23
		//Eventable{eventType=click, identification=text Snippets, element=Element{node=[A: null], tag=A, text=Snippets, attributes={href=http://localhost:8888/wolfcms/?/admin/snippet}}, source=StateVertexImpl{id=22, name=state22}, target=StateVertexImpl{id=23, name=state23}}
		mutateDOMTree(22);
		checkState22_OriginalAssertions();
		checkState22_ReusedAssertions();
		checkState22_GeneratedAssertions();
		checkState22_LearnedAssertions();
		checkState22_AllAssertions();
		checkState22_RandAssertions1();
		checkState22_RandAssertions2();
		checkState22_RandAssertions3();
		checkState22_RandAssertions4();
		checkState22_RandAssertions5();
		driver.findElement(By.linkText("Snippets")).click();
		//From state 23 to state 24
		//Eventable{eventType=click, identification=xpath //ul[@id='snippets']/li[3]/div[@class='remove']/a, element=Element{node=[A: null], tag=A, text=, attributes={class=remove, href=http://localhost:8888/wolfcms/?/admin/snippet/delete/532, onclick=return confirm('Are you sure you wish to delete? RNDARXo?');}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
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
		driver.findElement(By.xpath("//ul[@id='snippets']/li[3]/div[@class='remove']/a")).click();
		//Sink node at state 24
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
		element = new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
childrenElements.add(new DOMElement("A", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Password:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Password:", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
childrenElements.add(new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "website:WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/P[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("H1", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery-1.6.2.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[id=\"login-username-div\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Password:", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
childrenElements.add(new DOMElement("LABEL", "Password:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("TITLE", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TITLE", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","id=\"login-remember-me\"","name=\"login[remember]\"","type=\"checkbox\"","value=\"checked\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/themes/brown_and_green/login.css\"","id=\"css_theme\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/SCRIPT[@charset=\"utf-8\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[@href=\"/wolfcms/wolf/admin/themes/brown_and_green/login.css\" and @@id=\"css_theme\" and @@media=\"screen\" and @@rel=\"Stylesheet\" and @type=\"text/css\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "website:WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("DIV", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H1", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV/LABEL[for=\"login-username\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState22_OriginalAssertions(){
	}

	public void checkState22_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState22_GeneratedAssertions(){
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

	public void checkState22_LearnedAssertions(){
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

	public void checkState22_AllAssertions(){
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

		element = new DOMElement("DIV", "RND-ZsxvPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-zsxv.html\"","target=\"_blank\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState22_RandAssertions1(){
		element = new DOMElement("DIV", "RND-jNtzPublished", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"w1\""))));
childrenElements.add(new DOMElement("SPAN", "RND-jNtz", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Page(reorder)StatusViewModify", new ArrayList<String>(Arrays.asList("class=\"status\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Status", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RND-MaAX", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/5\"","title=\"5 | \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("SPAN", "RND-MaAX", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RND-Salb", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-13\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState22_RandAssertions2(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/3?csrf_token=f2b7c96123f669c64c317293e9e988abc0fc3efc501c1ee145a57d992af2f675\"","onclick=\"return confirm('Are you sure you wish to delete RND-ExEx11 and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV[4]/A[[@class=\"copy-page\" and @@href=\"#\" and @id=\"copy-9\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN/DIV/SPAN/IMG[[@align=\"middle\" and @@alt=\"Drag to Copy\" and @@class=\"handle_copy\" and @src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/15?csrf_token=43e10f08f89758c3146a9232eb1f552094ecd8f151a42663c716e22afa9ab0eb\"","onclick=\"return confirm('Are you sure you wish to delete RND-lSps and its underlying pages?');\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("H1", "Login-WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login-WolfCMS", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState22_RandAssertions3(){
		element = new DOMElement("IMG", "RND-lSps", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\"","title=\"15 | rnd-lsps\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[4]/SPAN/DIV/SPAN/IMG[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle_reorder\" and @src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/9\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDEKTm", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState22_RandAssertions4(){
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
		element = new DOMElement("INPUT", "Username:", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-username\"","name=\"login[username]\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[4]/SPAN/DIV/SPAN/IMG[[@align=\"middle\" and @@alt=\"\" and @@class=\"busy\" and @@id=\"busy-12\" and @@src=\"/wolfcms/wolf/admin/images/spinner.gif\" and @@style=\"display: none;\" and @title=\"\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[2]/SPAN/DIV[3]/A/IMG[@align=\"middle\" and @@alt=\"View Page\" and @@src=\"/wolfcms/wolf/admin/images/magnify.png\" and @title=\"View Page\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV[4]/A/IMG[@align=\"middle\" and @@alt=\"Add child\" and @@src=\"/wolfcms/wolf/admin/images/plus.png\" and @title=\"Add child\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState22_RandAssertions5(){
		element = new DOMElement("IMG", "RNDEKTm", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/2\"","title=\"2 | \"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/SCRIPT[@charset=\"utf-8\" and @type=\"text/javascript\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/cp-datepicker.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RND-lSps", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-15\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-9\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState23_OriginalAssertions(){
		if(!helper.equals("Snippets | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState23_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
		if(!helper.equals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState23_GeneratedAssertions(){
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

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

//		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionTagMatch

	}

	public void checkState23_LearnedAssertions(){
		element = new DOMElement("DIV", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_559\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/559\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLZHr?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDWyuY", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_557\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/557\"","onclick=\"return confirm('Are you sure you wish to delete? RNDWyuY?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDtGCb", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_550\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/550\"","onclick=\"return confirm('Are you sure you wish to delete? RNDtGCb?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDTvuL", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_553\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/553\"","onclick=\"return confirm('Are you sure you wish to delete? RNDTvuL?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDJSTp", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_564\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/564\"","onclick=\"return confirm('Are you sure you wish to delete? RNDJSTp?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState23_AllAssertions(){
		if(!helper.equals("Snippets | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!helper.equals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

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

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

	}

	public void checkState23_RandAssertions1(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/559\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLZHr?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDurhf", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_544\"")));
		childrenElements.clear();
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RNDThVr", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_549\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/549\"","onclick=\"return confirm('Are you sure you wish to delete? RNDThVr?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/532\"","onclick=\"return confirm('Are you sure you wish to delete? RNDARXo?');\"")));
		childrenElements.clear();
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[10]/DIV/A/IMG[@alt=\"delete snippet icon\" and @@src=\"/wolfcms/wolf/admin/images/icon-remove.gif\" and @title=\"Delete snippet\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/559\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLZHr?');\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/563\"","onclick=\"return confirm('Are you sure you wish to delete? RNDjOlh?');\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDkweg", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/561\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_561\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDkweg", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[25]/IMG[@align=\"middle\" and @@alt=\"snippet-icon\" and @src=\"/wolfcms/wolf/admin/images/snippet.png\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RNDThVr", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_549\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/549\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDThVr", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState23_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"box\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H2", "WhatisaSnippet?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDzXuY", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/538\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_538\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDzXuY", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/561\"","onclick=\"return confirm('Are you sure you wish to delete? RNDkweg?');\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RNDyEtv", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_545\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/545\"","onclick=\"return confirm('Are you sure you wish to delete? RNDyEtv?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_snippet_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState23_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[13]/DIV/A/IMG[@alt=\"delete snippet icon\" and @@src=\"/wolfcms/wolf/admin/images/icon-remove.gif\" and @title=\"Delete snippet\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[20]/IMG[[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle\" and @src=\"/wolfcms/wolf/admin/images/drag.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_559\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/559\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV[2]/DIV/DIV[2]/P[[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDTvuL", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_553\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState23_RandAssertions5(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[24]/IMG[@align=\"middle\" and @@alt=\"snippet-icon\" and @src=\"/wolfcms/wolf/admin/images/snippet.png\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/535\"","onclick=\"return confirm('Are you sure you wish to delete? RNDcDVj?');\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDlPSa", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/558\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_558\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDlPSa", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\" and @@rel=\"stylesheet\" and @type=\"text/css\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RNDjvls", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_547\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/547\"","onclick=\"return confirm('Are you sure you wish to delete? RNDjvls?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState24_OriginalAssertions(){
		if(!(closeAlertAndGetItsText().matches("^Are you sure you wish to delete[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!helper.equals("Snippets | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState24_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
		if(!helper.equals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch
	}

	public void checkState24_GeneratedAssertions(){
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

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p[]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

//		if(!(isElementPresent(By.xpath("//div[text()='User has been added!' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

//		if(!(isElementPresent(By.xpath("//div[@class='message' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState24_LearnedAssertions(){
		element = new DOMElement("DIV", "RNDjOlh", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_563\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/563\"","onclick=\"return confirm('Are you sure you wish to delete? RNDjOlh?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDxfpG", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_555\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/555\"","onclick=\"return confirm('Are you sure you wish to delete? RNDxfpG?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_559\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/559\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLZHr?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_snippet_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
childrenElements.add(new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

		element = new DOMElement("DIV", "RNDpRrv", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_562\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/562\"","onclick=\"return confirm('Are you sure you wish to delete? RNDpRrv?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted region assertion

	}

	public void checkState24_AllAssertions(){
		if(!(closeAlertAndGetItsText().matches("^Are you sure you wish to delete[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!helper.equals("Snippets | Wolf CMS", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!helper.equals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

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
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of RegionFullMatch

	}

	public void checkState24_RandAssertions1(){
		element = new DOMElement("IMG", "RNDYGKV", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_554\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[2]/IMG[[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle\" and @src=\"/wolfcms/wolf/admin/images/drag.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDpRrv", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/562\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_562\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDpRrv", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[3]/A[href=\"http://localhost:8888/wolfcms/?/admin/layout\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState24_RandAssertions2(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"box\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/525\"","onclick=\"return confirm('Are you sure you wish to delete? RNDmzga?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RNDpRrv", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_562\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/562\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDpRrv", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "RNDtGCb", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_550\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/550\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDtGCb", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=1cd9e09eecc9536265d0b4b72bd66644b0944e9971b5d3c378d881f15b944571\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogOut", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState24_RandAssertions3(){
		element = new DOMElement("LI", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_559\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/559\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/549\"","onclick=\"return confirm('Are you sure you wish to delete? RNDThVr?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDzXuY", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/538\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_538\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDzXuY", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "RNDmzga", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/525\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_525\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDmzga", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[1[@class=\"snippet node odd\" and @id=\"snippet_549\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState24_RandAssertions4(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/plugins/textile/textile.php\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDJSTp", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_564\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "Layouts", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Layouts", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDxfpG", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_555\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDcDVj", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_535\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
	}

	public void checkState24_RandAssertions5(){
		element = new DOMElement("A", "Layouts", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Layouts", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "RNDRqip", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_541\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/541\"","onclick=\"return confirm('Are you sure you wish to delete? RNDRqip?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[24]/IMG[[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle\" and @src=\"/wolfcms/wolf/admin/images/drag.gif\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[28]/DIV/A/IMG[@alt=\"delete snippet icon\" and @@src=\"/wolfcms/wolf/admin/images/icon-remove.gif\" and @title=\"Delete snippet\"]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "RNDMdYb", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_552\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
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
