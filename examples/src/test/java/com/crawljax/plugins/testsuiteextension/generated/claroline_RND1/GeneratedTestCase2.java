package com.crawljax.plugins.testsuiteextension.generated.claroline_RND1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.crawljax.forms.RandomInputValueGenerator;
import com.crawljax.util.DomUtils;

/*
 * Generated @ Sun Apr 13 19:30:35 PDT 2014
 */

public class GeneratedTestCase2 {

	private WebDriver driver;
	private String url;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	private DOMElement element;
	private DOMElement parentElement;
	private ArrayList<DOMElement> childrenElements = new ArrayList<DOMElement>();
	private String DOM = null;

	boolean getCoverageReport = false;

	@Before
	public void setUp() throws Exception {
		// Setting the JavaScript code coverage switch
		getCoverageReport = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.getCoverageReport();
	    if (getCoverageReport)
	    	driver = new FirefoxDriver(getProfile());
	    else
			driver = new FirefoxDriver();
		url = "http://localhost:8888/claroline-1.11.7/index.php?logout=true";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static FirefoxProfile getProfile() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.http", "localhost");
		profile.setPreference("network.proxy.http_port", 3128);
		profile.setPreference("network.proxy.type", 1);
		/* use proxy for everything, including localhost */
		profile.setPreference("network.proxy.no_proxies_on", "");
		return profile;
	}	

