package com.crawljax.plugins.testilizer.casestudies.photogallery.instrumentedtests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CategoryDeleteTest {

    private WebDriver driver;

    private String baseUrl;

    private boolean acceptNextAlert = true;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8888";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAddCategory() throws Exception {
        driver.get(baseUrl + "/phormer331/");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Admin Page"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("loginAdminPass"))), "clear", "").clear();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("loginAdminPass"))), "sendKeys", "editor").sendKeys("editor");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input.submit"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Manage Categories"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("name"))), "clear", "").clear();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("name"))), "sendKeys", "flowers").sendKeys("flowers");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.name("desc"))), "clear", "").clear();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.name("desc"))), "sendKeys", "contains photos of all the flowers !").sendKeys("contains photos of all the flowers !");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("listRadioNo"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("listRadioYe"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input.submit"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("BODY"))).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"BODY\")).getText().matches(\"^[\\\\s\\\\S]*Category \\\"flowers\\\" added succesfully![\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.xpath("(//a[contains(text(),'Delete / Clear')])[2]"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("BODY"))).getText().matches("^[\\s\\S]*Clears Category flowers of all its own \\(direct\\) photos, nothing will be removed[\\s\\S]*$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"BODY\")).getText().matches(\"^[\\\\s\\\\S]*Clears Category flowers of all its own \\\\(direct\\\\) photos, nothing will be removed[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.xpath("(//input[@name='howto'])[4]"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input.submit"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to delete [\\s\\S]*$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(closeAlertAndGetItsText().matches(\"^Are you sure you want to delete [\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
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

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
