package com.crawljax.plugins.testsuiteextension.generated.eshop1_RND3;

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
 * Generated @ Sun Apr 13 13:28:22 PDT 2014
 */

public class GeneratedTestCase0 {

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
		url = "https://localhost:9443/admin/carbon/admin/login.jsp";
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
	public void method0(){
		driver.get(url);
		//From state 0 to state 14
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={atusa=id11225255_0, class=button, tabindex=3, type=submit, value=Sign-in}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=14, name=state14}}
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
		driver.findElement(By.id("txtUserName")).clear();
		driver.findElement(By.id("txtUserName")).sendKeys("tenantAdmin@mytestdomain.com");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/TABLE[1]/TBODY[1]/TR[2]/TD[3]/TABLE[1]/TBODY[1]/TR[2]/TD[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[4]/TD[2]/INPUT[1]")).click();
		//Sink node at state 14
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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD/DIV[7]"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR[4]/TD[2]/P"))); // Random element assertion
element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://docs.wso2.org/display/ES100/WSO2+Enterprise+Store\"","target=\"_blank\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"../admin/css/carbonFormStyles.css\"","rel=\"stylesheet\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[3]/TD/DIV/DIV/DIV"))); // Random element assertion
element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"middle-ad\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"header-div\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"../admin/images/favicon.ico\"","rel=\"shortcut icon\"","type=\"image/x-icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD[2]/DIV/FORM/TABLE/TBODY/TR/TD/LABEL"))); // Random element assertion
element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/jquery.validate.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"0\"","id=\"content-table\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[6]/TD"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR[3]/TD[2]/H3/A"))); // Random element assertion
element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"main\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"txtPassword\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

	}

	public void checkState0_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR/TD/DIV/DIV[4]/DIV/UL/LI[4]"))); // Random element assertion
assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD[2]/DIV/FORM"))); // Random element assertion
element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"0\"","id=\"main-table\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"http://wso2.org/mail\"","target=\"_blank\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/customControls.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion

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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]/TD[6]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR[4]/TD[2]/H3"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"normal\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-content\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"tip-content-lifter\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_service_menu&key=service&breadcrumb=Services&singularLabel=Service&pluralLabel=Services\"","style=\"background-image: url(../generic/images/list27.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_content.jsp?region=region3&item=governance_add_wsdl_menu&key=wsdl&lifecycleAttribute=null&breadcrumb=WSDL&mediaType=application/wsdl+xml&extension=wsdl&singularLabel=WSDL&pluralLabel=WSDLs&hasNamespacetrue\"","style=\"background-image: url(../generic/images/add28.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR/TD[2]/H3"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR/TD[5]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tip-content-lifter\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-content\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"tip-title\"","href=\"../service-mgt/index.jsp?region=region1&item=services_list_menu\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginbox\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[2]/TD[3]/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-top java2wsdl\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState14_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[2]/TD[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"features\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-header\"","id=\"region1_configure_menu\"","onclick=\"mainMenuCollapse(this.childNodes[0])\"","style=\"cursor: pointer; display: none;\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"main\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("class=\"mMenuHeaders\"","id=\"region1_configure_menu\"","src=\"../admin/images/up-arrow.gif\""))));
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