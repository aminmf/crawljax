package com.crawljax.plugins.testsuiteextension.generated.photogallery_originaltests.copy;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.Select;

public class OrigTestCase3 {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testHomePage() throws Exception {
		driver.get("http://localhost:8888/phormer331/");
		assertTrue(isElementPresent(By.cssSelector("div#Granny")));
		driver.findElement(By.linkText("Stories")).click();
		assertTrue(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"));
		driver.findElement(By.partialLinkText("Default Category")).click();
		assertTrue(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"));
		driver.findElement(By.partialLinkText("Default Story")).click();
		assertTrue(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"));
		driver.findElement(By.linkText("SlideShow")).click();
		assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$"));
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
