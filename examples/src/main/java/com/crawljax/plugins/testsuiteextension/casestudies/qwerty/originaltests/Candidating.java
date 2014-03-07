package com.crawljax.plugins.testsuiteextension.casestudies.qwerty.originaltests;

import java.util.Random;
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


public class Candidating {
  private WebDriver driver;
  private WebDriverWait wait;
  private String baseUrl;
  private boolean removedCandidate;
  @Before
  public void setUp() throws Exception {
	driver = Common.driver();
    baseUrl = Common.baseUrl();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, 5);
    removedCandidate = false;
  }
  
  @Test
  public void testCandidating() throws Exception {
	driver.get(baseUrl + "tulemused/V%C3%95RU/isikud");
    
    String name = "Test Kasutaja";
    Random random = new Random();
    name += (char)(random.nextInt(26) + 97);
    
    WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabel")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tabel th")));
    assertThat(table.getText(), not(containsString(name)));
    
    driver.findElement(By.id("sisene")).click();
    WebElement FBbutton = wait.until(ExpectedConditions.elementToBeClickable(By.id("Facebook")));
	FBbutton.click();
	
	Common.insertFacebookCredentials(driver);
	
    driver.findElement(By.linkText("Kandideerimine")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Võru')]")));
    WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
    WebElement displayName = driver.findElement(By.name("displayName"));
    displayName.clear();
    displayName.sendKeys(name);
    new Select(driver.findElement(By.name("party"))).selectByVisibleText("ABC");
    new Select(driver.findElement(By.name("day"))).selectByVisibleText("5");
    new Select(driver.findElement(By.name("month"))).selectByVisibleText("6");
    new Select(driver.findElement(By.name("year"))).selectByVisibleText("1982");
    driver.findElement(By.id("naine")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("blahblah@gmail.com");
    driver.findElement(By.name("info")).clear();
    driver.findElement(By.name("info")).sendKeys("Adsf: asdsf");
    submitButton.click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
    WebElement kandidaadid = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Kandidaadid")));
    kandidaadid.click();
    
    WebElement candidatesDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("candidates")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kandidaadiPildiKast")));
    
    assertThat(driver.getCurrentUrl(), containsString("/kandidaadid"));
    assertThat(candidatesDiv.getText(), containsString(name));
    
    WebElement candidateBox = wait.until(ExpectedConditions.elementToBeClickable(
    		By.xpath("//p[contains(text(),'" + name + "')]/..")));
    candidateBox.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("candidateDetails")));
    assertThat(driver.findElement(By.id("email")).getText(), containsString("blahblah@gmail.com"));
    assertThat(driver.findElement(By.id("party")).getText(), containsString("ABC"));
    assertThat(driver.findElement(By.id("sex")).getText(), containsString("naine"));
    assertThat(driver.findElement(By.id("info")).getText(), containsString("Adsf: asdsf"));
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#candidateDetails .closeBtn"))).click();
    
    driver.get(baseUrl + "tulemused/V%C3%95RU/isikud");
    table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabel")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tabel th")));
    assertThat(table.getText(), containsString(name));
    
    WebElement kandideeri = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Kandideerimine")));
    kandideeri.click();
    submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
    driver.findElement(By.id("tyhista")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
    kandidaadid = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Kandidaadid")));
    kandidaadid.click();
    candidatesDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("candidates")));
    assertThat(candidatesDiv.getText(), not(containsString(name)));
    
    driver.get(baseUrl + "tulemused/V%C3%95RU/isikud");
    table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabel")));
    assertThat(table.getText(), not(containsString(name)));
    
    removedCandidate = true;
  }

	@After
	public void tearDown() throws Exception {
		if (!removedCandidate) {
			driver.get(baseUrl + "kandideeri");
			((JavascriptExecutor) driver)
					.executeScript("$('#tyhista').click()");
			removedCandidate = true;
		}
		//logout
		((JavascriptExecutor) driver).executeScript("$('#sisene').click()");
		driver.quit();
	}

}
