package com.crawljax.plugins.testsuiteextension.generated.claroline_RND2;

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
 * Generated @ Sun Apr 13 19:52:00 PDT 2014
 */

public class GeneratedTestCase76 {

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
	public void method76(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1]")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
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
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 2 to state 5
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[6], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={atusa=id1124404870_0, type=submit, value=Ok}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=5, name=state5}}
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
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/INPUT[6]")).click();
		//From state 5 to state 16
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=My messages, attributes={href=/claroline-1.11.7/claroline/messaging, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=16, name=state16}}
		mutateDOMTree(5);
		checkState5_OriginalAssertions();
		checkState5_ReusedAssertions();
		checkState5_GeneratedAssertions();
		checkState5_LearnedAssertions();
		checkState5_AllAssertions();
		checkState5_RandAssertions1();
		checkState5_RandAssertions2();
		checkState5_RandAssertions3();
		checkState5_RandAssertions4();
		checkState5_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[2]/SPAN[1]/A[1]")).click();
		//From state 16 to state 24
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1], element=Element{node=[A: null], tag=A, text=Edit text zone, attributes={href=/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_messaging_top.inc.html}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=24, name=state24}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/P[1]/A[1]")).click();
		//From state 24 to state 30
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=30, name=state30}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1]")).click();
		//From state 30 to state 45
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1], element=Element{node=[A: null], tag=A, text=Advanced, attributes={href=advanced_user_search.php}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=45, name=state45}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/UL[1]/LI[1]/FORM[1]/SMALL[1]/A[1]")).click();
		//From state 45 to state 58
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={atusa=id1124404870_0, class=claroButton, type=submit, value=Search user}}, source=StateVertexImpl{id=45, name=state45}, target=StateVertexImpl{id=58, name=state58}}
		mutateDOMTree(45);
		checkState45_OriginalAssertions();
		checkState45_ReusedAssertions();
		checkState45_GeneratedAssertions();
		checkState45_LearnedAssertions();
		checkState45_AllAssertions();
		checkState45_RandAssertions1();
		checkState45_RandAssertions2();
		checkState45_RandAssertions3();
		checkState45_RandAssertions4();
		checkState45_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/TABLE[1]/TBODY[1]/TR[7]/TD[2]/INPUT[1]")).click();
		//From state 58 to state 85
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php, style=background-image: url(/claroline-1.11.7/web/img/user.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=58, name=state58}, target=StateVertexImpl{id=85, name=state85}}
		mutateDOMTree(58);
		checkState58_OriginalAssertions();
		checkState58_ReusedAssertions();
		checkState58_GeneratedAssertions();
		checkState58_LearnedAssertions();
		checkState58_AllAssertions();
		checkState58_RandAssertions1();
		checkState58_RandAssertions2();
		checkState58_RandAssertions3();
		checkState58_RandAssertions4();
		checkState58_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/UL[1]/LI[1]/A[1]")).click();
		//From state 85 to state 90
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Create a new user, attributes={href=/claroline-1.11.7/claroline/admin/adminaddnewuser.php, target=_top}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=90, name=state90}}
		mutateDOMTree(85);
		checkState85_OriginalAssertions();
		checkState85_ReusedAssertions();
		checkState85_GeneratedAssertions();
		checkState85_LearnedAssertions();
		checkState85_AllAssertions();
		checkState85_RandAssertions1();
		checkState85_RandAssertions2();
		checkState85_RandAssertions3();
		checkState85_RandAssertions4();
		checkState85_RandAssertions5();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[3]/A[1]")).click();
		//From state 90 to state 119
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=http://localhost:8888/claroline-1.11.7/claroline/admin/adminaddnewuser.php}}, source=StateVertexImpl{id=90, name=state90}, target=StateVertexImpl{id=119, name=state119}}
		mutateDOMTree(90);
		checkState90_OriginalAssertions();
		checkState90_ReusedAssertions();
		checkState90_GeneratedAssertions();
		checkState90_LearnedAssertions();
		checkState90_AllAssertions();
		checkState90_RandAssertions1();
		checkState90_RandAssertions2();
		checkState90_RandAssertions3();
		checkState90_RandAssertions4();
		checkState90_RandAssertions5();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/FORM[1]/DL[1]/DT[1]/A[1]")).click();
		//Sink node at state 119
		mutateDOMTree(119);
		checkState119_OriginalAssertions();
		checkState119_ReusedAssertions();
		checkState119_GeneratedAssertions();
		checkState119_LearnedAssertions();
		checkState119_AllAssertions();
		checkState119_RandAssertions1();
		checkState119_RandAssertions2();
		checkState119_RandAssertions3();
		checkState119_RandAssertions4();
		checkState119_RandAssertions5();
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

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
	}

	public void checkState1_LearnedAssertions(){
	}

	public void checkState1_AllAssertions(){
	}

	public void checkState1_RandAssertions1(){
	}

	public void checkState1_RandAssertions2(){
	}

	public void checkState1_RandAssertions3(){
	}

	public void checkState1_RandAssertions4(){
	}

	public void checkState1_RandAssertions5(){
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
	}

	public void checkState2_LearnedAssertions(){
	}

	public void checkState2_AllAssertions(){
	}

	public void checkState2_RandAssertions1(){
	}

	public void checkState2_RandAssertions2(){
	}

	public void checkState2_RandAssertions3(){
	}

	public void checkState2_RandAssertions4(){
	}

	public void checkState2_RandAssertions5(){
	}

	public void checkState5_OriginalAssertions(){
	}

	public void checkState5_ReusedAssertions(){
	}

	public void checkState5_GeneratedAssertions(){
	}

	public void checkState5_LearnedAssertions(){
	}

	public void checkState5_AllAssertions(){
	}

	public void checkState5_RandAssertions1(){
	}

	public void checkState5_RandAssertions2(){
	}

	public void checkState5_RandAssertions3(){
	}

	public void checkState5_RandAssertions4(){
	}

	public void checkState5_RandAssertions5(){
	}

	public void checkState16_OriginalAssertions(){
	}

	public void checkState16_ReusedAssertions(){
	}

	public void checkState16_GeneratedAssertions(){
	}

	public void checkState16_LearnedAssertions(){
	}

	public void checkState16_AllAssertions(){
	}

	public void checkState16_RandAssertions1(){
	}

	public void checkState16_RandAssertions2(){
	}

	public void checkState16_RandAssertions3(){
	}

	public void checkState16_RandAssertions4(){
	}

	public void checkState16_RandAssertions5(){
	}

	public void checkState24_OriginalAssertions(){
	}

	public void checkState24_ReusedAssertions(){
	}

	public void checkState24_GeneratedAssertions(){
	}

	public void checkState24_LearnedAssertions(){
	}

	public void checkState24_AllAssertions(){
	}

	public void checkState24_RandAssertions1(){
	}

	public void checkState24_RandAssertions2(){
	}

	public void checkState24_RandAssertions3(){
	}

	public void checkState24_RandAssertions4(){
	}

	public void checkState24_RandAssertions5(){
	}

	public void checkState30_OriginalAssertions(){
	}

	public void checkState30_ReusedAssertions(){
	}

	public void checkState30_GeneratedAssertions(){
	}

	public void checkState30_LearnedAssertions(){
	}

	public void checkState30_AllAssertions(){
	}

	public void checkState30_RandAssertions1(){
	}

	public void checkState30_RandAssertions2(){
	}

	public void checkState30_RandAssertions3(){
	}

	public void checkState30_RandAssertions4(){
	}

	public void checkState30_RandAssertions5(){
	}

	public void checkState45_OriginalAssertions(){
	}

	public void checkState45_ReusedAssertions(){
	}

	public void checkState45_GeneratedAssertions(){
	}

	public void checkState45_LearnedAssertions(){
	}

	public void checkState45_AllAssertions(){
	}

	public void checkState45_RandAssertions1(){
	}

	public void checkState45_RandAssertions2(){
	}

	public void checkState45_RandAssertions3(){
	}

	public void checkState45_RandAssertions4(){
	}

	public void checkState45_RandAssertions5(){
	}

	public void checkState58_OriginalAssertions(){
	}

	public void checkState58_ReusedAssertions(){
	}

	public void checkState58_GeneratedAssertions(){
	}

	public void checkState58_LearnedAssertions(){
	}

	public void checkState58_AllAssertions(){
	}

	public void checkState58_RandAssertions1(){
	}

	public void checkState58_RandAssertions2(){
	}

	public void checkState58_RandAssertions3(){
	}

	public void checkState58_RandAssertions4(){
	}

	public void checkState58_RandAssertions5(){
	}

	public void checkState85_OriginalAssertions(){
	}

	public void checkState85_ReusedAssertions(){
	}

	public void checkState85_GeneratedAssertions(){
	}

	public void checkState85_LearnedAssertions(){
	}

	public void checkState85_AllAssertions(){
	}

	public void checkState85_RandAssertions1(){
	}

	public void checkState85_RandAssertions2(){
	}

	public void checkState85_RandAssertions3(){
	}

	public void checkState85_RandAssertions4(){
	}

	public void checkState85_RandAssertions5(){
	}

	public void checkState90_OriginalAssertions(){
	}

	public void checkState90_ReusedAssertions(){
	}

	public void checkState90_GeneratedAssertions(){
	}

	public void checkState90_LearnedAssertions(){
	}

	public void checkState90_AllAssertions(){
	}

	public void checkState90_RandAssertions1(){
	}

	public void checkState90_RandAssertions2(){
	}

	public void checkState90_RandAssertions3(){
	}

	public void checkState90_RandAssertions4(){
	}

	public void checkState90_RandAssertions5(){
	}

	public void checkState119_OriginalAssertions(){
	}

	public void checkState119_ReusedAssertions(){
	}

	public void checkState119_GeneratedAssertions(){
	}

	public void checkState119_LearnedAssertions(){
	}

	public void checkState119_AllAssertions(){
	}

	public void checkState119_RandAssertions1(){
	}

	public void checkState119_RandAssertions2(){
	}

	public void checkState119_RandAssertions3(){
	}

	public void checkState119_RandAssertions4(){
	}

	public void checkState119_RandAssertions5(){
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