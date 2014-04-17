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

public class GeneratedTestCase5 {

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
	public void method5(){
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
		//Eventable{eventType=click, identification=xpath //ul[@id='snippets']/li[3]/div[@class='remove']/a, element=Element{node=[A: null], tag=A, text=, attributes={class=remove, href=http://localhost:8888/wolfcms/?/admin/snippet/delete/514, onclick=return confirm('Are you sure you wish to delete? RNDQaiE?');}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
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
		//From state 24 to state 68
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=RNDAqdl, attributes={href=http://localhost:8888/wolfcms/?/admin/snippet/edit/520}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=68, name=state68}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[4]/DIV[1]/DIV[1]/UL[1]/LI[3]/A[1]")).click();
		//Sink node at state 68
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

	public void checkState22_OriginalAssertions(){
	}

	public void checkState22_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

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

	public void checkState22_LearnedAssertions(){
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

	public void checkState22_AllAssertions(){
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

	}

	public void checkState22_RandAssertions1(){
		element = new DOMElement("SPAN", "RND-RKgh", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/12\"","title=\"12 | rnd-rkgh\""))));
childrenElements.add(new DOMElement("A", "RND-RKgh", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"\"","class=\"busy\"","id=\"busy-12\"","src=\"/wolfcms/wolf/admin/images/spinner.gif\"","style=\"display: none;\"","title=\"\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"main\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_page_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "RND-OJIt", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/6\"","title=\"6 | \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("SPAN", "RND-OJIt", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-rdQyPublished", new ArrayList<String>(Arrays.asList("class=\"view-page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"view-link\"","href=\"http://localhost:8888/wolfcms/?rnd-rdqy.html\"","target=\"_blank\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/P[2]/SPAN[class=\"separator\"]"))); // Random element assertion
	}

	public void checkState22_RandAssertions2(){
		element = new DOMElement("IMG", "RND-RKgh", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag to Copy\"","class=\"handle_copy\"","src=\"/wolfcms/wolf/admin/images/drag_to_copy.gif\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Copy Page\"","src=\"/wolfcms/wolf/admin/images/copy.png\"","title=\"Copy Page\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-4\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RND-RKghPublished", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/12\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/12?csrf_token=251d5cdb755abfa2069e1dc2743d567dee9fbc125c611e7a5ef6a948b118765f\"","onclick=\"return confirm('Are you sure you wish to delete RND-RKgh and its underlying pages?');\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"copy-page\"","href=\"#\"","id=\"copy-12\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN/DIV[4]/A/IMG[@align=\"middle\" and @@alt=\"Add child\" and @@src=\"/wolfcms/wolf/admin/images/plus.png\" and @title=\"Add child\"]"))); // Random element assertion
	}

	public void checkState22_RandAssertions3(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clean\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/login/login\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN/DIV/SPAN/A[@class=\"edit-link\" and @@href=\"http://localhost:8888/wolfcms/?/admin/page/edit/10\" and @title=\"10 | \"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[7]/SPAN/DIV[4]/A/IMG[@align=\"middle\" and @@alt=\"Add child\" and @@src=\"/wolfcms/wolf/admin/images/plus.png\" and @title=\"Add child\"]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Add child\"","src=\"/wolfcms/wolf/admin/images/plus.png\"","title=\"Add child\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"add-child-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/add/7\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[9]/SPAN/DIV[4]/A[[@class=\"remove\" and @@href=\"http://localhost:8888/wolfcms/?/admin/page/delete/4?csrf_token=51ca5758e4b7053b5fe928f9b3f6d50ba7213b7b53fdc744fe4fd9dfae8ebaa0\" and @onclick=\"return confirm('Are you sure you wish to delete RND-GwJn and its underlying pages?');\"]"))); // Random element assertion
	}

	public void checkState22_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI/SPAN/DIV/SPAN/IMG[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle_reorder\" and @src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\"]"))); // Random element assertion
		element = new DOMElement("DIV", "RND-ProQPublished", new ArrayList<String>(Arrays.asList("class=\"page\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"w1\""))));
