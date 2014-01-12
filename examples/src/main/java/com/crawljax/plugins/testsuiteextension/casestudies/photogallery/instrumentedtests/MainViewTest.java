package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.instrumentedtests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainViewTest {

    private WebDriver driver;

    // private String baseUrl; 
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testMainView() throws Exception {
        driver.get("http://localhost:8888/phormer331/");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Default Category"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.cssSelector("div#theImage")));
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.cssSelector(\"div#theImage\")))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Hide  info"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(By.id("photoBoxes")).isDisplayed() == false);
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"photoBoxes\")).isDisplayed() == false)");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.linkText("Show info"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.id("photoBoxes"))).isDisplayed());
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.id(\"photoBoxes\")).isDisplayed())");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        int rating = Integer.parseInt(select.getAttribute("value"));
        int nextRating = rating % 5 + 1;
        System.out.println(nextRating);
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(option, "click", "").click();
        Thread.sleep(3000);
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        assertEquals("Your rating saved!", driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.cssSelector("span#rateStatus"))).getText());
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertEquals(\"Your rating saved!\", driver.findElement(By.cssSelector(\"span#rateStatus\")).getText())");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getBy(By.xpath("//div[@id='Granny']/div[5]/div[2]/center/a/img"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*p=2$"));
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.getCurrentUrl().matches(\"^http://localhost:8888/[\\\\s\\\\S]*p=2$\"))");
        com.crawljax.plugins.testsuiteextension.instrumentor.SeleniumInstrumentor.assertionModeOff();
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
