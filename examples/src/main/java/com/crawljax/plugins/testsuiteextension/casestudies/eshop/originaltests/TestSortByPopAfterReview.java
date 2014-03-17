package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSortByPopAfterReview {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:9763/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSortByPopAfterReview() throws Exception {
    driver.get(baseUrl + "/store/assets/gadget");
    driver.findElement(By.xpath("((//div[@class='span3 asset'])[8])//a")).click();
    String populerAsset = driver.getCurrentUrl();
    driver.findElement(By.linkText("User Reviews")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForFrameToLoad | id=socialIfr | ]]
    driver.findElement(By.id("com-body")).clear();
    driver.findElement(By.id("com-body")).sendKeys("my test rating with 5 stars");
    driver.findElement(By.linkText("5")).click();
    driver.findElement(By.id("btn-post")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector(".com-review"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.get(baseUrl + "/store/assets/gadget");
    driver.findElement(By.cssSelector("i.icon-star")).click();
    driver.findElement(By.xpath("((//div[@class='span3 asset'])[1])//a")).click();
    assertEquals(populerAsset, driver.getCurrentUrl());
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
