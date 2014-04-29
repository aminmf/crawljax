package com.crawljax.plugins.testilizer.casestudies.eshop.originaltests;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.crawljax.forms.RandomInputValueGenerator;

public class AllTests {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://localhost:9443";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAll() throws Exception {

		/*
		
		// URL => /admin/carbon/admin/login.jsp

		// LoginToCarbon
		driver.get(baseUrl + "/admin/carbon/admin/login.jsp");
		driver.findElement(By.cssSelector("#txtUserName.user")).clear();
		driver.findElement(By.cssSelector("#txtUserName.user")).sendKeys("admin");
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.button")).click();
		assertEquals("WSO2 Management Console", driver.getTitle());
		

		// testAddTenant
		driver.findElement(By.cssSelector("#menu-panel-button3")).click();
		driver.findElement(By.linkText("Add New Tenant")).click();
		driver.findElement(By.id("domain")).clear();
		String RandDomain = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("domain")).sendKeys(RandDomain+".com");
		//driver.findElement(By.id("domain")).sendKeys("mytestdomain.com");
		driver.findElement(By.id("admin-firstname")).clear();
		driver.findElement(By.id("admin-firstname")).sendKeys("testAdminFirstName");
		driver.findElement(By.id("admin-lastname")).clear();
		driver.findElement(By.id("admin-lastname")).sendKeys("testAdminLastName");
		driver.findElement(By.id("admin")).clear();
		driver.findElement(By.id("admin")).sendKeys("tenantAdmin");
		driver.findElement(By.id("admin-password")).clear();
		driver.findElement(By.id("admin-password")).sendKeys("admin1234");
		driver.findElement(By.id("admin-password-repeat")).clear();
		driver.findElement(By.id("admin-password-repeat")).sendKeys("admin1234");
		driver.findElement(By.id("admin-email")).clear();
		driver.findElement(By.id("admin-email")).sendKeys("tenantadminmail@mytestdomain.com");
		driver.findElement(By.cssSelector("input.button")).click();
		assertEquals("You have registered the Organization Successfully", driver.findElement(By.cssSelector("#messagebox-info")).getText());
		driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
		
		
		// testLogoutFromCarbon
		driver.findElement(By.linkText("Sign-out")).click();  

		// testLoginToCarbonAsTenant
		driver.findElement(By.cssSelector("#txtUserName.user")).clear();
		driver.findElement(By.cssSelector("#txtUserName.user")).sendKeys("tenantAdmin@mytestdomain.com");
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin1234");
		driver.findElement(By.cssSelector("input.button")).click();
		assertEquals("WSO2 Management Console", driver.getTitle());


		// testAddUserToTenant
		driver.findElement(By.cssSelector("#menu-panel-button3")).click();
		driver.findElement(By.linkText("Users and Roles")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("Add New User")).click();
		driver.findElement(By.name("username")).clear();
		String RandUser = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.name("username")).sendKeys(RandUser);
		//driver.findElement(By.name("username")).sendKeys("tenantUser");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("tenantUser");
		driver.findElement(By.name("retype")).clear();
		driver.findElement(By.name("retype")).sendKeys("tenantUser");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("td.buttonRow > input.button")).click();
		assertTrue(driver.findElement(By.cssSelector("#messagebox-info")).getText().contains("is added successfully."));
		driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
		 
		
		// testAddLoginPermissionToStoreRole
		driver.findElement(By.linkText("Users and Roles")).click();
		driver.findElement(By.linkText("Roles")).click();
		driver.findElement(By.linkText("Add New Internal Role")).click();
		driver.findElement(By.name("roleName")).clear();
		String RandRole = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.name("roleName")).sendKeys(RandUser);
		driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Login\")]/../..//td[last()-1]/div")).click();
		driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
		driver.findElement(By.xpath("//input[@value=\"Finish\"]")).click();
		assertTrue(driver.findElement(By.cssSelector("#messagebox-info")).getText().contains("is added successfully."));
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();


		 */



		
		

		// URL => /store/assets/gadget

		// testLoginAsAdmin
		driver.get(baseUrl + "/store");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());

		// testBookmarkAsset() and remove it
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.cssSelector("#assets-container a")).click();
		driver.findElement(By.id("btn-add-gadget")).click();
		assertEquals("Bookmarked", driver.findElement(By.id("btn-add-gadget")).getText());
		driver.findElement(By.cssSelector(".nav-separator > a:nth-child(1)")).click();
	
		// testShowMyItems
		driver.findElement(By.linkText("My Items")).click();
		assertEquals("by admin", driver.findElement(By.cssSelector("div.store-my-item .bookmark-assert-provider")).getText());

		// remove from list
		driver.findElement(By.cssSelector("a.btn:nth-child(3) > i:nth-child(1)")).click();
		assertTrue(driver.findElement(By.id("no-data-my-items")).getText().contains("You still haven't any bookmarks from the Store."));

		// testFilterByTag()
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.linkText("wso2")).click();
		Thread.sleep(3000);
		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size());

		// testLogout
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();
		assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed());
		assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());

		
		// testCreateSuperTenantUser
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("reg-username")).clear();
		String RandUser = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("reg-username")).sendKeys(RandUser);
		//driver.findElement(By.id("reg-username")).sendKeys("supertenantuserX");
		driver.findElement(By.id("reg-password")).clear();
		driver.findElement(By.id("reg-password")).sendKeys("supertenantuser");
		driver.findElement(By.id("reg-password2")).clear();
		driver.findElement(By.id("reg-password2")).sendKeys("supertenantuser");
		driver.findElement(By.id("registrationSubmit")).click();
		assertTrue(driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText().contains("RND"));

		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();
	
		
		// testAddNewAsset
		driver.findElement(By.linkText("Sign in")).click();
		// going to  /publisher/assets/gadget/
		driver.findElement(By.cssSelector("a[href*='publisher']")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector("ul.nav:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click(); // clinking on "Add gadget
		driver.findElement(By.id("overview_name")).clear();
		String RandValue = "RND-" + new RandomInputValueGenerator().getRandomString(4);
		driver.findElement(By.id("overview_name")).sendKeys(RandValue);
		driver.findElement(By.id("overview_version")).clear();
		driver.findElement(By.id("overview_version")).sendKeys("1.2.3");
		driver.findElement(By.id("overview_url")).clear();
		driver.findElement(By.id("overview_url")).sendKeys("http://example.com/gadget.xml");
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1");
		driver.findElement(By.id("token-input-tag-container")).sendKeys("data,");
		driver.findElement(By.id("btn-create-asset")).click();
		assertTrue(driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed());

		// testIfAssetAddedToPublisher
		assertTrue(driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")).getText().contains("RND"));
		
		
		// UpdateDescription
		driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")).click();
		//driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1 + added description");
		driver.findElement(By.id("editAssetButton")).click();
		assertTrue(driver.findElement(By.cssSelector(".alert")).getText().contains("Asset updated successfully"));
		
 		if(true)return;
		
		
		// LogoutFromPublisher
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();

		// LoginAsTenantAdmin
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("tenantAdmin@mytestdomain.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("tenantAdmin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());

		// testLogout
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();

		// LoginAsSuperTenantUser
		driver.findElement(By.cssSelector("a[href*='store']")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("supertenantuser");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("supertenantuser");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("supertenantuser", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());

		// testLogout
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();

	
		// LoginAsTenantUser
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("tenantUser@mytestdomain.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("tenantUser");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("tenantUser", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());

		// TestIfAssetAddedToStore
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		assertEquals("by supertenantuser", driver.findElement(By.xpath("//div[@id='container-assets']//small[2]")).getText());


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
