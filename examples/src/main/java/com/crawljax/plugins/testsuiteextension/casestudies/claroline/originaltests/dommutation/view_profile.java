package com.crawljax.plugins.testsuiteextension.casestudies.claroline.originaltests.dommutation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class view_profile {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8888/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testViewProfile() throws Exception {
		driver.get(baseUrl + "/claroline-1.11.7/index.php");
		mutateDOMTree();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		mutateDOMTree();
		driver.findElement(By.linkText("Platform administration")).click();
		mutateDOMTree();
		driver.findElement(By.linkText("Right profile list")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Course member \\(the user is actually enrolled in the course\\)[\\s\\S]*$"));
		driver.findElement(By.xpath("(//img[@alt='Edit'])[6]")).click();
		assertEquals("Claroline", driver.getTitle());
		driver.findElement(By.cssSelector("a > span")).click();
		driver.findElement(By.cssSelector("a > span")).click();
		driver.findElement(By.cssSelector("a > span")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Access allowed[\\s\\S]*$"));
		driver.findElement(By.linkText("View all right profile")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.cssSelector("table.claroTable.emphaseLine")).getText().matches("^[\\s\\S]*Edition allowed[\\s\\S]*$"));
		driver.findElement(By.linkText("Logout")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();

	}

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
	private void mutateDOMTree(){
		// execute JavaScript code to mutate DOM
		String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode();
		if (code!= null){
			try{
				((JavascriptExecutor)driver).executeScript(code);
			}catch (Exception e) {
				System.out.println("Could not execute script");
			}
			
		}
	}
}
