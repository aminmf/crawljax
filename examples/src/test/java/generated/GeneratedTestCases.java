package generated;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Generated @ Mon Dec 16 01:00:54 PST 2013
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
	public void method_method0(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
			//From state 13 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method1(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			//From state 23 to state 24
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=24, name=state24}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			//From state 24 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=24, name=state24}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			//From state 25 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method2(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			//From state 4 to state 7
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=7, name=state7}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
			//From state 7 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method3(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 28
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=28, name=state28}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			//From state 28 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A, element=Element{node=[A: null], tag=A, text=Advanced options, attributes={class=doCollapse, href=#}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.id("course_title")).clear();
			driver.findElement(By.id("course_title")).sendKeys("Computer Science");
			driver.findElement(By.id("course_officialCode")).clear();
			driver.findElement(By.id("course_officialCode")).sendKeys("A7");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A")).click();
			//From state 29 to state 30
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DIV/DL[2]/DD/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=course_status_date, name=course_status_selection, type=radio, value=date}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DIV/DL[2]/DD/INPUT[2]")).click();
			//From state 30 to state 31
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=31, name=state31}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			//From state 31 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=31, name=state31}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method4(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$"));
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
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
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$"));
			//From state 19 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method5(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$"));
			//From state 17 to state 18
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=18, name=state18}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
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
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The information have been modified[\\s\\S]*$"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method6(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			//From state 12 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method7(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			//From state 4 to state 7
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=7, name=state7}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method_method8(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 28
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=28, name=state28}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			//From state 28 to state 29
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A, element=Element{node=[A: null], tag=A, text=Advanced options, attributes={class=doCollapse, href=#}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}}
			driver.findElement(By.id("course_title")).clear();
			driver.findElement(By.id("course_title")).sendKeys("Computer Science");
			driver.findElement(By.id("course_officialCode")).clear();
			driver.findElement(By.id("course_officialCode")).sendKeys("A7");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A")).click();
			//From state 29 to state 30
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DIV/DL[2]/DD/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=course_status_date, name=course_status_selection, type=radio, value=date}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/DIV/DL[2]/DD/INPUT[2]")).click();
			//From state 30 to state 31
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=31, name=state31}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
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
