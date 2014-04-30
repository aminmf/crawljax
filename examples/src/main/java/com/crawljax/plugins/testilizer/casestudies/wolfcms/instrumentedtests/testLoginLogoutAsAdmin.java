package com.crawljax.plugins.testilizer.casestudies.wolfcms.instrumentedtests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testLoginLogoutAsAdmin {

    private WebDriver driver;

    private String baseUrl;

    private boolean acceptNextAlert = true;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8888/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLoginAsAdmin() throws Exception {
        driver.get("http://localhost:8888/wolfcms/?/admin");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Login - Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Login - Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
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
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.xpath("//div[@id='footer']/p"))).getText().matches("^Thank you for using Wolf CMS [\\s\\S]\\.[\\s\\S]\\.[\\s\\S] [\\s\\S] Feedback [\\s\\S] Documentation$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.xpath(\"//div[@id='footer']/p\")).getText().matches(\"^Thank you for using Wolf CMS [\\\\s\\\\S]\\\\.[\\\\s\\\\S]\\\\.[\\\\s\\\\S] [\\\\s\\\\S] Feedback [\\\\s\\\\S] Documentation$\"))");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Log Out"))), "click", "").click();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Login - Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Login - Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Login - Wolf CMS", driver.getTitle());
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Login - Wolf CMS\", driver.getTitle())");
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.xpath("//div[@id='dialog']/form/div/label[@class='checkbox']"))).getText().matches("^Remember me for [\\s\\S][\\s\\S] minutes\\.$"));
        com.crawljax.plugins.testilizer.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.xpath(\"//div[@id='dialog']/form/div/label[@class='checkbox']\")).getText().matches(\"^Remember me for [\\\\s\\\\S][\\\\s\\\\S] minutes\\\\.$\"))");
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
