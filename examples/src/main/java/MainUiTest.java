

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainUiTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/index.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUI() throws Exception {
		driver.get(baseUrl);
		assertEquals("Draw Ellipse", driver.findElement(By.id("control1"))
				.getText());
		assertEquals("Add a Store", driver.findElement(By.id("control3"))
				.getText());
		assertEquals("More Options", driver.findElement(By.id("control4"))
				.getText());
		assertEquals("import 1",
				driver.findElement(By.cssSelector("button.import-button"))
						.getText());
		driver.findElement(By.id("control4")).click();
		assertEquals("Find Weighted Average", driver.findElement(By.id("ave"))
				.getText());
		assertEquals("The Node to Add ...",
				driver.findElement(By.id("add_next")).getText());
		assertEquals("The Node to Remove",
				driver.findElement(By.xpath("(//button[@id='add_next'])[2]"))
						.getText());
		driver.findElement(By.id("control3")).click();
		assertEquals("Add it", driver.findElement(By.id("add")).getText());
		assertEquals("", driver.findElement(By.id("weight")).getText());
		assertEquals("", driver.findElement(By.id("lng")).getText());
		assertEquals("", driver.findElement(By.id("lat")).getText());
		driver.findElement(By.id("control1")).click();
		assertEquals("Enter", driver.findElement(By.id("draw")).getText());
		assertEquals("", driver.findElement(By.id("coststep")).getText());
		assertEquals("", driver.findElement(By.id("cost")).getText());
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
}
