package com.crawljax.plugins.testsuiteextension.generated.photogallery_originaltests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrigTestCase5 {
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
		driver.findElement(By.cssSelector("div.aThumb:nth-child(5) > center:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.partialLinkText("Hide")).click();
		if(!(driver.findElement(By.id("photoBoxes")).isDisplayed() == false)){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.partialLinkText("Show")).click();
		if(!(driver.findElement(By.id("photoBoxes")).isDisplayed())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		WebElement select = driver.findElement(By.id("rateSelect"));
		int rating = Integer.parseInt(select.getAttribute("value"));
		int nextRating = rating % 5 + 2;
		//System.out.println(nextRating);
		String cssSelector = "#rateSelect > option:nth-child(" + Integer.toString(nextRating) + ")";
		driver.findElement(By.cssSelector(cssSelector)).click();
		//if(!helper.equals("Saving your rate", driver.findElement(By.cssSelector("#rateStatus")).getText());
		Thread.sleep(3000);
		if(!helper.equals("Your rating saved!", driver.findElement(By.cssSelector("span#rateStatus")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
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
