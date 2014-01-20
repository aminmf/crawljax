package com.crawljax.plugins.testsuiteextension.casestudies.pizza.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSeleniumTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	private String indexPage;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		indexPage = "/pizza_forge/faces/index.xhtml";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCRUD() throws Exception {
		// Create
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Base")).click();
		driver.findElement(By.linkText("Create New")).click();

		// name
		WebElement nameTextBox = driver.findElement(By.id("create:baseBeanBaseName"));
		nameTextBox.clear();
		String name = "TestBase";
		nameTextBox.sendKeys(name);

		driver.findElement(By.linkText("Save")).click();

		assertTrue(isElementPresent(By.id("search:baseBeanPageItems:0:itemName"))); 
		driver.findElement(By.id("search:baseBeanPageItems:0:itemName")).click();

		WebElement nameResult = driver.findElement(By.id("baseBeanBaseName"));
		assertTrue(nameResult.getText().matches(name));

		// Edit
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Base")).click();

		driver.findElement(By.id("search:baseBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();

		// name
		nameTextBox = driver.findElement(By.id("create:baseBeanBaseName"));
		nameTextBox.clear();
		name = "TestBase2";
		nameTextBox.sendKeys(name);

		driver.findElement(By.linkText("Save")).click();

		nameResult = driver.findElement(By.id("baseBeanBaseName"));
		assertTrue(nameResult.getText().matches(name));

		// Delete
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Base")).click();

		assertTrue(isElementPresent(By.id("search:baseBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:baseBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Base")).click(); 
		assertFalse(isElementPresent(By.id("search:baseBeanPageItems:0:itemName")));
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
