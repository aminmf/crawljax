package com.crawljax.plugins.testsuiteextension.generated.photogallery_originaltests;

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
		if(!(isElementPresent(By.cssSelector("div#Granny")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.linkText("Stories")).click();
		if(!(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.partialLinkText("Default Category")).click();
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*category[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.partialLinkText("Default Story")).click();
		if(!(driver.findElement(By.cssSelector("div.midInfo")).getText().matches("^[\\s\\S]*story[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.linkText("SlideShow")).click();
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
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
