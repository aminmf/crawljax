package com.crawljax.plugins.testsuiteextension.generated.wolfcms_EP_temp;

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
 * Generated @ Wed Apr 16 05:41:28 PDT 2014
 */

public class GeneratedTestCase13 {

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
	public void method13(){
		driver.get(url);
		//From state 0 to state 26
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=26, name=state26}}
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
		//From state 26 to state 27
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=26, name=state26}, target=StateVertexImpl{id=27, name=state27}}
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
		driver.findElement(By.linkText("Users")).click();
		//From state 27 to state 28
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={class=current, href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=28, name=state28}}
		mutateDOMTree(27);
		checkState27_OriginalAssertions();
		checkState27_ReusedAssertions();
		checkState27_GeneratedAssertions();
		checkState27_LearnedAssertions();
		checkState27_AllAssertions();
		checkState27_RandAssertions1();
		checkState27_RandAssertions2();
		checkState27_RandAssertions3();
		checkState27_RandAssertions4();
		checkState27_RandAssertions5();
		driver.findElement(By.linkText("Users")).click();
		//From state 28 to state 29
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={class=current, href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}}
		mutateDOMTree(28);
		checkState28_OriginalAssertions();
		checkState28_ReusedAssertions();
		checkState28_GeneratedAssertions();
		checkState28_LearnedAssertions();
		checkState28_AllAssertions();
		checkState28_RandAssertions1();
		checkState28_RandAssertions2();
		checkState28_RandAssertions3();
		checkState28_RandAssertions4();
		checkState28_RandAssertions5();
		driver.findElement(By.linkText("Users")).click();
		//From state 29 to state 30
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={class=current, href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}}
		mutateDOMTree(29);
		checkState29_OriginalAssertions();
		checkState29_ReusedAssertions();
		checkState29_GeneratedAssertions();
		checkState29_LearnedAssertions();
		checkState29_AllAssertions();
		checkState29_RandAssertions1();
		checkState29_RandAssertions2();
		checkState29_RandAssertions3();
		checkState29_RandAssertions4();
		checkState29_RandAssertions5();
		driver.findElement(By.linkText("Users")).click();
		//From state 30 to state 31
		//Eventable{eventType=click, identification=cssSelector tr.node:nth-child(2) > td:nth-child(4) > a:nth-child(1) > img:nth-child(1), element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=delete user icon, src=/wolfcms/wolf/admin/images/icon-remove.gif, title=Delete user}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=31, name=state31}}
		mutateDOMTree(30);
		checkState30_OriginalAssertions();
		checkState30_ReusedAssertions();
		checkState30_GeneratedAssertions();
		checkState30_LearnedAssertions();
		checkState30_AllAssertions();
		checkState30_RandAssertions1();
		checkState30_RandAssertions2();
		checkState30_RandAssertions3();
		checkState30_RandAssertions4();
		checkState30_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())) System.out.println("173"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))) System.out.println("175"); // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("187"); // generated assertion in case of AEP for Original

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("193"); // generated assertion in case of AEP for Original

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("195"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState0_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("205"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("213"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("218"); // predicted pattern assertion

	}

	public void checkState0_AllAssertions(){
		if(!helper.equals("Login - Wolf CMS", driver.getTitle())) System.out.println("223"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"))) System.out.println("225"); // original assertion

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("231"); // generated assertion in case of AEP for Original

//		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("233"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("239"); // generated assertion in case of AEP for Original

	}

	public void checkState0_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[2]")))) System.out.println("244"); // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[5]/INPUT")))) System.out.println("245"); // Random element assertion
element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"login-username\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("250"); // Random pattern assertion
element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("256"); // Random pattern assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("260"); // Random pattern assertion

	}

	public void checkState0_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/H1")))) System.out.println("265"); // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[2]/INPUT")))) System.out.println("266"); // Random element assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("271"); // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","id=\"login-remember-me\"","name=\"login[remember]\"","type=\"checkbox\"","value=\"checked\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("282"); // Random pattern assertion
element = new DOMElement("TITLE", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("287"); // Random pattern assertion

	}

	public void checkState0_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV/INPUT")))) System.out.println("292"); // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT")))) System.out.println("293"); // Random element assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-username\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-username\"","name=\"login[username]\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("302"); // Random pattern assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-username\"","name=\"login[username]\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("306"); // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("315"); // Random pattern assertion

	}

	public void checkState0_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV")))) System.out.println("320"); // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[4]/INPUT[2]")))) System.out.println("321"); // Random element assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("326"); // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("335"); // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-username\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-username\"","name=\"login[username]\"","type=\"text\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("344"); // Random pattern assertion

	}

	public void checkState0_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/P/A")))) System.out.println("349"); // Random element assertion
