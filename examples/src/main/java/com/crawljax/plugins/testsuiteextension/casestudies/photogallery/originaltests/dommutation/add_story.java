package com.crawljax.plugins.testsuiteextension.casestudies.photogallery.originaltests.dommutation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class add_story {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String DOM = null;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8888";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAddStoryAssert() throws Exception {
		driver.get(baseUrl + "/phormer331/");
		mutateDOMTree();
		driver.findElement(By.linkText("Admin Page")).click();
		driver.findElement(By.id("loginAdminPass")).clear();
		driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
		driver.findElement(By.cssSelector("input.submit")).click();
		mutateDOMTree();
		driver.findElement(By.linkText("Manage Stories")).click();
		mutateDOMTree();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Photos");
		driver.findElement(By.name("desc")).clear();
		driver.findElement(By.name("desc")).sendKeys("Greenery !!");
		driver.findElement(By.cssSelector("input.submit")).click();
		mutateDOMTree();
		assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Story \"Photos\" added succesfully![\\s\\S]*$"));
		driver.findElement(By.cssSelector("a[title=\"Log Out\"]")).click();
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
