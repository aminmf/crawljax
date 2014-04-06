package com.crawljax.plugins.testsuiteextension.generated.wolfcms_EP;

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
 * Generated @ Sun Apr 06 00:30:31 PDT 2014
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
	public void method2(){
		driver.get(url);
		//From state 0 to state 12
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=12, name=state12}}
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
		//From state 12 to state 13
		//Eventable{eventType=click, identification=text Users, element=Element{node=[A: null], tag=A, text=Users, attributes={href=http://localhost:8888/wolfcms/?/admin/user}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
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
		driver.findElement(By.linkText("Users")).click();
		//From state 13 to state 14
		//Eventable{eventType=click, identification=xpath //div[@id='sidebar']/p/a[text()=' New User'], element=Element{node=[A: null], tag=A, text=New User, attributes={href=http://localhost:8888/wolfcms/?/admin/user/add}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=14, name=state14}}
		mutateDOMTree(13);
		checkState13_OriginalAssertions();
		checkState13_ReusedAssertions();
		checkState13_GeneratedAssertions();
		checkState13_LearnedAssertions();
		checkState13_AllAssertions();
		checkState13_RandAssertions1();
		checkState13_RandAssertions2();
		checkState13_RandAssertions3();
		checkState13_RandAssertions4();
		checkState13_RandAssertions5();
		driver.findElement(By.xpath("//div[@id='sidebar']/p/a[text()=' New User']")).click();
		//From state 14 to state 16
		//Eventable{eventType=click, identification=name commit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=button, name=commit, type=submit, value=Save}}, source=StateVertexImpl{id=14, name=state14}, target=StateVertexImpl{id=16, name=state16}}
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
		driver.findElement(By.id("user_name")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_name")).sendKeys(RandValue);
		driver.findElement(By.id("user_email")).clear();
		RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4) + "@example.com";
		driver.findElement(By.id("user_email")).sendKeys(RandValue);
		RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_email")).sendKeys(RandValue);
		driver.findElement(By.id("user_username")).clear();
		RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_username")).sendKeys(RandValue);
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("pswpsw");
		driver.findElement(By.id("user_confirm")).clear();
		driver.findElement(By.id("user_confirm")).sendKeys("pswpsw");
		driver.findElement(By.name("commit")).click();
		//From state 16 to state 70
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=Administrator, attributes={href=http://localhost:8888/wolfcms/?/admin/user/edit/1}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=70, name=state70}}
		mutateDOMTree(16);
		checkState16_OriginalAssertions();
		checkState16_ReusedAssertions();
		checkState16_GeneratedAssertions();
		checkState16_LearnedAssertions();
		checkState16_AllAssertions();
		checkState16_RandAssertions1();
		checkState16_RandAssertions2();
		checkState16_RandAssertions3();
		checkState16_RandAssertions4();
		checkState16_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]")).click();
		//Sink node at state 70
		mutateDOMTree(70);
		checkState70_OriginalAssertions();
		checkState70_ReusedAssertions();
		checkState70_GeneratedAssertions();
		checkState70_LearnedAssertions();
		checkState70_AllAssertions();
		checkState70_RandAssertions1();
		checkState70_RandAssertions2();
		checkState70_RandAssertions3();
		checkState70_RandAssertions4();
		checkState70_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

	}

	public void checkState0_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[4]"))); // Random element assertion
