package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddLoginPermissionToStoreRole {
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
  public void testAddLoginPermissionToStoreRole() throws Exception {
    driver.get(baseUrl + "admin/t/mytestdomain.com/carbon/role/add-step1.jsp?roleType=Internal");
    driver.findElement(By.cssSelector("#menu-panel-button3 > span")).click();
    driver.findElement(By.linkText("Users and Roles")).click();
    driver.findElement(By.linkText("Roles")).click();
    driver.findElement(By.linkText("Add New Internal Role")).click();
    driver.findElement(By.name("roleName")).clear();
    driver.findElement(By.name("roleName")).sendKeys("store");
    driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
    driver.findElement(By.xpath("//span[contains(text(),\"Login\")]/../..//td[last()-1]/div")).click();
    driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
    driver.findElement(By.xpath("//input[@value=\"tenantUser\"]")).click();
    driver.findElement(By.xpath("//input[@value=\"Finish\"]")).click();
    assertEquals("Role store is added successfully.", driver.findElement(By.cssSelector("#messagebox-info")).getText());
    driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
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
