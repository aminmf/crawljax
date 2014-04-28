package com.crawljax.plugins.testsuiteextension.generated.wolfcms_originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDeleteUser {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testDeleteUser() throws Exception {
		driver.get("http://localhost:8888/wolfcms/?/admin");
		assertEquals("Login - Wolf CMS", driver.getTitle());
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		driver.findElement(By.linkText("Users")).click();
		assertEquals("Users | Wolf CMS", driver.getTitle());
		driver.findElement(By.linkText("Users")).click();
		assertEquals("Users | Wolf CMS", driver.getTitle());
		//driver.findElement(By.xpath("//tbody/tr/td/a[text()='Test User One']/../../td/a/img[@title=\"Delete user\"]")).click();
		driver.findElement(By.cssSelector("tr.node:nth-child(2) > td:nth-child(4) > a:nth-child(1) > img:nth-child(1)")).click();
		//assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete Test User One[\\s\\S]$"));
		assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete [\\s\\S]*$"));
 		assertEquals("Users | Wolf CMS", driver.getTitle());
		//assertEquals("User Test User One has been deleted!", driver.findElement(By.xpath("//div[@class='message']")).getText());
		//assertFalse(isElementPresent(By.xpath("//tbody/tr/td/a[text()='Test User One']")));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
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
