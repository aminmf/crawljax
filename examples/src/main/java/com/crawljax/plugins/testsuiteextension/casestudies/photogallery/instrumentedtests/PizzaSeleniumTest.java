package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.instrumentedtests;

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
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Create New"))), "click", "").click();
        String name = "TestPizza";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", name).sendKeys(name);
        String price = "1.0";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "sendKeys", price).sendKeys(price);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(nameResult.getText().matches(name));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(name))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(priceResult.getText().matches(price));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(priceResult.getText().matches(price))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        // Edit 
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "clear", "").clear();
        String newName = "TestPizza2";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(nameTextBox, "sendKeys", newName).sendKeys(newName);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "clear", "").clear();
        String newPrice = "2.1";
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(priceTextBox, "sendKeys", newPrice).sendKeys(newPrice);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Save"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(nameResult.getText().matches(newName));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(nameResult.getText().matches(newName))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(priceResult.getText().matches(newPrice));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(priceResult.getText().matches(newPrice))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        // Delete 
        driver.get(baseUrl + indexPage);
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.id("search:pizzaBeanPageItems:0:itemName")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.id(\"search:pizzaBeanPageItems:0:itemName\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("search:pizzaBeanPageItems:0:itemName"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Edit"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Delete"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Pizza"))), "click", "").click();
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