element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"clean\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-username\"","name=\"login[username]\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login-username-div\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"clean\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[5]/INPUT"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[2]"))); // Random element assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"login-redirect\"","name=\"login[redirect]\"","type=\"hidden\"","value=\"/wolfcms/?/admin/\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("TITLE", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[2]/INPUT"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/P/A"))); // Random element assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","id=\"login-remember-me\"","name=\"login[remember]\"","type=\"checkbox\"","value=\"checked\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"submit\"","type=\"submit\"","value=\"Login\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/P"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK"))); // Random element assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[4]/INPUT[2]"))); // Random element assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState12_OriginalAssertions(){
		assertEquals("Pages | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState12_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
		assertTrue(driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")).getText() != ""); // reused assertion in case of ElementFullMatch
	}

	public void checkState12_GeneratedAssertions(){
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\"","title=\"15 | \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState12_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/3\"","title=\"3 | rnd-arfe\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-3\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/4\"","title=\"4 | \""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-4\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/4\"","title=\"4 | \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/5\"","title=\"5 | rnd-oumo\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-5\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | rnd-mdkp\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState12_AllAssertions(){
		assertEquals("Pages | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

		assertTrue(driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")).getText() != ""); // reused assertion in case of ElementFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/15\"","title=\"15 | \"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState12_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[13]/SPAN/DIV/SPAN/A/IMG"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[9]/SPAN/DIV/SPAN/IMG[3]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | rnd-xfob\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-4\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/14\"","title=\"14 | rnd-wctn\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState12_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[5]/SPAN/DIV[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[13]/SPAN/DIV[4]/A[2]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/13?csrf_token=df33d3632c60d63bffef4690350ca0a963a7c3aa6d667e3d98008eb878afae3d\"","onclick=\"return confirm('Are you sure you wish to delete RND-wjEn and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/15?csrf_token=581e54cd4367f15766f736faa9c820ab6d8f0c09f5e59515f221de147d548c82\"","onclick=\"return confirm('Are you sure you wish to delete RNDIphU and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState12_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/STYLE"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/4\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=e48576a867f80089a0507c2d076132ee03dbf4272e2456eb5c8e681b7c9a183a\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-12\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState12_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[6]/SPAN/DIV[3]/A/IMG"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[4]/SPAN/DIV/SPAN/IMG"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState12_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV[4]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[8]/SPAN/DIV/SPAN/IMG[3]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-arfe.html\"","target=\"_blank\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-2\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/11?csrf_token=a431befb0b311a3930f4ba4f5b0f5746eff79fa7339084e830742fbba2c79bb7\"","onclick=\"return confirm('Are you sure you wish to delete RND-FPYA and its underlying pages?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState13_OriginalAssertions(){
		assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState13_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState13_GeneratedAssertions(){
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState13_LearnedAssertions(){
	}

	public void checkState13_AllAssertions(){
		assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState13_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[21]/TD/SMALL"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[15]/TD[4]/A/IMG"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=9fe3dc366399e464693e296271cebf8bf42b6be408c6cf4424fdbd2dfc472b3d\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/29?csrf_token=13e11b5659cbb617be6d43bcc1872a5375b185e415087aa703818410e03c32a6\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserCRcu?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=9fe3dc366399e464693e296271cebf8bf42b6be408c6cf4424fdbd2dfc472b3d\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/29?csrf_token=13e11b5659cbb617be6d43bcc1872a5375b185e415087aa703818410e03c32a6\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserCRcu?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState13_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[14]/TD[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[9]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/19?csrf_token=d9f0462364337ed090c0d0c5d1007ea8fc378dddd305191ae0f462dfcd71ae57\"","onclick=\"return confirm('Are you sure you wish to delete RNDthjr?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/22?csrf_token=83e9580944030fe9e3c3564ccd42349590c861b980f1f40b23104c5e609275cf\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserzqCS?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node even\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/35?csrf_token=411a09b2e3dd7ed372173099573ccc81b3bd1a786613a6d8bbf16b3ae65b0a46\"","onclick=\"return confirm('Are you sure you wish to delete RNDtafH?');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState13_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[5]/TD[4]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/30?csrf_token=11dd66a2235cca4309b8a506409eaac8def2a8defba61687f1d284a70dae1fe6\"","onclick=\"return confirm('Are you sure you wish to delete RNDUsertibC?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/32?csrf_token=51a05b4b713448d582ba2d747cd0b49109c75fd0981a25e549de8ec6af1e1f9a\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserBQuL?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState13_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[10]/TD[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/22?csrf_token=83e9580944030fe9e3c3564ccd42349590c861b980f1f40b23104c5e609275cf\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserzqCS?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState13_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR[11]/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/TABLE/TBODY/TR/TD[4]/IMG"))); // Random element assertion
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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_OriginalAssertions(){
		assertEquals("Users - Add | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState14_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState14_GeneratedAssertions(){
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState14_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"user_role-editor\"","name=\"user_role[editor]\"","type=\"checkbox\"","value=\"3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-editor\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"user_role-administrator\"","name=\"user_role[administrator]\"","type=\"checkbox\"","value=\"1\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-administrator\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState14_AllAssertions(){
		assertEquals("Users - Add | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState14_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"optional\"","for=\"user_email\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"es\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"zh_TW\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"da\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR[4]/TD[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P/INPUT"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_confirm\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\""))));
		childrenElements.add(new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR[6]/TD[2]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_password\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"pl\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR/TD"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"current\"","href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_password\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P"))); // Random element assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"en\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_language\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_OriginalAssertions(){
		assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!']"))); // original assertion

	}

	public void checkState16_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState16_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"display: none\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"display: none\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState16_LearnedAssertions(){
	}

	public void checkState16_AllAssertions(){
		assertEquals("Users | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!']"))); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"message\"","id=\"success\"","style=\"display: none\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_user_index\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

	}

	public void checkState16_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[11]/TD/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P/INPUT"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"optional\"","for=\"user_email\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"es\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"zh_TW\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/20?csrf_token=84296e3ec61e069e97da4c73e18f1b5ae47b3f264bfdd94a167ec26f593545c1\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserQqwu?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[16]/TD/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[5]/P[2]/A[3]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/33?csrf_token=4081f03cfda26b67544838a01487117b799cc8f3196c8674ba35501eee4e94fd\"","onclick=\"return confirm('Are you sure you wish to delete RNDEIcf?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/35\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/26?csrf_token=16b9027258717b30caf88f98cd2c3af8173558f8158a950fb4baf2b09204d38f\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserigCI?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[17]/TD[4]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[20]/TD"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/27?csrf_token=51df84ba24a2459b8911a29cf86ddaf9c06fe324ed256e7a2efcee1b35e1055a\"","onclick=\"return confirm('Are you sure you wish to delete RNDUserRSBQ?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/37?csrf_token=010fea03b2f726fbd05e7f4887affe53aa38c603a0f1f5535c362fad7cbbe320\"","onclick=\"return confirm('Are you sure you wish to delete RNDwSTd?');\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/33?csrf_token=4081f03cfda26b67544838a01487117b799cc8f3196c8674ba35501eee4e94fd\"","onclick=\"return confirm('Are you sure you wish to delete RNDEIcf?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[20]/TD[4]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[12]/TD/IMG"))); // Random element assertion
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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/delete/34?csrf_token=3961e81ec662861782d5b9a839be2e90565c583d4e60116549cc95f53a9ffe40\"","onclick=\"return confirm('Are you sure you wish to delete RNDdzqP?');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete user icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete user\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"node odd\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\""))));
		childrenElements.add(new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/TABLE/TBODY/TR[14]/TD/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR[6]/TD[2]/SPAN[3]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_password\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"user icon\"","src=\"http://www.gravatar.com/avatar/af1376f86d92b2ce2517323dbff8c345.jpg?s=32&d=http%3A%2F%2Flocalhost%3A8888%2Fwolfcms%2Fwolf%2Fadmin%2Fimages%2Fuser.png&r=g\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"user\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState70_OriginalAssertions(){
	}

	public void checkState70_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState70_GeneratedAssertions(){
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState70_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"user_role-editor\"","name=\"user_role[editor]\"","type=\"checkbox\"","value=\"3\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-editor\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("checked=\"checked\"","id=\"user_role-administrator\"","name=\"user_role[administrator]\"","type=\"checkbox\"","value=\"1\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"user_role-administrator\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState70_AllAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternFullMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagMatch

	}

	public void checkState70_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"optional\"","for=\"user_email\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"es\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"zh_TW\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"da\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState70_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR[4]/TD[3]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P/INPUT"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_confirm\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/layout\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\""))));
		childrenElements.add(new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState70_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR[6]/TD[2]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\"","method=\"post\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
		childrenElements.add(new DOMElement("H1", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=8fc31951e22159906d7b9bff3ff2bfa168a25f09d8f002a9db8d496ca16adf7d\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"pl\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("class=\"select\"","id=\"user_language\"","name=\"user[language]\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_password\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState70_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/TABLE/TBODY/TR/TD"))); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"user_name\"","maxlength=\"100\"","name=\"user[name]\"","size=\"100\"","type=\"text\"","value=\"Administrator\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"user_password\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState70_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"current\"","href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"user_email\"","maxlength=\"255\"","name=\"user[email]\"","size=\"255\"","type=\"text\"","value=\"admin@yoursite.com\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
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