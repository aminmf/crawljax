package com.crawljax.plugins.testsuiteextension.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestModifyUserEmail {
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
	public void testModifyUserEmail() throws Exception {
		driver.get("http://localhost:8081/wolfcms/?/admin");
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Users")).click();
		assertEquals("Users | Wolf CMS", driver.getTitle());
		driver.findElement(By.partialLinkText("RND")).click();
		assertEquals("Users - Edit | Wolf CMS", driver.getTitle());
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("test1@example.com");
		driver.findElement(By.name("commit")).click();
		assertEquals("Users | Wolf CMS", driver.getTitle());
		assertEquals("User has been saved!", driver.findElement(By.xpath("//div[@class='message']")).getText());
		assertTrue(isElementPresent(By.xpath("//div[text()='User has been saved!']")));
		//assertEquals("test1@example.com", driver.findElement(By.xpath("//tbody/tr/td/a[text()='Test User One']/../../td[2]")).getText());
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
