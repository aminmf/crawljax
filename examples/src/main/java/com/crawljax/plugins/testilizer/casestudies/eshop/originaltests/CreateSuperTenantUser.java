package com.crawljax.plugins.testilizer.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateSuperTenantUser {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://localhost:9443/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateSuperTenantUser() throws Exception {
    driver.get(baseUrl + "/store/");
    driver.findElement(By.id("btn-register")).click();
    driver.findElement(By.id("reg-username")).clear();
    driver.findElement(By.id("reg-username")).sendKeys("supertenantuser");
    driver.findElement(By.id("reg-password")).clear();
    driver.findElement(By.id("reg-password")).sendKeys("supertenantuser");
    driver.findElement(By.id("reg-password2")).clear();
    driver.findElement(By.id("reg-password2")).sendKeys("supertenantuser");
    driver.findElement(By.id("registrationSubmit")).click();
    try {
      assertEquals("supertenantuser", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