childrenElements.add(new DOMElement("SPAN", "RND-ProQ", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RND-YsFi", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle_reorder\"","src=\"/wolfcms/wolf/admin/images/drag_to_sort.gif\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "RND-YsFi", new ArrayList<String>(Arrays.asList("class=\"edit-link\"","href=\"http://localhost:8888/wolfcms/?/admin/page/edit/5\"","title=\"5 | \"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"w1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"page icon\"","class=\"icon\"","src=\"/wolfcms/wolf/admin/images/page.png\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"title\""))));
childrenElements.add(new DOMElement("SPAN", "RND-YsFi", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/page/delete/7?csrf_token=a63a25a0e2cb59c5204e88869f1da9b2bcc6e0f206e25aa090da417c3076774b\"","onclick=\"return confirm('Are you sure you wish to delete RND-tFVM and its underlying pages?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"modify\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Remove page\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Remove page\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState22_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[3]/SPAN/DIV/SPAN/A/SPAN[class=\"title\"]"))); // Random element assertion
		element = new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("id=\"mainTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("UL", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI/UL/LI[10]/SPAN/DIV[[class=\"view-page\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[[@class=\"plugin\" and @id=\"layout-plugin\"]"))); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_OriginalAssertions(){
		assertEquals("Snippets | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState23_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
		assertEquals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText()); // reused assertion in case of ElementFullMatch
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p[]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='colmask']//div[@id='col1']/h2[]"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionTagMatch

	}

	public void checkState23_LearnedAssertions(){
		element = new DOMElement("DIV", "RNDWyuY", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_557\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/557\"","onclick=\"return confirm('Are you sure you wish to delete? RNDWyuY?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDtGCb", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_550\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/550\"","onclick=\"return confirm('Are you sure you wish to delete? RNDtGCb?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDCeFk", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_542\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/542\"","onclick=\"return confirm('Are you sure you wish to delete? RNDCeFk?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDTvuL", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_553\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/553\"","onclick=\"return confirm('Are you sure you wish to delete? RNDTvuL?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_snippet_index\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"site-title\""))));
childrenElements.add(new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"mainTabs\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState23_AllAssertions(){
		assertEquals("Snippets | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

		assertEquals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText()); // reused assertion in case of ElementFullMatch

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

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

	}

	public void checkState23_RandAssertions1(){
		element = new DOMElement("IMG", "RNDRqip", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_541\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/562\"","onclick=\"return confirm('Are you sure you wish to delete? RNDpRrv?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDzXuY", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_538\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[24]/DIV/A/IMG[@alt=\"delete snippet icon\" and @@src=\"/wolfcms/wolf/admin/images/icon-remove.gif\" and @title=\"Delete snippet\"]"))); // Random element assertion
		element = new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=492e5f471924df7f212040de9e5b2ed20d6da7e0d385422d4f8048616025eff6\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "LogOut", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		element = new DOMElement("LI", "RNDMdYb", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_552\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/552\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDMdYb", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[[@class=\"plugin\" and @id=\"snippet-plugin\"]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/529\"","onclick=\"return confirm('Are you sure you wish to delete? RNDxSCw?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/546\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLfRR?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/549\"","onclick=\"return confirm('Are you sure you wish to delete? RNDThVr?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[13]/IMG[[@align=\"middle\" and @@alt=\"Drag and Drop\" and @@class=\"handle\" and @src=\"/wolfcms/wolf/admin/images/drag.gif\"]"))); // Random element assertion
		element = new DOMElement("A", "RNDThVr", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/549\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_549\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDThVr", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "RNDkweg", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_561\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/561\"","onclick=\"return confirm('Are you sure you wish to delete? RNDkweg?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "RNDUDTV", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/537\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_537\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDUDTV", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[8]/DIV[class=\"remove\"]"))); // Random element assertion
	}

	public void checkState23_RandAssertions4(){
		element = new DOMElement("IMG", "RNDtGCb", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_550\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDxfpG", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_555\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[[@class=\"snippet node even\" and @id=\"snippet_522\"]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/554\"","onclick=\"return confirm('Are you sure you wish to delete? RNDYGKV?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions5(){
		element = new DOMElement("LI", "RNDkAes", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_556\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/556\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDkAes", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDkAes", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_556\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/534\"","onclick=\"return confirm('Are you sure you wish to delete? RNDQglw?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/UL/LI[40]/A[href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/557\"]"))); // Random element assertion
		element = new DOMElement("IMG", "RNDLfRR", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_546\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState24_OriginalAssertions(){
		assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete[\\s\\S]*$")); // original assertion

		assertEquals("Snippets | Wolf CMS", driver.getTitle()); // original assertion

	}

	public void checkState24_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
		assertEquals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText()); // reused assertion in case of ElementFullMatch
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"snippet\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Snippet(", new ArrayList<String>(Arrays.asList("href=\"#\"","id=\"reorder-toggle\""))));
childrenElements.add(new DOMElement("A", "reorder", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", ")", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // generated assertion in case of RegionFullMatch

		assertTrue(isElementPresent(By.xpath("//div[@id='footer']/p[]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]"))); // generated assertion in case of ElementTagAttMatch

		assertTrue(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!' @class=\"message\" and  @id=\"success\" and style=\"opacity: 1;\"]"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState24_LearnedAssertions(){
		element = new DOMElement("DIV", "RNDCeFk", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_542\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/542\"","onclick=\"return confirm('Are you sure you wish to delete? RNDCeFk?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDRqip", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_541\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/541\"","onclick=\"return confirm('Are you sure you wish to delete? RNDRqip?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDxfpG", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_555\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/555\"","onclick=\"return confirm('Are you sure you wish to delete? RNDxfpG?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDPkwb", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_543\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/543\"","onclick=\"return confirm('Are you sure you wish to delete? RNDPkwb?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

		element = new DOMElement("DIV", "RNDLZHr", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_559\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/559\"","onclick=\"return confirm('Are you sure you wish to delete? RNDLZHr?');\""))));
childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState24_AllAssertions(){
		assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete[\\s\\S]*$")); // original assertion

		assertEquals("Snippets | Wolf CMS", driver.getTitle()); // original assertion

		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch

		assertEquals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText()); // reused assertion in case of ElementFullMatch

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

	}

	public void checkState24_RandAssertions1(){
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/542\"","onclick=\"return confirm('Are you sure you wish to delete? RNDCeFk?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Snippet(reorder)Modify", new ArrayList<String>(Arrays.asList("class=\"index-def\"","id=\"site-map-def\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"snippet\""))));
childrenElements.add(new DOMElement("DIV", "Snippet(reorder)", new ArrayList<String>(Arrays.asList("class=\"modify\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Modify", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/560\"","onclick=\"return confirm('Are you sure you wish to delete? RNDSnIV?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDBATn", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_523\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[5]/P/A[[@href=\"http://forum.wolfcms.org/\" and @target=\"_blank\"]"))); // Random element assertion
	}

	public void checkState24_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/wolfcms/wolf/plugins/markdown/markdown.css\" and @@media=\"screen\" and @@rel=\"Stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[4[@class=\"snippet node odd\" and @id=\"snippet_561\"]"))); // Random element assertion
		element = new DOMElement("IMG", "RNDpRrv", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_562\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/525\"","onclick=\"return confirm('Are you sure you wish to delete? RNDmzga?');\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"remove\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/textile/textile.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState24_RandAssertions3(){
		element = new DOMElement("LI", "RNDThVr", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_549\"")));
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/markitup/skins/simple/style.css\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV/DIV/UL/LI[5]/IMG[@align=\"middle\" and @@alt=\"snippet-icon\" and @src=\"/wolfcms/wolf/admin/images/snippet.png\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/DIV[2]/DIV/DIV[class=\"box\"]"))); // Random element assertion
		element = new DOMElement("A", "RNDTvuL", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/553\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_553\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "RNDTvuL", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState24_RandAssertions4(){
		element = new DOMElement("IMG", "RNDbCYv", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node odd\"","id=\"snippet_526\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"delete snippet icon\"","src=\"/wolfcms/wolf/admin/images/icon-remove.gif\"","title=\"Delete snippet\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"remove\"","href=\"http://localhost:8888/wolfcms/?/admin/snippet/delete/544\"","onclick=\"return confirm('Are you sure you wish to delete? RNDurhf?');\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDRqip", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_541\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/plugins/textile/textile.css\"","media=\"screen\"","rel=\"Stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState24_RandAssertions5(){
		element = new DOMElement("LI", "RNDUCFf", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_521\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"index ui-sortable\"","id=\"snippets\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/521\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"Drag and Drop\"","class=\"handle\"","src=\"/wolfcms/wolf/admin/images/drag.gif\""))));
