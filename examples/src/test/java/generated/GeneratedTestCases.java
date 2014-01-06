package generated;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Generated @ Mon Jan 06 13:55:50 PST 2014
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

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 37 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 37 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method2(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 37 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method3(){
		try {
			driver.get(url);

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 4 to state 5
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=5, name=state5}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 5 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method4(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 17 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 17 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method6(){
		try {
			driver.get(url);

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 17 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method7(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 4 to state 5
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=5, name=state5}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 5 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method8(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 3
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Manage course categories, attributes={href=admin_category.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=3, name=state3}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[2]/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 3 to state 4
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a category, attributes={href=/claroline-1.11.7/claroline/admin/admin_category.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/category_new.png?1315407288); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 4 to state 5
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=5, name=state5}}
			driver.findElement(By.id("category_name")).clear();
			driver.findElement(By.id("category_name")).sendKeys("Software Testing");
			driver.findElement(By.id("category_code")).clear();
			driver.findElement(By.id("category_code")).sendKeys("SWT22");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/INPUT[3]")).click();
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 5 to state 6
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method9(){
		try {
			driver.get(url);

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method10(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method11(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 15
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A, element=Element{node=[A: null], tag=A, text=Manage classes, attributes={href=admin_class.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=15, name=state15}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[6]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 15 to state 16
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a new class, attributes={href=/claroline-1.11.7/claroline/admin/admin_class.php?cmd=rqAdd, style=background-image: url(/claroline-1.11.7/web/img/class.png?1232379976); background-repeat: no-repeat; background-position: left center; padding-left: 20px;}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/TABLE/TBODY/TR/TD[2]/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 16 to state 17
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value= Ok }}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}}
			driver.findElement(By.name("class_name")).clear();
			driver.findElement(By.name("class_name")).sendKeys("EG");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/FORM/TABLE/TBODY/TR[2]/TD[2]/INPUT")).click();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*The new class has been created[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method12(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 20 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 23 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method13(){
		try {
			driver.get(url);

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 9
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=9, name=state9}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 9 to state 10
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=10, name=state10}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 10 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}}
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method14(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 9
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=9, name=state9}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 9 to state 10
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=10, name=state10}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 10 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}}
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 9
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Claroline.net news, attributes={href=clarolinenews.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=9, name=state9}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[5]/UL/LI[3]/A")).click();
			assertTrue(driver.findElement(By.cssSelector("div.toolTitleBlock")).getText().matches("^[\\s\\S]*CLAROLINE\\.NET NEWS[\\s\\S]*$"));
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 9 to state 10
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A, element=Element{node=[A: null], tag=A, text=Manage my account, attributes={href=/claroline-1.11.7/claroline/auth/profile.php, target=_top}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=10, name=state10}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[2]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 10 to state 11
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}}
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
			//From state 11 to state 12
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method16(){
		try {
			driver.get(url);

			//From state 0 to state 25
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 25 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
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
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method18(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 13 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=13, name=state13}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 2 to state 27
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=Create user, attributes={href=adminaddnewuser.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=27, name=state27}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/UL/LI[4]/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 27 to state 37
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={id=applyChange, name=applyChange, type=submit, value=Ok}}, source=StateVertexImpl{id=27, name=state27}, target=StateVertexImpl{id=37, name=state37}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertEquals("Create a new user - Claroline", driver.getTitle());
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method19(){
		try {
			driver.get(url);

			//From state 0 to state 13
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=13, name=state13}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method20(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			//From state 1 to state 20
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=20, name=state20}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			//From state 20 to state 23
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=23, name=state23}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			assertTrue(isElementPresent(By.tagName("DIV")));
			assertTrue(isElementPresent(By.cssSelector("div.toolTitleBlock")));
			assertTrue(isElementPresent(By.cssSelector("div.claroDialogBox.boxSuccess")));
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
