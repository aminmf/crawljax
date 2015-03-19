package com.crawljax.plugins.testilizer.casestudies.addressbook.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testModifyUserAddress {
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
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img")).click();
        
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/textarea[1]")).clear(); // address
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form/textarea[1]")).sendKeys("Piccadilly Circus 123"); // address
        driver.findElement(By.xpath("html/body/div[1]/div[4]/form[1]/input[22]")).click(); // updateButton
        
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("html/body/div[1]/div[4]/form[2]/table/tbody/tr[2]/td[4]")).getText().contains("Piccadilly Circus 123"));
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
