package com.crawljax.plugins.testilizer.casestudies.cookerybook.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BreadcrumbsCorrectlyFormedTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8888/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBreadcrumbsCorrectlyFormed() throws Exception {
    driver.get(baseUrl + "adaptable-cookery-book/");
    driver.findElement(By.linkText("Recipes")).click();
    try {
      assertEquals("Home /", driver.findElement(By.linkText("Home /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Recipes /", driver.findElement(By.linkText("Recipes /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("a[href=\"http://localhost:8888/adaptable-cookery-book/recipe/6\"]")).click();
    try {
      assertEquals("Home /", driver.findElement(By.linkText("Home /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Recipes /", driver.findElement(By.linkText("Recipes /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Recipe: Vanilla Slice /", driver.findElement(By.linkText("Recipe: Vanilla Slice /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Courses")).click();
    try {
      assertEquals("Home /", driver.findElement(By.linkText("Home /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Courses /", driver.findElement(By.linkText("Courses /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("a[href=\"http://localhost:8888/adaptable-cookery-book/course/dessert\"]")).click();
    try {
      assertEquals("Home /", driver.findElement(By.linkText("Home /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Courses /", driver.findElement(By.linkText("Courses /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Course: Dessert /", driver.findElement(By.linkText("Course: Dessert /")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Courses")).click();
    assertEquals("Courses Available", driver.getTitle());
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
