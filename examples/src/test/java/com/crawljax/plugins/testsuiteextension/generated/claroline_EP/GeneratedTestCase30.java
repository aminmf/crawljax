package com.crawljax.plugins.testsuiteextension.generated.claroline_EP;

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
 * Generated @ Wed Apr 09 21:06:29 PDT 2014
 */

public class GeneratedTestCase30 {

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
	public void method30(){
		driver.get(url);
		//From state 0 to state 147
		//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=147, name=state147}}
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
		//From state 147 to state 2
		//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=147, name=state147}, target=StateVertexImpl{id=2, name=state2}}
		mutateDOMTree(147);
		checkState147_OriginalAssertions();
		checkState147_ReusedAssertions();
		checkState147_GeneratedAssertions();
		checkState147_LearnedAssertions();
		checkState147_AllAssertions();
		checkState147_RandAssertions1();
		checkState147_RandAssertions2();
		checkState147_RandAssertions3();
		checkState147_RandAssertions4();
		checkState147_RandAssertions5();
		driver.findElement(By.linkText("Platform administration")).click();
		//From state 2 to state 71
		//Eventable{eventType=click, identification=text Manage course categories, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=71, name=state71}}
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
		driver.findElement(By.linkText("Manage course categories")).click();
		//From state 71 to state 72
		//Eventable{eventType=click, identification=cssSelector img[alt="Edit category"], element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit category, src=/claroline-1.11.7/web/img/edit.png?1232379976}}, source=StateVertexImpl{id=71, name=state71}, target=StateVertexImpl{id=72, name=state72}}
		mutateDOMTree(71);
		checkState71_OriginalAssertions();
		checkState71_ReusedAssertions();
		checkState71_GeneratedAssertions();
		checkState71_LearnedAssertions();
		checkState71_AllAssertions();
		checkState71_RandAssertions1();
		checkState71_RandAssertions2();
		checkState71_RandAssertions3();
		checkState71_RandAssertions4();
		checkState71_RandAssertions5();
		driver.findElement(By.cssSelector("img[alt=\"Edit category\"]")).click();
		//From state 72 to state 73
		//Eventable{eventType=click, identification=cssSelector img[alt="Move down category"], element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Move down category, src=/claroline-1.11.7/web/img/move_down.png?1232379976}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}}
		mutateDOMTree(72);
		checkState72_OriginalAssertions();
		checkState72_ReusedAssertions();
		checkState72_GeneratedAssertions();
		checkState72_LearnedAssertions();
		checkState72_AllAssertions();
		checkState72_RandAssertions1();
		checkState72_RandAssertions2();
		checkState72_RandAssertions3();
		checkState72_RandAssertions4();
		checkState72_RandAssertions5();
		driver.findElement(By.id("category_code")).clear();
		driver.findElement(By.id("category_code")).sendKeys("Sci");
		driver.findElement(By.cssSelector("img[alt=\"Move down category\"]")).click();
		//From state 73 to state 186
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[5]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=?cmd=rqEdit&categoryId=1342}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=186, name=state186}}
		mutateDOMTree(73);
		checkState73_OriginalAssertions();
		checkState73_ReusedAssertions();
		checkState73_GeneratedAssertions();
		checkState73_LearnedAssertions();
		checkState73_AllAssertions();
		checkState73_RandAssertions1();
		checkState73_RandAssertions2();
		checkState73_RandAssertions3();
		checkState73_RandAssertions4();
		checkState73_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/TABLE[1]/TBODY[1]/TR[1]/TD[5]/A[1]")).click();
		//Sink node at state 186
		mutateDOMTree(186);
		checkState186_OriginalAssertions();
		checkState186_ReusedAssertions();
		checkState186_GeneratedAssertions();
		checkState186_LearnedAssertions();
		checkState186_AllAssertions();
		checkState186_RandAssertions1();
		checkState186_RandAssertions2();
		checkState186_RandAssertions3();
		checkState186_RandAssertions4();
		checkState186_RandAssertions5();
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
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
		childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
		childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternFullMatch

	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
		if(!(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // reused assertion in case of ElementFullMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
		childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternFullMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
		childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternFullMatch

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

	public void checkState147_OriginalAssertions(){
	}

	public void checkState147_ReusedAssertions(){
	}

	public void checkState147_GeneratedAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

	}

	public void checkState147_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState147_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState147_RandAssertions1(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=839&type=received\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState147_RandAssertions2(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
		childrenElements.add(new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("id=\"userProfile\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBoxDock\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState147_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/H1")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"qtip iconDefinitionList \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content collapsible-wrapper\"","style=\"display: none;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet collapsible  collapsed\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H4", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("P", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState147_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState147_RandAssertions5(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[177]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[564]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"User picture\"","class=\"userPicture\"","src=\"/claroline-1.11.7/web/img/nopicture.png?1232379976\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.claroDialogBox.boxWarning")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState2_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState2_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.claroDialogBox.boxWarning")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState2_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPanel\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("class=\"adminCommunication\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"technical/phpInfo.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"adminmergeuser.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState2_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/BR")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"advanced_course_search.php\"")));
		parentElement = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"../messaging/sendmessage.php?cmd=rqMessageToAllUsers\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState2_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[6]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[7]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"search_course\"","name=\"search\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/exe.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState2_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/desktop/index.php\"","target=\"_top\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/settings.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPlatform\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState2_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[4]/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SMALL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"advanced_course_search.php\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState71_OriginalAssertions(){
	}

	public void checkState71_ReusedAssertions(){
	}

	public void checkState71_GeneratedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("table.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState71_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState71_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("table.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState71_RandAssertions1(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[90]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[403]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1385\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"technical/phpInfo.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/user.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("LI", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState71_RandAssertions2(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[165]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[256]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"search_course\"","name=\"search\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\"")));
		childrenElements.clear();
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/exe.png?1232379976\"")));
		parentElement = new DOMElement("H2", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/enroll.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqReg&categoryId=0\"")));
		childrenElements.clear();
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"../user/addcsvusers.php?AddType=adminTool\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState71_RandAssertions3(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/H1")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCourse\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("action=\"admin_courses.php\"","method=\"get\"","name=\"searchCourse\""))));
		childrenElements.add(new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"qtip iconDefinitionList \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"userName\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet mycourselist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"userCommands\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"userCourseList\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState71_RandAssertions4(){
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[4]/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[512]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("B", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState71_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
//		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[448]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exVisibility&categoryId=1366\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Change visibility\"","src=\"/claroline-1.11.7/web/img/visible.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/index.php\"","target=\"_top\""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState72_OriginalAssertions(){
	}

	public void checkState72_ReusedAssertions(){
	}

	public void checkState72_GeneratedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector(".claroDialogBox")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState72_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState72_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector(".claroDialogBox")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("table.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState72_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/A/INPUT")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"can_have_courses\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1365\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"headerX\""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState72_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[7]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[2]/TD[4]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"category_parent\"","name=\"category_parent\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1385\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1366\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Move up category\"","src=\"/claroline-1.11.7/web/img/move_up.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState72_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"category_name\"","maxlength=\"100\"","name=\"category_name\"","size=\"30\"","type=\"text\"","value=\"Software Eng\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"category_name\"","maxlength=\"100\"","name=\"category_name\"","size=\"30\"","type=\"text\"","value=\"Software Eng\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"category_root_course\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState72_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[7]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"claroFormId\"","type=\"hidden\"","value=\"5344d67018d20\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/admin_category.php\"","id=\"categorySettings\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1386\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"exEdit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/admin_category.php\"","id=\"categorySettings\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState72_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("OPTION", "", new ArrayList<String>(Arrays.asList("value=\"1386\"")));
		parentElement = new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"category_parent\"","name=\"category_parent\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/admin/admin_category.php';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/admin_category.php\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"category_parent\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1365\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState73_OriginalAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

	}

	public void checkState73_ReusedAssertions(){
	}

	public void checkState73_GeneratedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState73_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState73_AllAssertions(){
		if(!(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // original assertion

		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox boxSuccess\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgSuccess\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of AEP for Original

		if(!(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState73_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[7]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1365\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1385\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"headerX\""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState73_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[2]/TD[4]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1366\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Move up category\"","src=\"/claroline-1.11.7/web/img/move_up.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState73_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
		childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1386\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState73_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[8]/TD[7]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1384\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Move up category\"","src=\"/claroline-1.11.7/web/img/move_up.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exVisibility&categoryId=1366\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Change visibility\"","src=\"/claroline-1.11.7/web/img/visible.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1365\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState73_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerLeft\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1386\"","onclick=\"return ADMIN.confirmationDel('Software Eng');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=807\"","onclick=\"return ADMIN.confirmationDel('Software Eng');\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState186_OriginalAssertions(){
	}

	public void checkState186_ReusedAssertions(){
	}

	public void checkState186_GeneratedAssertions(){
		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector(".claroDialogBox")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

	}

	public void checkState186_LearnedAssertions(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // predicted pattern assertion

	}

	public void checkState186_AllAssertions(){
		if(!(isElementPresent(By.cssSelector("div.toolTitleBlock")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.id("claroBody")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector(".claroDialogBox")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("TABLE.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		if(!(isElementPresent(By.cssSelector("table.claroTable.emphaseLine")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of ElementTagAttMatch

		element = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // generated assertion in case of PatternTagAttMatch

	}

	public void checkState186_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/A/INPUT")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[2]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"can_have_courses\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("SELECT", "", new ArrayList<String>(Arrays.asList("id=\"category_parent\"","name=\"category_parent\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("THEAD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TABLE", "", new ArrayList<String>(Arrays.asList("border=\"0\"","cellspacing=\"2\"","class=\"claroTable emphaseLine\"","width=\"100%\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"headerX\""))));
		childrenElements.add(new DOMElement("TR", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState186_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[7]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[2]/TD[4]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1365\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Delete category\"","src=\"/claroline-1.11.7/web/img/delete.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exDelete&categoryId=1385\"","onclick=\"return ADMIN.confirmationDel('Software Testing');\"")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1366\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Move up category\"","src=\"/claroline-1.11.7/web/img/move_up.png?1232379976\""))));
		childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState186_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A/IMG")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[4]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"category_name\"","maxlength=\"100\"","name=\"category_name\"","size=\"30\"","type=\"text\"","value=\"Software Eng\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"category_root_course\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState186_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[3]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("id=\"category_name\"","maxlength=\"100\"","name=\"category_name\"","size=\"30\"","type=\"text\"","value=\"Software Eng\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("id=\"navlist\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"?cmd=exMoveUp&categoryId=1386\""))));
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList(""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
//		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("name=\"cmd\"","type=\"hidden\"","value=\"exEdit\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/admin/admin_category.php\"","id=\"categorySettings\"","method=\"post\"")));
		childrenElements.clear();
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
	}

	public void checkState186_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[3]")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[2]/TD[5]/A")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random element assertion
		element = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=main\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternTagPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"category_parent\""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
		element = new DOMElement("LABEL", "", new ArrayList<String>(Arrays.asList("for=\"hidden\"")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementPatternFullPresent(parentElement , element, childrenElements))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;} // Random pattern assertion
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
