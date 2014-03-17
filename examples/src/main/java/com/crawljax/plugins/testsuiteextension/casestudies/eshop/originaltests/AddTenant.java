package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddTenant {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://localhost:9443";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAddTenant() throws Exception {
    driver.findElement(By.cssSelector("#menu-panel-button3")).click();
    driver.findElement(By.linkText("Add New Tenant")).click();
    driver.findElement(By.id("domain")).clear();
    driver.findElement(By.id("domain")).sendKeys("mytestdomain.com");
    driver.findElement(By.id("admin-firstname")).clear();
    driver.findElement(By.id("admin-firstname")).sendKeys("testAdminFirstName");
    driver.findElement(By.id("admin-lastname")).clear();
    driver.findElement(By.id("admin-lastname")).sendKeys("testAdminLastName");
    driver.findElement(By.id("admin")).clear();
    driver.findElement(By.id("admin")).sendKeys("tenantAdmin");
    driver.findElement(By.id("admin-password")).clear();
    driver.findElement(By.id("admin-password")).sendKeys("admin1234");
    driver.findElement(By.id("admin-password-repeat")).clear();
    driver.findElement(By.id("admin-password-repeat")).sendKeys("admin1234");
    driver.findElement(By.id("admin-email")).clear();
    driver.findElement(By.id("admin-email")).sendKeys("tenantadminmail@mytestdomain.com");
    driver.findElement(By.cssSelector("input.button")).click();
    assertEquals("You have registered the Organization Successfully", driver.findElement(By.cssSelector("#messagebox-info")).getText());
    driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
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
