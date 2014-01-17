package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests.dommutation;

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
		driver.findElement(By.cssSelector("div.aThumb:nth-child(5) > center:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.partialLinkText("Hide")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed() == false);
		driver.findElement(By.partialLinkText("Show")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed());
		WebElement select = driver.findElement(By.id("rateSelect"));
		int rating = Integer.parseInt(select.getAttribute("value"));
		int nextRating = rating % 5 + 2;
		System.out.println(nextRating);
		String cssSelector = "#rateSelect > option:nth-child(" + Integer.toString(nextRating) + ")";
		driver.findElement(By.cssSelector(cssSelector)).click();
		//assertEquals("Saving your rate", driver.findElement(By.cssSelector("#rateStatus")).getText());
		Thread.sleep(3000);
		mutateDOMTree();
		assertEquals("Your rating saved!", driver.findElement(By.cssSelector("span#rateStatus")).getText());
		driver.findElement(By.xpath("//div[@id='Granny']/div[5]/div[2]/center/a/img")).click();
		mutateDOMTree();
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
	
	private void mutateDOMTree(){
		// execute JavaScript code to mutate DOM
		String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode();
		if (code!= null)
			((JavascriptExecutor)driver).executeScript(code);
	}
}