	@After
	public void tearDown() throws Exception {
	    if (getCoverageReport)
	    	((JavascriptExecutor) driver).executeScript(" if (window.jscoverage_report) {return jscoverage_report('CodeCoverageReport');}");
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


	/*
	 * Test Cases
	 */
	 
	@Test
	public void method2(){
		driver.get(url);
		//From state 0 to state 9
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[2], element=Element{node=[A: null], tag=A, text=Create user account, attributes={href=/claroline-1.11.7/claroline/auth/inscription.php}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=9, name=state9}}
		mutateDOMTree(0);
		checkState0_OriginalAssertions();
		checkState0_ReusedAssertions();
		checkState0_GeneratedAssertions();
		checkState0_LearnedAssertions();
		checkState0_AllAssertions();
		checkState0_RandAssertions1();
		checkState0_RandAssertions2();
		checkState0_RandAssertions3();
		checkState0_RandAssertions4();
		checkState0_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/P[1]/A[2]")).click();
		//From state 9 to state 11
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvaW5zY3JpcHRpb24ucGhw, target=_top}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=11, name=state11}}
		mutateDOMTree(9);
		checkState9_OriginalAssertions();
		checkState9_ReusedAssertions();
		checkState9_GeneratedAssertions();
		checkState9_LearnedAssertions();
		checkState9_AllAssertions();
		checkState9_RandAssertions1();
		checkState9_RandAssertions2();
		checkState9_RandAssertions3();
		checkState9_RandAssertions4();
		checkState9_RandAssertions5();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 11 to state 19
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZhVzV6WTNKcGNIUnBiMjR1Y0dodw%3D%3D, target=_top}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=19, name=state19}}
		mutateDOMTree(11);
		checkState11_OriginalAssertions();
		checkState11_ReusedAssertions();
		checkState11_GeneratedAssertions();
		checkState11_LearnedAssertions();
		checkState11_AllAssertions();
		checkState11_RandAssertions1();
		checkState11_RandAssertions2();
		checkState11_RandAssertions3();
		checkState11_RandAssertions4();
		checkState11_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 19 to state 55
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1poVnpWNldUTktjR05JVW5CaU1qUjFZMGRvZHclM0QlM0Q%3D, target=_top}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=55, name=state55}}
		mutateDOMTree(19);
		checkState19_OriginalAssertions();
		checkState19_ReusedAssertions();
		checkState19_GeneratedAssertions();
		checkState19_LearnedAssertions();
		checkState19_AllAssertions();
		checkState19_RandAssertions1();
		checkState19_RandAssertions2();
		checkState19_RandAssertions3();
		checkState19_RandAssertions4();
		checkState19_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 55 to state 58
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcG9WbnBXTmxkVVRrdGpSMDVKVlc1Q2FVMXFVakZaTUdSdlpIY2xNMFFsTTBRJTNE, target=_top}}, source=StateVertexImpl{id=55, name=state55}, target=StateVertexImpl{id=58, name=state58}}
		mutateDOMTree(55);
		checkState55_OriginalAssertions();
		checkState55_ReusedAssertions();
		checkState55_GeneratedAssertions();
		checkState55_LearnedAssertions();
		checkState55_AllAssertions();
		checkState55_RandAssertions1();
		checkState55_RandAssertions2();
		checkState55_RandAssertions3();
		checkState55_RandAssertions4();
		checkState55_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 58 to state 66
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjRzlXYm5CWFRteGtWVlJyZEdwU01EVktWbGMxUTJGVk1YRlZha1phVFVkU2RscElZMnhOTUZGc1RUQlJKVE5F, target=_top}}, source=StateVertexImpl{id=58, name=state58}, target=StateVertexImpl{id=66, name=state66}}
		mutateDOMTree(58);
		checkState58_OriginalAssertions();
		checkState58_ReusedAssertions();
		checkState58_GeneratedAssertions();
		checkState58_LearnedAssertions();
		checkState58_AllAssertions();
		checkState58_RandAssertions1();
		checkState58_RandAssertions2();
		checkState58_RandAssertions3();
		checkState58_RandAssertions4();
		checkState58_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 66 to state 67
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqUnpsWFltNUNXRlJ0ZUd0V1ZsSnlaRWR3VTAxRVZrdFdiR014VVRKR1ZrMVlSbFpoYTFwaFZGVmtVMlJzY0VsWk1uaE9UVVpHYzFSVVFsSktWRTVG, target=_top}}, source=StateVertexImpl{id=66, name=state66}, target=StateVertexImpl{id=67, name=state67}}
		mutateDOMTree(66);
		checkState66_OriginalAssertions();
		checkState66_ReusedAssertions();
		checkState66_GeneratedAssertions();
		checkState66_LearnedAssertions();
		checkState66_AllAssertions();
		checkState66_RandAssertions1();
		checkState66_RandAssertions2();
		checkState66_RandAssertions3();
		checkState66_RandAssertions4();
		checkState66_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 67 to state 76
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVVucHNXRmx0TlVOWFJsSjBaVWQwVjFac1NubGFSV1IzVlRBeFJWWnJkRmRpUjAxNFZWUktSMVpyTVZsU2JGcG9ZVEZ3YUZaR1ZtdFZNbEp6WTBWc1drMXVhRTlVVlZwSFl6RlNWVkZzU2t0V1JUVkc%3D, target=_top}}, source=StateVertexImpl{id=67, name=state67}, target=StateVertexImpl{id=76, name=state76}}
		mutateDOMTree(67);
		checkState67_OriginalAssertions();
		checkState67_ReusedAssertions();
		checkState67_GeneratedAssertions();
		checkState67_LearnedAssertions();
		checkState67_AllAssertions();
		checkState67_RandAssertions1();
		checkState67_RandAssertions2();
		checkState67_RandAssertions3();
		checkState67_RandAssertions4();
		checkState67_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 76 to state 86
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVnVjSE5YUm14MFRsVk9XRkpzU2pCYVZXUXdWakZhYzFOdWJHRlNWMUl6VmxSQmVGSldXbkprUm1ScFVqQXhORlpXVWt0U01WcHlUVlpzVTJKR2NHOVpWRVozWVVaYVIxWnRkRlpOYkVwNldUQldjMWRyTVhWaFJUbFZWbFp3U0ZsNlJsTldWa1p6VTJ0MFYxSlVWa2MlM0Q%3D, target=_top}}, source=StateVertexImpl{id=76, name=state76}, target=StateVertexImpl{id=86, name=state86}}
		mutateDOMTree(76);
		checkState76_OriginalAssertions();
		checkState76_ReusedAssertions();
		checkState76_GeneratedAssertions();
		checkState76_LearnedAssertions();
		checkState76_AllAssertions();
		checkState76_RandAssertions1();
		checkState76_RandAssertions2();
		checkState76_RandAssertions3();
		checkState76_RandAssertions4();
		checkState76_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 86 to state 88
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVm5WalNFNVlVbTE0TUZSc1ZrOVhSa3B6VTJwQ1lWWlhVWGRXYWtaaFl6Rk9kV0pIUmxOV01VbDZWbXhTUW1WR1NsZFhia3ByVW0xU2NGVnFRWGhPUmxwWFZXdDBVMDFXY0hsVVZscHpWVEpLUjJOSE9WcFdSVm96V1ZWYVlWSXhXblJrUmxwT1lrVndObGRVUWxkak1XUnlUVmhXYUZKVWJGWldiRnAzVTBac05sSnNUbGRXYTFwNlZUSjBNRll4U2xWV2EyTWxNMFElM0Q%3D, target=_top}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=88, name=state88}}
		mutateDOMTree(86);
		checkState86_OriginalAssertions();
		checkState86_ReusedAssertions();
		checkState86_GeneratedAssertions();
		checkState86_LearnedAssertions();
		checkState86_AllAssertions();
		checkState86_RandAssertions1();
		checkState86_RandAssertions2();
		checkState86_RandAssertions3();
		checkState86_RandAssertions4();
		checkState86_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 88 to state 114
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2twbFYwWkhZa1prVjAweWFIaFdSM1JyVlcxV1IyTkZaR0ZTYlZKd1ZqQmFTMVl4V2tkYVJGSlVUVlZzTkZaV2FHOVhSMHB5VGxab1YyRnJTak5XTVZwelZteGtkRTlXY0ZkaVIzY3lWMVpXYTJJeGJGZFhXSEJvVWpKb1YxbHNhRzlYUm10NVRWWk9VMDFXU25sVWJGcFBWVEZhZFZGdGFGZGlWRVV3V1ZSQmVGTkdUbGxoUjJ4VFlraENVRlpVUW10aU1rNVhWbTVXYWxORk5WbFZiVEUwVFVaU2MxWnJPVmhTYTNCNlZUSndRMWxXV2xoVldHUlhZV3RhYUZsNlJrOWtWMHBJVW14T1YwMVZiRFpXYlhoVFVXMVdSMU5zWkZoaWEzQnlWVzB4VTJOR1ZuRlJXR2hQVW14d1dGWlhkREJWTURGWFkwaHNWVlpzY0hwV1ZFcExVakpPU0U5V2NGZFNWbTk2VjFaV1lWbFdTWGhYYmxKclVteHdUMWxyVm5kT2JHUlZVV3hrYWsxWFVubFVWbWhYWVVaS1ZXSkdXbGRpUm5BelZUQmFjMDVzU25OVWJHUlhZVEZ3TmxaVVNqQk5SbGw0VTJ4V1YyRXlUV3hOTUZFbE0wUSUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=114, name=state114}}
		mutateDOMTree(88);
		checkState88_OriginalAssertions();
		checkState88_ReusedAssertions();
		checkState88_GeneratedAssertions();
		checkState88_LearnedAssertions();
		checkState88_AllAssertions();
		checkState88_RandAssertions1();
		checkState88_RandAssertions2();
		checkState88_RandAssertions3();
		checkState88_RandAssertions4();
		checkState88_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 114 to state 133
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2twbFYwWkhZa1prVjAweWFIaFdSM1JyVlcxV1IyTkZaR0ZTYlZKd1ZqQmFTMVl4V2tkYVJGSlVUVlZzTkZaV2FHOVhSMHB5VGxab1YyRnJTak5XTVZwelZteGtkRTlXY0ZkaVIzY3lWMVpXYTJJeGJGZFhXSEJvVWpKb1YxbHNhRzlYUm10NVRWWk9VMDFXU25sVWJGcFBWVEZhZFZGdGFGZGlWRVV3V1ZSQmVGTkdUbGxoUjJ4VFlraENVRlpVUW10aU1rNVhWbGhrVjJFelVsaFVWbVEwVFVaU2MxWnJPV2xTTUhCS1ZWZDBiMVl3TVhGV2JFSlhZV3RHTkZZd1pGTk9iRTV6VjJ4a2JHRXhXWHBXYlRGM1VXMVdSMU5zWkZoaWEzQnhWVzB4YjFkR2JISlhibVJPWWtkU1dGWlhkR3RXTURGWFkwaHNWVlpzV25wWFZscExWbGRLUjJGR1dtbFNNbWhGVjFkd1IxbFdaRVpOVld4b1VqSjRUMVp0ZEhkVFZtUllaRWRHYVUxcmNFaFdSM1J2Vm0xS1NHRkdXbGRpV0dnelZGUkdVMVl4WkhWVWJYQnBVMFZLUzFaclpEUlpWbEp6VjJ4c1VtRXlhRmhaVjNSeVpVWmtWMWRzY0d4U2JWSjVWako0VTJGV1dYbGhSbWhYVW0xU00xVnFSbFpsUjA1SFYyMUdVMVp1UW5wWFYzUnZVVEZPUjFkWWJFNVhSVFZ2Vm0xek1WSXhWWGxqUm1SWFRVUkdXRmt3V2xOV01VcEdZMFZrWVZKRlJYaFdha1ozVTBkT1IxUnRiRlJTVlc5NVZtMTRhMlF4UlhoaVJtUmhVbTFTY0ZWdE1UUmpWbFp6V2taT2FrMVdjREJhVldoUFZERmFjMU51Y0ZwV1YxRjNWakJhU21ReVRrWmhSbkJPVW01Q05sWnRjRWRUTWsxNFZHNUthRkp0YUZoWmEyaERZakZhU0UxVVVsUk5hekUwVm0wMVQxZEhTbGhsUmxKVlZteGFNMVpIZUdGamJHdDZZVVU1VTJKSGR6RldhMXB2WWpGVmVWTnVTazlXYkhCaFdWUkdWbVZHV2tWU2JrNVlWakExUjFZeU1UUmhWa3AxVVZoa1dHRXhXbWhaVkVaaFkyc3hWMWRyTlZkU2EzQlpWbTB3ZUdJeVZuTlhiazVZWWxoU1ZWVnFRbUZUYkZaWVpVZEdhRlpzY0VkV2JHaHJWakpLV1dGSGFGcGxhM0JVVlRCYVlXTnRTa2hTYkU1T1RVVndWbFl4WkRCWlYxRjNUbFZrV0dKR1dsVlpiVEZUVmpGU1YxZHJkR3hpUm13MVZHeGFUMVl5U2xaalJFWldWak5vZGxadE1VdFdWa3AxVjJ4d1RtSnRhRFpYVkVvMFlUSk9kRlZyWkdoU2JWSlBWVzAxUTFSR1dYaFhiR1JhVm0xNFdWVnRlR3RXUm1SSVpVYzVWbUV4V2pOV01GcHpWbFpLZFZwSGNHbFNiSEEwVmxSS05GUXhWWGROVm1SWVlXdGFWMWxzYUc5V1JteFhWMnR3YkZZd1draFphMXByVmpBd2VXRklhRmRTTTFKeVZsY3hWMUl5VGtaYVIwWlRZbFpLZDFacVFtRlRNVmw0VjJ0a1lWSkdTbFZVVmxaelRrWmFWMkZIT1ZoU01IQjVWR3hhYjFZeVJuSlRhazVYVFZad2VsWnRlR3RrUlRsWFkwWmthVkl6WTNsV01WcFhZVEpKZUdKR1pGaFhTRUp2VldwS2IxWXhiSE5oUnpsWVVtMTBOVlJXV2s5Vk1ERlhVMjVzVldKR2NGQldWRVpoWkZaR2RHRkdaR2xXUlZWM1YxWlNRbVZHVGtkVWJHeG9Vako0VkZscmFFTlZSbHBWVVcxMGFVMXJOVmhXYlRWWFlXeE9SazVXYkZaaVZFVXdWRlZhVTJNeFduSlBWbWhUWVROQ05sWlVTbmRSTVd4WFYyeG9WbGRIVWxoWlYzUmhZVVpzTmxKck9XdFdNSEJKVlcxNFQxWXdNVlppUkZwWFlsaG9WRlZYTVZkU01VNXpXa1pvYVdFelFubFdWekI0VlRKT1IxWnVSbEpYUjJoUVZXMTRkMWRHV2xoa1JFSldUVVJHV0Zrd2FITldWbHB6WTBod1YxWkZjRXhWYWtwUFUwVTVWMk5HWkZOV2JUazJWakZhVjFsV2JGZFRXR2hZWW14S2NsVnRlSGRVTVd4eVZtNWtUMkpIVWxaVlYzaHJZV3N4V0ZWdWJGVldiV2hZV1ZWYVMxWlhTa2RYYkdScFVtNUJlbFpVUW1Gak1EVnpVMjVPVldKSFVsaFpWRVozVG14YVZWTnFRazVTYkd3MFZUSjRWMVl5UlhsVVYzaE9UVVpGYkUwd1VTVXpSQSUzRCUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=114, name=state114}, target=StateVertexImpl{id=133, name=state133}}
		mutateDOMTree(114);
		checkState114_OriginalAssertions();
		checkState114_ReusedAssertions();
		checkState114_GeneratedAssertions();
		checkState114_LearnedAssertions();
		checkState114_AllAssertions();
		checkState114_RandAssertions1();
		checkState114_RandAssertions2();
		checkState114_RandAssertions3();
		checkState114_RandAssertions4();
		checkState114_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//Sink node at state 133
		mutateDOMTree(133);
		checkState133_OriginalAssertions();
		checkState133_ReusedAssertions();
		checkState133_GeneratedAssertions();
		checkState133_LearnedAssertions();
		checkState133_AllAssertions();
		checkState133_RandAssertions1();
		checkState133_RandAssertions2();
		checkState133_RandAssertions3();
		checkState133_RandAssertions4();
		checkState133_RandAssertions5();
	}



	public void checkState0_OriginalAssertions(){
	}

	public void checkState0_ReusedAssertions(){
	}

	public void checkState0_GeneratedAssertions(){
	}

	public void checkState0_LearnedAssertions(){
	}

	public void checkState0_AllAssertions(){
	}

	public void checkState0_RandAssertions1(){
		
	}

	public void checkState0_RandAssertions2(){
		
	}

	public void checkState0_RandAssertions3(){
		
	}

	public void checkState0_RandAssertions4(){
		
	}

	public void checkState0_RandAssertions5(){
		
	}

	public void checkState9_OriginalAssertions(){
	}

	public void checkState9_ReusedAssertions(){
	}

	public void checkState9_GeneratedAssertions(){
	}

	public void checkState9_LearnedAssertions(){
	}

	public void checkState9_AllAssertions(){
	}

	public void checkState9_RandAssertions1(){
	}

	public void checkState9_RandAssertions2(){
	}

	public void checkState9_RandAssertions3(){
	}

	public void checkState9_RandAssertions4(){
	}

	public void checkState9_RandAssertions5(){
	}

	public void checkState11_OriginalAssertions(){
	}

	public void checkState11_ReusedAssertions(){
	}

	public void checkState11_GeneratedAssertions(){
	}

	public void checkState11_LearnedAssertions(){
	}

	public void checkState11_AllAssertions(){
	}

	public void checkState11_RandAssertions1(){
	}

	public void checkState11_RandAssertions2(){
	}

	public void checkState11_RandAssertions3(){
	}

	public void checkState11_RandAssertions4(){
	}

	public void checkState11_RandAssertions5(){
	}

	public void checkState19_OriginalAssertions(){
	}

	public void checkState19_ReusedAssertions(){
	}

	public void checkState19_GeneratedAssertions(){
	}

	public void checkState19_LearnedAssertions(){
	}

	public void checkState19_AllAssertions(){
	}

	public void checkState19_RandAssertions1(){
	}

	public void checkState19_RandAssertions2(){
	}

	public void checkState19_RandAssertions3(){
	}

	public void checkState19_RandAssertions4(){
	}

	public void checkState19_RandAssertions5(){
	}

	public void checkState55_OriginalAssertions(){
	}

	public void checkState55_ReusedAssertions(){
	}

	public void checkState55_GeneratedAssertions(){
	}

	public void checkState55_LearnedAssertions(){
	}

	public void checkState55_AllAssertions(){
	}

	public void checkState55_RandAssertions1(){
	}

	public void checkState55_RandAssertions2(){
	}

	public void checkState55_RandAssertions3(){
	}

	public void checkState55_RandAssertions4(){
	}

	public void checkState55_RandAssertions5(){
	}

	public void checkState58_OriginalAssertions(){
	}

	public void checkState58_ReusedAssertions(){
	}

	public void checkState58_GeneratedAssertions(){
	}

	public void checkState58_LearnedAssertions(){
	}

	public void checkState58_AllAssertions(){
	}

	public void checkState58_RandAssertions1(){
	}

	public void checkState58_RandAssertions2(){
	}

	public void checkState58_RandAssertions3(){
	}

	public void checkState58_RandAssertions4(){
	}

	public void checkState58_RandAssertions5(){
	}

	public void checkState66_OriginalAssertions(){
	}

	public void checkState66_ReusedAssertions(){
	}

	public void checkState66_GeneratedAssertions(){
	}

	public void checkState66_LearnedAssertions(){
	}

	public void checkState66_AllAssertions(){
	}

	public void checkState66_RandAssertions1(){
	}

	public void checkState66_RandAssertions2(){
	}

	public void checkState66_RandAssertions3(){
	}

	public void checkState66_RandAssertions4(){
	}

	public void checkState66_RandAssertions5(){
	}

	public void checkState67_OriginalAssertions(){
	}

	public void checkState67_ReusedAssertions(){
	}

	public void checkState67_GeneratedAssertions(){
	}

	public void checkState67_LearnedAssertions(){
	}

	public void checkState67_AllAssertions(){
	}

	public void checkState67_RandAssertions1(){
	}

	public void checkState67_RandAssertions2(){
	}

	public void checkState67_RandAssertions3(){
	}

	public void checkState67_RandAssertions4(){
	}

	public void checkState67_RandAssertions5(){
	}

	public void checkState76_OriginalAssertions(){
	}

	public void checkState76_ReusedAssertions(){
	}

	public void checkState76_GeneratedAssertions(){
	}

	public void checkState76_LearnedAssertions(){
	}

	public void checkState76_AllAssertions(){
	}

	public void checkState76_RandAssertions1(){
	}

	public void checkState76_RandAssertions2(){
	}

	public void checkState76_RandAssertions3(){
	}

	public void checkState76_RandAssertions4(){
	}

	public void checkState76_RandAssertions5(){
	}

	public void checkState86_OriginalAssertions(){
	}

	public void checkState86_ReusedAssertions(){
	}

	public void checkState86_GeneratedAssertions(){
	}

	public void checkState86_LearnedAssertions(){
	}

	public void checkState86_AllAssertions(){
	}

	public void checkState86_RandAssertions1(){
	}

	public void checkState86_RandAssertions2(){
	}

	public void checkState86_RandAssertions3(){
	}

	public void checkState86_RandAssertions4(){
	}

	public void checkState86_RandAssertions5(){
	}

	public void checkState88_OriginalAssertions(){
	}

	public void checkState88_ReusedAssertions(){
	}

	public void checkState88_GeneratedAssertions(){
	}

	public void checkState88_LearnedAssertions(){
	}

	public void checkState88_AllAssertions(){
	}

	public void checkState88_RandAssertions1(){
	}

	public void checkState88_RandAssertions2(){
	}

	public void checkState88_RandAssertions3(){
	}

	public void checkState88_RandAssertions4(){
	}

	public void checkState88_RandAssertions5(){
	}

	public void checkState114_OriginalAssertions(){
	}

	public void checkState114_ReusedAssertions(){
	}

	public void checkState114_GeneratedAssertions(){
	}

	public void checkState114_LearnedAssertions(){
	}

	public void checkState114_AllAssertions(){
	}

	public void checkState114_RandAssertions1(){
	}

	public void checkState114_RandAssertions2(){
	}

	public void checkState114_RandAssertions3(){
	}

	public void checkState114_RandAssertions4(){
	}

	public void checkState114_RandAssertions5(){
	}

	public void checkState133_OriginalAssertions(){
	}

	public void checkState133_ReusedAssertions(){
	}

	public void checkState133_GeneratedAssertions(){
	}

	public void checkState133_LearnedAssertions(){
	}

	public void checkState133_AllAssertions(){
	}

	public void checkState133_RandAssertions1(){
	}

	public void checkState133_RandAssertions2(){
	}

	public void checkState133_RandAssertions3(){
	}

	public void checkState133_RandAssertions4(){
	}

	public void checkState133_RandAssertions5(){
	}



	/*
	 * Auxiliary methods 
	 */

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


	private boolean isElementPatternTagPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);

				// check parent node's tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parentTagName.equals(parent.getTagName()))
					continue;
		
				// check children nodes' tags
				HashSet<String> childrenTagNameFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagNameFromDOM.add(sourceElement.getChildNodes().item(j).getNodeName());
				HashSet<String> childrenTagNameToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTagNameToTest.add(children.get(k).getTagName());
				if (!childrenTagNameToTest.equals(childrenTagNameFromDOM))
					continue;

				return true;		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


	private boolean isElementPatternFullPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				// check node's attributes
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);
				NamedNodeMap elementAttList = sourceElement.getAttributes();
				HashSet<String> elemetAtts = new HashSet<String>();
				for (int j = 0; j < elementAttList.getLength(); j++)
					elemetAtts.add(elementAttList.item(j).getNodeName() + "=\"" + elementAttList.item(j).getNodeValue() + "\"");
				if (!element.getAttributes().equals(elemetAtts))
					continue;
				
				// check parent node's tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parentTagName.equals(parent.getTagName()))
					continue;
				NamedNodeMap parentAttList = sourceElement.getParentNode().getAttributes();
				HashSet<String> parentAtts = new HashSet<String>();
				for (int j = 0; j < parentAttList.getLength(); j++)
					parentAtts.add(parentAttList.item(j).getNodeName() + "=\"" + parentAttList.item(j).getNodeValue() + "\"");
				if (!parent.getAttributes().equals(parentAtts))
					continue;
		
				// check children nodes' tags
				HashSet<String> childrenTagNameFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagNameFromDOM.add(sourceElement.getChildNodes().item(j).getNodeName());
				HashSet<String> childrenTagNameToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTagNameToTest.add(children.get(k).getTagName());
				if (!childrenTagNameToTest.equals(childrenTagNameFromDOM))
					continue;
				
				// check children nodes' attributes
				HashSet<HashSet<String>> childrenAttsFromDOM = new HashSet<HashSet<String>>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++){
					NamedNodeMap childAttListFromDOM = sourceElement.getChildNodes().item(j).getAttributes();
					HashSet<String> childAtts = new HashSet<String>();
					if (childAttListFromDOM!=null)
						for (int k = 0; k < childAttListFromDOM.getLength(); k++)
							childAtts.add(childAttListFromDOM.item(k).getNodeName() + "=\"" + childAttListFromDOM.item(k).getNodeValue() + "\"");
					childrenAttsFromDOM.add(childAtts);
				}
				HashSet<HashSet<String>> childrenAttsToTest = new HashSet<HashSet<String>>();				
				for (int k=0; k<children.size();k++)
					childrenAttsToTest.add(children.get(k).getAttributes());
				
				if (!childrenAttsToTest.equals(childrenAttsFromDOM))
					continue;
				
				return true;		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
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

	public class DOMElement {
		private String tagName;
		private String textContent;
		private HashSet<String> attributes = new HashSet<String>();

		public DOMElement(String tagName, String textContent, ArrayList<String> attributes){
			this.tagName = tagName;
			this.textContent = textContent;
			
			if (attributes.get(0)!="")
				for (int i=0; i<attributes.size();i++)
					this.attributes.add(attributes.get(i));
		}

		public String getTagName() {
			return tagName;
		}

		public String getTextContent() {
			return textContent;
		}

		public HashSet<String> getAttributes() {
			return attributes;
		}
	}
	
	private void mutateDOMTree(int stateID){
	// execute JavaScript code to mutate DOM
	String code = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.mutateDOMTreeCode(stateID);
		if (code!= null){
			long RandomlySelectedDOMElementID = (long) ((JavascriptExecutor)driver).executeScript(code);
			int MutationOperatorCode = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.MutationOperatorCode;
			int StateToBeMutated = com.crawljax.plugins.testsuiteextension.TestSuiteExtension.StateToBeMutated;	
			com.crawljax.plugins.testsuiteextension.TestSuiteExtension.SelectedRandomElementInDOM[MutationOperatorCode][StateToBeMutated]
					= (int) RandomlySelectedDOMElementID;
		}
	}
 

}