package com.crawljax.plugins.testsuiteextension.casestudies.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class course_category_edit {

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
    public void testCourseCategoryEdit() throws Exception {
        driver.get(baseUrl + "/claroline-1.11.7/");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("button[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Platform administration"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Manage course categories"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("img[alt=\"Edit category\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("category_code"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("category_code"))), "sendKeys", "Sci").sendKeys("Sci");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Economics \\(ECO\\)[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("table.claroTable.emphaseLine"))).getText().matches("^[\\s\\S]*Economics \\(ECO\\)[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"table.claroTable.emphaseLine\")).getText().matches(\"^[\\\\s\\\\S]*Economics \\\\(ECO\\\\)[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        String Categories_Claroline = driver.getTitle();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("img[alt=\"Move down category\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.claroDialogBox.boxSuccess"))).getText().matches("^[\\s\\S]*Category moved down[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.claroDialogBox.boxSuccess\")).getText().matches(\"^[\\\\s\\\\S]*Category moved down[\\\\s\\\\S]*$\"))");
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
