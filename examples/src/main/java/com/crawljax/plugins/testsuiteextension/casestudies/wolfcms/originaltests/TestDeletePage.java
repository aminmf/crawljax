package com.crawljax.plugins.testsuiteextension.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDeletePage {
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
	public void testDeletePage() throws Exception {
		driver.get("http://localhost:8888/wolfcms/?/admin");
		assertEquals("Login - Wolf CMS", driver.getTitle());
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Pages")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		//assertEquals("Selenium test page", driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a[span='Selenium test page']")).getText());
		
		assertTrue(driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a/span")).getText()!="");
		
		//assertTrue(driver.findElement(By.cssSelector("#page_11 > span:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).getText()!="");	
		
		//driver.findElement(By.xpath("//ul[@id='site-map']/li/span/div/span/a[span='Selenium test page']/../../../div[@class='modify']/a[@class='remove']")).click();
		
		driver.findElement(By.cssSelector("img[alt='Remove page']")).click();

		//assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete [\\s\\S] and its underlying pages[\\s\\S]$"));
		assertTrue(closeAlertAndGetItsText().contains("Are you sure you wish to delete"));
		//Thread.sleep(500);
		//assertEquals("Page Selenium test page has been deleted!", driver.findElement(By.xpath("//div[@class='message']")).getText());
		//assertTrue(isElementPresent(By.xpath("//div[@class='message' and text()='Page Selenium test page has been deleted!']")));
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		//assertFalse(isElementPresent(By.xpath("//ul[@id='site-map']/li/span/div/span/a[span='Selenium test page']")));
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
