package com.crawljax.plugins.testilizer.casestudies.wolfcms.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestModifyPage {
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
	public void testModifyPage() throws Exception {
		driver.get("http://localhost:8888/wolfcms/?/admin");
		assertEquals("Login - Wolf CMS", driver.getTitle());
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Pages")).click();
		assertEquals("Pages | Wolf CMS", driver.getTitle());
		driver.findElement(By.xpath("//a[@class='edit-link']/span[1]")).click();
		//assertEquals("Pages - Edit - Selenium test page | Wolf CMS", driver.getTitle());
		driver.findElement(By.id("part_0_content")).clear();
		driver.findElement(By.id("part_0_content")).sendKeys("Just a selenium test page.\n\n<?php Page::includeSnippet('Selenium Test Snippet One'); ?>");
		driver.findElement(By.cssSelector("#page_status_id > option:nth-child(3)")).click();
		driver.findElement(By.linkText("Metadata")).click();
		//assertEquals("selenium-test-page", driver.findElement(By.id("page_slug")).getValue());
		driver.findElement(By.name("commit")).click();
		assertEquals("Page has been saved!", driver.findElement(By.xpath("//div[@class='message']")).getText());
		assertTrue(isElementPresent(By.xpath("//div[@class='message' and text()='Page has been saved!']")));
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
