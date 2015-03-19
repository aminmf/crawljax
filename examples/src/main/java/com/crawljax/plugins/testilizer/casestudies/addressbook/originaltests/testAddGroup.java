package com.crawljax.plugins.testilizer.casestudies.addressbook.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testAddGroup {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.get("http://localhost:8888/addressbook/index.php");
        driver.findElement(By.name("user")).sendKeys("admin"); // username
        driver.findElement(By.name("pass")).sendKeys("secret"); // password
        driver.findElement(By.cssSelector("input[type='submit']")).click(); // confirmLogin
        driver.findElement(By.xpath("html/body/div[1]/div[3]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[1]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[1]")).sendKeys("Sample Group");
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/textarea[1]")).sendKeys("Sample Group Header");
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[2]")).click();
        assertTrue(driver.findElement(By.xpath("//div[@id='content']/div")).getText().contains("Group record has been updated."));
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
