package com.crawljax.plugins.testilizer.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.crawljax.forms.RandomInputValueGenerator;

public class testCreateUser {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testTestCreateUser() throws Exception {
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
		driver.findElement(By.xpath("//div[@id='sidebar']/p/a[text()=' New User']")).click();
		assertEquals("Users - Add | Wolf CMS", driver.getTitle());
		driver.findElement(By.id("user_name")).clear();
		//driver.findElement(By.id("user_name")).sendKeys("Test User One");
		
		String RandValue = "RNDUser" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("user_name")).sendKeys(RandValue);

	
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys(RandValue+"@example.com");
		driver.findElement(By.id("user_username")).clear();
		//driver.findElement(By.id("user_username")).sendKeys("testUser1");

		driver.findElement(By.id("user_username")).sendKeys(RandValue);
		
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("pswpsw");
		driver.findElement(By.id("user_confirm")).clear();
		driver.findElement(By.id("user_confirm")).sendKeys("pswpsw");
		driver.findElement(By.id("user_role-editor")).click();
		driver.findElement(By.name("commit")).click();
		assertEquals("Users | Wolf CMS", driver.getTitle());
		Thread.sleep(500);
		assertTrue(isElementPresent(By.xpath("//div[text()='User has been added!']")));
		//assertEquals("testUser1", driver.findElement(By.xpath("//tbody/tr/td/a[text()='Test User One']/../small")).getText());

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
