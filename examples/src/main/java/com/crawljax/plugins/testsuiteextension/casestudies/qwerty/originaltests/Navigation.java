package com.crawljax.plugins.testsuiteextension.casestudies.qwerty.originaltests;

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

public class Navigation {
	private WebDriver driver;
	private WebDriverWait wait;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = Common.driver();
		baseUrl = Common.baseUrl();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
	}

	@Test
	public void testNavigation() throws Exception {
		driver.get(baseUrl);

		WebElement table = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("tabel")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tabel th")));
		assertThat(driver.getCurrentUrl(),
				containsString("/tulemused/kogu_riik/erakonnad"));
		assertThat(table.getText(), containsString("Kohukesed"));

		new Select(driver.findElement(By.id("piirkond")))
				.selectByVisibleText("Haabersti, Kristiine, Põhja-Tallinn");
		new Select(driver.findElement(By.id("objekt")))
				.selectByVisibleText("Isikute kaupa");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//td[contains(text(),'Kite Kat')]")));
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[contains(text(),'Näita kaardil')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("googleMap")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mapLegend")));

		wait.until(ExpectedConditions.elementToBeClickable(
				By.linkText("Kandidaadid"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h1[contains(text(),'Haabersti, Kristiine, Põhja-Tallinn')]")));
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.linkText("Abi"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h1[contains(text(),'Korduma kippuvad küsimused')]")));

		wait.until(ExpectedConditions.elementToBeClickable(
				By.linkText("Kandideerimine"))).click();
		WebElement sisene = driver.findElement(By.id("sisene"));
		assertThat(sisene.getText(), containsString("Sisene"));
		WebElement notLoggedIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("notLoggedIn")));
		assertThat(notLoggedIn.getText(),
				containsString("Te pole süsteemi sisenenud ning ei saa seetõttu kandideerida."));
		sisene.click();
		WebElement FBbutton = wait.until(ExpectedConditions
				.elementToBeClickable(By.id("Facebook")));
		FBbutton.click();

		Common.insertFacebookCredentials(driver);
		
		sisene = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@id='sisene' and contains(text(),'Välju')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		assertFalse(notLoggedIn.isDisplayed());
		
		sisene.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("submit")));
		assertTrue(notLoggedIn.isDisplayed());
	}

	@After
	public void tearDown() throws Exception {
		((JavascriptExecutor) driver).executeScript("$('#sisene').click()");
		driver.quit();
	}
}
