package com.crawljax.plugins.testilizer.casestudies.cookerybook.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangePresentationStyleGloballyTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8888/";
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
  }

  @Test
  public void testChangePresentationStyleGlobally() throws Exception {
    driver.get(baseUrl + "adaptable-cookery-book/");
    //driver.findElement(By.linkText("segmented")).click();
    driver.findElement(By.linkText("Recipes")).click();
    driver.findElement(By.cssSelector("div.grid-recipes:nth-child(1) > a:nth-child(1)")).click();
      
    //assertEquals(driver.findElements(By.cssSelector("div.single-recipe li.active > a.recipe-style[href='#segmented']")).size(), 1);
    
    driver.get("http://localhost:8888/adaptable-cookery-book/recipes");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    //driver.findElement(By.xpath("//a[@href='#step-by-step']")).click();
    driver.findElement(By.linkText("step-by-step")).click();
    
    driver.findElement(By.cssSelector("div.grid-recipes:nth-child(2) > a:nth-child(1)")).click();

    assertEquals(driver.findElements(By.cssSelector(".nav-tabs > li:nth-child(3) > a:nth-child(1)")).size(), 1);

    driver.get("http://localhost:8888/adaptable-cookery-book/recipes");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.linkText("narrative")).click();
    driver.findElement(By.cssSelector("a[href=\"http://localhost:8888/adaptable-cookery-book/recipe/4\"]")).click();

    assertEquals(driver.findElements(By.cssSelector(".nav-tabs > li:nth-child(1) > a:nth-child(1)")).size(), 1);

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
