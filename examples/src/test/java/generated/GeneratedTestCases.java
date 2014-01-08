package generated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.crawljax.util.DomUtils;

/*
 * Generated @ Wed Jan 08 12:28:35 PST 2014
 */

public class GeneratedTestCases {

	private WebDriver driver;
	private String url;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		url = "http://watersmc.ece.ubc.ca:8888/claroline-1.11.7/index.php";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
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
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 76
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=76, name=state76}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			assertTrue(driver.findElement(By.id("courseSettings")).getText().matches("^[\\s\\S]* Access allowed to anybody[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 76 to state 84
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=76, name=state76}, target=StateVertexImpl{id=84, name=state84}}
			driver.findElement(By.id("course_userLimit")).clear();
			driver.findElement(By.id("course_userLimit")).sendKeys("60");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*You have just created the course website[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 84 to state 85
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=84, name=state84}, target=StateVertexImpl{id=85, name=state85}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method1(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 4 to state 7
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=7, name=state7}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 7 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method2(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 13 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method3(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 13 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method4(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 23 to state 24
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 24 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 25 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method5(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 23 to state 24
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 24 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 25 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method6(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 4 to state 7
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=7, name=state7}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 7 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method7(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 53
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 53 to state 56
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 56 to state 57
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 57 to state 60
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 60 to state 61
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 61 to state 67
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 67 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=67, name=state67}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method8(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 53
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 53 to state 56
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 56 to state 57
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 57 to state 60
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 60 to state 61
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 61 to state 67
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 67 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=67, name=state67}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method9(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 93
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Edit text zones, attributes={href=managing/editFile.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=93, name=state93}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[2]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 93 to state 94
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[3]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Preview, src=/claroline-1.11.7/web/img/preview.png?1232379976}}, source=StateVertexImpl{id=93, name=state93}, target=StateVertexImpl{id=94, name=state94}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[3]/A/IMG")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*textzone_top\\.inc\\.html[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 94 to state 95
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[3]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Preview, src=/claroline-1.11.7/web/img/preview.png?1232379976}}, source=StateVertexImpl{id=94, name=state94}, target=StateVertexImpl{id=95, name=state95}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[3]/A/IMG")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 95 to state 96
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit, src=/claroline-1.11.7/web/img/edit.png?1232379976}}, source=StateVertexImpl{id=95, name=state95}, target=StateVertexImpl{id=96, name=state96}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/A/IMG")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 96 to state 97
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/P/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, type=submit, value=Ok}}, source=StateVertexImpl{id=96, name=state96}, target=StateVertexImpl{id=97, name=state97}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/P/INPUT")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*Hello !! Welcome to Clatoline\\.\\. :\\)[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 97 to state 98
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=98, name=state98}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method10(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 93
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Edit text zones, attributes={href=managing/editFile.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=93, name=state93}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[2]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 93 to state 94
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[3]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Preview, src=/claroline-1.11.7/web/img/preview.png?1232379976}}, source=StateVertexImpl{id=93, name=state93}, target=StateVertexImpl{id=94, name=state94}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[3]/A/IMG")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*textzone_top\\.inc\\.html[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 94 to state 95
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[3]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Preview, src=/claroline-1.11.7/web/img/preview.png?1232379976}}, source=StateVertexImpl{id=94, name=state94}, target=StateVertexImpl{id=95, name=state95}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[3]/A/IMG")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 95 to state 96
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit, src=/claroline-1.11.7/web/img/edit.png?1232379976}}, source=StateVertexImpl{id=95, name=state95}, target=StateVertexImpl{id=96, name=state96}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[2]/A/IMG")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 96 to state 97
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/P/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=claroButton, type=submit, value=Ok}}, source=StateVertexImpl{id=96, name=state96}, target=StateVertexImpl{id=97, name=state97}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/P/INPUT")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*Hello !! Welcome to Clatoline\\.\\. :\\)[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 97 to state 98
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=98, name=state98}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method11(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 88
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=88, name=state88}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 88 to state 89
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[6]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Delete category, src=/claroline-1.11.7/web/img/delete.png?1232379976}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[6]/A/IMG")).click();
			assertTrue(closeAlertAndGetItsText().matches("^Are you sure to delete Software Eng [\\s\\S]$")); // original assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category deleted\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 89 to state 90
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=89, name=state89}, target=StateVertexImpl{id=90, name=state90}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method12(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 88
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=88, name=state88}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 88 to state 89
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[6]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Delete category, src=/claroline-1.11.7/web/img/delete.png?1232379976}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR[5]/TD[6]/A/IMG")).click();
			assertTrue(closeAlertAndGetItsText().matches("^Are you sure to delete Software Eng [\\s\\S]$")); // original assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category deleted\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 89 to state 90
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=89, name=state89}, target=StateVertexImpl{id=90, name=state90}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method13(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 72
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[5]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit category, src=/claroline-1.11.7/web/img/edit.png?1232379976}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=72, name=state72}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[5]/A/IMG")).click();
			assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Economics \\(ECO\\)[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 72 to state 73
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[8]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Move down category, src=/claroline-1.11.7/web/img/move_down.png?1232379976}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}}
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("Sci");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[8]/A/IMG")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 73 to state 74
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=74, name=state74}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method14(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 72
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[5]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Edit category, src=/claroline-1.11.7/web/img/edit.png?1232379976}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=72, name=state72}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[5]/A/IMG")).click();
			assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Economics \\(ECO\\)[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 72 to state 73
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[8]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Move down category, src=/claroline-1.11.7/web/img/move_down.png?1232379976}}, source=StateVertexImpl{id=72, name=state72}, target=StateVertexImpl{id=73, name=state73}}
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("Sci");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[8]/A/IMG")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 73 to state 74
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=73, name=state73}, target=StateVertexImpl{id=74, name=state74}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method15(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method16(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method17(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 29 to state 39
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=39, name=state39}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle()); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 39 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=39, name=state39}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method18(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 29 to state 39
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=39, name=state39}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle()); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 39 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=39, name=state39}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method19(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 44
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI/A, element=Element{node=[A: null], tag=A, text=Announcement, attributes={href=config_edit.php?config_code=CLANN}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=44, name=state44}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI/A")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*Use 0 to display all[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 44 to state 45
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=44, name=state44}, target=StateVertexImpl{id=45, name=state45}}
			driver.findElement(By.id("label_announcementPortletMaxItems")).clear();
			driver.findElement(By.id("label_announcementPortletMaxItems")).sendKeys("0");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Announcement, \\(CLANN\\) are now effective on server[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 45 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=45, name=state45}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method20(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 18 to state 19
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
			driver.findElement(By.id("old_password")).clear();
			driver.findElement(By.id("old_password")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.id("password_conf")).clear();
			driver.findElement(By.id("password_conf")).sendKeys("nainy");
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("7788814476");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 19 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method21(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 18 to state 19
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
			driver.findElement(By.id("old_password")).clear();
			driver.findElement(By.id("old_password")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.id("password_conf")).clear();
			driver.findElement(By.id("password_conf")).sendKeys("nainy");
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("7788814476");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 19 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method22(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 44
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI/A, element=Element{node=[A: null], tag=A, text=Announcement, attributes={href=config_edit.php?config_code=CLANN}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=44, name=state44}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI/A")).click();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*Use 0 to display all[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 44 to state 45
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=44, name=state44}, target=StateVertexImpl{id=45, name=state45}}
			driver.findElement(By.id("label_announcementPortletMaxItems")).clear();
			driver.findElement(By.id("label_announcementPortletMaxItems")).sendKeys("0");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Announcement, \\(CLANN\\) are now effective on server[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 45 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=45, name=state45}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method23(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 53
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 53 to state 56
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 56 to state 57
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 57 to state 60
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 60 to state 61
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 61 to state 67
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method24(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 43 to state 53
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 53 to state 56
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A")).click();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 56 to state 57
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 57 to state 60
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 60 to state 61
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // reused assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			//From state 61 to state 67
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPresent(By.name("editConfClass"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","FORM", new ArrayList<String>(Arrays.asList("#text","INPUT","#text","INPUT","#text","INPUT","#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method25(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 18 to state 19
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
			driver.findElement(By.id("old_password")).clear();
			driver.findElement(By.id("old_password")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.id("password_conf")).clear();
			driver.findElement(By.id("password_conf")).sendKeys("nainy");
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("7788814476");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method26(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 18 to state 19
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=19, name=state19}}
			driver.findElement(By.id("old_password")).clear();
			driver.findElement(By.id("old_password")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.id("password_conf")).clear();
			driver.findElement(By.id("password_conf")).sendKeys("nainy");
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("7788814476");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method27(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 23 to state 24
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 24 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method28(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 23 to state 24
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 24 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$")); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("table.claroTable.emphaseLine"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method29(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 29 to state 39
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=39, name=state39}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle()); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method30(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
			//From state 86 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 2 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			//From state 29 to state 39
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=39, name=state39}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle()); // original assertion
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("FORM"))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method31(){
		try {
			driver.get(url);

			//From state 0 to state 99
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=99, name=state99}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method32(){
		try {
			driver.get(url);

			//From state 0 to state 86
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=86, name=state86}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","TABLE","#text")))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","DIV", new ArrayList<String>(Arrays.asList("#text","DIV","#text","DIV","#text")))); // generated assertion
			assertTrue(isElementPresent(By.tagName("TABLE"))); // generated assertion
			assertTrue(isElementPatternPresent("DIV","TABLE", new ArrayList<String>(Arrays.asList("#text","THEAD","#text","TBODY","#text")))); // generated assertion
		} catch (Exception e) {
			fail(e.getMessage());
		}
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

	private boolean isElementPatternPresent(String parentTag, String elementTag, ArrayList<String> childrenTags) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(elementTag);

			org.w3c.dom.Element sourceElement = null;
			for (int i = 0; i < nodeList.getLength(); i++){
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);

				String parentTagName = sourceElement.getParentNode().getNodeName();

				ArrayList<String> childrenTagName = new ArrayList<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagName.add(sourceElement.getChildNodes().item(j).getNodeName());

				if (parentTagName.equals(parentTag) && childrenTagName.equals(childrenTags))
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

}	 
