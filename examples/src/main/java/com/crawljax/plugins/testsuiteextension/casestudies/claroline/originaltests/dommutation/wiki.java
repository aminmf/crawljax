package com.crawljax.plugins.testsuiteextension.casestudies.claroline.originaltests.dommutation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class wiki {
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
	public void testWiki() throws Exception {
		driver.get(baseUrl + "/claroline-1.11.7/");
		mutateDOMTree();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		mutateDOMTree();
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Modules")).click();
		mutateDOMTree();
		//driver.findElement(By.xpath("(//img[@alt='Properties'])[11]")).click();
		driver.findElement(By.cssSelector(".claroTable > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(6) > a:nth-child(1) > img:nth-child(1)")).click();
		driver.findElement(By.linkText("Local settings")).click();
		mutateDOMTree();
		driver.findElement(By.id("label_showWikiEditorToolbar_FALSE")).click();
		driver.findElement(By.id("label_forcePreviewBeforeSaving_TRUE")).click();
		driver.findElement(By.id("label_forcePreviewBeforeSaving_FALSE")).click();
		driver.findElement(By.id("label_showWikiEditorToolbar_TRUE")).click();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Wiki, \\(CLWIKI\\) are now effective on server\\.[\\s\\S]*$"));
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		mutateDOMTree();
		driver.findElement(By.linkText("About")).click();
		driver.findElement(By.linkText("Logout")).click();
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
	
	private void mutateDOMTree(){
		// execute JavaScript code to mutate DOM
		String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode();
		if (code!= null){
			try{
				((JavascriptExecutor)driver).executeScript(code);
			}catch (Exception e) {
				System.out.println("Could not execute script");
			}
			
		}
	}
}
