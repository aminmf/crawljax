package com.crawljax.plugins.testsuiteextension.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDeleteSnippet {
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
	public void testDeleteSnippet() throws Exception {
		driver.get("http://localhost:8888/wolfcms/?/admin");
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Snippets")).click();
		assertEquals("Snippets | Wolf CMS", driver.getTitle());
		//driver.findElement(By.xpath("//ul[@id='snippets']/li[a='Selenium Test Snippet One']/div[@class='remove']/a")).click();
		driver.findElement(By.xpath("//ul[@id='snippets']/li[3]/div[@class='remove']/a")).click();
		//driver.findElement(By.cssSelector("#snippet_3 > div:nth-child(4) > a:nth-child(1)")).click();
		assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete[\\s\\S]*$"));
		assertEquals("Snippets | Wolf CMS", driver.getTitle());
		//assertFalse(isElementPresent(By.xpath("//ul[@id='snippets']/li/a[text()='Selenium Test Snippet One']")));
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
