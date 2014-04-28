package com.crawljax.plugins.testsuiteextension.generated.photogallery_originaltests;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.Select;

public class OrigTestCase6 {
	private WebDriver driver;
	// private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		// baseUrl = "http://localhost/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSlideShow() throws Exception {
		driver.get("http://localhost:8888/phormer331/");
		driver.findElement(By.linkText("SlideShow")).click();
		if(!(driver.getTitle().matches("^SlideShow[\\s\\S]*$"))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.id("ss_playpause_link")).click();
		if(!(isElementPresent(By.cssSelector("img#ss_photo")))){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.linkText("Next")).click();
		if(!helper.equals("2", driver.findElement(By.cssSelector("span#ss_n")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.linkText("Previous")).click();
		if(!helper.equals("1", driver.findElement(By.cssSelector("span#ss_n")).getText())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
		driver.findElement(By.linkText("Smaller Size")).click();
		if(!helper.equals("SlideShow :: My PhotoGallery", driver.getTitle())){System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());  return;}
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
