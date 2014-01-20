package com.crawljax.plugins.testsuiteextension.casestudies.pizza.instrumentedtests;

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
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza Order"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Create New"))), "click", "").click();
		// name
		WebElement nameTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderName")));
		String name = "TestPizzaOrder";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
		// address
		WebElement addressTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderAddress")));
        String address = "TestAddress";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(addressTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(addressTextBox, "sendKeys", address).sendKeys(address);
		// total
		WebElement totalTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderTotal")));
        String total = "1.0";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(totalTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(totalTextBox, "sendKeys", total).sendKeys(total);
		// delivery date
		WebElement deliveryDateTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderDeliveryDate")));
        String deliveryDate = "21.5.2013 19:00:00";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(deliveryDateTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(deliveryDateTextBox, "sendKeys", deliveryDate).sendKeys(deliveryDate);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaOrderBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderName"))).getText().matches("TestPizzaOrder"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderName\")).getText().matches(\"TestPizzaOrder\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderAddress"))).getText().matches("TestAddress"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderAddress\")).getText().matches(\"TestAddress\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderTotal"))).getText().matches("1.0"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderTotal\")).getText().matches(\"1.0\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderDeliveryDate"))).getText().matches("21.5.2013 19:00:00"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderDeliveryDate\")).getText().matches(\"21.5.2013 19:00:00\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        // Edit  
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza Order"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
		// name
		nameTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        String newName = "TestPizzaOrder2";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", newName).sendKeys(newName);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(addressTextBox, "clear", "").clear();
		// address
		addressTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderAddress")));
		String newAddress = "TestAddress2";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(addressTextBox, "sendKeys", newAddress).sendKeys(newAddress);
		// total
		totalTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderTotal")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(totalTextBox, "clear", "").clear();
        String newTotal = "2.1";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(totalTextBox, "sendKeys", newTotal).sendKeys(newTotal);
		// delivery date
		deliveryDateTextBox = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("create:pizzaOrderBeanPizzaOrderDeliveryDate")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(deliveryDateTextBox, "clear", "").clear();
        String newDeliveryDate = "22.5.2013 18:30:00";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(deliveryDateTextBox, "sendKeys", newDeliveryDate).sendKeys(newDeliveryDate);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();

        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderName"))).getText().matches("TestPizzaOrder2"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderName\")).getText().matches(\"TestPizzaOrder2\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();

        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderAddress"))).getText().matches("TestAddress2"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderAddress\")).getText().matches(\"TestAddress2\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderTotal"))).getText().matches("2.1"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderTotal\")).getText().matches(\"2.1\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();

        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("pizzaOrderBeanPizzaOrderDeliveryDate"))).getText().matches("22.5.2013 18:30:00"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"pizzaOrderBeanPizzaOrderDeliveryDate\")).getText().matches(\"22.5.2013 18:30:00\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();

        // Delete  
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza Order"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaOrderBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Delete"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza Order"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertFalse(isElementPresent(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaOrderBeanPageItems:0:itemName"))));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertFalse(isElementPresent(By.id(\"search:pizzaOrderBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
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
