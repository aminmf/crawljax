package com.crawljax.plugins.testilizer.casestudies.wolfcms.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDeleteUser {

    private WebDriver driver;

    private String baseUrl;

    private boolean acceptNextAlert = true;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testDeleteUser() throws Exception {
        driver.get("http://localhost:8888/wolfcms/?/admin");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Login - Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Login - Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login-username"))), "clear", "").clear();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login-username"))), "sendKeys", "admin").sendKeys("admin");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login-password"))), "clear", "").clear();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.id("login-password"))), "sendKeys", "admin").sendKeys("admin");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.xpath("//input[@value='Login']"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Pages | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Pages | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Users"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Users"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Users"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Users"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("tr.node:nth-child(2) > td:nth-child(4) > a:nth-child(1) > img:nth-child(1)"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        //assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete Test User One[\\s\\S]$")); 
        assertTrue(closeAlertAndGetItsText().matches("^Are you sure you wish to delete [\\s\\S]*$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(closeAlertAndGetItsText().matches(\"^Are you sure you wish to delete [\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Users | Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Users | Wolf CMS\", driver.getTitle())");
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
