package com.crawljax.plugins.testilizer.casestudies.claroline.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc3 {

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
	public void testTc3() throws Exception {
		driver.get(baseUrl + "/claroline-1.11.7/index.php");
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "clear", "").clear();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "sendKeys", "nainy").sendKeys("nainy");
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "clear", "").clear();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "sendKeys", "nainy").sendKeys("nainy");
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("button[type=\"submit\"]"))), "click", "").click();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Show/Hide"))), "click", "").click();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
		assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.content.collapsible-wrapper"))).getText().matches("^[\\s\\S]*textzone_top\\.authenticated\\.inc\\.html[\\s\\S]*$"));
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.content.collapsible-wrapper\")).getText().matches(\"^[\\\\s\\\\S]*textzone_top\\\\.authenticated\\\\.inc\\\\.html[\\\\s\\\\S]*$\"))");
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("View all my messages"))), "click", "").click();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
		assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.toolTitleBlock"))).getText().equals("MY MESSAGES"));
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.toolTitleBlock\")).getText().equals(\"MY MESSAGES\"))");
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
		com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Logout"))), "click", "").click();
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
}
