package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests.getcoverage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class TC2 {
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
	public void testTc2() throws Exception {
		driver.get(baseUrl + "/phormer331/?c=1");
		driver.findElement(By.linkText("Default Category")).click();
		driver.findElement(By.linkText("Phormer 3.31")).click();
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*MySQL[\\s\\S]*$"));
	}

	@After
	public void tearDown() throws Exception {
		((JavascriptExecutor) driver).executeScript(" if (window.jscoverage_report) {return jscoverage_report('report');}");

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
