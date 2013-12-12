package com.crawljax.plugins.testsuiteextension.casestudies.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class course_desc {

    private WebDriver driver;

    private String baseUrl;

    private boolean acceptNextAlert = true;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://watersmc.ece.ubc.ca:8888/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCourseDesc() throws Exception {
        driver.get(baseUrl + "/claroline-1.11.7/");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("button[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Create a course site"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_title"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_title"))), "sendKeys", "Engineering Graphics").sendKeys("Engineering Graphics");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_officialCode"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_officialCode"))), "sendKeys", "AAOC112").sendKeys("AAOC112");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("access_public"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("BODY"))).getText().matches("^[\\s\\S]* Access allowed to anybody[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"BODY\")).getText().matches(\"^[\\\\s\\\\S]* Access allowed to anybody[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("registration_validation"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("registration_validation"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("registration_validation"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("registration_validation"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Optionnal settings"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_departmentName"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_departmentName"))), "sendKeys", "ECE").sendKeys("ECE");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Advanced options"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_userLimit"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("course_userLimit"))), "sendKeys", "60").sendKeys("60");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.name("changeProperties"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("BODY"))).getText().matches("^[\\s\\S]*You have just created the course website[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"BODY\")).getText().matches(\"^[\\\\s\\\\S]*You have just created the course website[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Logout"))), "click", "").click();
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