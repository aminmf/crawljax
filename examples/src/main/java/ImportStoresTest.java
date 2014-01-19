

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImportStoresTest {
	private WebDriver driver;
	private String baseUrl;
	private String filePath;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/index.html";
		filePath = "/Users/sj/capstone/UBC ECE Capstone Project - Nodes.csv";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testImportStores() throws Exception {
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
		driver.findElement(By.cssSelector("#gmimap24 > area")).click();
		assertEquals(
				"Store ID: S-951\nSub-network: BC Vancouver Island\nCalculated Weight: 1\n(49.206369, -124.00547799999998)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap8 > area")).click();
		assertEquals(
				"Store ID: S-6642\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.701017, -112.83046999999999)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap12 > area")).click();
		assertEquals(
				"Store ID: S-78\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.696062, -114.84030200000001)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap9 > area")).click();
		assertEquals(
				"Store ID: S-915\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.516363, -115.75455299999999)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap6 > area")).click();
		assertEquals(
				"Store ID: S-33\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.673058, -115.98283800000002)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap11 > area")).click();
		assertEquals(
				"Store ID: S-16\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.125286, -116.494144)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap10 > area")).click();
		assertEquals(
				"Store ID: S-953\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.500382, -117.28768500000001)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap7 > area")).click();
		assertEquals(
				"Store ID: S-24\nSub-network: BC Kootenays\nCalculated Weight: 1\n(49.136013, -118.51278300000001)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap14 > area")).click();
		assertEquals(
				"Store ID: S-157\nSub-network: BC Lower Mainland\nCalculated Weight: 1\n(49.353756, -121.21627799999999)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap22 > area")).click();
		assertEquals(
				"Store ID: S-956\nSub-network: BC Interior\nCalculated Weight: 1\n(49.827837, -119.62995899999999)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap21 > area")).click();
		assertEquals(
				"Store ID: S-126\nSub-network: BC Interior\nCalculated Weight: 1\n(50.021169, -119.40516500000001)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap20 > area")).click();
		assertEquals(
				"Store ID: S-952\nSub-network: BC Lower Mainland\nCalculated Weight: 1\n(49.111242, -121.95764400000002)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap2 > area")).click();
		assertEquals(
				"Store ID: S-6619\nSub-network: AB North\nCalculated Weight: 1\n(53.453318, -113.56372099999999)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
		driver.findElement(By.cssSelector("#gmimap23 > area")).click();
		assertEquals(
				"Store ID: S-6628\nSub-network: BC North\nCalculated Weight: 1\n(55.176613, -118.80512199999998)",
				driver.findElement(By.cssSelector("div.gm-style-iw > div"))
						.getText());
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
