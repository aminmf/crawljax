package com.crawljax.plugins.testsuiteextension.casestudies.claroline.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.crawljax.forms.RandomInputValueGenerator;

public class AddNewCategory {
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
  public void testAddNewCategory() throws Exception {
    driver.get(baseUrl + "/claroline-1.11.7/");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("nainy");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("nainy");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Platform administration")).click();
   // driver.findElement(By.linkText("Internal messaging")).click();
    //driver.findElement(By.linkText("All messages from a user")).click();
    driver.findElement(By.linkText("Manage course categories")).click();
    driver.findElement(By.linkText("Create a category")).click();
    driver.findElement(By.id("category_name")).clear();
    driver.findElement(By.id("category_name")).sendKeys("Software Testing");
    driver.findElement(By.id("category_code")).clear();
    
	String RandValue = "RND-" + new RandomInputValueGenerator().getRandomString(4);
	driver.findElement(By.id("category_code")).sendKeys(RandValue);

    //driver.findElement(By.id("category_code")).sendKeys("SWT222");
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
      //assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Category created[\\s\\S]*$"));
    driver.findElement(By.linkText("Logout")).click();
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
