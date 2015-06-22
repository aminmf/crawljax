package com.crawljax.plugins.testilizer.casestudies.cookerybook.originaltests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangePresentationStyleOnRecipeTest {
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
	  public void testChangePresentationStyleOnRecipe() throws Exception {
	    driver.get(baseUrl + "adaptable-cookery-book/");
	    driver.findElement(By.linkText("Recipes")).click();
	    driver.findElement(By.cssSelector("a[href=\"http://localhost:8888/adaptable-cookery-book/recipe/1\"]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'segmented')])[2]")).click();

	    assertEquals(driver.findElements(By.cssSelector("li.active > a.recipe-style[href='#segmented']")).size(), 2);

	      
	    driver.findElement(By.xpath("(//a[contains(text(),'step-by-step')])[2]")).click();

	                   
	    assertEquals(driver.findElements(By.cssSelector("li.active > a.recipe-style[href='#step-by-step']")).size(), 2);

	                                
	    driver.findElement(By.xpath("(//a[contains(text(),'narrative')])[2]")).click();

	                                
	    assertEquals(driver.findElements(By.cssSelector("li.active > a.recipe-style[href='#narrative']")).size(), 2);
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
