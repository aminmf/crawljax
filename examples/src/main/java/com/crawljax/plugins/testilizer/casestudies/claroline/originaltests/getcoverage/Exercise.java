package com.crawljax.plugins.testilizer.casestudies.claroline.originaltests.getcoverage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  //driver = new FirefoxDriver();
	  driver = new FirefoxDriver(getProfile());
	  baseUrl = "http://localhost:8888/";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
  public void testExercise() throws Exception {
    driver.get(baseUrl + "/claroline-1.11.7/");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("nainy");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("nainy");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Platform administration")).click();
    driver.findElement(By.linkText("Configuration")).click();
    driver.findElement(By.linkText("Exercises")).click();
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Properties for Exercises, \\(CLQWZ\\) are now effective on server\\.[\\s\\S]*$"));
      assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Exercises, \\(CLQWZ\\) are now effective on server\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
        //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Automatically insert an event in the calendar at the end date[\\s\\S]*$"));
        assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Automatically insert an event in the calendar at the end date[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("label_exercisesPerPage")).clear();
    driver.findElement(By.id("label_exercisesPerPage")).sendKeys("20");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

  @After
  public void tearDown() throws Exception {
	  ((JavascriptExecutor) driver).executeScript(" if (window.jscoverage_report) {return jscoverage_report('ClarolineOrig');}");
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
