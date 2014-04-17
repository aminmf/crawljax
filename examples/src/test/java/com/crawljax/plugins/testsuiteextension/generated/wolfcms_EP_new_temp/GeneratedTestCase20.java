package com.crawljax.plugins.testsuiteextension.generated.wolfcms_EP_new_temp;

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
 * Generated @ Thu Apr 17 08:04:15 PDT 2014
 */

public class GeneratedTestCase20 {

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
	public void method20(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath //input[@value='Login'], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={accesskey=s, class=submit, type=submit, value=Login}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		//From state 1 to state 2
		//Eventable{eventType=click, identification=xpath //div[@class='page']/span/a/span[text()='Home Page']/../../../../div[@class="modify"]/a/img[@title='Add child'], element=Element{node=[IMG: null], tag=IMG, text=, attributes={align=middle, alt=Add child, src=/wolfcms/wolf/admin/images/plus.png, title=Add child}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.xpath("//div[@class='page']/span/a/span[text()='Home Page']/../../../../div[@class=\"modify\"]/a/img[@title='Add child']")).click();
		//From state 2 to state 66
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Page Title, attributes={class=here, href=#pagetitle}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=66, name=state66}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[1]")).click();
		//Sink node at state 66
		mutateDOMTree(66);
		checkState66_OriginalAssertions();
		checkState66_ReusedAssertions();
		checkState66_GeneratedAssertions();
		checkState66_LearnedAssertions();
		checkState66_AllAssertions();
		checkState66_RandAssertions1();
		checkState66_RandAssertions2();
		checkState66_RandAssertions3();
		checkState66_RandAssertions4();
		checkState66_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
		assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion

	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
		element = new DOMElement("LABEL", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p[]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState0_LearnedAssertions(){
		element = new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
childrenElements.add(new DOMElement("A", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState0_AllAssertions(){
		assertEquals("Login - Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']")).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$")); // original assertion

		element = new DOMElement("LABEL", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList("class=\"checkbox\"","for=\"login-remember-me\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"margin-top: 6px\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Remembermefor30minutes.", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("SPAN", "(Forgotpassword?)", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"login_submit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "(", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/forgot\""))));
childrenElements.add(new DOMElement("A", "Forgotpassword?", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "website:WolfCMS", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "website:", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\""))));
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

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

	public void checkState1_OriginalAssertions(){
		assertEquals("Pages | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // original assertion

	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span[class=\"title\"]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

		element = new DOMElement("SPAN", "RNDJknm", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/13\"","title=\"13 | \"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDJknm", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState1_LearnedAssertions(){
		element = new DOMElement("DIV", "RND-ProQPublished", new ArrayList<String>(Arrays.asList("class=\"status published-status\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Published", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "RND-RmXsPublished", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_8\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
childrenElements.add(new DOMElement("DIV", "RND-RmXs", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
childrenElements.add(new DOMElement("DIV", "Published", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RND-xtaqPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RND-YsFiPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "RND-iwyCPublished", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_3\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
childrenElements.add(new DOMElement("DIV", "RND-iwyC", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
childrenElements.add(new DOMElement("DIV", "Published", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState1_AllAssertions(){
		assertEquals("Pages | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // original assertion

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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "RND-ProQPublished", new ArrayList<String>(Arrays.asList("class=\"status published-status\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Published", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("SPAN", "RND-RmXsPublished", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_8\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\""))));
childrenElements.add(new DOMElement("DIV", "RND-RmXs", new ArrayList<String>(Arrays.asList("class=\"status published-status\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"view-page\""))));
childrenElements.add(new DOMElement("DIV", "Published", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState1_RandAssertions1(){
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/7?csrf_token=287e859a07eb489b9b72e550a75482327c2a8299dba9d20418cc4a81bdace137\"","onclick=\"return confirm('Are you sure you wish to delete RND-tFVM and its underlying pages?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-ProQPublished", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/2\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/2?csrf_token=282a95de221f60b2b9c6999b65682ca6c7b699f5b60b4016699cb0076ac8f040\"","onclick=\"return confirm('Are you sure you wish to delete RND-ProQ and its underlying pages?');\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-2\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","target=\"_blank\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"View Page\"","src=\"/wolfcms/wolf/admin/images/magnify.png\"","title=\"View Page\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-2\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV/SPAN[class=\"w1\"]"))); // Random element assertion
	}

	public void checkState1_RandAssertions2(){
		element = new DOMElement("IMG", "RND-tFVM", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/7\"","title=\"7 | \"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/DIV/SPAN/A[@href=\"http://localhost:8888/wolfcms/?/admin/page/edit/1\" and @title=\"/\"]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=dc7a572d0c29a01209e219cfa6f820feb4eb31882743606c564f80d4dfa0ddbc\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-xtaqPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?\"","target=\"_blank\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RND-YsFi", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-5\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState1_RandAssertions3(){
		element = new DOMElement("IMG", "RND-RmXs", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[4]/SPAN/DIV[4]/A/IMG[@align=\"middle\" and @@alt=\"Add child\" and @@src=\"/wolfcms/wolf/admin/images/plus.png\" and @title=\"Add child\"]"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/5\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "RND-tFVMPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_7\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "RND-tFVMPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-iwyCPublished", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/3\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/3?csrf_token=943fdc5f9dd43fe856f42d45557c1038223c154678a3d8ab4a42675748be8af2\"","onclick=\"return confirm('Are you sure you wish to delete RND-iwyC and its underlying pages?');\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-3\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState1_RandAssertions4(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/6?csrf_token=0535b2130750fa30beab88773ef898a3c4b768cf27d4ce662b162294504211d1\"","onclick=\"return confirm('Are you sure you wish to delete RND-OJIt and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/12\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RND-GwJn", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-4\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/DIV[4]/IMG[[@align=\"middle\" and @@alt=\"Copy Page Disabled\" and @@src=\"/wolfcms/wolf/admin/images/copy-disabled.png\" and @title=\"Copy Page Disabled\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[10]/SPAN/DIV[3]/A[@class=\"view-link\" and @@href=\"http://localhost:8888/wolfcms/?\" and @target=\"_blank\"]"))); // Random element assertion
	}

	public void checkState1_RandAssertions5(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/2\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/11?csrf_token=666c0c980dba8ae0991532fd1b7eb2d4f10049b11295c5882d78c97d2fa3c013\"","onclick=\"return confirm('Are you sure you wish to delete RND-rdQy and its underlying pages?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "RND-OJItPublished", new ArrayList<String>(Arrays.asList("class=\"node level-1 no-children\"","id=\"page_6\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sortable tree-root ui-sortable ui-sortable-disabled\"","id=\"site-map\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "RND-OJItPublished", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RND-ProQ", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/2\"","title=\"2 | \"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-RKghPublished", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"w1\""))));
childrenElements.add(new DOMElement("SPAN", "RND-RKgh", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_OriginalAssertions(){
		assertEquals("Pages - Add | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState2_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState2_GeneratedAssertions(){
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p[]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState2_LearnedAssertions(){
		element = new DOMElement("P", "StatusDraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Status", new ArrayList<String>(Arrays.asList("for=\"page_status_id\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\""))));
childrenElements.add(new DOMElement("SELECT", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save and Close\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=c6bf29ec6d132fef6e70a2f387f98f8f1374312e13f33edffb9ace371fe3c6c1\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"site-title\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState2_AllAssertions(){
		assertEquals("Pages - Add | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("P", "StatusDraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Status", new ArrayList<String>(Arrays.asList("for=\"page_status_id\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\""))));
childrenElements.add(new DOMElement("SELECT", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save and Close\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState2_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\" and @@rel=\"stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery.ui.nestedSortable.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Add Tab icon\"","src=\"/wolfcms/wolf/admin/images/plus.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"add-part\"","title=\"Add Tab\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/markdown/markdown.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "LayoutinheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_layout_id\"","name=\"page[layout_id]\""))));
childrenElements.add(new DOMElement("SELECT", "inheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState2_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/admin/javascripts/jquery-ui-1.8.5.custom.min.js\" and @type=\"text/javascript\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Users", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Users", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/wolf.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[3]/DIV/TABLE/TBODY/TR[4]/TD[2]/SELECT/OPTION[[value=\"1\"]"))); // Random element assertion
	}

	public void checkState2_RandAssertions3(){
		element = new DOMElement("DIV", "FilternoneTextileMarkdown", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"part-content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"part-1-content\"","style=\"display: block;\""))));
childrenElements.add(new DOMElement("DIV", "FilternoneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/SCRIPT[type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("LABEL", "Slug", new ArrayList<String>(Arrays.asList("for=\"page_slug\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"label\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Slug", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[3]/UL/LI/A[@class=\"here\" and @href=\"#part-1-content\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[id=\"site-title\"]"))); // Random element assertion
	}

	public void checkState2_RandAssertions4(){
		element = new DOMElement("UL", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"page-plugin\""))));
childrenElements.add(new DOMElement("LI", "Pages", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"snippet-plugin\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"layout-plugin\""))));
childrenElements.add(new DOMElement("LI", "Snippets", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"file_manager-plugin\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"right\""))));
childrenElements.add(new DOMElement("LI", "Layouts", new ArrayList<String>(Arrays.asList("class=\"right\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Files", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Users", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Demodialog[x]Thisisjustademo.AddPart[x]", new ArrayList<String>(Arrays.asList("id=\"boxes\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"window\"","id=\"dialog\""))));
childrenElements.add(new DOMElement("#comment", "#Demodialog", new ArrayList<String>(Arrays.asList("class=\"window\"","id=\"add-part-dialog\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Demodialog[x]Thisisjustademo.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Addpartdialog", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AddPart[x]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"page_parent_id\"","name=\"page[parent_id]\"","type=\"hidden\"","value=\"1\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"page_parent_id\"","name=\"page[parent_id]\"","type=\"hidden\"","value=\"1\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV/DIV[2]/DIV[2]/FORM/DIV[]"))); // Random element assertion
	}

	public void checkState2_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[2]/DIV[3]/DIV/TABLE/TBODY/TR[4]/TD[2]/SELECT/OPTION[@selected=\"selected\" and @value=\"2\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV/UL/LI/A[@class=\"here\" and @href=\"#pagetitle\"]"))); // Random element assertion
		element = new DOMElement("TD", "LayoutinheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_layout_id\"","name=\"page[layout_id]\""))));
childrenElements.add(new DOMElement("SELECT", "inheritnoneWolfSimpleRSSXML", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_parent_id\"","name=\"page[parent_id]\"","type=\"hidden\"","value=\"1\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"csrf_token\"","name=\"csrf_token\"","type=\"hidden\"","value=\"a9a998a68009f1b35ab7b5be950f4e1426e9fac7a9c6d035cb62f8c0c861ce87\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"form-area\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"buttons\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Demodialog[x]Thisisjustademo.AddPart[x]", new ArrayList<String>(Arrays.asList("class=\"window\"","id=\"dialog\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"boxes\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"titlebar\""))));
childrenElements.add(new DOMElement("DIV", "Demodialog[x]", new ArrayList<String>(Arrays.asList("class=\"content\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Thisisjustademo.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState66_OriginalAssertions(){
	}

	public void checkState66_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState66_GeneratedAssertions(){
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p[]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState66_LearnedAssertions(){
		element = new DOMElement("P", "StatusDraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Status", new ArrayList<String>(Arrays.asList("for=\"page_status_id\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\""))));
childrenElements.add(new DOMElement("SELECT", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save and Close\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=5ab3388ffa9cd0b45cdde97b93f2dc9424ba6f724c8d3f0c6fc9c3e80dc0d1ea\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"site-title\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState66_AllAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("P", "StatusDraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"row\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Status", new ArrayList<String>(Arrays.asList("for=\"page_status_id\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\""))));
childrenElements.add(new DOMElement("SELECT", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save and Close\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=5ab3388ffa9cd0b45cdde97b93f2dc9424ba6f724c8d3f0c6fc9c3e80dc0d1ea\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState66_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV/DIV[@class=\"window\" and @id=\"dialog\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[[@class=\"content tabs\" and @id=\"part-tabs\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_add\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"delete-part\"","title=\"Remove Tab\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tab_toolbar\"","id=\"tab-toolbar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Remove Tab icon\"","src=\"/wolfcms/wolf/admin/images/minus.png\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/plugins/textile/textile.php\" and @type=\"text/javascript\"]"))); // Random element assertion
	}

	public void checkState66_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"settings\"","style=\"display: none;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"metainfo-content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"div-settings\"","title=\"Settings\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Description", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TEXTAREA", "", new ArrayList<String>(Arrays.asList("class=\"textarea\"","cols=\"3\"","id=\"page_description\"","name=\"page[description]\"","rows=\"2\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("P", "Thisisjustademo.", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Thisisjustademo.", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[[@class=\"plugin\" and @id=\"layout-plugin\"]"))); // Random element assertion
		element = new DOMElement("LI", "body", new ArrayList<String>(Arrays.asList("class=\"tab\"","id=\"part-1-tab\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"tabNavigation\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "body", new ArrayList<String>(Arrays.asList("class=\"here\"","href=\"#part-1-content\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState66_RandAssertions3(){
		element = new DOMElement("OPTION", "nonePagenotfound", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"page_behavior_id\"","name=\"page[behavior_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "none", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Users", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[[@class=\"plugin\" and @id=\"file_manager-plugin\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_add\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"div-settings\"","title=\"Settings\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"","id=\"settings\"","style=\"display: none;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\""))));
childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState66_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/DIV/DIV[2]/DIV[2]/FORM/DIV/INPUT[[@id=\"part-name-field\" and @@maxlength=\"100\" and @@name=\"part[name]\" and @@type=\"text\" and @value=\"\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI/A[@class=\"current\" and @href=\"http://localhost:8888/wolfcms/?/admin/page\"]"))); // Random element assertion
		element = new DOMElement("SELECT", "inheritnotrequiredrequiredProtected", new ArrayList<String>(Arrays.asList("id=\"page_needs_login\"","name=\"page[needs_login]\"","title=\"When enabled, users have to login before they can view the page.\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"field\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"2\""))));
childrenElements.add(new DOMElement("OPTION", "inherit", new ArrayList<String>(Arrays.asList("value=\"0\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("value=\"1\""))));
childrenElements.add(new DOMElement("OPTION", "notrequired", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("OPTION", "required", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("OPTION", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("value=\"101\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Hidden", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Demodialog[x]Thisisjustademo.AddPart[x]", new ArrayList<String>(Arrays.asList("id=\"boxes\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"window\"","id=\"dialog\""))));
childrenElements.add(new DOMElement("#comment", "#Demodialog", new ArrayList<String>(Arrays.asList("class=\"window\"","id=\"add-part-dialog\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Demodialog[x]Thisisjustademo.", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Addpartdialog", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AddPart[x]", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState66_RandAssertions5(){
		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/page/add\"","id=\"page_edit_form\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save and Close\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/page\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "StatusDraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("for=\"page_status_id\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Status", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery-1.6.2.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/DIV[5]/P/SELECT/OPTION[[value=\"101\"]"))); // Random element assertion
		element = new DOMElement("OPTION", "DraftPreviewPublishedHiddenArchived", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"1\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"page_status_id\"","name=\"page[status_id]\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Draft", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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