package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.instrumentedtests;

//import java.util.regex.Pattern;  
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;  
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.Select;  
public class HomePageTest {

    private WebDriver driver;

    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testHomePage() throws Exception {
        driver.get("http://localhost:8888/phormer331/");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(isElementPresent(By.cssSelector("div#Granny")));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(isElementPresent(By.cssSelector(\"div#Granny\")))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("Stories"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.getCurrentUrl().matches("^http://localhost:8888/[\\s\\S]*mode=stories$"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.getCurrentUrl().matches(\"^http://localhost:8888/[\\\\s\\\\S]*mode=stories$\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.partialLinkText("Default Category"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.midInfo"))).getText().matches("^[\\s\\S]*category[\\s\\S]*$"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.midInfo\")).getText().matches(\"^[\\\\s\\\\S]*category[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.partialLinkText("Default Story"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.cssSelector("div.midInfo"))).getText().matches("^[\\s\\S]*story[\\s\\S]*$"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.findElement(By.cssSelector(\"div.midInfo\")).getText().matches(\"^[\\\\s\\\\S]*story[\\\\s\\\\S]*$\"))");
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOff();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getWebElement(driver.findElement(com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getBy(By.linkText("SlideShow"))), "click", "").click();
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.assertionModeOn();
        assertTrue(driver.getTitle().matches("^SlideShow[\\s\\S]*$"));
        com.crawljax.plugins.testsuiteextension.seleniuminstrumentor.SeleniumInstrumentor.getAssertion("assertTrue(driver.getTitle().matches(\"^SlideShow[\\\\s\\\\S]*$\"))");
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
