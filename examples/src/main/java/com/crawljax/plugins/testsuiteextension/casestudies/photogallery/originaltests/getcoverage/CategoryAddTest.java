package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests.getcoverage;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CategoryAddTest {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
	    driver = new FirefoxDriver(getProfile());
		baseUrl = "http://localhost:8888";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    js = (JavascriptExecutor) driver;    
	}

	  public static FirefoxProfile getProfile() {
	      FirefoxProfile profile = new FirefoxProfile();

	      profile.setPreference("network.proxy.http", "localhost");
	      profile.setPreference("network.proxy.http_port", 3128);
	      profile.setPreference("network.proxy.type", 1);
	      /* use proxy for everything, including localhost */
	      profile.setPreference("network.proxy.no_proxies_on", "");

	      return profile;
	}

	@Test
	public void testAddCategory() throws Exception {
		driver.get(baseUrl + "/phormer331/");
		driver.findElement(By.linkText("Admin Page")).click();
		driver.findElement(By.id("loginAdminPass")).clear();
		driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
		driver.findElement(By.cssSelector("input.submit")).click();
		driver.findElement(By.linkText("Manage Categories")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("flowers");
		driver.findElement(By.name("desc")).clear();
		driver.findElement(By.name("desc")).sendKeys("contains photos of all the flowers !");
		driver.findElement(By.id("listRadioNo")).click();
		driver.findElement(By.id("listRadioYe")).click();
		driver.findElement(By.cssSelector("input.submit")).click();
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$"));
	}

	@After
	public void tearDown() throws Exception {
		((JavascriptExecutor) driver).executeScript(" if (window.jscoverage_report) {return jscoverage_report('PhormerOrigTestReport');}");

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
