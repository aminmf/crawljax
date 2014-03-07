package com.crawljax.plugins.testsuiteextension.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.crawljax.forms.RandomInputValueGenerator;

public class TestCreateSnippet {
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
	public void testCreateSnippet() throws Exception {
		driver.get("http://localhost:8081/wolfcms/?/admin");
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Snippets")).click();
		assertEquals("Snippets | Wolf CMS", driver.getTitle());
		assertEquals("Snippet (reorder)", driver.findElement(By.xpath("//div[@id='site-map-def']/div[@class='snippet']")).getText());
		driver.findElement(By.xpath("//div[@id='sidebar']/p/a[text()=' New Snippet']")).click();
		assertEquals("Snippets - Add | Wolf CMS", driver.getTitle());
		
		String RandValue = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		
		driver.findElement(By.id("snippet_name")).clear();
		//driver.findElement(By.id("snippet_name")).sendKeys("Selenium Test Snippet One");
		driver.findElement(By.id("snippet_name")).sendKeys(RandValue);
		
		driver.findElement(By.id("snippet_content")).clear();
		driver.findElement(By.id("snippet_content")).sendKeys("Just a Selenium test snippet.");
		driver.findElement(By.name("commit")).click();
		assertEquals("Snippets | Wolf CMS", driver.getTitle());
		//assertEquals("Selenium Test Snippet One", driver.findElement(By.xpath("//ul[@id='snippets']/li/a[text()='Selenium Test Snippet One']")).getText());
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
