package com.crawljax.plugins.testilizer.casestudies.pizza.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PizzaOrderSeleniumTest {
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
		driver.findElement(By.linkText("Pizza Order")).click();
		driver.findElement(By.linkText("Create New")).click();

		// name
		WebElement nameTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderName"));
		String name = "TestPizzaOrder";
		nameTextBox.clear();
		nameTextBox.sendKeys(name);

		// address
		WebElement addressTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderAddress"));
		String address = "TestAddress";
		addressTextBox.clear();
		addressTextBox.sendKeys(address);

		// total
		WebElement totalTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderTotal"));
		String total = "1.0";
		totalTextBox.clear();
		totalTextBox.sendKeys(total);

		// delivery date
		WebElement deliveryDateTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderDeliveryDate"));
		String deliveryDate = "Jan 20, 2014 8:33:36 PM";
		deliveryDateTextBox.clear();
		deliveryDateTextBox.sendKeys(deliveryDate);

		driver.findElement(By.linkText("Save")).click();

		assertTrue(isElementPresent(By.id("search:pizzaOrderBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:pizzaOrderBeanPageItems:0:itemName")).click();

		WebElement nameResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderName"));
		assertTrue(nameResult.getText().matches(name));
		WebElement addressResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderAddress"));
		assertTrue(addressResult.getText().matches(address));
		WebElement totalResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderTotal"));
		assertTrue(totalResult.getText().matches(total));
		WebElement deliveryDateResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderDeliveryDate"));
		assertTrue(deliveryDateResult.getText().matches(deliveryDate));

		// Edit
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Pizza Order")).click();

		driver.findElement(By.id("search:pizzaOrderBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();

		// name
		nameTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderName"));
		nameTextBox.clear();
		String newName = "TestPizzaOrder2";
		nameTextBox.sendKeys(newName);

		// address
		addressTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderAddress"));
		addressTextBox.clear();
		String newAddress = "TestAddress2";
		addressTextBox.sendKeys(newAddress);

		// total
		totalTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderTotal"));
		totalTextBox.clear();
		String newTotal = "2.1";
		totalTextBox.sendKeys(newTotal);

		// delivery date
		deliveryDateTextBox = driver.findElement(By.id("create:pizzaOrderBeanPizzaOrderDeliveryDate"));
		deliveryDateTextBox.clear();
		String newDeliveryDate = "Jan 20, 2014 8:33:36 PM";
		deliveryDateTextBox.sendKeys(newDeliveryDate);

		driver.findElement(By.linkText("Save")).click();


		nameResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderName"));
		assertTrue(nameResult.getText().matches(newName));
		addressResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderAddress"));
		assertTrue(addressResult.getText().matches(newAddress));
		totalResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderTotal"));
		assertTrue(totalResult.getText().matches(newTotal));
		deliveryDateResult = driver.findElement(By.id("pizzaOrderBeanPizzaOrderDeliveryDate"));
		assertTrue(deliveryDateResult.getText().matches(newDeliveryDate));

		// Delete
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Pizza Order")).click();

		assertTrue(isElementPresent(By.id("search:pizzaOrderBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:pizzaOrderBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Pizza Order")).click();
		//assertFalse(isElementPresent(By.id("search:pizzaOrderBeanPageItems:0:itemName")));
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
