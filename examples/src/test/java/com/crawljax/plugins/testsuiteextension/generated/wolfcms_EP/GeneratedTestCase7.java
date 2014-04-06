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

public class GeneratedTestCase7 {

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
	public void method7(){
		driver.get(url);
		//From state 0 to state 53
		//Eventable{eventType=click, identification=partialText Wolf CMS, element=Element{node=[A: null], tag=A, text=Wolf CMS, attributes={href=http://localhost:8888/wolfcms/}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=53, name=state53}}
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
		driver.findElement(By.partialLinkText("Wolf CMS")).click();
		//From state 53 to state 54
		//Eventable{eventType=click, identification=partialText RND, element=Element{node=[A: null], tag=A, text=RND-aRFe, attributes={href=http://localhost:8888/wolfcms/?rnd-arfe.html}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=54, name=state54}}
		mutateDOMTree(53);
		checkState53_OriginalAssertions();
		checkState53_ReusedAssertions();
		checkState53_GeneratedAssertions();
		checkState53_LearnedAssertions();
		checkState53_AllAssertions();
		checkState53_RandAssertions1();
		checkState53_RandAssertions2();
		checkState53_RandAssertions3();
		checkState53_RandAssertions4();
		checkState53_RandAssertions5();
		driver.findElement(By.partialLinkText("RND")).click();
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

	public void checkState53_OriginalAssertions(){
	}

	public void checkState53_ReusedAssertions(){
	}

	public void checkState53_GeneratedAssertions(){
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

	}

	public void checkState53_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"tagline\"")));
		parentElement = new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?about-us/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState53_AllAssertions(){
		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of PatternTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState53_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV/DIV/DIV/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-nmmw.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1wrap\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
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
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","id=\"login-remember-me\"","name=\"login[remember]\"","type=\"checkbox\"","value=\"checked\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[12]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/public/themes/simple/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-oumo.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colmask\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colmid\""))));
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
	}

	public void checkState53_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/H1"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[4]/LABEL"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/themes/brown_and_green/login.css\"","id=\"css_theme\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1wrap\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV[2]/UL[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[10]/A"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login-password\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("class=\"medium\"","id=\"login-password\"","name=\"login[password]\"","type=\"password\"","value=\"\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"login-password\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login-password-div\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"dialog\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState53_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/FORM/DIV[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[2]"))); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-fpya.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"nav\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState54_OriginalAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")).getText().contains("RND"));; // original assertion

	}

	public void checkState54_ReusedAssertions(){
	}

	public void checkState54_GeneratedAssertions(){
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState54_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","title=\"Wolf\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","title=\"Wolf CMS\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rss.xml\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?articles/\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"tagline\"")));
		parentElement = new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?about-us/\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState54_AllAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='colmask']//div[@id='col1']/h2")).getText().contains("RND"));; // original assertion

		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState54_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV/DIV/DIV/H2"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-nmmw.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1wrap\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colmid\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"col1wrap\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"col2\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col3\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1wrap\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState54_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/H1"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[12]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/public/themes/simple/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"current\"","href=\"http://localhost:8888/wolfcms/?rnd-arfe.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"nav\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState54_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV[2]/P[2]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[10]/A"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","title=\"Wolf\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("href=\"http://www.wolfcms.org/\"","title=\"Wolf CMS\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?articles/\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H1", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"tagline\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/public/themes/wolf/print.css\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState54_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/P/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?rnd-oumo.html\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colmid\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colmask\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"current\"","href=\"http://localhost:8888/wolfcms/?rnd-arfe.html\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState54_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/UL/LI"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/P/BR"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col2\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col1pad\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/public/themes/wolf/screen.css\"","media=\"screen\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"col3\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"colright\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
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