if(!(isElementPresent(By.xpath("/HTML/BODY/DIV")))) System.out.println("350"); // Random element assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("355"); // Random pattern assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery-1.6.2.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("359"); // Random pattern assertion
element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("366"); // Random pattern assertion

	}

	public void checkState26_OriginalAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())) System.out.println("371"); // original assertion

	}

	public void checkState26_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("376"); // reused assertion in case of ElementFullMatch
	}

	public void checkState26_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("390"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("402"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("410"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")))) System.out.println("412"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\"","title=\"15 | \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("418"); // generated assertion in case of PatternTagMatch

	}

	public void checkState26_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_9\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("435"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | rnd-xfob\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("441"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/11\"","title=\"11 | rnd-fpya\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-11\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("455"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/13\"","title=\"13 | rnd-wjen\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("461"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_7\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("475"); // predicted pattern assertion

	}

	public void checkState26_AllAssertions(){
		if(!helper.equals("Pages | Wolf CMS", driver.getTitle())) System.out.println("480"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("482"); // reused assertion in case of ElementFullMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("494"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("502"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")))) System.out.println("504"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState26_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/DIV[4]/A")))) System.out.println("509"); // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[8]/SPAN/DIV[3]")))) System.out.println("510"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("514"); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | rnd-xfob\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("519"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-4\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("523"); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("532"); // Random pattern assertion
	}

	public void checkState26_RandAssertions2(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[13]/SPAN/DIV/SPAN/A/IMG")))) System.out.println("536"); // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[12]")))) System.out.println("537"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=170bb94e91bb6e55cc7433c2ed8c058ae215191f93b8e8e8bfe79dc3c78c7805\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("542"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/4\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("547"); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/14\"","title=\"14 | rnd-wctn\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("552"); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/14\"","title=\"14 | rnd-wctn\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-14\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("565"); // Random pattern assertion
	}

	public void checkState26_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN")))) System.out.println("569"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI/SPAN/DIV/SPAN")))) System.out.println("570"); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("575"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("580"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-12\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("584"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/3?csrf_token=2957d30a3fe42a04bc8a225227a77577c090041421bc1c4dc8174f0fce98eb16\"","onclick=\"return confirm('Are you sure you wish to delete RND-aRFe and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("589"); // Random pattern assertion
	}

	public void checkState26_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[10]/SPAN/DIV/SPAN/A")))) System.out.println("593"); // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[8]/SPAN/DIV/SPAN/A/IMG")))) System.out.println("594"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("598"); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-arfe.html\"","target=\"_blank\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("603"); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("610"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("615"); // Random pattern assertion
	}

	public void checkState26_RandAssertions5(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[10]/SPAN/DIV[4]/A[2]/IMG")))) System.out.println("619"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("620"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-2\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("624"); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/5\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/5?csrf_token=e347726adae2fac4558e9d19cc3a797c9107b8faf85b0690f98778f663843245\"","onclick=\"return confirm('Are you sure you wish to delete RND-ouMo and its underlying pages?');\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-5\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("635"); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("648"); // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("652"); // Random pattern assertion
	}

	public void checkState27_OriginalAssertions(){
	}

	public void checkState27_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("659"); // reused assertion in case of ElementFullMatch
	}

	public void checkState27_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("673"); // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("675"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("687"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("695"); // generated assertion in case of PatternTagMatch

////		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("697"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState27_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("708"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("714"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("724"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("736"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"button\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/add\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("742"); // predicted pattern assertion

	}

	public void checkState27_AllAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("747"); // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("749"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("761"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("769"); // generated assertion in case of PatternTagMatch

