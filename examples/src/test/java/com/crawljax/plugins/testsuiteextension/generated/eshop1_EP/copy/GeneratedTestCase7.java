package com.crawljax.plugins.testsuiteextension.generated.eshop1_EP.copy;

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
 * Generated @ Thu Apr 10 15:17:28 PDT 2014
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
	public void method7(){
		driver.get(url);
		//From state 0 to state 7
		//Eventable{eventType=click, identification=cssSelector input.button, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=button, tabindex=3, type=submit, value=Sign-in}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=7, name=state7}}
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
		driver.findElement(By.cssSelector("input.button")).click();
		//From state 7 to state 9
		//Eventable{eventType=click, identification=text Users and Roles, element=Element{node=[A: null], tag=A, text=Users and Roles, attributes={class=menu-default, href=../userstore/index.jsp?region=region1&item=userstores_menu, style=background-image: url(../userstore/images/user-store.gif);}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=9, name=state9}}
		mutateDOMTree(7);
		checkState7_OriginalAssertions();
		checkState7_ReusedAssertions();
		checkState7_GeneratedAssertions();
		checkState7_LearnedAssertions();
		checkState7_AllAssertions();
		checkState7_RandAssertions1();
		checkState7_RandAssertions2();
		checkState7_RandAssertions3();
		checkState7_RandAssertions4();
		checkState7_RandAssertions5();
		driver.findElement(By.cssSelector("#menu-panel-button3")).click();
		driver.findElement(By.linkText("Users and Roles")).click();
		//From state 9 to state 16
		//Eventable{eventType=click, identification=text Roles, element=Element{node=[A: null], tag=A, text=Roles, attributes={class=icon-link, href=../role/role-mgt.jsp, style=background-image:url(images/user-roles.gif);}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=16, name=state16}}
		mutateDOMTree(9);
		checkState9_OriginalAssertions();
		checkState9_ReusedAssertions();
		checkState9_GeneratedAssertions();
		checkState9_LearnedAssertions();
		checkState9_AllAssertions();
		checkState9_RandAssertions1();
		checkState9_RandAssertions2();
		checkState9_RandAssertions3();
		checkState9_RandAssertions4();
		checkState9_RandAssertions5();
		driver.findElement(By.linkText("Roles")).click();
		//From state 16 to state 17
		//Eventable{eventType=click, identification=text Add New Internal Role, element=Element{node=[A: null], tag=A, text=Add New Internal Role, attributes={class=icon-link, href=add-step1.jsp?roleType=Internal, style=background-image:url(images/add.gif);}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
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
		driver.findElement(By.linkText("Add New Internal Role")).click();
		//From state 17 to state 18
		//Eventable{eventType=click, identification=xpath //input[@value="Finish"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=button, type=submit, value=Finish}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
		mutateDOMTree(17);
		checkState17_OriginalAssertions();
		checkState17_ReusedAssertions();
		checkState17_GeneratedAssertions();
		checkState17_LearnedAssertions();
		checkState17_AllAssertions();
		checkState17_RandAssertions1();
		checkState17_RandAssertions2();
		checkState17_RandAssertions3();
		checkState17_RandAssertions4();
		checkState17_RandAssertions5();
		driver.findElement(By.name("roleName")).clear();
		String RandValue = "RND" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.name("roleName")).sendKeys(RandValue);
		driver.findElement(By.xpath("//input[@value=\"Finish\"]")).click();
		//From state 18 to state 19
		//Eventable{eventType=click, identification=xpath //button[text()="OK"], element=Element{node=[BUTTON: null], tag=BUTTON, text=OK, attributes={type=button}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
		mutateDOMTree(18);
		checkState18_OriginalAssertions();
		checkState18_ReusedAssertions();
		checkState18_GeneratedAssertions();
		checkState18_LearnedAssertions();
		checkState18_AllAssertions();
		checkState18_RandAssertions1();
		checkState18_RandAssertions2();
		checkState18_RandAssertions3();
		checkState18_RandAssertions4();
		checkState18_RandAssertions5();
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		//Sink node at state 19
		mutateDOMTree(19);
		checkState19_OriginalAssertions();
		checkState19_ReusedAssertions();
		checkState19_GeneratedAssertions();
		checkState19_LearnedAssertions();
		checkState19_AllAssertions();
		checkState19_RandAssertions1();
		checkState19_RandAssertions2();
		checkState19_RandAssertions3();
		checkState19_RandAssertions4();
		checkState19_RandAssertions5();
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
		
	}

	public void checkState0_RandAssertions2(){
		
	}

	public void checkState0_RandAssertions3(){
		
	}

	public void checkState0_RandAssertions4(){
		
	}

	public void checkState0_RandAssertions5(){
		
	}

	public void checkState7_OriginalAssertions(){
		assertEquals("WSO2 Management Console", driver.getTitle());; // original assertion

	}

	public void checkState7_ReusedAssertions(){
	}

	public void checkState7_GeneratedAssertions(){
	}

	public void checkState7_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"passwordExpire\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tip-content-lifter\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-content\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"tip-title\"","href=\"../modulemgt/index.jsp?region=region1&item=modules_list_menu\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState7_AllAssertions(){
		assertEquals("WSO2 Management Console", driver.getTitle());; // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"passwordExpire\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

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
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState7_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]/TD[6]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR[4]/TD[2]/H3"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_content.jsp?region=region3&item=governance_add_wsdl_menu&key=wsdl&lifecycleAttribute=null&breadcrumb=WSDL&mediaType=application/wsdl+xml&extension=wsdl&singularLabel=WSDL&pluralLabel=WSDLs&hasNamespacetrue\"","style=\"background-image: url(../generic/images/add28.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions3(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/TABLE/TBODY/TR/TD/DIV/TABLE/TBODY/TR/TD[2]/H3"))); // Random element assertion
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginbox\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-top java2wsdl\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[2]/TD[3]/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState7_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[2]/TD[4]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"features\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://docs.wso2.org/display/ES100/WSO2+Enterprise+Store\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_OriginalAssertions(){
	}

	public void checkState9_ReusedAssertions(){
	}

	public void checkState9_GeneratedAssertions(){
	}

	public void checkState9_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState9_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState9_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]/TD[6]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_content.jsp?region=region3&item=governance_add_wsdl_menu&key=wsdl&lifecycleAttribute=null&breadcrumb=WSDL&mediaType=application/wsdl+xml&extension=wsdl&singularLabel=WSDL&pluralLabel=WSDLs&hasNamespacetrue\"","style=\"background-image: url(../generic/images/add28.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[3]/TD/DIV/UL/LI[6]/UL/LI[2]/UL/LI[10]"))); // Random element assertion
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
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
//		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"tip-top java2wsdl\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions4(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR/TD[5]"))); // Random element assertion
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[3]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"../user/user-mgt.jsp\"","style=\"background-image:url(images/users.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState9_RandAssertions5(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV[2]/DIV/TABLE/TBODY/TR[2]/TD[3]/DIV"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR/TD/TABLE/TBODY/TR[2]/TD"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"../user/change-passwd.jsp?isUserChange=true&returnPath=../userstore/index.jsp\"","style=\"background-image: url(images/keys.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://docs.wso2.org/display/ES100/WSO2+Enterprise+Store\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_OriginalAssertions(){
	}

	public void checkState16_ReusedAssertions(){
	}

	public void checkState16_GeneratedAssertions(){
	}

	public void checkState16_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState16_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState16_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/FORM/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"ALL-USER-STORE-DOMAINS\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"domain\"","name=\"domain\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[2]/TBODY/TR/TD[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[3]/TBODY"))); // Random element assertion
		element = new DOMElement("TH", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[3]/TD/DIV/UL/LI[6]/UL/LI[2]/UL/LI[10]"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"../user/user-mgt.jsp\"","style=\"background-image:url(images/users.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState16_RandAssertions5(){
//		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR/TD/TABLE/TBODY/TR[2]/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"tableEvenRow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-permissions.jsp?roleName=Internal/RNDCAtb\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"view-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/view.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"deleteUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/delete.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_OriginalAssertions(){
	}

	public void checkState17_ReusedAssertions(){
	}

	public void checkState17_GeneratedAssertions(){
	}

	public void checkState17_LearnedAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"normal\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"formRaw\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState17_AllAssertions(){
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("class=\"normal\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"formRaw\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState17_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/FORM/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_content.jsp?region=region3&item=governance_add_wsdl_menu&key=wsdl&lifecycleAttribute=null&breadcrumb=WSDL&mediaType=application/wsdl+xml&extension=wsdl&singularLabel=WSDL&pluralLabel=WSDLs&hasNamespacetrue\"","style=\"background-image: url(../generic/images/add28.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[3]/TD/DIV/UL/LI[6]/UL/LI[2]/UL/LI[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_service_menu&key=service&breadcrumb=Services&singularLabel=Service&pluralLabel=Services\"","style=\"background-image: url(../generic/images/list27.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
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
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"sharedRoleTd\""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD/DIV/UL/LI[5]/UL/LI[7]/UL/LI[2]/A"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD/DIV/UL/LI[5]/UL/LI[5]/UL/LI"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState17_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR/TD/TABLE"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD/DIV[4]/SPAN"))); // Random element assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"formRaw\""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"3\"","id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer-content\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"http://docs.wso2.org/display/ES100/WSO2+Enterprise+Store\"","target=\"_blank\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../dialog/js/jqueryui/jquery-ui.min.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_OriginalAssertions(){
		assertTrue(driver.findElement(By.cssSelector("#messagebox-info")).getText().contains("is added successfully.")); // original assertion

	}

	public void checkState18_ReusedAssertions(){
	}

	public void checkState18_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"messagebox-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog-content\"","id=\"dialog\"","style=\"height: 136px; width: 450px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"messagebox-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog-content\"","id=\"dialog\"","style=\"height: 136px; width: 450px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("#messagebox-info"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState18_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"footer-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("colspan=\"3\"","id=\"footer\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"footer-content\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button4\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-resizable-handle ui-resizable-sw\"","style=\"position: absolute; overflow: hidden; z-index: 1002; -moz-user-select: none;\"","unselectable=\"on\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog ui-draggable ui-resizable\"","style=\"display: block; position: absolute; width: 450px; height: 160px; overflow: hidden; z-index: 1002; outline: 0px none; top: 174.5px; left: 307.5px;\"","tabindex=\"-1\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-resizable-handle ui-resizable-ne\"","style=\"position: absolute; overflow: hidden; z-index: 1003; -moz-user-select: none;\"","unselectable=\"on\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog ui-draggable ui-resizable\"","style=\"display: block; position: absolute; width: 450px; height: 160px; overflow: hidden; z-index: 1002; outline: 0px none; top: 174.5px; left: 307.5px;\"","tabindex=\"-1\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState18_AllAssertions(){
		assertTrue(driver.findElement(By.cssSelector("#messagebox-info")).getText().contains("is added successfully.")); // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"messagebox-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog-content\"","id=\"dialog\"","style=\"height: 136px; width: 450px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("#messagebox-info"))); // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"messagebox-info\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"ui-dialog-content\"","id=\"dialog\"","style=\"height: 136px; width: 450px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // generated assertion in case of AEP for Original

		assertTrue(isElementPresent(By.cssSelector("#messagebox-info"))); // generated assertion in case of ElementTagAttMatch

	}

	public void checkState18_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/FORM/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"ALL-USER-STORE-DOMAINS\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"domain\"","name=\"domain\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[2]/TBODY/TR/TD[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[3]/TBODY"))); // Random element assertion
		element = new DOMElement("TH", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
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
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../cassandramgt/images/cassandra-keyspace.png);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[3]/TD/DIV/UL/LI[6]/UL/LI[2]/UL/LI[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"tableEvenRow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-permissions.jsp?roleName=Internal/RNDCAtb\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"view-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/view.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"deleteUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/delete.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState18_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD/DIV/UL/LI[5]/UL/LI[7]/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_OriginalAssertions(){
	}

	public void checkState19_ReusedAssertions(){
	}

	public void checkState19_GeneratedAssertions(){
	}

	public void checkState19_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState19_AllAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"middle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"body\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("id=\"workArea\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons\"","id=\"menu-panel-button2\"","style=\"display: none;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu-panel-button_dummy\"","style=\"display:none\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumb-div\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("cellspacing=\"0\""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"showToHidden\"","id=\"menu-panel-button0\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"vertical-menu-container\"","id=\"vertical-menu-container\"","style=\"\"")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // predicted pattern assertion

	}

	public void checkState19_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/FORM/TABLE/TBODY/TR"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"../admin/js/main.js\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"menu\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"main\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("selected=\"selected\"","value=\"ALL-USER-STORE-DOMAINS\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"domain\"","name=\"domain\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[2]/TBODY/TR/TD[2]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/DIV/DIV/TABLE[3]/TBODY"))); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_service_menu&key=service&breadcrumb=Services&singularLabel=Service&pluralLabel=Services\"","style=\"background-image: url(../generic/images/list27.png);\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TH", "", new ArrayList<String>(Arrays.asList("colspan=\"2\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
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

	public void checkState19_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[3]/TABLE/TBODY/TR[2]/TD/SCRIPT"))); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("height=\"1px\"","src=\"../admin/images/1px.gif\"","width=\"225px\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../eventing/images/topics.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/list.jsp?region=region3&item=governance_list_site_menu&key=site&breadcrumb=Sites&singularLabel=Site&pluralLabel=Sites\"","style=\"background-image: url(../generic/images/list10.png);\""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellpadding=\"0\"","cellspacing=\"0\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR[3]/TD/DIV/UL/LI[6]/UL/LI[2]/UL/LI[10]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[10]"))); // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"menu-disabled-link\"","style=\"background-image: url(../resources/images/config.gif);\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"middle\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"logged-user\""))));
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"menu-panel-buttons selected\"","id=\"menu-panel-button3\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
	}

	public void checkState19_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/TABLE/TBODY/TR[2]/TD[2]/TABLE/TBODY/TR/TD/DIV/UL/LI[5]/UL/LI[7]/UL/LI[2]/A"))); // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"tableEvenRow\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"updateUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-permissions.jsp?roleName=Internal/RNDCAtb\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"edit-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/edit.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"view-users.jsp?roleName=Internal/RNDCAtb&org.wso2.carbon.role.read.only=false\"","style=\"background-image:url(images/view.gif);\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"icon-link\"","href=\"#\"","onclick=\"deleteUserGroup('Internal/RNDCAtb')\"","style=\"background-image:url(images/delete.gif);\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternTagPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("id=\"region5\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"menu\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementPatternFullPresent(parentElement , element, childrenElements)); // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"sub\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"menu-default\"","href=\"../generic/add_edit.jsp?region=region3&item=governance_add_gadget_menu&key=gadget&lifecycleAttribute=null&breadcrumb=Gadget\"","style=\"background-image: url(../generic/images/add10.png);\""))));
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
