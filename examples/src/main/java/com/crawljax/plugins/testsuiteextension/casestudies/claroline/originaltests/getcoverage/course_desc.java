package com.crawljax.plugins.testsuiteextension.casestudies.claroline.originaltests.getcoverage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class course_desc {
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
  public void testCourseDesc() throws Exception {
    driver.get(baseUrl + "/claroline-1.11.7/");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("nainy");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("nainy");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Create a course site")).click();
    driver.findElement(By.id("course_title")).clear();
    driver.findElement(By.id("course_title")).sendKeys("Engineering Graphics");
    driver.findElement(By.id("course_officialCode")).clear();
    driver.findElement(By.id("course_officialCode")).sendKeys("AAOC112");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=mslist2 | label=Sciences]]
    driver.findElement(By.id("access_public")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
        //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]* Access allowed to anybody[\\s\\S]*$"));
        assertTrue(driver.findElement(By.id("courseSettings")).getText().matches("^[\\s\\S]* Access allowed to anybody[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("registration_validation")).click();
    driver.findElement(By.id("registration_validation")).click();
    driver.findElement(By.linkText("Optionnal settings")).click();
    driver.findElement(By.id("course_departmentName")).clear();
    driver.findElement(By.id("course_departmentName")).sendKeys("ECE");
    driver.findElement(By.linkText("Advanced options")).click();
    driver.findElement(By.id("course_userLimit")).clear();
    driver.findElement(By.id("course_userLimit")).sendKeys("60");
    driver.findElement(By.name("changeProperties")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have just created the course website[\\s\\S]*$"));
      assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*You have just created the course website[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