//		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("771"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState27_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[21]/TD/SMALL")))) System.out.println("776"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[15]/TD[4]/A/IMG")))) System.out.println("777"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("781"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/27?csrf_token=6504a26d06feb1470d90a8204d34029be0bb6ccc78e4fd8547903c38750f8fb9\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserRSBQ?');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("785"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/23?csrf_token=e55df928d1ee04241f1821ade679b5bb4fc281b1840756bf32dfd8ae6806bd0b\"","onclick=\"return confirm('Are you sure you wish to delete RNDUsergWph?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("792"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("797"); // Random pattern assertion
	}

	public void checkState27_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[14]/TD[4]")))) System.out.println("801"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[9]")))) System.out.println("802"); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6a97f21d39d383158a718bdc7aaca83a.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/17\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("813"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/31?csrf_token=7e846e2650cbf9ed28e3284dcdb72efa1f2777aaf67ced4bbfab5103d6f94291\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserKblj?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("820"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("825"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("829"); // Random pattern assertion
	}

	public void checkState27_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]")))) System.out.println("833"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[5]/TD[4]/A")))) System.out.println("834"); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("839"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/0f2f881630d13b2269dc8251cd2d956c.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/32\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("850"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("854"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6be4becb75f857ad504892693c4c1430.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("858"); // Random pattern assertion
	}

	public void checkState27_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("862"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[10]/TD[4]")))) System.out.println("863"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("868"); // Random pattern assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("881"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("885"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/b478da8c5e12d157346139359dc8a2fd.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("889"); // Random pattern assertion
	}

	public void checkState27_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[11]/TD")))) System.out.println("893"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR/TD[4]/IMG")))) System.out.println("894"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/24?csrf_token=1b647b111d8bdd02069dab79eb95b0c0c8fd87ed8675f90a17c39d177531019a\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserMUHd?');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("898"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("902"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/21\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("907"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.gravatar.com/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("912"); // Random pattern assertion
	}

	public void checkState28_OriginalAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("916"); // original assertion

	}

	public void checkState28_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("921"); // reused assertion in case of ElementFullMatch
	}

	public void checkState28_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("935"); // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("937"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("949"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("957"); // generated assertion in case of PatternTagMatch

