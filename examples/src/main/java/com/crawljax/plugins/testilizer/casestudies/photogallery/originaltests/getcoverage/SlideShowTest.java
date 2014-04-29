package com.crawljax.plugins.testilizer.casestudies.photogallery.originaltests.getcoverage;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

//import org.openqa.selenium.support.ui.Select;

public class SlideShowTest {
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
	public void testSlideShow() throws Exception {
		driver.get("http://localhost:8888/phormer331/?feat=slideshow");
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$"));
		driver.findElement(By.id("ss_playpause_link")).click();
		assertTrue(isElementPresent(By.cssSelector("img#ss_photo")));
		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText());
		driver.findElement(By.linkText("Next")).click();
		assertEquals("2", driver.findElement(By.cssSelector("span#ss_n")).getText());
		driver.findElement(By.linkText("Previous")).click();
		assertEquals("1", driver.findElement(By.cssSelector("span#ss_n")).getText());
		driver.findElement(By.linkText("Smaller Size")).click();
		assertEquals("SlideShow :: My PhotoGallery", driver.getTitle());
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
}
