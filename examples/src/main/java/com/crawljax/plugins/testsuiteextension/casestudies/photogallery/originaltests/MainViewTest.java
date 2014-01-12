package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainViewTest {
	private WebDriver driver;
	// private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testMainView() throws Exception {
		driver.get("http://localhost:8888/phormer331/");
		driver.findElement(By.partialLinkText("Default Category")).click();
		assertTrue(driver.findElement(By.cssSelector("a.theTitleA")).getText().matches("^[\\s\\S]*Default Category[\\s\\S]*$"));
		driver.findElement(By.cssSelector("div.aThumb:nth-child(1) > center:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.bcell:nth-child(7) > form:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(7) > td:nth-child(1) > input:nth-child(2)")).click();
		//assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed() == false);
		//driver.findElement(By.linkText("Show info")).click();
		//assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed());
		WebElement select = driver.findElement(By.id("rateSelect"));
		int rating = Integer.parseInt(select.getAttribute("value"));
		int nextRating = rating % 5 + 1;
		System.out.println(nextRating);
		List<WebElement> allOptions = select.findElements(By.tagName("option"));
		for (WebElement option : allOptions) {
			if (Integer.parseInt(option.getAttribute("value")) == nextRating) {
				option.click();
				break;
			}
		}
		Thread.sleep(3000);
		assertEquals("Your rating saved!", driver.findElement(By.cssSelector("span#rateStatus")).getText());
		driver.findElement(By.xpath("//div[@id='Granny']/div[5]/div[2]/center/a/img")).click();
		assertTrue(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*p=2$"));
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
}
