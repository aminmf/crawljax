package com.crawljax.plugins.testsuiteextension.generated.wolfcms;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.crawljax.forms.RandomInputValueGenerator;

public class GeneratedTestCase0 {
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
	public void testTestCreatePage() throws Exception {
		driver.get("http://localhost:8888/wolfcms/?/admin");
		assertEquals("Login - Wolf CMS", driver.getTitle());
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		assertTrue(driver.findElement(By.xpath("//div[@id='footer']/p")).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"));
		driver.findElement(By.xpath("//div[@class='page']/span/a/span[text()='Home Page']/../../../../div[@class=\"modify\"]/a/img[@title='Add child']")).click();
		assertEquals("Pages - Add | Wolf CMS", driver.getTitle());
		driver.findElement(By.id("page_title")).clear();
		//driver.findElement(By.id("page_title")).sendKeys("Selenium test page");

		String RandValue = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("page_title")).sendKeys(RandValue);

		driver.findElement(By.id("part_0_content")).clear();
		driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.");
		driver.findElement(By.cssSelector("#page_status_id > option:nth-child(3)")).click();
		driver.findElement(By.linkText("Metadata")).click();
		//assertEquals("selenium-test-page", driver.findElement(By.id("page_slug")).getText());
		driver.findElement(By.name("commit")).click();
		Thread.sleep(500);
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		//assertEquals("Selenium test page", driver.findElement(By.xpath("//a[@class='edit-link']/span[text()='Selenium test page']")).getText());
		
		//assertEquals(RandValue, driver.findElement(By.xpath("//a[@class='edit-link']/span[text()='" + RandValue + "']")).getText());
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
