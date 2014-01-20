package com.crawljax.plugins.testsuiteextension.casestudies.pizza.instrumentedtests;

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
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Create New"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        String name = "TestTopping";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:toppingBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:toppingBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        try {
            WebElement nameResult = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("toppingBeanToppingName"))));
            assertTrue(nameResult.getText().matches(name));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(name))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        try {
            WebElement nameResult = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("toppingBeanToppingName"))));
            assertTrue(nameResult.getText().matches(name));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(name))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        // Edit  
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        name = "TestTopping2";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        try {
            WebElement nameResult = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("toppingBeanToppingName"))));
            assertTrue(nameResult.getText().matches(name));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(name))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        try {
            WebElement nameResult = driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("toppingBeanToppingName"))));
            assertTrue(nameResult.getText().matches(name));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(name))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        // Delete  
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:toppingBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:toppingBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:toppingBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:toppingBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Delete"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Topping"))), "click", "").click();
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
