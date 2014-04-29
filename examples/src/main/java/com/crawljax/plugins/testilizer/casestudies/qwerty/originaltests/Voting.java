package com.crawljax.plugins.testilizer.casestudies.qwerty.originaltests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Voting {

	  private WebDriver driver;
	  private WebDriverWait wait;
	  private String baseUrl;
	  private boolean removedVote;

	  @Before
	  public void setUp() throws Exception {
	    driver = Common.driver();
	    baseUrl = Common.baseUrl();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    wait = new WebDriverWait(driver, 5);
	    removedVote = false;
	  }
	  
	  @Test
	  public void testVoting() throws Exception {
		driver.get(baseUrl + "kandidaadid");
		
		WebElement candidate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Sinine Silm')]/..")));
		candidate.click();
		WebElement voteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("voteBtn")));
		WebElement reasonDisabled = driver.findElement(By.id("reasonDisabled"));
		assertThat(reasonDisabled.getText(), containsString("Te pole süsteemi sisenenud"));
		assertFalse(voteButton.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#candidateDetails .closeBtn"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("candidateDetails")));
		
		driver.findElement(By.id("sisene")).click();
		WebElement FBbutton = wait.until(ExpectedConditions.elementToBeClickable(By.id("Facebook")));
		FBbutton.click();
		
		Common.insertFacebookCredentials(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='sisene' and contains(text(),'Välju')]")));
		candidate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Sinine Silm')]/..")));
		candidate.click();
		voteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("voteBtn")));
		reasonDisabled = driver.findElement(By.id("reasonDisabled"));
		assertThat(reasonDisabled.getText(), containsString("Te valite teises ringkonnas"));
		assertFalse(voteButton.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#candidateDetails .closeBtn"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("candidateDetails")));
		
		candidate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Jõuluvana')]/..")));
		candidate.click();
		voteButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("voteBtn")));
		voteButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("confirmation")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("voted")));
		candidate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Jõuluvana')]/..")));
		candidate.click();
		voteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("voteBtn")));
		reasonDisabled = driver.findElement(By.id("reasonDisabled"));
		assertEquals("true", voteButton.getAttribute("disabled"));
		assertThat(reasonDisabled.getText(), containsString("Olete juba hääletanud"));
		driver.findElement(By.cssSelector("#candidateDetails .closeBtn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cancelLink"))).click();
		removedVote = true;
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmation .closeBtn"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("confirmation")));
		candidate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Jõuluvana')]/..")));
		candidate.click();
		voteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("voteBtn")));
		((JavascriptExecutor) driver).executeScript(
	            "console.log(arguments[0])",voteButton);
		assertTrue(voteButton.isEnabled());
	  }

	  @After
	public void tearDown() throws Exception {
		if (!removedVote) {
			((JavascriptExecutor) driver)
					.executeScript("$('#cancelLink').click()");
			removedVote = true;
		}
		//logout
		((JavascriptExecutor) driver).executeScript("$('#sisene').click()");
		driver.quit();
	}

}
