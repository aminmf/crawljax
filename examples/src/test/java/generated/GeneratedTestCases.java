package generated;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Generated @ Thu Jan 02 13:20:13 PST 2014
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
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method1(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1]")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method2(){
		try {
			driver.get(url);

			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL3dhdGVyc21jLmVjZS51YmMuY2E6ODg4OC9jbGFyb2xpbmUtMS4xMS43L2luZGV4LnBocA%3D%3D, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
			//From state 1 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void method3(){
		try {
			driver.get(url);

			//From state 0 to state 4
			//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}}
			driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1]")).click();
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
