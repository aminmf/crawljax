package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewAsset {
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
  public void testAddNewAsset() throws Exception {
    driver.get(baseUrl + "/publisher/assets/gadget/");
    driver.findElement(By.linkText("Add gadget")).click();
    driver.findElement(By.id("overview_name")).clear();
    driver.findElement(By.id("overview_name")).sendKeys("userAddedAsset");
    driver.findElement(By.id("overview_version")).clear();
    driver.findElement(By.id("overview_version")).sendKeys("1.2.3");
    driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span")).click();
    driver.findElement(By.id("overview_url")).clear();
    driver.findElement(By.id("overview_url")).sendKeys("http://example.com/gadget.xml");
    driver.findElement(By.id("overview_description")).clear();
    driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1");
    driver.findElement(By.id("images_thumbnail")).clear();
    driver.findElement(By.id("images_thumbnail")).sendKeys("~/Pictures/thumbnail.jpg");
    driver.findElement(By.id("images_banner")).clear();
    driver.findElement(By.id("images_banner")).sendKeys("~/Pictures/banner.jpg");
    driver.findElement(By.id("token-input-tag-container")).sendKeys("wso2,");
    driver.findElement(By.id("btn-create-asset")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (!driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
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
