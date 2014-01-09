package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests.getcoverage;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

//import org.openqa.selenium.support.ui.Select;

public class HomePageTest {
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
	public void testHomePage() throws Exception {
		driver.get("http://localhost:8888/phormer331/");
		assertTrue(isElementPresent(By.cssSelector("div#Granny")));
		driver.findElement(By.linkText("Stories")).click();
		assertTrue(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"));
		driver.findElement(By.partialLinkText("Default Category")).click();
		assertTrue(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"));
		driver.findElement(By.partialLinkText("Default Story")).click();
		assertTrue(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"));
		driver.findElement(By.linkText("SlideShow")).click();
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$"));
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
}
