package com.crawljax.plugins.testilizer.casestudies.qwerty.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CandidateSearch {
  private WebDriver driver;
  //private WebDriverWait wait;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
	driver = Common.driver();
    baseUrl = Common.baseUrl();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //wait = new WebDriverWait(driver, 5);
  }
  
  @Test
  public void testCandidateSearch() throws Exception {
	  //wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	  
	  driver.get(baseUrl + "kandidaadid");
		 //.sendKeys("admin");

	  WebElement candidatesDiv =  driver.findElement(By.id("candidates"));
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Onu Heino')]")));
	  
	  driver.findElement(By.id("nimi")).clear();
	  driver.findElement(By.id("nimi")).sendKeys("li");
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(text(),'Onu Heino')]")));
	  
	  assertThat(driver.getCurrentUrl(), containsString("/kandidaadid/kogu_riik/erakonnata/li"));
	  assertThat(candidatesDiv.getText(), containsString("Linnar Lind"));
	  assertThat(candidatesDiv.getText(), containsString("Liine Näri"));
	  
	  new Select(driver.findElement(By.id("erakond"))).selectByVisibleText("ABC");
	  new Select(driver.findElement(By.id("ringkond"))).selectByVisibleText("Haabersti, Kristiine, Põhja-Tallinn");
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(text(),'Liine Näri')]")));
	  
	  assertThat(driver.getCurrentUrl(), containsString("/kandidaadid/HAAB/ABC/li"));
	  assertThat(candidatesDiv.getText(), containsString("Linnar Lind"));
	  
	  driver.get(baseUrl + "kandidaadid/V%C3%95RU/%C3%9CPE/j%C3%B5");
	  // candidatesDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("candidates")));
	  candidatesDiv = driver.findElement(By.id("candidates"));
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Jõuluvana')]")));
	  assertThat(candidatesDiv.getText(), not(containsString("Linnar Lind")));
  }
  

  @After
  public void tearDown() throws Exception {
	driver.quit();
  }
}
