package com.crawljax.plugins.testilizer.casestudies.pizza.originaltests.old;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PizzaSeleniumTest {
	private WebDriver driver;
	private String baseUrl;
	private String indexPage;
	private StringBuffer verificationErrors = new StringBuffer();

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
		driver.findElement(By.linkText("Pizza")).click();
		driver.findElement(By.linkText("Create New")).click();

		// name
		WebElement nameTextBox = driver.findElement(By.id("create:pizzaBeanPizzaName"));
		String name = "TestPizza";
		nameTextBox.clear();
		nameTextBox.sendKeys(name);

		// price
		WebElement priceTextBox = driver.findElement(By.id("create:pizzaBeanPizzaPrice"));
		String price = "1.0";
		priceTextBox.clear();
		priceTextBox.sendKeys(price);

		driver.findElement(By.linkText("Save")).click();

		assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:pizzaBeanPageItems:0:itemName")).click();

		WebElement nameResult = driver.findElement(By.id("pizzaBeanPizzaName"));
		assertTrue(nameResult.getText().matches(name));
		WebElement priceResult = driver.findElement(By.id("pizzaBeanPizzaPrice"));
		assertTrue(priceResult.getText().matches(price));

		// Edit
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Pizza")).click();

		driver.findElement(By.id("search:pizzaBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();

		// name
		nameTextBox = driver.findElement(By.id("create:pizzaBeanPizzaName"));
		nameTextBox.clear();
		String newName = "TestPizza2";
		nameTextBox.sendKeys(newName);

		// price
		priceTextBox = driver.findElement(By.id("create:pizzaBeanPizzaPrice"));
		priceTextBox.clear();
		String newPrice = "2.1";
		priceTextBox.sendKeys(newPrice);

		driver.findElement(By.linkText("Save")).click();

		nameResult = driver.findElement(By.id("pizzaBeanPizzaName"));
		assertTrue(nameResult.getText().matches(newName));
		priceResult = driver.findElement(By.id("pizzaBeanPizzaPrice"));
		assertTrue(priceResult.getText().matches(newPrice));

		// Delete
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Pizza")).click();

		assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:pizzaBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Pizza")).click();
		assertFalse(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
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
