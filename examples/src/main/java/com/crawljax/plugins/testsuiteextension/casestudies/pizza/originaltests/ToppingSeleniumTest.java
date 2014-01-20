package com.crawljax.plugins.testsuiteextension.casestudies.pizza.originaltests;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToppingSeleniumTest {
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
		driver.get(baseUrl + "/pizza_forge/faces/index.xhtml");
		driver.findElement(By.linkText("Topping")).click();
		driver.findElement(By.linkText("Create New")).click();

		// name
		WebElement nameTextBox = driver.findElement(By.id("create:toppingBeanToppingName"));
		nameTextBox.clear();
		String name = "TestTopping";
		nameTextBox.sendKeys(name);

		driver.findElement(By.linkText("Save")).click();

		assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:toppingBeanPageItems:0:itemName")).click();

		try {
			WebElement nameResult = driver.findElement(By.id("toppingBeanToppingName"));
			assertTrue(nameResult.getText().matches(name));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		// Edit
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Topping")).click();
		
		driver.findElement(By.id("search:toppingBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		// name
		nameTextBox = driver.findElement(By.id("create:toppingBeanToppingName"));
		nameTextBox.clear();
		name = "TestTopping2";
		nameTextBox.sendKeys(name);
		
		driver.findElement(By.linkText("Save")).click();

		try {
			WebElement nameResult = driver.findElement(By.id("toppingBeanToppingName"));
			assertTrue(nameResult.getText().matches(name));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		// Delete
		driver.get(baseUrl + indexPage);
		driver.findElement(By.linkText("Topping")).click();
		
		assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
		driver.findElement(By.id("search:toppingBeanPageItems:0:itemName")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Topping")).click();
		assertFalse(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
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
