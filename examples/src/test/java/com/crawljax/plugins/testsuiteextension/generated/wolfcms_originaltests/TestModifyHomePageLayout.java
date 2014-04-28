package com.crawljax.plugins.testsuiteextension.generated.wolfcms_originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestModifyHomePageLayout {
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
	public void testModifyHomePageLayout() throws Exception {
	    driver.get("http://localhost:8888/wolfcms/?/admin");
	    assertEquals("Login - Wolf CMS", driver.getTitle());
	    driver.findElement(By.id("login-username")).clear();
	    driver.findElement(By.id("login-username")).sendKeys("admin");
	    driver.findElement(By.id("login-password")).clear();
	    driver.findElement(By.id("login-password")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		driver.findElement(By.xpath("//div[@class='page']/span/a/span[text()='Home Page']")).click();
		assertEquals("Pages - Edit - Home Page | Wolf CMS", driver.getTitle());
		driver.findElement(By.linkText("Metadata")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.cssSelector("#page_layout_id > option:nth-child(3)")).click();
		driver.findElement(By.name("commit")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
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
