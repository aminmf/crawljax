

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RemoveStoreTest {
	private WebDriver driver;
	private String baseUrl;
	private String filePath;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8888/capstone/index.html";
		filePath = "/Users/sj/capstone/UBC ECE Capstone Project - Nodes.csv";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testRemoveStoresAfterAddAndImport() throws Exception {
		driver.get(baseUrl);
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("document.getElementById('upload-wrap').style.display = 'block';");
		WebElement fileInput = driver.findElement(By
				.xpath("//input[@type='file']"));
		fileInput.sendKeys(filePath);
		assertEquals("25 stores imported!", closeAlertAndGetItsText());
		driver.findElement(By.id("sub_id0")).click();
		driver.findElement(By.id("sub_id1")).click();
		driver.findElement(By.id("sub_id2")).click();
		driver.findElement(By.id("sub_id3")).click();
		driver.findElement(By.id("sub_id4")).click();
		driver.findElement(By.id("sub_id5")).click();
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("#gmimap8 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.701017, -112.83047)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap12 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.696062, -114.840302)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap11 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.125286, -116.494144)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By.cssSelector("#gmimap7 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.136013, -118.512783)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap14 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.353756, -121.216278)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap20 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.111242, -121.957644)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap19 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.131015, -122.319807)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap24 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.206369, -124.005478)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap10 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.500382, -117.287685)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap22 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.827837, -119.629959)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap18 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.089944, -123.079194)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap13 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.136154, -122.844872)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap17 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.1757, -122.967246)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap16 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.221185, -122.559657)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap15 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.271011, -122.754772)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By
				.cssSelector("#gmimap21 > area")));
		action.perform();
		assertEquals("Successfully removed store at (50.021169, -119.405165)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By.cssSelector("#gmimap9 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.516363, -115.754553)",
				driver.findElement(By.id("panel")).getText());
		action.doubleClick(driver.findElement(By.cssSelector("#gmimap6 > area")));
		action.perform();
		assertEquals("Successfully removed store at (49.673058, -115.982838)",
				driver.findElement(By.id("panel")).getText());
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
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
