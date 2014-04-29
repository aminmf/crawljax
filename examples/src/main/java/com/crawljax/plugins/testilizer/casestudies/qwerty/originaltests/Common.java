package com.crawljax.plugins.testilizer.casestudies.qwerty.originaltests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Common {
	public static String baseUrl(){
		String prop = System.getProperty("QwertyBaseUrl");
		if(prop != null)
			return prop;
		else
			return "http://localhost/qwerty/";
			//return "http://evali.tk/";
	}
	
	public static WebDriver driver(){
/*		System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.binary", "E:/Program Files/SRWare Iron/iron.exe");
		return new ChromeDriver(capabilities);*/
		return new FirefoxDriver();
	}
	
	public static void insertFacebookCredentials(WebDriver driver) {
		String parentWindowHandle = driver.getWindowHandle();
		WebDriver popup = null;
		for(String handle : driver.getWindowHandles()){
			popup = driver.switchTo().window(handle);
			if(popup.getTitle().contains("Facebook")){
			    driver.findElement(By.id("email")).clear();
			    driver.findElement(By.id("email")).sendKeys("vagzcphf@spam4.me");
			    driver.findElement(By.id("pass")).clear();
			    driver.findElement(By.id("pass")).sendKeys("qwertyParool");
			    driver.findElement(By.name("login")).click();
			    
/*			    try {
					driver.findElement(By.name("__CONFIRM__")).click();
			    } catch (NoSuchWindowException e) {
					System.out.println("Confirmed already");
				} catch (NoSuchElementException e) {
					System.out.println("Confirmed already");
				} catch (Exception e) {
					throw e;
				}*/ //Firefox ei saa hakkama sellega
				break;
			}
		}
		driver.switchTo().window(parentWindowHandle);
	}
}
