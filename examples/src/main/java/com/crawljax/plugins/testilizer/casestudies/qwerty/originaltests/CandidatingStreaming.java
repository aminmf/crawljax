package com.crawljax.plugins.testilizer.casestudies.qwerty.originaltests;

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

public class CandidatingStreaming {
  private WebDriver candidating;
  private WebDriver streaming;
  private WebDriverWait candidatingWait;
  private WebDriverWait streamingWait;
  private String baseUrl;
  private boolean removedCandidate;
  
  @Before
  public void setUp() throws Exception {
	candidating = Common.driver();
	streaming = Common.driver();
    baseUrl = Common.baseUrl();
    candidating.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    streaming.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    candidatingWait = new WebDriverWait(candidating, 5);
    streamingWait = new WebDriverWait(streaming, 5);
    removedCandidate = false;
  }
  
  @Test
  public void testCandidating() throws Exception {
	streaming.get(baseUrl + "tulemused/V%C3%95RU/isikud");
	candidating.get(baseUrl + "kandideeri");
    
    String name = "Test Kasutaja";
    Random random = new Random();
    name += (char)(random.nextInt(26) + 97);
    
    WebElement table = streamingWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabel")));
    streamingWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tabel th")));
    assertThat(table.getText(), not(containsString(name)));
    
    candidating.findElement(By.id("sisene")).click();
    WebElement FBbutton = candidatingWait.until(ExpectedConditions.elementToBeClickable(By.id("Facebook")));
	FBbutton.click();
	
	Common.insertFacebookCredentials(candidating);
	
	candidatingWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Võru')]")));
    WebElement submitButton = candidatingWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
    WebElement displayName = candidating.findElement(By.name("displayName"));
    displayName.clear();
    displayName.sendKeys(name);
    new Select(candidating.findElement(By.name("party"))).selectByVisibleText("ABC");
    new Select(candidating.findElement(By.name("day"))).selectByVisibleText("5");
    new Select(candidating.findElement(By.name("month"))).selectByVisibleText("6");
    new Select(candidating.findElement(By.name("year"))).selectByVisibleText("1982");
    candidating.findElement(By.id("naine")).click();
    candidating.findElement(By.name("email")).clear();
    candidating.findElement(By.name("email")).sendKeys("blahblah@gmail.com");
    candidating.findElement(By.name("info")).clear();
    candidating.findElement(By.name("info")).sendKeys("Adsf: asdsf");
    submitButton.click();
    
    candidatingWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
    
    Thread.sleep(2000);
    table = streaming.findElement(By.id("tabel"));
    assertThat(table.getText(), containsString(name));
    
    candidating.findElement(By.id("tyhista")).click();
    WebElement confirmation = candidatingWait.until(ExpectedConditions.visibilityOfElementLocated(
    		By.id("confirmation")));
    assertThat(confirmation.getText(), containsString("Olete edukalt kandidatuuri tühistanud"));
    candidatingWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
    
    Thread.sleep(2000);
    table = streaming.findElement(By.id("tabel"));
    assertThat(table.getText(), not(containsString(name)));
    removedCandidate = true;
  }

	@After
	public void tearDown() throws Exception {
		if(!removedCandidate){
			((JavascriptExecutor) candidating).executeScript(
					"$('#tyhista').click()");
			removedCandidate = true;
		}
		//logout
		((JavascriptExecutor) candidating).executeScript("$('#sisene').click()");
		candidating.quit();
		streaming.quit();
	}

}