//		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("959"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState28_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=00f8763a156056889fe793ef9bf27422485e5975e717db12ae6248d652d884a0\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("978"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("986"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("992"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1002"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1014"); // predicted pattern assertion

	}

	public void checkState28_AllAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("1019"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1021"); // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1023"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1035"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1043"); // generated assertion in case of PatternTagMatch

	}

	public void checkState28_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[21]/TD/SMALL")))) System.out.println("1048"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[15]/TD[4]/A/IMG")))) System.out.println("1049"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1053"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/26?csrf_token=3bffaa5d9ae72f280c154f3127b6a709f8af9f67d6895446d2ad7d1adaf8e681\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserigCI?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1058"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1063"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1068"); // Random pattern assertion
	}

	public void checkState28_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[14]/TD[4]")))) System.out.println("1072"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[9]")))) System.out.println("1073"); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6a97f21d39d383158a718bdc7aaca83a.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/17\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1084"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1089"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/35?csrf_token=cd754e8f1ebab69e65f96e7d0b52e897772a9d6c619f28654cedab0f7de168df\"","onclick=\"return confirm('Are you sure you wish to delete RNDtafH?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1096"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/27?csrf_token=197d8ec20fc6619c5453cb2a0b7c6f1b8f4aa120681be934fc40c009917787fd\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserRSBQ?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1103"); // Random pattern assertion
	}

	public void checkState28_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]")))) System.out.println("1107"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[5]/TD[4]/A")))) System.out.println("1108"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/18?csrf_token=60a08f3b3c7c58889ce057c3387403fdc838f6a1da04a74268ea713b2e019192\"","onclick=\"return confirm('Are you sure you wish to delete Amin?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1113"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/0f2f881630d13b2269dc8251cd2d956c.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/32\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1124"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1128"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/29?csrf_token=2ccb61c4b222ccb12e3cce10319f356f953a162810d3adf32145e9fcc1687de8\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserCRcu?');\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1132"); // Random pattern assertion
	}

	public void checkState28_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("1136"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[10]/TD[4]")))) System.out.println("1137"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1142"); // Random pattern assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1155"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1159"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6be4becb75f857ad504892693c4c1430.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1163"); // Random pattern assertion
	}

	public void checkState28_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR/TD[4]/IMG")))) System.out.println("1167"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[11]/TD")))) System.out.println("1168"); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=29f77898c0c680ba31e6c09970f2b7166c46db63f689040e950304cbec0d03a5\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1175"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1179"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1183"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/32?csrf_token=d3f9697b89bb3ef218166e0a39eee20a712146b26a1db9c2e00eea084b31a7fa\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserBQuL?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1190"); // Random pattern assertion
	}

	public void checkState29_OriginalAssertions(){
	}

	public void checkState29_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1197"); // reused assertion in case of ElementFullMatch
	}

	public void checkState29_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1211"); // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1213"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1225"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1233"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("1235"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState29_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=b97b2e5fd4dac149c46b283429f8c339fed77406a974c2e733bc02cea2e61c74\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1254"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1262"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1268"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1278"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1290"); // predicted pattern assertion

	}

	public void checkState29_AllAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1295"); // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1297"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1309"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1317"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("1319"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState29_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[21]/TD/SMALL")))) System.out.println("1324"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[15]/TD[4]/A/IMG")))) System.out.println("1325"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1329"); // Random pattern assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=b97b2e5fd4dac149c46b283429f8c339fed77406a974c2e733bc02cea2e61c74\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1344"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/27?csrf_token=c31a042ae9c7ba05ed216229fe9710360c6afe645811818952e9b9a145c5ae88\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserRSBQ?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1349"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1354"); // Random pattern assertion
	}

	public void checkState29_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[14]/TD[4]")))) System.out.println("1358"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[9]")))) System.out.println("1359"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/23?csrf_token=afb7d8034b41a09877f98c03b44308c720c69503b043da26566dd4433d070f04\"","onclick=\"return confirm('Are you sure you wish to delete RNDUsergWph?');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1363"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6a97f21d39d383158a718bdc7aaca83a.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/17\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1374"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1379"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1383"); // Random pattern assertion
	}

	public void checkState29_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[5]/TD[4]/A")))) System.out.println("1387"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]")))) System.out.println("1388"); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1393"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/0f2f881630d13b2269dc8251cd2d956c.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/32\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1404"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=2de47c1f5cb62a7f1a70a4f2891388a596100ecdcffabea2d9f24d779d5dc4f7\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1411"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/28?csrf_token=0d3c0ce2425ff04a8642fac236ab1964fd6060bd7bc96b49807f9e30dd95c58a\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserjjzJ?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1418"); // Random pattern assertion
	}

	public void checkState29_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[10]/TD[4]")))) System.out.println("1422"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("1423"); // Random element assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1436"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1441"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1445"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/26?csrf_token=9e49e70a1b09f14888e54bff0fa4940aa04de4e7b71c3226bab1d9f10566cbd6\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserigCI?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1452"); // Random pattern assertion
	}

	public void checkState29_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR/TD[4]/IMG")))) System.out.println("1456"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[11]/TD")))) System.out.println("1457"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=2de47c1f5cb62a7f1a70a4f2891388a596100ecdcffabea2d9f24d779d5dc4f7\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1462"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1466"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6be4becb75f857ad504892693c4c1430.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1470"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1474"); // Random pattern assertion
	}

	public void checkState30_OriginalAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("1478"); // original assertion

	}

	public void checkState30_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1483"); // reused assertion in case of ElementFullMatch
	}

	public void checkState30_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1497"); // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1499"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1511"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1519"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")))) System.out.println("1521"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState30_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1532"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1538"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1548"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1560"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"button\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/add\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1566"); // predicted pattern assertion

	}

	public void checkState30_AllAssertions(){
		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("1571"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1573"); // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1575"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1587"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1595"); // generated assertion in case of PatternTagMatch

	}

	public void checkState30_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[21]/TD/SMALL")))) System.out.println("1600"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[15]/TD[4]/A/IMG")))) System.out.println("1601"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1605"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6a97f21d39d383158a718bdc7aaca83a.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/17\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1616"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/21?csrf_token=b53a40bbb4a3224f7fd7c5a7a6ab570ec5e49a87092abf48c69db02f4c428330\"","onclick=\"return confirm('Are you sure you wish to delete RNDyyFO?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1621"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/18?csrf_token=fe2d0959abb1083cf7365f86264c035ea9add815467e1f7c129378e6c1af1d7d\"","onclick=\"return confirm('Are you sure you wish to delete Amin?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1626"); // Random pattern assertion
	}

	public void checkState30_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[14]/TD[4]")))) System.out.println("1630"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[9]")))) System.out.println("1631"); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1636"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/0f2f881630d13b2269dc8251cd2d956c.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/32\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1647"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1652"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1657"); // Random pattern assertion
	}

	public void checkState30_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[5]/TD[4]/A")))) System.out.println("1661"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]")))) System.out.println("1662"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1667"); // Random pattern assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1680"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/23?csrf_token=551db198dd8f89ab81ed70ef82a85d466e1b7c29ea46b5b0ff37589116e9d4a5\"","onclick=\"return confirm('Are you sure you wish to delete RNDUsergWph?');\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1684"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1688"); // Random pattern assertion
	}

	public void checkState30_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("1692"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[10]/TD[4]")))) System.out.println("1693"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1697"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1701"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/32?csrf_token=928ce137ee396a4b685dc941a1f06e1cdc6c4ccf721cfe7b4e4e58f15118f747\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserBQuL?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1706"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1710"); // Random pattern assertion
	}

	public void checkState30_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR/TD[4]/IMG")))) System.out.println("1714"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[11]/TD")))) System.out.println("1715"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/26\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1720"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/36?csrf_token=e688388b720148fe1669083fe017f23322a9bc54dca6c2945b59cafb6963690c\"","onclick=\"return confirm('Are you sure you wish to delete RNDPGZW?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1727"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6be4becb75f857ad504892693c4c1430.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1731"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1735"); // Random pattern assertion
	}

	public void checkState31_OriginalAssertions(){
		if(!(closeAlertAndGetItsText().matches("^Are you sure you wish to delete [\\s\\S]*$"))) System.out.println("1739"); // original assertion

		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("1741"); // original assertion

	}

	public void checkState31_ReusedAssertions(){
		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1746"); // reused assertion in case of ElementFullMatch
	}

	public void checkState31_GeneratedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1760"); // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1762"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1774"); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1782"); // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.xpath("//div[text()='User has been added!']")))) System.out.println("1784"); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState31_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=8ca9ecee2342b97e1659af7e2c49e021340701a678f0b58f9f24738190679fa6\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1803"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1811"); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1817"); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1829"); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1839"); // predicted pattern assertion

	}

	public void checkState31_AllAssertions(){
		if(!(closeAlertAndGetItsText().matches("^Are you sure you wish to delete [\\s\\S]*$"))) System.out.println("1844"); // original assertion

		if(!helper.equals("Users | Wolf CMS", driver.getTitle())) System.out.println("1846"); // original assertion

		if(!(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"))) System.out.println("1848"); // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.xpath("//div[@id='footer']/p")))) System.out.println("1850"); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://forum.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1862"); // generated assertion in case of PatternFullMatch

	}

	public void checkState31_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[15]/TD[3]")))) System.out.println("1867"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[5]")))) System.out.println("1868"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1872"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/37?csrf_token=d80d0af0be9347a9e6ace6c5c62c8c2150455b7292b37844ff4ad1b2eac3ed0c\"","onclick=\"return confirm('Are you sure you wish to delete RNDwSTd?');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1876"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/37?csrf_token=d80d0af0be9347a9e6ace6c5c62c8c2150455b7292b37844ff4ad1b2eac3ed0c\"","onclick=\"return confirm('Are you sure you wish to delete RNDwSTd?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1883"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/20?csrf_token=c05c3178b011c31339c41f1284f89fb731f81c8f84b38929edfc6e968fde3eee\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserQqwu?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1888"); // Random pattern assertion
	}

	public void checkState31_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/THEAD/TR/TH")))) System.out.println("1892"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[11]/TD/A")))) System.out.println("1893"); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1898"); // Random pattern assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TH", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1911"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1916"); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1921"); // Random pattern assertion
	}

	public void checkState31_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[10]/TD/IMG")))) System.out.println("1925"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]")))) System.out.println("1926"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1931"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1935"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1939"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/26?csrf_token=01e702013d84e9112d73e9f61df3acd8208ddfc1994d74a432e6f68fa7469a5e\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserigCI?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1946"); // Random pattern assertion
	}

	public void checkState31_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[16]/TD/A")))) System.out.println("1950"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[5]/P[2]/A[3]")))) System.out.println("1951"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1955"); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/26\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1960"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/27?csrf_token=d9fd5cdcda5961a48d5fc5d65c6a6202876b131b9d8e16e4d4762634e746c9ae\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserRSBQ?');\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1964"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1968"); // Random pattern assertion
	}

	public void checkState31_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[17]/TD[4]/A")))) System.out.println("1972"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[7]/TD[4]/A")))) System.out.println("1973"); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1978"); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/24?csrf_token=9963950fccdc846829032f44e0db39c22541464e0a433f7d1988d0eca707da5c\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserMUHd?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))) System.out.println("1985"); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/6be4becb75f857ad504892693c4c1430.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1989"); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))) System.out.println("1993"); // Random pattern assertion
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
