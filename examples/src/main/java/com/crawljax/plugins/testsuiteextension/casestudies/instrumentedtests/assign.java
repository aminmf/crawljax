package com.crawljax.plugins.testsuiteextension.casestudies.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assign {

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
    public void testAssign() throws Exception {
        driver.get(baseUrl + "/claroline-1.11.7/index.php");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("login"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("password"))), "sendKeys", "nainy").sendKeys("nainy");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("button[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Platform administration"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Configuration"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Assignments"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_confval_def_sub_vis_change_only_new_FALSE"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_confval_def_sub_vis_change_only_new_TRUE"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.name("editConfClass"))).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.name(\"editConfClass\")).getText().matches(\"^[\\\\s\\\\S]*ets how the assignment property \\\"default works visibility\\\" acts\\\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\\\.[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.name("editConfClass"))).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.name(\"editConfClass\")).getText().matches(\"^[\\\\s\\\\S]*For assignments list[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.name("editConfClass"))).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.name(\"editConfClass\")).getText().matches(\"^[\\\\s\\\\S]*/<COURSEID>/work/[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Quota"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.name("editConfClass"))).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.name(\"editConfClass\")).getText().matches(\"^[\\\\s\\\\S]*Maximum size of a document that a user can uploa[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        // Warning: verifyTextPresent may require manual changes  
        try {
            //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$"));  
            assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.claroDialogBox.boxSuccess"))).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.claroDialogBox.boxSuccess\")).getText().matches(\"^[\\\\s\\\\S]*Properties for Assignments, \\\\(CLWRK\\\\) are now effective on server\\\\.[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Submissions"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "sendKeys", "364").sendKeys("364");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "clear", "").clear();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("label_clwrk_endDateDelay"))), "sendKeys", "365").sendKeys("365");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("input[type=\"submit\"]"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("View all"))), "click", "").click();
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