childrenElements.add(new DOMElement("A", "RNDUCFf", new ArrayList<String>(Arrays.asList("class=\"remove\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/admin/javascripts/jquery-1.6.2.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "RNDSnIV", new ArrayList<String>(Arrays.asList("align=\"middle\"","alt=\"snippet-icon\"","src=\"/wolfcms/wolf/admin/images/snippet.png\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"snippet node even\"","id=\"snippet_560\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Files", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/plugin/file_manager\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"file_manager-plugin\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Files", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/plugins/markdown/markdown.php\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_OriginalAssertions(){
	}

	public void checkState68_ReusedAssertions(){
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$")); // reused assertion in case of ElementFullMatch
	}

	public void checkState68_GeneratedAssertions(){
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

	public void checkState68_LearnedAssertions(){
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=fae00f79fa9fd3655e579f3452900d3627537152745c5d32e47f3b6b34867e0c\""))));
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

		element = new DOMElement("P", "FilternoneTextileMarkdown", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"snippet_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"snippet_filter_id\"","name=\"snippet[filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
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

		element = new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList("class=\"buttons\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/521\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("accesskey=\"s\"","class=\"button\"","name=\"commit\"","type=\"submit\"","value=\"Save\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("accesskey=\"e\"","class=\"button\"","name=\"continue\"","type=\"submit\"","value=\"Save and Continue Editing\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/snippet\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "or", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Cancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState68_AllAssertions(){
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

		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=fae00f79fa9fd3655e579f3452900d3627537152745c5d32e47f3b6b34867e0c\""))));
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

		element = new DOMElement("P", "FilternoneTextileMarkdown", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"page\"","style=\"\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"snippet_filter_id\""))));
childrenElements.add(new DOMElement("LABEL", "Filter", new ArrayList<String>(Arrays.asList("class=\"filter-selector\"","id=\"snippet_filter_id\"","name=\"snippet[filter_id]\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SELECT", "noneTextileMarkdown", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // predicted region assertion

	}

	public void checkState68_RandAssertions1(){
		element = new DOMElement("DIV", "WolfCMS", new ArrayList<String>(Arrays.asList("id=\"site-title\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "WolfCMS", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/DIV/H3[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@charset=\"utf-8\" and @@src=\"/wolfcms/wolf/plugins/textile/textile.php\" and @type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=fae00f79fa9fd3655e579f3452900d3627537152745c5d32e47f3b6b34867e0c\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/521\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"content\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"csrf_token\"","name=\"csrf_token\"","type=\"hidden\"","value=\"9f8d15d8c13e669f280583d2d093e02cb621d04196be1b8c5632857390a8153c\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"form-area\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"buttons\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "orCancel", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_RandAssertions2(){
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"textbox\"","id=\"snippet_name\"","maxlength=\"100\"","name=\"snippet[name]\"","size=\"255\"","type=\"text\"","value=\"RNDUCFf\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("class=\"title\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"main\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("id=\"body_snippet_edit\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"content-wrapper\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"sidebar-wrapper\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/wolfcms/wolf/admin/images/favicon.ico\"","rel=\"favourites icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV[id=\"content-wrapper\"]"))); // Random element assertion
	}

	public void checkState68_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[3]/DIV/DIV/FORM/P/INPUT[[@accesskey=\"e\" and @@class=\"button\" and @@name=\"continue\" and @@type=\"submit\" and @value=\"Save and Continue Editing\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "|", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Files", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/plugin/file_manager\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"plugin\"","id=\"file_manager-plugin\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Files", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV[2]/UL/LI[6]/A[href=\"http://localhost:8888/wolfcms/?/admin/user\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/wolfcms/wolf/admin/themes/brown_and_green/styles.css\" and @@id=\"css_theme\" and @@media=\"screen\" and @@rel=\"Stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
	}

	public void checkState68_RandAssertions4(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/521\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H3", "Name", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"meta-pages\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"pages\"","id=\"pages\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("H3", "Body", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Documentation", new ArrayList<String>(Arrays.asList("href=\"http://wiki.wolfcms.org/\"","target=\"_blank\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Documentation", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "PagesSnippetsLayoutsFilesAdministrationUsers", new ArrayList<String>(Arrays.asList("class=\"right\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Users", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"csrf_token\"","name=\"csrf_token\"","type=\"hidden\"","value=\"9f8d15d8c13e669f280583d2d093e02cb621d04196be1b8c5632857390a8153c\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"http://localhost:8888/wolfcms/?/admin/snippet/edit/521\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState68_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[4]/P[2]/SPAN[class=\"separator\"]"))); // Random element assertion
		element = new DOMElement("H3", "Name", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"form-area\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Name", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("charset=\"utf-8\"","src=\"/wolfcms/wolf/plugins/textile/textile.php\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("id=\"site-links\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Youarecurrentlyloggedinas", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/user/edit/1\""))));
childrenElements.add(new DOMElement("A", "Administrator", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/?/admin/login/logout?csrf_token=fae00f79fa9fd3655e579f3452900d3627537152745c5d32e47f3b6b34867e0c\""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList("class=\"separator\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://localhost:8888/wolfcms/\"","id=\"site-view-link\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "LogOut", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "|", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "ViewSite", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/wolfcms/wolf/admin/markitup/jquery.markitup.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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