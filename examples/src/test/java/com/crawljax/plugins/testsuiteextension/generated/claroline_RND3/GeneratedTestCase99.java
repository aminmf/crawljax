package com.crawljax.plugins.testsuiteextension.generated.claroline_RND3;

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
 * Generated @ Sun Apr 13 20:10:58 PDT 2014
 */

public class GeneratedTestCase99 {

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
	public void method99(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text= Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1]")).click();
		//From state 1 to state 2
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw, target=_top}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=2, name=state2}}
		mutateDOMTree(1);
		checkState1_OriginalAssertions();
		checkState1_ReusedAssertions();
		checkState1_GeneratedAssertions();
		checkState1_LearnedAssertions();
		checkState1_AllAssertions();
		checkState1_RandAssertions1();
		checkState1_RandAssertions2();
		checkState1_RandAssertions3();
		checkState1_RandAssertions4();
		checkState1_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 2 to state 5
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=/claroline-1.11.7/claroline/}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=5, name=state5}}
		mutateDOMTree(2);
		checkState2_OriginalAssertions();
		checkState2_ReusedAssertions();
		checkState2_GeneratedAssertions();
		checkState2_LearnedAssertions();
		checkState2_AllAssertions();
		checkState2_RandAssertions1();
		checkState2_RandAssertions2();
		checkState2_RandAssertions3();
		checkState2_RandAssertions4();
		checkState2_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1]")).click();
		//From state 5 to state 14
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=14, name=state14}}
		mutateDOMTree(5);
		checkState5_OriginalAssertions();
		checkState5_ReusedAssertions();
		checkState5_GeneratedAssertions();
		checkState5_LearnedAssertions();
		checkState5_AllAssertions();
		checkState5_RandAssertions1();
		checkState5_RandAssertions2();
		checkState5_RandAssertions3();
		checkState5_RandAssertions4();
		checkState5_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 14 to state 23
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2, target=_top}}, source=StateVertexImpl{id=14, name=state14}, target=StateVertexImpl{id=23, name=state23}}
		mutateDOMTree(14);
		checkState14_OriginalAssertions();
		checkState14_ReusedAssertions();
		checkState14_GeneratedAssertions();
		checkState14_LearnedAssertions();
		checkState14_AllAssertions();
		checkState14_RandAssertions1();
		checkState14_RandAssertions2();
		checkState14_RandAssertions3();
		checkState14_RandAssertions4();
		checkState14_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 23 to state 28
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjI%3D, target=_top}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=28, name=state28}}
		mutateDOMTree(23);
		checkState23_OriginalAssertions();
		checkState23_ReusedAssertions();
		checkState23_GeneratedAssertions();
		checkState23_LearnedAssertions();
		checkState23_AllAssertions();
		checkState23_RandAssertions1();
		checkState23_RandAssertions2();
		checkState23_RandAssertions3();
		checkState23_RandAssertions4();
		checkState23_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 28 to state 43
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSSUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=43, name=state43}}
		mutateDOMTree(28);
		checkState28_OriginalAssertions();
		checkState28_ReusedAssertions();
		checkState28_GeneratedAssertions();
		checkState28_LearnedAssertions();
		checkState28_AllAssertions();
		checkState28_RandAssertions1();
		checkState28_RandAssertions2();
		checkState28_RandAssertions3();
		checkState28_RandAssertions4();
		checkState28_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 43 to state 111
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTU1V6UkElM0QlM0Q%3D, target=_top}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=111, name=state111}}
		mutateDOMTree(43);
		checkState43_OriginalAssertions();
		checkState43_ReusedAssertions();
		checkState43_GeneratedAssertions();
		checkState43_LearnedAssertions();
		checkState43_AllAssertions();
		checkState43_RandAssertions1();
		checkState43_RandAssertions2();
		checkState43_RandAssertions3();
		checkState43_RandAssertions4();
		checkState43_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 111 to state 116
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRVMVY2VWtFbE0wUWxNMFElM0Q%3D, target=_top}}, source=StateVertexImpl{id=111, name=state111}, target=StateVertexImpl{id=116, name=state116}}
		mutateDOMTree(111);
		checkState111_OriginalAssertions();
		checkState111_ReusedAssertions();
		checkState111_GeneratedAssertions();
		checkState111_LearnedAssertions();
		checkState111_AllAssertions();
		checkState111_RandAssertions1();
		checkState111_RandAssertions2();
		checkState111_RandAssertions3();
		checkState111_RandAssertions4();
		checkState111_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 116 to state 126
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSVk1WWTJWV3RGYkUwd1VXeE5NRkVsTTBRJTNE, target=_top}}, source=StateVertexImpl{id=116, name=state116}, target=StateVertexImpl{id=126, name=state126}}
		mutateDOMTree(116);
		checkState116_OriginalAssertions();
		checkState116_ReusedAssertions();
		checkState116_GeneratedAssertions();
		checkState116_LearnedAssertions();
		checkState116_AllAssertions();
		checkState116_RandAssertions1();
		checkState116_RandAssertions2();
		checkState116_RandAssertions3();
		checkState116_RandAssertions4();
		checkState116_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//Sink node at state 126
		mutateDOMTree(126);
		checkState126_OriginalAssertions();
		checkState126_ReusedAssertions();
		checkState126_GeneratedAssertions();
		checkState126_LearnedAssertions();
		checkState126_AllAssertions();
		checkState126_RandAssertions1();
		checkState126_RandAssertions2();
		checkState126_RandAssertions3();
		checkState126_RandAssertions4();
		checkState126_RandAssertions5();
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

	public void checkState1_OriginalAssertions(){
	}

	public void checkState1_ReusedAssertions(){
	}

	public void checkState1_GeneratedAssertions(){
	}

	public void checkState1_LearnedAssertions(){
	}

	public void checkState1_AllAssertions(){
	}

	public void checkState1_RandAssertions1(){
	}

	public void checkState1_RandAssertions2(){
	}

	public void checkState1_RandAssertions3(){
	}

	public void checkState1_RandAssertions4(){
	}

	public void checkState1_RandAssertions5(){
	}

	public void checkState2_OriginalAssertions(){
	}

	public void checkState2_ReusedAssertions(){
	}

	public void checkState2_GeneratedAssertions(){
	}

	public void checkState2_LearnedAssertions(){
	}

	public void checkState2_AllAssertions(){
	}

	public void checkState2_RandAssertions1(){
	}

	public void checkState2_RandAssertions2(){
	}

	public void checkState2_RandAssertions3(){
	}

	public void checkState2_RandAssertions4(){
	}

	public void checkState2_RandAssertions5(){
	}

	public void checkState5_OriginalAssertions(){
	}

	public void checkState5_ReusedAssertions(){
	}

	public void checkState5_GeneratedAssertions(){
	}

	public void checkState5_LearnedAssertions(){
	}

	public void checkState5_AllAssertions(){
	}

	public void checkState5_RandAssertions1(){
	}

	public void checkState5_RandAssertions2(){
	}

	public void checkState5_RandAssertions3(){
	}

	public void checkState5_RandAssertions4(){
	}

	public void checkState5_RandAssertions5(){
	}

	public void checkState14_OriginalAssertions(){
	}

	public void checkState14_ReusedAssertions(){
	}

	public void checkState14_GeneratedAssertions(){
	}

	public void checkState14_LearnedAssertions(){
	}

	public void checkState14_AllAssertions(){
	}

	public void checkState14_RandAssertions1(){
	}

	public void checkState14_RandAssertions2(){
	}

	public void checkState14_RandAssertions3(){
	}

	public void checkState14_RandAssertions4(){
	}

	public void checkState14_RandAssertions5(){
	}

	public void checkState23_OriginalAssertions(){
	}

	public void checkState23_ReusedAssertions(){
	}

	public void checkState23_GeneratedAssertions(){
	}

	public void checkState23_LearnedAssertions(){
	}

	public void checkState23_AllAssertions(){
	}

	public void checkState23_RandAssertions1(){
	}

	public void checkState23_RandAssertions2(){
	}

	public void checkState23_RandAssertions3(){
	}

	public void checkState23_RandAssertions4(){
	}

	public void checkState23_RandAssertions5(){
	}

	public void checkState28_OriginalAssertions(){
	}

	public void checkState28_ReusedAssertions(){
	}

	public void checkState28_GeneratedAssertions(){
	}

	public void checkState28_LearnedAssertions(){
	}

	public void checkState28_AllAssertions(){
	}

	public void checkState28_RandAssertions1(){
	}

	public void checkState28_RandAssertions2(){
	}

	public void checkState28_RandAssertions3(){
	}

	public void checkState28_RandAssertions4(){
	}

	public void checkState28_RandAssertions5(){
	}

	public void checkState43_OriginalAssertions(){
	}

	public void checkState43_ReusedAssertions(){
	}

	public void checkState43_GeneratedAssertions(){
	}

	public void checkState43_LearnedAssertions(){
	}

	public void checkState43_AllAssertions(){
	}

	public void checkState43_RandAssertions1(){
	}

	public void checkState43_RandAssertions2(){
	}

	public void checkState43_RandAssertions3(){
	}

	public void checkState43_RandAssertions4(){
	}

	public void checkState43_RandAssertions5(){
	}

	public void checkState111_OriginalAssertions(){
	}

	public void checkState111_ReusedAssertions(){
	}

	public void checkState111_GeneratedAssertions(){
	}

	public void checkState111_LearnedAssertions(){
	}

	public void checkState111_AllAssertions(){
	}

	public void checkState111_RandAssertions1(){
	}

	public void checkState111_RandAssertions2(){
	}

	public void checkState111_RandAssertions3(){
	}

	public void checkState111_RandAssertions4(){
	}

	public void checkState111_RandAssertions5(){
	}

	public void checkState116_OriginalAssertions(){
	}

	public void checkState116_ReusedAssertions(){
	}

	public void checkState116_GeneratedAssertions(){
	}

	public void checkState116_LearnedAssertions(){
	}

	public void checkState116_AllAssertions(){
	}

	public void checkState116_RandAssertions1(){
	}

	public void checkState116_RandAssertions2(){
	}

	public void checkState116_RandAssertions3(){
	}

	public void checkState116_RandAssertions4(){
	}

	public void checkState116_RandAssertions5(){
	}

	public void checkState126_OriginalAssertions(){
	}

	public void checkState126_ReusedAssertions(){
	}

	public void checkState126_GeneratedAssertions(){
	}

	public void checkState126_LearnedAssertions(){
	}

	public void checkState126_AllAssertions(){
	}

	public void checkState126_RandAssertions1(){
	}

	public void checkState126_RandAssertions2(){
	}

	public void checkState126_RandAssertions3(){
	}

	public void checkState126_RandAssertions4(){
	}

	public void checkState126_RandAssertions5(){
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