package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PromoteToInReviewTenant {
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
  public void testPromoteToInReviewTenant() throws Exception {
    driver.get(baseUrl + "/publisher/assets/gadget/");
    driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
    driver.findElement(By.linkText("Life Cycle")).click();
    driver.findElement(By.id("In-Review")).click();
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='lc-history']//tr"));
	WebElement val = rows.get(0).findElement(By.xpath("./td[2]"));
	System.out.println(val.getText());
	assertEquals(val.getText(), "tenantUser changed the asset from Created to In-Review");
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
