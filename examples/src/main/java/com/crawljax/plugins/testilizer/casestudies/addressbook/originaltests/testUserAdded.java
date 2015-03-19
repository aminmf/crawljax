package com.crawljax.plugins.testilizer.casestudies.addressbook.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testUserAdded {
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
		driver.findElement(By.xpath("html/body/div[1]/div[3]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[1]")).click(); // next
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[3]")).sendKeys("John"); // firstname
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[5]")).sendKeys("Doe"); // lastname
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/textarea[1]")).sendKeys("Times Square"); // address
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[14]")).sendKeys("mail.com"); // email
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[11]")).sendKeys("123456789"); // mobile
		driver.findElement(By.xpath(".//*[@id='content']/form/select[1]")).sendKeys("1969");;
		driver.findElement(By.xpath("html/body/div[1]/div[4]/form/input[21]")).click(); // insertButton

		Thread.sleep(8000);
		assertTrue(driver.findElement(By.xpath("html/body/div[1]/div[4]/label/strong/span")).getText().contains("1"));
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
