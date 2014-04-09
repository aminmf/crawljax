package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;

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

		// URL => /admin/carbon/admin/login.jsp

		// LoginToCarbon
		/*driver.get(baseUrl + "/admin/carbon/admin/login.jsp");
		driver.findElement(By.cssSelector("#txtUserName.user")).clear();
		driver.findElement(By.cssSelector("#txtUserName.user")).sendKeys("admin");
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.button")).click();
		assertEquals("WSO2 Management Console", driver.getTitle());
		*/

		// testAddTenant
		/*driver.findElement(By.cssSelector("#menu-panel-button3")).click();
		driver.findElement(By.linkText("Add New Tenant")).click();
		driver.findElement(By.id("domain")).clear();
		driver.findElement(By.id("domain")).sendKeys("mytestdomain.com");
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
		 */

		// testLogoutFromCarbon
		//driver.findElement(By.linkText("Sign-out")).click();  

		// testLoginToCarbonAsTenant
		/*driver.get(baseUrl + "/admin/carbon/admin/login.jsp");
		driver.findElement(By.cssSelector("#txtUserName.user")).clear();
		driver.findElement(By.cssSelector("#txtUserName.user")).sendKeys("tenantAdmin@mytestdomain.com");
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin1234");
		driver.findElement(By.cssSelector("input.button")).click();
		assertEquals("WSO2 Management Console", driver.getTitle());
		 */

		// testAddUserToTenant
		/*driver.findElement(By.cssSelector("#menu-panel-button3")).click();
		driver.findElement(By.linkText("Users and Roles")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("Add New User")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("tenantUser");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("tenantUser");
		driver.findElement(By.name("retype")).clear();
		driver.findElement(By.name("retype")).sendKeys("tenantUser");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("td.buttonRow > input.button")).click();
		assertEquals("User PRIMARY/tenantUser is added successfully.", driver.findElement(By.cssSelector("#messagebox-info")).getText());
		driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
		 */

		// testAddLoginPermissionToStoreRole
		/*driver.get(baseUrl + "admin/t/mytestdomain.com/carbon/role/add-step1.jsp?roleType=Internal");
		driver.findElement(By.cssSelector("#menu-panel-button3 > span")).click();
		driver.findElement(By.linkText("Users and Roles")).click();
		driver.findElement(By.linkText("Roles")).click();
		driver.findElement(By.linkText("Add New Internal Role")).click();
		driver.findElement(By.name("roleName")).clear();
		driver.findElement(By.name("roleName")).sendKeys("store");
		driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Login\")]/../..//td[last()-1]/div")).click();
		driver.findElement(By.xpath("//input[contains(@value,\"Next\")]")).click();
		driver.findElement(By.xpath("//input[@value=\"tenantUser\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Finish\"]")).click();
		assertEquals("Role store is added successfully.", driver.findElement(By.cssSelector("#messagebox-info")).getText());
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

		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget

		// testBookmarkAsset() and remove it
		//driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.cssSelector("#assets-container a")).click();
		driver.findElement(By.id("btn-add-gadget")).click();
		assertEquals("Bookmarked", driver.findElement(By.id("btn-add-gadget")).getText());
		driver.findElement(By.cssSelector(".nav-separator > a:nth-child(1)")).click();
	
		// testShowMyItems
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("My Items")).click();
		assertEquals("by admin", driver.findElement(By.cssSelector("div.store-my-item .bookmark-assert-provider")).getText());

		// remove from list
		driver.findElement(By.cssSelector("a.btn:nth-child(3) > i:nth-child(1)")).click();
		assertTrue(driver.findElement(By.id("no-data-my-items")).getText().contains("You still haven't any bookmarks from the Store."));


		/******* This does not work! ********/
		// testAddReview()
		/*driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.xpath("((//div[@class='span3 asset'])[last()])//a")).click();
		driver.findElement(By.linkText("User Reviews")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#com-body")).clear();
		driver.findElement(By.cssSelector("#com-body")).sendKeys("my test rating with 3 stars");
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.id("btn-post")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (isElementPresent(By.cssSelector(".com-review"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
				
		// testSortByPopAfterReview
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.xpath("((//div[@class='span3 asset'])[8])//a")).click();
		String populerAsset = driver.getCurrentUrl();
		driver.findElement(By.linkText("User Reviews")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [waitForFrameToLoad | id=socialIfr | ]]
		driver.findElement(By.id("com-body")).clear();
		driver.findElement(By.id("com-body")).sendKeys("my test rating with 5 stars");
		driver.findElement(By.linkText("5")).click();
		driver.findElement(By.id("btn-post")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (isElementPresent(By.cssSelector(".com-review"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.cssSelector("i.icon-star")).click();
		driver.findElement(By.xpath("((//div[@class='span3 asset'])[1])//a")).click();
		assertEquals(populerAsset, driver.getCurrentUrl());
		*/
		


		// testFilterByTag()
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.linkText("wso2")).click();
		Thread.sleep(3000);
		
		assertEquals(4, ((List<WebElement>) driver.findElements(By.xpath("//div[@class='span3 asset']"))).size());


		// testLogout
		driver.findElement(By.cssSelector(".search-bar > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();  // clicking on gadget
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();
		assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed());
		assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());




		/*** This can't be done multiple times ***/
		// testCreateSuperTenantUser
		/*driver.get(baseUrl + "/store/");
		driver.findElement(By.id("btn-register")).click();
		driver.findElement(By.id("reg-username")).clear();
		driver.findElement(By.id("reg-username")).sendKeys("supertenantuser4");
		driver.findElement(By.id("reg-password")).clear();
		driver.findElement(By.id("reg-password")).sendKeys("supertenantuser4");
		driver.findElement(By.id("reg-password2")).clear();
		driver.findElement(By.id("reg-password2")).sendKeys("supertenantuser4");
		driver.findElement(By.id("registrationSubmit")).click();
		assertEquals("supertenantuser4", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());
		*/

		
		
		/**** CHECK THIS LATER *****/
		// testAddNewAsset

		// going to  /publisher/assets/gadget/
		driver.findElement(By.cssSelector("div.pull-right > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		driver.findElement(By.linkText("Add gadget")).click();
		driver.findElement(By.id("overview_name")).clear();
		driver.findElement(By.id("overview_name")).sendKeys("userAddedAsset");
		driver.findElement(By.id("overview_version")).clear();
		driver.findElement(By.id("overview_version")).sendKeys("1.2.3");
		driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span")).click();
		driver.findElement(By.id("overview_url")).clear();
		driver.findElement(By.id("overview_url")).sendKeys("http://example.com/gadget.xml");
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1");
		driver.findElement(By.id("images_thumbnail")).clear();
		driver.findElement(By.id("images_thumbnail")).sendKeys("~/Pictures/thumbnail.jpg");
		driver.findElement(By.id("images_banner")).clear();
		driver.findElement(By.id("images_banner")).sendKeys("~/Pictures/banner.jpg");
		driver.findElement(By.id("token-input-tag-container")).sendKeys("wso2,");
		driver.findElement(By.id("btn-create-asset")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (!driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		
		if(true) return;

		
		
		// testReLogin
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();



		// testBookmarkAsset
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.cssSelector("#assets-container a")).click();
		driver.findElement(By.id("btn-add-gadget")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("Bookmarked".equals(driver.findElement(By.id("btn-add-gadget")).getText())) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}



		// testShowMyItems
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("My Items")).click();
		assertEquals("by admin", driver.findElement(By.cssSelector("div.store-my-item .bookmark-assert-provider")).getText());



		// LogoutFromPublisher
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();


		// LoginAsAdmin
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("admin", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());



		///// NOT WORKING!
		// PromoteToPublished
		/*driver.get(baseUrl + "/publisher/assets/gadget/");
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		driver.findElement(By.linkText("Life Cycle")).click();
		driver.findElement(By.id("Published")).click();
		List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id='lc-history']//tr"));
		WebElement val1 = rows1.get(0).findElement(By.xpath("./td[2]"));
		System.out.println(val1.getText());
		assertEquals(val1.getText(), "admin changed the asset from In-Review to Published");
		 */



		// LogoutFromPublisher
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();




		// LoginAsSuperTenantUser
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("supertenantuser");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("supertenantuser");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("supertenantuser", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());



		// TestIfAssetAddedToStore
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		assertEquals("by supertenantuser", driver.findElement(By.xpath("//div[@id='container-assets']//small[2]")).getText());


		// Logout
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Sign out")).click();
		assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed());


		// LoginAsTenantUser
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("tenantUser@mytestdomain.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("tenantUser");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		assertEquals("tenantUser", driver.findElement(By.cssSelector("ul.nav li a.dropdown-toggle")).getText());

		if(true)return;

		// AddNewAsset
		driver.get(baseUrl + "/publisher/assets/gadget/");
		driver.findElement(By.linkText("Add gadget")).click();
		driver.findElement(By.id("overview_name")).clear();
		driver.findElement(By.id("overview_name")).sendKeys("userAddedAsset");
		driver.findElement(By.id("overview_version")).clear();
		driver.findElement(By.id("overview_version")).sendKeys("1.2.3");
		driver.findElement(By.xpath("//ul[@role='menu']/li[3]/a/span")).click();
		driver.findElement(By.id("overview_url")).clear();
		driver.findElement(By.id("overview_url")).sendKeys("http://example.com/gadget.xml");
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1");
		driver.findElement(By.id("images_thumbnail")).clear();
		driver.findElement(By.id("images_thumbnail")).sendKeys("~/Pictures/thumbnail.jpg");
		driver.findElement(By.id("images_banner")).clear();
		driver.findElement(By.id("images_banner")).sendKeys("~/Pictures/banner.jpg");
		driver.findElement(By.id("token-input-tag-container")).sendKeys("wso2,");
		driver.findElement(By.id("btn-create-asset")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (!driver.findElement(By.cssSelector(".asset-being-added")).isDisplayed()) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}


		// TestIfAssetAddedToPublisher
		driver.get(baseUrl + "/publisher/assets/gadget/");
		assertTrue(isElementPresent(By.xpath("//a[contains(text(),\"userAddedAsset\")]")));

		// UpdateDescription
		driver.get(baseUrl + "/publisher/assets/gadget/");
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("overview_description")).clear();
		driver.findElement(By.id("overview_description")).sendKeys("this is my user added asset 1 + added description");
		driver.findElement(By.id("editAssetButton")).click();


		// PromoteToInReview
		driver.get(baseUrl + "/publisher/assets/gadget/");
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		driver.findElement(By.linkText("Life Cycle")).click();
		driver.findElement(By.id("In-Review")).click();
		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@id='lc-history']//tr"));
		WebElement val2 = rows2.get(0).findElement(By.xpath("./td[2]"));
		System.out.println(val2.getText());
		assertEquals(val2.getText(), "supertenantuser changed the asset from Created to In-Review");


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



		// PromoteToPublished
		driver.get(baseUrl + "/publisher/assets/gadget/");
		driver.findElement(By.xpath("//a[contains(text(),\"userAddedAsset\")]")).click();
		driver.findElement(By.linkText("Life Cycle")).click();
		driver.findElement(By.id("Published")).click();
		List<WebElement> rows3 = driver.findElements(By.xpath("//table[@id='lc-history']//tr"));
		WebElement val3 = rows3.get(0).findElement(By.xpath("./td[2]"));
		System.out.println(val3.getText());
		assertEquals(val3.getText(), "admin changed the asset from In-Review to Published");


		// LogoutFromPublisher
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


		// ReLogin
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.linkText("Sign in")).click();


		// BookmarkAsset
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.cssSelector("#assets-container a")).click();
		driver.findElement(By.id("btn-add-gadget")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("Bookmarked".equals(driver.findElement(By.id("btn-add-gadget")).getText())) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}


		// TestAddReview
		driver.get(baseUrl + "/store/assets/gadget");
		driver.findElement(By.xpath("((//div[@class='span3 asset'])[last()])//a")).click();
		driver.findElement(By.linkText("User Reviews")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [waitForFrameToLoad | id=socialIfr | ]]
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (isElementPresent(By.id("com-body"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		driver.findElement(By.id("com-body")).clear();
		driver.findElement(By.id("com-body")).sendKeys("my test rating with 3 stars");
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.id("btn-post")).click();
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (isElementPresent(By.cssSelector(".com-review"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		driver.navigate().refresh();


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
