package com.crawljax.plugins.testilizer.generated.claroline_RAND;

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
 * Generated @ Fri Apr 18 00:45:05 PDT 2014
 */

public class GeneratedTestCase8 {

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
		getCoverageReport = com.crawljax.plugins.testilizer.Testilizer.getCoverageReport();
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
	public void method8(){
		driver.get(url);
		//From state 0 to state 1
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Claroline, attributes={href=/claroline-1.11.7/index.php, target=_top}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/SPAN[1]/A[1]")).click();
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
		//From state 2 to state 4
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={href=/claroline-1.11.7/claroline/}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=4, name=state4}}
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
		//From state 4 to state 5
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv, target=_top}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=5, name=state5}}
		mutateDOMTree(4);
		checkState4_OriginalAssertions();
		checkState4_ReusedAssertions();
		checkState4_GeneratedAssertions();
		checkState4_LearnedAssertions();
		checkState4_AllAssertions();
		checkState4_RandAssertions1();
		checkState4_RandAssertions2();
		checkState4_RandAssertions3();
		checkState4_RandAssertions4();
		checkState4_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 5 to state 9
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2YVc1a1pYZ3VjR2h3UDJ4dloyOTFkRDEwY25WbA%3D%3D, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=9, name=state9}}
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
		//From state 9 to state 18
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJZVmMxYTFwWVozVmpSMmgzVURKNGRsb3lPVEZrUkRFd1kyNVdiQSUzRCUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=18, name=state18}}
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
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 18 to state 20
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlpWbU14WVRGd1dWb3pWbXBTTW1nelZVUktOR1JzYjNsUFZFWnJVa1JGZDFreU5WZGlRU1V6UkNVelJBJTNEJTNE, target=_top}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=20, name=state20}}
		mutateDOMTree(18);
		checkState18_OriginalAssertions();
		checkState18_ReusedAssertions();
		checkState18_GeneratedAssertions();
		checkState18_LearnedAssertions();
		checkState18_AllAssertions();
		checkState18_RandAssertions1();
		checkState18_RandAssertions2();
		checkState18_RandAssertions3();
		checkState18_RandAssertions4();
		checkState18_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 20 to state 25
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbHBXYlUxNFdWUkdkMWRXYjNwV2JYQlRUVzFuZWxaVlVrdE9SMUp6WWpOc1VGWkZXbkpWYTFKR1pERnJlVTVXWkdsUlUxVjZVa05WZWxKQkpUTkVKVE5F, target=_top}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=25, name=state25}}
		mutateDOMTree(20);
		checkState20_OriginalAssertions();
		checkState20_ReusedAssertions();
		checkState20_GeneratedAssertions();
		checkState20_LearnedAssertions();
		checkState20_AllAssertions();
		checkState20_RandAssertions1();
		checkState20_RandAssertions2();
		checkState20_RandAssertions3();
		checkState20_RandAssertions4();
		checkState20_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 25 to state 26
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiSEJYWWxVeE5GZFdVa2RrTVdSWFlqTndWMkpZUWxSVVZ6RnVaV3hhVmxWcmRFOVNNVXA2V1dwT2MxVkdXa1pYYmtwV1lURktSMXBFUm5KbFZUVlhXa2RzVWxVeFZqWlZhMDVXWld4S1FrcFVUa1ZLVkU1Rg%3D%3D, target=_top}}, source=StateVertexImpl{id=25, name=state25}, target=StateVertexImpl{id=26, name=state26}}
		mutateDOMTree(25);
		checkState25_OriginalAssertions();
		checkState25_ReusedAssertions();
		checkState25_GeneratedAssertions();
		checkState25_LearnedAssertions();
		checkState25_AllAssertions();
		checkState25_RandAssertions1();
		checkState25_RandAssertions2();
		checkState25_RandAssertions3();
		checkState25_RandAssertions4();
		checkState25_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 26 to state 38
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVNFSllXV3hWZUU1R1pGZFZhMlJyVFZkU1dGbHFUbmRXTWtwWlVXeFNWVlo2Um5WYVYzaGhWbXhXY21SRk9WTk5WWEEyVjFkd1QyTXhWa2RYYTFwWVltdHdWMWxVUmt0U01YQkZVbTVLYkZaVVZsaFhhMlJ6Vld4VmVGWnFXbFpoTURWWFdsZDRTMUZyY0ZWVWExWkxWa1UxUmclM0QlM0Q%3D, target=_top}}, source=StateVertexImpl{id=26, name=state26}, target=StateVertexImpl{id=38, name=state38}}
		mutateDOMTree(26);
		checkState26_OriginalAssertions();
		checkState26_ReusedAssertions();
		checkState26_GeneratedAssertions();
		checkState26_LearnedAssertions();
		checkState26_AllAssertions();
		checkState26_RandAssertions1();
		checkState26_RandAssertions2();
		checkState26_RandAssertions3();
		checkState26_RandAssertions4();
		checkState26_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 38 to state 45
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZORlNsbFhWM2hXWlVVMVIxcEdaRlpoTWxKeVZGWmtVMWRHYkhGVWJtUlhUV3R3V2xWWGVGTldWbG8yVW01V1lWWXphR2hXYlhoWFkyMVNSazlXVGs1V1dFRXlWakZrZDFReVRYaFdhMlJZWVRGd1dWbHRkSGRXTVd4VlVtdDBVMDFZUWtaVmJUVkxZa1phVlZac2FGaGhNbEo2VmxkNFZtVkdXbkZYYkZwb1RVUldXRmRzWkRSVE1VWnlZMFpXVldFeFdreFdhMVV4VW1jbE0wUWxNMFElM0Q%3D, target=_top}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=45, name=state45}}
		mutateDOMTree(38);
		checkState38_OriginalAssertions();
		checkState38_ReusedAssertions();
		checkState38_GeneratedAssertions();
		checkState38_LearnedAssertions();
		checkState38_AllAssertions();
		checkState38_RandAssertions1();
		checkState38_RandAssertions2();
		checkState38_RandAssertions3();
		checkState38_RandAssertions4();
		checkState38_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 45 to state 48
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWk9SbE5zYkZoV00yaFhXbFZWTVZJeGNFZGFSbHBvVFd4S2VWWkdXbXRWTVdSSFlraEdWV0p0VWxoVVYzUjNWMnhXV0dWR1RsZFdiRzh5VlcwMVYxbFdXWHBoUjJoWFlsaG9XRmt5TVZOU2F6bFhWR3MxVjFkRlJYbFdha1pyWkRGUmVWUllhRmRoTWxKWldWUkdkMWRXYkhSa1NHUlhUVmQ0VmxWdGREQlZNREZaVVd0YVZtSlVWa3haYTFwaFZsWmFjMkZHYUdoTmJFbzJWbXhrTkZadFZrZFhia1pZWWtad2IxUlZVbGRYUm1SeldrUlNWRTFWV25sWk1GcFhWbGRGZUZkcmVGZGhNVlY0VlcxamJFMHdVV3hOTUZFbE0wUSUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=45, name=state45}, target=StateVertexImpl{id=48, name=state48}}
		mutateDOMTree(45);
		checkState45_OriginalAssertions();
		checkState45_ReusedAssertions();
		checkState45_GeneratedAssertions();
		checkState45_LearnedAssertions();
		checkState45_AllAssertions();
		checkState45_RandAssertions1();
		checkState45_RandAssertions2();
		checkState45_RandAssertions3();
		checkState45_RandAssertions4();
		checkState45_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 48 to state 54
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2s5U2JFNXpZa1pvVjAweWFGaFhiRlpXVFZaSmVHTkZaR0ZTYkhCdlZGZDRTMlZXV2tkWGJYUldUVmRTU0ZscmFFZFdWMHAwVld4b1ZWWXpVak5XTW5oWFYwZFdSMVJzWkZkaVJ6aDVWbGN3TVZZeGJGZFhXSEJvVWpKb1dGbHNhRzlYUm10NVRWWk9VMkY2YkZoV1IzTXhWakZrUmxKWWJGZGhhMXB5V2tSR1VtVldVbGxoUm1Sb1RXeEtXbGRXVWtka01XUlhZa2hTYTFOSFVsaFVWbVEwVm14V2RHUkVRbFpOUkVaYVZWZDBZVlp0U2xWV2EzaGFZVEZ3YUZac1dtRmpNa1pIWVVkb1RtSkZiekpXYlhoclRrWmFkRlpyWkZoaWExcFpXV3RhZDJJeFVsWlZiR1JZVW0xU2VsZHJVbE5XUlRGV1YyNXNXazFHY0ZoV2JHUkdaVVprY21WR1pHaE5WbFkwVmxjeGFtSkZNSGRWVjNoT1RVWkZiRTB3VVNVelJBJTNEJTNE, target=_top}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=54, name=state54}}
		mutateDOMTree(48);
		checkState48_OriginalAssertions();
		checkState48_ReusedAssertions();
		checkState48_GeneratedAssertions();
		checkState48_LearnedAssertions();
		checkState48_AllAssertions();
		checkState48_RandAssertions1();
		checkState48_RandAssertions2();
		checkState48_RandAssertions3();
		checkState48_RandAssertions4();
		checkState48_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 54 to state 56
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2twbFYwWkhZa1prVjAweWFIaFdSM1JyVlcxV1IyTkZaR0ZTYlZKd1ZqQmFTMVl4V2tkYVJGSlVUVlZzTkZaV2FHOVhSMHB5VGxab1YyRnJTak5XTVZwelZteGtkRTlXY0ZkaVIzY3lWMVpXYTJJeGJGZFhXSEJvVWpKb1YxbHNhRzlYUm10NVRWWk9VMDFXU25sVWJGcFBWVEZhZFZGdGFGZGlWRVV3V1ZSQmVGTkdUbGxoUjJ4VFlraENVRlpVUW10aU1rNVhWbGhrVjJFelVsaFVWbVEwVFVaU2MxWnJPV2xTTUhCS1ZWZDBiMVl3TVhGV2JFSlhZV3RHTkZZd1pGTk9iRTV6VjJ4a2JHRXhXWHBXYlRGM1VXMVdSMU5zWkZoaWEzQnhWVzB4YjFkR2JISlhibVJPWWtkU1dGWlhkR3RXTURGWFkwaHNWVlpzV25wWFZscExWbGRLUjJGR1dtbFNNbWhGVjFkd1IxbFdaRVpOVld4b1VqSjRUMVp0ZEhkVFZtUllaRWRHYVUxcmNFaFdSM1J2Vm0xS1NHRkdXbGRpV0dnelZGUkdVMVl4WkhWVWJYQnBVMFZLUzFaclpEUlpWbEp6VjJ4c1VtRXlhRmhaVjNSeVpVWmtWMWRzY0d4U2JWSjVWako0VTJGV1dYbGhSbWhYVW0xU00xVnFSbFpsUjA1SFYyMUdVMVp1UW5wWFYzUnZVVEZPUjFkWWJFNVhSVFZ2Vm0xek1WSXhWWGxqUm1SWFRVUkdXRmt3V2xOV01VcEdZMFZrWVZKRlJYaFdha1ozVTBkT1IxUnRiRlJTVlc5NVZtMTRhMlF4UlhoaVJtUmhVbTFTY0ZWdE1UUmpWbFp6V2taT2FrMVdjREJhVldoUFZERmFjMU51Y0ZwV1YxRjNWakJhU21ReVRrWmhSbkJPVW01Q05sWnRjRWRUTWsxNFZHNUthRkp0YUZoWmEyaERZakZhU0UxVVVsUk5hekUwVm0wMVQxZEhTbGhsUmxKVlZteGFNMVpIZUdGamJHdDZZVVU1VTJKSGR6RldhMXB2WWpGVmVWTnVTazlXYkhCaFdWUkdWbVZHV2tWU2JrNVlWakExUjFZeU1UUmhWa3AxVVZoa1dHRXhXbWhaVkVaaFkyc3hWMWRyTlZkU2EzQlpWbTB3ZUdJeVZuTlhiazVZWWxoU1ZWVnFRbUZUYkZaWVpVZEdhRlpzY0VkV2JHaHJWakpLV1dGSGFGcGxhM0JVVlRCYVlXTnRTa2hTYkU1T1RVVndWbFl4WkRCWlYxRjNUbFZrV0dKR1dsVlpiVEZUVmpGU1YxZHJkR3hpUm13MVZHeGFUMVl5U2xaalJFWldWak5vZGxadE1VdFdWa3AxVjJ4d1RtSnRhRFpYVkVvMFlUSk9kRlZyWkdoU2JWSlBWVzAxUTFSR1dYaFhiR1JhVm0xNFdWVnRlR3RXUm1SSVpVYzVWbUV4V2pOV01GcHpWbFpLZFZwSGNHbFNiSEEwVmxSS05GUXhWWGROVm1SWVlXdGFWMWxzYUc5V1JteFhWMnM1VTJKRk5YcFphMXB2VmpBd2VXRkdhRmhpUmxwWFZGWmFTbVZIVGtaYVIwWlRZa2hDZGxaR1pEUlRNbFpYVjJ0a1dHSllVbGRVVm1SVFUwWnNjbUZGWkZkV01IQXdWbGQ0YjFaV1dYcFZhazVYVFc1b1dGWXdaRmRTTVZKeldrWmthVko2YURWV2JHTjNUVlpaZUdKR1pGaFhTRUp2VldwS2IxZEdiSE5oUnpsWVVtMTBOVlJXV2s5Vk1rWTJZa1pvVjFJelRYaFdha1pyVW14S1dXSkdaR2hoTVhCNVYydFNSMVZ0VmxkVmJHeG9VbTFTYjFSWGVFdFhiR1JYVld0a2EwMVhVbGhaYTJoVFlURk9TRlZzYUZWV2JWRXdWbTE0VjJSSFVrVlJiRnBPVWtWYVlWWldaREJaVmxwMFUyeFdWMkV6YUdGWlZFWjNZVVphYzFkdFJtcE5hMXBJV1ZWa2IxUnRTa1ppZWtwWFlsaG9jbFJyV21Ga1JscHlXa1pvYVdFeGNGcFhWM1JoWkRKSmVGVnNXbFppUjFKWlZXMHhVMlZzWkhKVmJFNVhVbFJHVjFZeU5YTlhhekZIWTBab1YySkhVa2RhVlZwclkyMVdSMXBIYUU1V2JGa3dWbXhqZUdGdFNrWk5TR1JXVmpOb1QxUlZXa1ppUlRCM1ZWTlZlbEpCSlRORUpUTkU%3D, target=_top}}, source=StateVertexImpl{id=54, name=state54}, target=StateVertexImpl{id=56, name=state56}}
		mutateDOMTree(54);
		checkState54_OriginalAssertions();
		checkState54_ReusedAssertions();
		checkState54_GeneratedAssertions();
		checkState54_LearnedAssertions();
		checkState54_AllAssertions();
		checkState54_RandAssertions1();
		checkState54_RandAssertions2();
		checkState54_RandAssertions3();
		checkState54_RandAssertions4();
		checkState54_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 56 to state 68
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2twbFYwWkhZa1prVjAweWFIaFdSM1JyVlcxV1IyTkZaR0ZTYlZKd1ZqQmFTMVl4V2tkYVJGSlVUVlZzTkZaV2FHOVhSMHB5VGxab1YyRnJTak5XTVZwelZteGtkRTlXY0ZkaVIzY3lWMVpXYTJJeGJGZFhXSEJvVWpKb1YxbHNhRzlYUm10NVRWWk9VMDFXU25sVWJGcFBWVEZhZFZGdGFGZGlWRVV3V1ZSQmVGTkdUbGxoUjJ4VFlraENVRlpVUW10aU1rNVhWbGhrVjJFelVsaFVWbVEwVFVaU2MxWnJPV2xTTUhCS1ZWZDBiMVl3TVhGV2JFSlhZV3RHTkZZd1pGTk9iRTV6VjJ4a2JHRXhXWHBXYlRGM1VXMVdSMU5zWkZoaWEzQnhWVzB4YjFkR2JISlhibVJPWWtkU1dGWlhkR3RXTURGWFkwaHNWVlpzV25wWFZscExWbGRLUjJGR1dtbFNNbWhGVjFkd1IxbFdaRVpOVld4b1VqSjRUMVp0ZEhkVFZtUllaRWRHYVUxcmNFaFdSM1J2Vm0xS1NHRkdXbGRpV0dnelZGUkdVMVl4WkhWVWJYQnBVMFZLUzFaclpEUlpWbEp6VjJ4c1VtRXlhRmhaVjNSeVpVWmtWMWRzY0d4U2JWSjVWako0VTJGV1dYbGhSbWhYVW0xU00xVnFSbFpsUjA1SFYyMUdVMVp1UW5wWFYzUnZVVEZPUjFkWWJFNVhSVFZ2Vm0xek1WSXhWWGxqUm1SWFRVUkdXRmt3V2xOV01VcEdZMFZrWVZKRlJYaFdha1ozVTBkT1IxUnRiRlJTVlc5NVZtMTRhMlF4UlhoaVJtUmhVbTFTY0ZWdE1UUmpWbFp6V2taT2FrMVdjREJhVldoUFZERmFjMU51Y0ZwV1YxRjNWakJhU21ReVRrWmhSbkJPVW01Q05sWnRjRWRUTWsxNFZHNUthRkp0YUZoWmEyaERZakZhU0UxVVVsUk5hekUwVm0wMVQxZEhTbGhsUmxKVlZteGFNMVpIZUdGamJHdDZZVVU1VTJKSGR6RldhMXB2WWpGVmVWTnVTazlXYkhCaFdWUkdWbVZHV2tWU2JrNVlWakExUjFZeU1UUmhWa3AxVVZoa1dHRXhXbWhaVkVaaFkyc3hWMWRyTlZkU2EzQlpWbTB3ZUdJeVZuTlhiazVZWWxoU1ZWVnFRbUZUYkZaWVpVZEdhRlpzY0VkV2JHaHJWakpLV1dGSGFGcGxhM0JVVlRCYVlXTnRTa2hTYkU1T1RVVndWbFl4WkRCWlYxRjNUbFZrV0dKR1dsVlpiVEZUVmpGU1YxZHJkR3hpUm13MVZHeGFUMVl5U2xaalJFWldWak5vZGxadE1VdFdWa3AxVjJ4d1RtSnRhRFpYVkVvMFlUSk9kRlZyWkdoU2JWSlBWVzAxUTFSR1dYaFhiR1JhVm0xNFdWVnRlR3RXUm1SSVpVYzVWbUV4V2pOV01GcHpWbFpLZFZwSGNHbFNiSEEwVmxSS05GUXhWWGROVm1SWVlXdGFWMWxzYUc5V1JteFhWMnR3YkZZd1draFphMXByVmpBd2VXRklhRmRTTTFKeVZsY3hWMUl5VGtaYVIwWlRZbFpLZDFacVFtRlRNVmw0VjJ0a1lWSkdTbFZVVmxaelRrWmFWMkZIT1ZoU01IQjVWR3hhYjFZeVJuSlRhazVYVFZad2VsWnRlR3RrUlRsWFkwWmthVkl6WTNsV01WcFhZVEpKZUdKR1pGaFhTRUp2VldwS2IxWXhiSE5oUnpsWVVtMTBOVlJXV2s5Vk1ERlhVMjVzVldKR2NGQldWRVpoWkZaR2RHRkdaR2xXUlZWM1YxWlNRbVZHVGtkVWJHeG9Vako0VkZscmFFTlZSbHBWVVcxMGFVMXJOVmhXYkdoclZqSkZlbFZzYUZWV2JWRXdWRlZhVTJNeFduSlBWMnhUVFVoQ1MxWldaREJpTVZsM1RWaEdWMkpGU2xoWlYzUkhUa1paZDFwR1RrOWlSVFY2VmpKNGEySkhSWGhYV0hCWFlsUkdNMVZYTVZkU01VNXpXa1pvYVdFelFuaFdWekI0WWpGa1IySklTbGhpYlZKUFdXdGtVMWRHV2xoa1IzUlhUVVJHV0Zrd2FITldWbHB6VjI1d1dGWnNjRXhXYkdSTFVqSkdSMWR0YkZOTmJXaEdWakZrZDFJeGJGZGFSVnBPVmxkNGIxVnFTalJVTVZwMFpFaGtWRlp0VWxsYVJXUkhZVlV4Y21ORmFGZFNNMUoyVm0weFMxTkhSa2RYYkdScFYwZG5lbFpHVWtkVk1WbDRXa2hXVldKWVFuQlZNRlpMVXpGYWNscEVVbHBXYkVwNlZqSjRjMVZ0UlhsaFJtaGFWak5TZVZwVldtdFdNV1J6WTBkNFUySldTalZXYWtvMFZUSkdWMWRZYkdoU2JXaFlWVzB4VTAweFZuRlNiRnBzVWpBMVNGWXlNVWRWTVZwMVVXNXdXRll6VW5aVlZFWlBVakZrV1dKRk5WaFNWRloyVm0weGVrMVdTWGhXV0d4cVVtMVNXRlJWVWtkWFJtdDNWMnhPVjAxVmNFZFpNRlpyV1ZaS1JsSllhRmRoYTFvelZUQmtUMUl4VW5SaVJsSlRWbGM1TlZadE1UUmhNbEY0VWxob2FWSnRVbWhWYlRGVFkwWldkRTFVVW1wV2JGcDZWMnRhVDJGck1WZGpSRUpoVmxkb1VGWkVSbUZqTVU1MVkwWndWMVl4UmpOV2FrSmhVMjFSZVZScldtaFNia0pQVlcwMVEwNXNXblJqUldSVVRXc3hORlpITlV0aFJrcDBZVVpvV21FeWFFUlpha1poVTBVeFZWVnNVazVoZWtVd1ZtMHdNVlF4WkVoVGJHaHNVbXhLVmxadGVHRk5NVnBJWlVkR2FtSkhkRFpaVlZVMVZUSktTR1I2UmxkaE1YQjJXV3BHVm1WV1RuVlRhemxYWWtoQ2FGZFdVa2RXYlZaSFYydFdVMkpyTlZsV2FrRXhVakZaZVUxVVVtaFdhM0F4VlZab2ExZEhSWGhYYldoYVZrVmFhRmt5YzNoV01XUnlUbFprVTJFelFscFdiVEIzWlVkSmVWWnVUbGhpYXpWWldXeG9VMVpXVm5GUmJVWlVZa1phV1ZwVlpFZGhSbHB6WTBWa1YySkhhSEpXYWtwTFYxZEdTR0ZHY0d4aE0wSlZWbFJDWVZsWFRuUlRhMmhUWWtVMVQxUlZWbmRXYkZsNFdrUkNXbFl4UmpOVWJGWnJWMGRLUjFkc1ZscGlWRVpVVm1wR1UxWXhaSEprUjNocFVtMTNNVlpIZUdGVU1WbDVVMnhhYWxKRldsZFdhazV2Wkd4YWRFMVZkRmRXYTNBeFZqSjRkMVJ0U25SaFJGcFlWa1Z2TUZsVVNrOWtSbFp5V2tkb1UySldTbEJXVnpBeFVURlNSMWRZYUZoaVIxSmhWbTB4TkZkV1ZuUmxSM1JYVW0xU1NWcFZZelZXYlVWNFYycE9WMDFHY0hwV2JGcExaRlp3U0dOSGJGTmlTRUV3Vm14U1MwNUdVWGhXV0dST1ZtMVNXVmxYZEdGV01XeHpZVWM1VjFKdGVGaFdNbk0xVlRKS1JrNVljRnBoTVhCMlZtcEJkMlZYUmtkaFJtaHBVbXh3V0ZaR1dtRlRiVlpJVkd0YVlWSXdXbFJaYTJoRFpHeGFSMXBFVWxSTmJGcFlWakowYTFkSFNsbFZiR1JWVm0xU1ZGVXdXbk5qYlVaR1drWmtWMDFJUVhkV2JHUTBZakZhVjFkWWNGWmhhelZZVkZjMWIxZEdXWGRhUm1SVFRWWktlbGRyV210aFZrbzJZVVJXVjJKSFRqTlVWbHBhWlVkS1IxcEdhRmhUUlVwMlZsZHdTMkl4WkVkaVNFNW9VbnBzV1ZWdE1UQk9WbEpYVjJzNVZrMXJXVEpaYTFwdlZqRkplbFJZYUZkaGExcHlWVzE0UzFkWFNrZGFSMmhvVFZoQ05WWXlkRk5TTVZaMFZteGtWbUpIZUc5VmJURlRZakZTV0dWRmRGaGlSMUpZVmxkMGEyRXdNVmhWYkdoYVlUSm9WRmxVUms5VFJsWnpZVVpXVjJKV1JYZFdiVEUwVmpKU1NGVnJWbEppUm5CUFZXdFdZVmxXV2xkYVJFSmFWbXh3TUZVeWVGZFdNa1Y2WVVkR1dsWkZXak5aVlZwaFl6RmtkRkp0Y0U1aE1YQkpWMVpXYTJJeFVuUlRhMXBwWld0d1dGbHNhRzlqYkZKeVYyMUdhMUpzY0hsWGExcHZZVmRGZUdOR2NGaFdNMUpvV2tSS1NtVkdWbk5YYkZwcFVqRktXbFpYTUhoVk1sWnpXa2hLVm1KRk5WaFZiRkpIVmpGWmVVNVlUbGhoZWtaSVdUQmFiMVl5U2toVmEyUmhWbFp3Y2xreU1WZFNNWEJJWVVVMVYySkdhM2RXYlhocVpVZEdkRk5yV2s1VFIxSlhWbXBPYjFReFVsWlhhMXBwVWxSQ00xWldUbFpsYkVwQ1NsUk9SVXBVVGtVJTNE, target=_top}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=68, name=state68}}
		mutateDOMTree(56);
		checkState56_OriginalAssertions();
		checkState56_ReusedAssertions();
		checkState56_GeneratedAssertions();
		checkState56_LearnedAssertions();
		checkState56_AllAssertions();
		checkState56_RandAssertions1();
		checkState56_RandAssertions2();
		checkState56_RandAssertions3();
		checkState56_RandAssertions4();
		checkState56_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//Sink node at state 68
		mutateDOMTree(68);
		checkState68_OriginalAssertions();
		checkState68_ReusedAssertions();
		checkState68_GeneratedAssertions();
		checkState68_LearnedAssertions();
		checkState68_AllAssertions();
		checkState68_RandAssertions1();
		checkState68_RandAssertions2();
		checkState68_RandAssertions3();
		checkState68_RandAssertions4();
		checkState68_RandAssertions5();
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
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("390"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/index.php\" and @@rel=\"top\" and @title=\"\"]")))) System.out.println("391"); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhwP2xvZ291dD10cnVl\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("396"); // Random element assertion
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("403"); // Random element assertion
		element = new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("408"); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
		element = new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\""))));
childrenElements.add(new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("418"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("423"); // Random element assertion
		element = new DOMElement("LI", "Humanities", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Humanities", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("428"); // Random element assertion
		element = new DOMElement("SPAN", "mmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("433"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[]")))) System.out.println("434"); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
		element = new DOMElement("BR", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("441"); // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/inscription.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Createuseraccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("446"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("451"); // Random element assertion
		element = new DOMElement("BR", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("455"); // Random element assertion
		element = new DOMElement("H4", "Subcategories", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Subcategories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("460"); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("469"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV[id=\"platformManager\"]")))) System.out.println("470"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("id=\"leftContent\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("487"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON[@tabindex=\"3\" and @type=\"submit\"]")))) System.out.println("488"); // Random element assertion
		element = new DOMElement("DT", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
childrenElements.add(new DOMElement("#comment", "Accessicon", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Enrolment/unenrolmenticon", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Roleicon", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("503"); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("511"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("515"); // Random element assertion
		element = new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Searchfromkeyword", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("520"); // Random element assertion
		element = new DOMElement("H4", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("525"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("529"); // Random element assertion
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
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/LABEL[for=\"login\"]")))) System.out.println("548"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN[class=\"poweredBy\"]")))) System.out.println("549"); // Random element assertion
		element = new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("554"); // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/inscription.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Createuseraccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("559"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("id=\"leftContent\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("576"); // Random element assertion
	}

	public void checkState1_RandAssertions2(){
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("583"); // Random element assertion
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("588"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("599"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("610"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("id=\"leftContent\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("627"); // Random element assertion
	}

	public void checkState1_RandAssertions3(){
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("637"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("662"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL[]")))) System.out.println("663"); // Random element assertion
		element = new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("668"); // Random element assertion
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("679"); // Random element assertion
	}

	public void checkState1_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN/A[@href=\"http://www.claroline.net\" and @target=\"_blank\"]")))) System.out.println("683"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("692"); // Random element assertion
		element = new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\""))));
childrenElements.add(new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("699"); // Random element assertion
		element = new DOMElement("BUTTON", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("tabindex=\"3\"","type=\"submit\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Enter", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("704"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("729"); // Random element assertion
	}

	public void checkState1_RandAssertions5(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("739"); // Random element assertion
		element = new DOMElement("DD", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("746"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("750"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL[]")))) System.out.println("751"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("756"); // Random element assertion
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
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("779"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("790"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("795"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("802"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[@href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\" and @@media=\"screen, projection, tv\" and @@rel=\"stylesheet\" and @type=\"text/css\"]")))) System.out.println("803"); // Random element assertion
	}

	public void checkState2_RandAssertions2(){
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("810"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV/A[href=\"mailto:m@ga.com?subject=[Claroline]\"]")))) System.out.println("811"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("836"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("840"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("845"); // Random element assertion
	}

	public void checkState2_RandAssertions3(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("852"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("856"); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("863"); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2YVc1a1pYZ3VjR2h3\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("868"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("872"); // Random element assertion
	}

	public void checkState2_RandAssertions4(){
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("886"); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("890"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("895"); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("899"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("903"); // Random element assertion
	}

	public void checkState2_RandAssertions5(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("910"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("914"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("925"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]")))) System.out.println("926"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("937"); // Random element assertion
	}

	public void checkState4_OriginalAssertions(){
	}

	public void checkState4_ReusedAssertions(){
	}

	public void checkState4_GeneratedAssertions(){
	}

	public void checkState4_LearnedAssertions(){
	}

	public void checkState4_AllAssertions(){
	}

	public void checkState4_RandAssertions1(){
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("959"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("963"); // Random element assertion
		element = new DOMElement("DT", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
childrenElements.add(new DOMElement("#comment", "Accessicon", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Enrolment/unenrolmenticon", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Roleicon", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("978"); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Humanities", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1001"); // Random element assertion
		element = new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Searchfromkeyword", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1006"); // Random element assertion
	}

	public void checkState4_RandAssertions2(){
		element = new DOMElement("LI", "SoftwareTesting", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareTesting", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1014"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1025"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN/A[@href=\"http://www.claroline.net\" and @target=\"_blank\"]")))) System.out.println("1026"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1032"); // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1037"); // Random element assertion
	}

	public void checkState4_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/CREDITS.txt\" and @rel=\"Author\"]")))) System.out.println("1041"); // Random element assertion
		element = new DOMElement("H4", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1046"); // Random element assertion
		element = new DOMElement("DL", "AAOC112EngineeringGraphicsmmnainy-English", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "Renderthecourseanditschildren", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DT", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DD", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1059"); // Random element assertion
		element = new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("for=\"login\""))));
childrenElements.add(new DOMElement("LABEL", "Username", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("for=\"password\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("class=\"inputPassword\"","id=\"password\"","name=\"password\"","size=\"12\"","tabindex=\"2\"","type=\"password\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LABEL", "Password", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("tabindex=\"3\"","type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Enter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1082"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]")))) System.out.println("1083"); // Random element assertion
	}

	public void checkState4_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DL/DT/IMG[@alt=\"Access allowed to anybody (even without login)\" and @@class=\"access qtip \" and @src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"]")))) System.out.println("1087"); // Random element assertion
		element = new DOMElement("H4", "Subcategories", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Subcategories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1092"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV[id=\"claroPage\"]")))) System.out.println("1093"); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1097"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV[id=\"loginBox\"]")))) System.out.println("1098"); // Random element assertion
	}

	public void checkState4_RandAssertions5(){
		element = new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv\"","target=\"_top\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1106"); // Random element assertion
		element = new DOMElement("A", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1111"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[[]")))) System.out.println("1112"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1116"); // Random element assertion
		element = new DOMElement("BUTTON", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("tabindex=\"3\"","type=\"submit\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Enter", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1121"); // Random element assertion
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
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1146"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1150"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1159"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceCid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1163"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[[for=\"password\"]")))) System.out.println("1164"); // Random element assertion
	}

	public void checkState5_RandAssertions2(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1171"); // Random element assertion
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1178"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1182"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net\" and @rel=\"Copyright\"]")))) System.out.println("1183"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1188"); // Random element assertion
	}

	public void checkState5_RandAssertions3(){
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1202"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"institution\""))));
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1213"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/A/INPUT[@onclick=\"document.location='/claroline-1.11.7/claroline/';return false\" and @@type=\"button\" and @value=\"Cancel\"]")))) System.out.println("1214"); // Random element assertion
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1219"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net\" and @rel=\"Copyright\"]")))) System.out.println("1220"); // Random element assertion
	}

	public void checkState5_RandAssertions4(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1227"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1242"); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1249"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1264"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1273"); // Random element assertion
	}

	public void checkState5_RandAssertions5(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1280"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceGid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1284"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1295"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1299"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1308"); // Random element assertion
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
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1330"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@id=\"login\" and @@name=\"login\" and @@size=\"15\" and @@tabindex=\"1\" and @@type=\"text\" and @value=\"\"]")))) System.out.println("1331"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@autocomplete=\"off\" and @@id=\"password\" and @@name=\"password\" and @@size=\"15\" and @@tabindex=\"2\" and @type=\"password\"]")))) System.out.println("1332"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceGid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1336"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1340"); // Random element assertion
	}

	public void checkState9_RandAssertions2(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1347"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]")))) System.out.println("1348"); // Random element assertion
		element = new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1355"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"siteName\""))));
childrenElements.add(new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1366"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[id=\"campusBannerLeft\"]")))) System.out.println("1367"); // Random element assertion
	}

	public void checkState9_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net\" and @rel=\"Copyright\"]")))) System.out.println("1371"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1380"); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1384"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[class=\"breadcrumbTrails\"]")))) System.out.println("1385"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1390"); // Random element assertion
	}

	public void checkState9_RandAssertions4(){
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1398"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1403"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1408"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2YVc1a1pYZ3VjR2h3UDJ4dloyOTFkRDEwY25WbA==\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1412"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[[class=\"spacer\"]")))) System.out.println("1413"); // Random element assertion
	}

	public void checkState9_RandAssertions5(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1420"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[id=\"topBanner\"]")))) System.out.println("1421"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1430"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"password\"","name=\"password\"","size=\"15\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1434"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1438"); // Random element assertion
	}

	public void checkState18_OriginalAssertions(){
	}

	public void checkState18_ReusedAssertions(){
	}

	public void checkState18_GeneratedAssertions(){
	}

	public void checkState18_LearnedAssertions(){
	}

	public void checkState18_AllAssertions(){
	}

	public void checkState18_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[class=\"breadCrumbsNode lastBreadCrumbsNode\"]")))) System.out.println("1457"); // Random element assertion
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1471"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1482"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1486"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1490"); // Random element assertion
	}

	public void checkState18_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[@name=\"sourceUrl\" and @@type=\"hidden\" and @value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJZVmMxYTFwWVozVmpSMmgzVURKNGRsb3lPVEZrUkRFd1kyNVdiQSUzRCUzRA==\"]")))) System.out.println("1494"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJZVmMxYTFwWVozVmpSMmgzVURKNGRsb3lPVEZrUkRFd1kyNVdiQSUzRCUzRA==\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1498"); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1505"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJZVmMxYTFwWVozVmpSMmgzVURKNGRsb3lPVEZrUkRFd1kyNVdiQSUzRCUzRA==\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1509"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1513"); // Random element assertion
	}

	public void checkState18_RandAssertions3(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1520"); // Random element assertion
		element = new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlpWbU14WVRGd1dWb3pWbXBTTW1nelZVUktOR1JzYjNsUFZFWnJVa1JGZDFreU5WZGlRU1V6UkNVelJBJTNEJTNE\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1525"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1529"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM[@action=\"/claroline-1.11.7/claroline/auth/login.php\" and @@class=\"claroLoginForm\" and @method=\"post\"]")))) System.out.println("1530"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1536"); // Random element assertion
	}

	public void checkState18_RandAssertions4(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1543"); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1547"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"password\"","name=\"password\"","size=\"15\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1551"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceCid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1555"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1559"); // Random element assertion
	}

	public void checkState18_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[[id=\"breadcrumbLine\"]")))) System.out.println("1563"); // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1568"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1573"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1580"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1585"); // Random element assertion
	}

	public void checkState20_OriginalAssertions(){
	}

	public void checkState20_ReusedAssertions(){
	}

	public void checkState20_GeneratedAssertions(){
	}

	public void checkState20_LearnedAssertions(){
	}

	public void checkState20_AllAssertions(){
	}

	public void checkState20_RandAssertions1(){
		element = new DOMElement("SPAN", "mmnainy", new ArrayList<String>(Arrays.asList("class=\"userName\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1608"); // Random element assertion
		element = new DOMElement("A", "Removecourseenrolment", new ArrayList<String>(Arrays.asList("class=\"userCommandsItem\"","href=\"/claroline-1.11.7/claroline/auth/courses.php?cmd=rqUnreg\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/unenroll.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Removecourseenrolment", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1614"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV[2]/DL/DT[5]/SPAN/IMG[@alt=\"You are manager of this course\" and @@class=\"qtip role \" and @src=\"/claroline-1.11.7/web/img/manager.png?1232379976\"]")))) System.out.println("1615"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[id=\"campusBannerLeft\"]")))) System.out.println("1616"); // Random element assertion
		element = new DOMElement("DT", "AAOC112-EngineeringGraphics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("class=\"courseList\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"qtip iconDefinitionList \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "AAOC112-EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1625"); // Random element assertion
	}

	public void checkState20_RandAssertions2(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/tooltitle.js?1311696294\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1632"); // Random element assertion
		element = new DOMElement("A", "Edittextzone", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=textzone_right.inc.html\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Edittextzone", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1639"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1643"); // Random element assertion
		element = new DOMElement("A", "A7-ComputerScience", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=A7_003\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "A7-ComputerScience", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1648"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfile\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userProfileBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userPicture\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userDetails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1657"); // Random element assertion
	}

	public void checkState20_RandAssertions3(){
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1664"); // Random element assertion
		element = new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","src=\"/claroline-1.11.7/web/img/mail_close.png?1232379976\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1668"); // Random element assertion
		element = new DOMElement("SPAN", "AAOC112-EngineeringGraphics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "AAOC112-EngineeringGraphics", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"You are manager of this course\"","class=\"qtip role \"","src=\"/claroline-1.11.7/web/img/manager.png?1232379976\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1676"); // Random element assertion
		element = new DOMElement("LI", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Platformadministration", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1681"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("B", "textzone_right.inc.html", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "file.", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1688"); // Random element assertion
	}

	public void checkState20_RandAssertions4(){
		element = new DOMElement("DT", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"iconDefinitionList\"","src=\"/claroline-1.11.7/claroline/announcements/img/announcement.png?1213169582\""))));
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1698"); // Random element assertion
		element = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1703"); // Random element assertion
		element = new DOMElement("TR", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "Hello", new ArrayList<String>(Arrays.asList("align=\"center\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "nainymm", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("TD", "FridayApril11,2014", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1716"); // Random element assertion
		element = new DOMElement("TD", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=14&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1722"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[[id=\"desktopRightContent\"]")))) System.out.println("1723"); // Random element assertion
	}

	public void checkState20_RandAssertions5(){
		element = new DOMElement("TD", "HellonainymmFridayApril11,2014", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"unreadMessage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Hello", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/messaging/readmessage.php?messageId=15&type=received\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1732"); // Random element assertion
		element = new DOMElement("DIV", "LatestannouncementsNoannouncementtodisplay", new ArrayList<String>(Arrays.asList("class=\"content\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"portlet CLANN_Portlet\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DL", "Noannouncementtodisplay", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1739"); // Random element assertion
		element = new DOMElement("LI", "Claroline>Mydesktop", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("#text", ">", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1745"); // Random element assertion
		element = new DOMElement("TH", "SubjectSenderDate", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("align=\"center\"","valign=\"top\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1750"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1765"); // Random element assertion
	}

	public void checkState25_OriginalAssertions(){
	}

	public void checkState25_ReusedAssertions(){
	}

	public void checkState25_GeneratedAssertions(){
	}

	public void checkState25_LearnedAssertions(){
	}

	public void checkState25_AllAssertions(){
	}

	public void checkState25_RandAssertions1(){
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1788"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[id=\"topBanner\"]")))) System.out.println("1789"); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1794"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1798"); // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1803"); // Random element assertion
	}

	public void checkState25_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN[class=\"poweredBy\"]")))) System.out.println("1807"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]")))) System.out.println("1808"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1819"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1824"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@type=\"submit\" and @value=\"Ok\"]")))) System.out.println("1825"); // Random element assertion
	}

	public void checkState25_RandAssertions3(){
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1833"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterCenter\"]")))) System.out.println("1834"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1838"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[[id=\"toolViewOption\"]")))) System.out.println("1839"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[[]")))) System.out.println("1840"); // Random element assertion
	}

	public void checkState25_RandAssertions4(){
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1854"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1858"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1865"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1870"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]")))) System.out.println("1871"); // Random element assertion
	}

	public void checkState25_RandAssertions5(){
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1885"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV[id=\"platformManager\"]")))) System.out.println("1886"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]")))) System.out.println("1887"); // Random element assertion
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1892"); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiSEJYWWxVeE5GZFdVa2RrTVdSWFlqTndWMkpZUWxSVVZ6RnVaV3hhVmxWcmRFOVNNVXA2V1dwT2MxVkdXa1pYYmtwV1lURktSMXBFUm5KbFZUVlhXa2RzVWxVeFZqWlZhMDVXWld4S1FrcFVUa1ZLVkU1Rg%3D%3D\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1897"); // Random element assertion
	}

	public void checkState26_OriginalAssertions(){
	}

	public void checkState26_ReusedAssertions(){
	}

	public void checkState26_GeneratedAssertions(){
	}

	public void checkState26_LearnedAssertions(){
	}

	public void checkState26_AllAssertions(){
	}

	public void checkState26_RandAssertions1(){
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1929"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1933"); // Random element assertion
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1944"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1950"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("1961"); // Random element assertion
	}

	public void checkState26_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[id=\"campusBannerRight\"]")))) System.out.println("1965"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[[class=\"spacer\"]")))) System.out.println("1966"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1970"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]")))) System.out.println("1971"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/CREDITS.txt\" and @rel=\"Author\"]")))) System.out.println("1972"); // Random element assertion
	}

	public void checkState26_RandAssertions3(){
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1990"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("1994"); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("1999"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2003"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[id=\"campusBannerRight\"]")))) System.out.println("2004"); // Random element assertion
	}

	public void checkState26_RandAssertions4(){
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2012"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@type=\"submit\" and @value=\"Ok\"]")))) System.out.println("2013"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[id=\"userBannerRight\"]")))) System.out.println("2014"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2019"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2026"); // Random element assertion
	}

	public void checkState26_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI/SPAN/A[@href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVNFSllXV3hWZUU1R1pGZFZhMlJyVFZkU1dGbHFUbmRXTWtwWlVXeFNWVlo2Um5WYVYzaGhWbXhXY21SRk9WTk5WWEEyVjFkd1QyTXhWa2RYYTFwWVltdHdWMWxVUmt0U01YQkZVbTVLYkZaVVZsaFhhMlJ6Vld4VmVGWnFXbFpoTURWWFdsZDRTMUZyY0ZWVWExWkxWa1UxUmclM0QlM0Q%3D\" and @target=\"_top\"]")))) System.out.println("2030"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2034"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[]")))) System.out.println("2035"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2040"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("dir=\"ltr\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\""))));
childrenElements.add(new DOMElement("#comment", "Banner", new ArrayList<String>(Arrays.asList("id=\"claroBody\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\""))));
childrenElements.add(new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndoftopBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "$Id:body.tpl.php143322012-11-2310:08:10Zzefredz$", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------ClarolineBody---------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "----------EndofClarolineBody----------", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "endofclaroPage", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2065"); // Random element assertion
	}

	public void checkState38_OriginalAssertions(){
	}

	public void checkState38_ReusedAssertions(){
	}

	public void checkState38_GeneratedAssertions(){
	}

	public void checkState38_LearnedAssertions(){
	}

	public void checkState38_AllAssertions(){
	}

	public void checkState38_RandAssertions1(){
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2087"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2091"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2102"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2107"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2111"); // Random element assertion
	}

	public void checkState38_RandAssertions2(){
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2118"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2122"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2126"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]")))) System.out.println("2127"); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2131"); // Random element assertion
	}

	public void checkState38_RandAssertions3(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A/IMG[@alt=\"home\" and @src=\"/claroline-1.11.7/web/img/home.png?1232379976\"]")))) System.out.println("2135"); // Random element assertion
		element = new DOMElement("A", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2140"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2145"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2149"); // Random element assertion
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2156"); // Random element assertion
	}

	public void checkState38_RandAssertions4(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[id=\"campusBannerLeft\"]")))) System.out.println("2160"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[[class=\"spacer\"]")))) System.out.println("2161"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\" and @type=\"text/javascript\"]")))) System.out.println("2162"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2168"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVNFSllXV3hWZUU1R1pGZFZhMlJyVFZkU1dGbHFUbmRXTWtwWlVXeFNWVlo2Um5WYVYzaGhWbXhXY21SRk9WTk5WWEEyVjFkd1QyTXhWa2RYYTFwWVltdHdWMWxVUmt0U01YQkZVbTVLYkZaVVZsaFhhMlJ6Vld4VmVGWnFXbFpoTURWWFdsZDRTMUZyY0ZWVWExWkxWa1UxUmclM0QlM0Q=\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2172"); // Random element assertion
	}

	public void checkState38_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[[id=\"userBanner\"]")))) System.out.println("2176"); // Random element assertion
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2181"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2186"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@autocomplete=\"off\" and @@id=\"password\" and @@name=\"password\" and @@size=\"15\" and @@tabindex=\"2\" and @type=\"password\"]")))) System.out.println("2187"); // Random element assertion
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2194"); // Random element assertion
	}

	public void checkState45_OriginalAssertions(){
	}

	public void checkState45_ReusedAssertions(){
	}

	public void checkState45_GeneratedAssertions(){
	}

	public void checkState45_LearnedAssertions(){
	}

	public void checkState45_AllAssertions(){
	}

	public void checkState45_RandAssertions1(){
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2219"); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterRight", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2230"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2235"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[[class=\"spacer\"]")))) System.out.println("2236"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2241"); // Random element assertion
	}

	public void checkState45_RandAssertions2(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[id=\"campusFooterLeft\"]")))) System.out.println("2245"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2249"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2253"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2257"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[id=\"campusBannerRight\"]")))) System.out.println("2258"); // Random element assertion
	}

	public void checkState45_RandAssertions3(){
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2266"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2270"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/BR[]")))) System.out.println("2271"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2286"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/HR[]")))) System.out.println("2287"); // Random element assertion
	}

	public void checkState45_RandAssertions4(){
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2297"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2301"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2306"); // Random element assertion
		element = new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2311"); // Random element assertion
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2315"); // Random element assertion
	}

	public void checkState45_RandAssertions5(){
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2322"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/index.php\" and @@rel=\"top\" and @title=\"\"]")))) System.out.println("2323"); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2327"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[id=\"topBanner\"]")))) System.out.println("2328"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/BR[]")))) System.out.println("2329"); // Random element assertion
	}

	public void checkState48_OriginalAssertions(){
	}

	public void checkState48_ReusedAssertions(){
	}

	public void checkState48_GeneratedAssertions(){
	}

	public void checkState48_LearnedAssertions(){
	}

	public void checkState48_AllAssertions(){
	}

	public void checkState48_RandAssertions1(){
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2353"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2357"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceCid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2361"); // Random element assertion
		element = new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterCenter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2372"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]")))) System.out.println("2373"); // Random element assertion
	}

	public void checkState48_RandAssertions2(){
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2380"); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2385"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"password\"","name=\"password\"","size=\"15\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2389"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2395"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[id=\"userBannerRight\"]")))) System.out.println("2396"); // Random element assertion
	}

	public void checkState48_RandAssertions3(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2403"); // Random element assertion
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2407"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2412"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2416"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[type=\"text/javascript\"]")))) System.out.println("2417"); // Random element assertion
	}

	public void checkState48_RandAssertions4(){
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2427"); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2431"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@autocomplete=\"off\" and @@id=\"password\" and @@name=\"password\" and @@size=\"15\" and @@tabindex=\"2\" and @type=\"password\"]")))) System.out.println("2432"); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2437"); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2444"); // Random element assertion
	}

	public void checkState48_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LEGEND[]")))) System.out.println("2448"); // Random element assertion
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2453"); // Random element assertion
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2460"); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2465"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A/IMG[@alt=\"home\" and @src=\"/claroline-1.11.7/web/img/home.png?1232379976\"]")))) System.out.println("2466"); // Random element assertion
	}

	public void checkState54_OriginalAssertions(){
	}

	public void checkState54_ReusedAssertions(){
	}

	public void checkState54_GeneratedAssertions(){
	}

	public void checkState54_LearnedAssertions(){
	}

	public void checkState54_AllAssertions(){
	}

	public void checkState54_RandAssertions1(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/A[[href=\"/claroline-1.11.7/claroline/auth/inscription.php\"]")))) System.out.println("2485"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2490"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"courseRightContent\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"coursePortletList\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2503"); // Random element assertion
		element = new DOMElement("LI", "Internalmessaging", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminCommunication\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Internalmessaging", new ArrayList<String>(Arrays.asList("href=\"../messaging/admin.php\""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2508"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI/A[@class=\"qtip \" and @@href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\" and @title=\"Engineering Graphics\"]")))) System.out.println("2509"); // Random element assertion
	}

	public void checkState54_RandAssertions2(){
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2516"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV[class=\"toolList\"]")))) System.out.println("2517"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P[style=\"padding: 5px;\"]")))) System.out.println("2518"); // Random element assertion
		element = new DOMElement("IMG", "Groups", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/group/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/group/group.php?cidReset=true&cidReq=AAOC112\"","id=\"CLGRP\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2522"); // Random element assertion
		element = new DOMElement("UL", "AAOC112", new ArrayList<String>(Arrays.asList("class=\"coursesTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"1                         current\""))));
childrenElements.add(new DOMElement("LI", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2529"); // Random element assertion
	}

	public void checkState54_RandAssertions3(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2536"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"courseLeftSidebar\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolList\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2543"); // Random element assertion
		element = new DOMElement("A", "Document", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/document/document.php?cidReset=true&cidReq=AAOC112\"","id=\"CLDOC\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/document/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Document", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2549"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON[@tabindex=\"3\" and @type=\"submit\"]")))) System.out.println("2550"); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline>AAOC112", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\""))));
childrenElements.add(new DOMElement("DIV", "Claroline>AAOC112", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2565"); // Random element assertion
	}

	public void checkState54_RandAssertions4(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
childrenElements.add(new DOMElement("#comment", "PlatformBanner", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPlatformBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "UserBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "BreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Claroline>Administration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofBreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2589"); // Random element assertion
		element = new DOMElement("IMG", "Exercises", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/exercise/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/exercise/exercise.php?cidReset=true&cidReq=AAOC112\"","id=\"CLQWZ\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2593"); // Random element assertion
		element = new DOMElement("IMG", "Exercises", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/exercise/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/exercise/exercise.php?cidReset=true&cidReq=AAOC112\"","id=\"CLQWZ\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2597"); // Random element assertion
		element = new DOMElement("A", "Upgrade", new ArrayList<String>(Arrays.asList("href=\"upgrade/index.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Upgrade", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2602"); // Random element assertion
		element = new DOMElement("LI", "Modules", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminPlatform\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Modules", new ArrayList<String>(Arrays.asList("href=\"module/module_list.php\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2607"); // Random element assertion
	}

	public void checkState54_RandAssertions5(){
		element = new DOMElement("A", "Managecoursecategories", new ArrayList<String>(Arrays.asList("href=\"admin_category.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Managecoursecategories", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2615"); // Random element assertion
		element = new DOMElement("A", "Platformstatistics", new ArrayList<String>(Arrays.asList("href=\"../tracking/platform_report.php\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Platformstatistics", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2620"); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2624"); // Random element assertion
		element = new DOMElement("LI", "Filesstatistics", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"adminTechnical\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Filesstatistics", new ArrayList<String>(Arrays.asList("href=\"technical/files_stats.php\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2629"); // Random element assertion
		element = new DOMElement("LI", "mmnainyManagemyaccountLogout", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Managemyaccount", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2634"); // Random element assertion
	}

	public void checkState56_OriginalAssertions(){
	}

	public void checkState56_ReusedAssertions(){
	}

	public void checkState56_GeneratedAssertions(){
	}

	public void checkState56_LearnedAssertions(){
	}

	public void checkState56_AllAssertions(){
	}

	public void checkState56_RandAssertions1(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2657"); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2663"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET[]")))) System.out.println("2664"); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2673"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL[class=\"breadCrumbs\"]")))) System.out.println("2674"); // Random element assertion
	}

	public void checkState56_RandAssertions2(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2681"); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2685"); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2689"); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2694"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\" and @type=\"text/javascript\"]")))) System.out.println("2695"); // Random element assertion
	}

	public void checkState56_RandAssertions3(){
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2705"); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2710"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"http://www.claroline.net\" and @rel=\"Copyright\"]")))) System.out.println("2711"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2715"); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2719"); // Random element assertion
	}

	public void checkState56_RandAssertions4(){
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2726"); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2731"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2735"); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2740"); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2744"); // Random element assertion
	}

	public void checkState56_RandAssertions5(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2751"); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2755"); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("autocomplete=\"off\"","id=\"password\"","name=\"password\"","size=\"15\"","tabindex=\"2\"","type=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2759"); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2763"); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2767"); // Random element assertion
	}

	public void checkState68_OriginalAssertions(){
	}

	public void checkState68_ReusedAssertions(){
	}

	public void checkState68_GeneratedAssertions(){
	}

	public void checkState68_LearnedAssertions(){
	}

	public void checkState68_AllAssertions(){
	}

	public void checkState68_RandAssertions1(){
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2789"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/P/BR[]")))) System.out.println("2790"); // Random element assertion
		element = new DOMElement("H1", "Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2795"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2799"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2803"); // Random element assertion
	}

	public void checkState68_RandAssertions2(){
		element = new DOMElement("H1", "Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2811"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/P[]")))) System.out.println("2812"); // Random element assertion
		element = new DOMElement("TITLE", "414Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "414Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2817"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/P/BR[]")))) System.out.println("2818"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/H1[]")))) System.out.println("2819"); // Random element assertion
	}

	public void checkState68_RandAssertions3(){
		element = new DOMElement("H1", "Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2827"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2834"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/P/BR[]")))) System.out.println("2835"); // Random element assertion
		element = new DOMElement("BR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2839"); // Random element assertion
		element = new DOMElement("H1", "Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2844"); // Random element assertion
	}

	public void checkState68_RandAssertions4(){
		element = new DOMElement("H1", "Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2852"); // Random element assertion
		element = new DOMElement("TITLE", "414Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "414Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2857"); // Random element assertion
		if(!(isElementPresent(By.xpath("/HTML/BODY/P[]")))) System.out.println("2858"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2865"); // Random element assertion
		element = new DOMElement("TITLE", "414Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "414Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2870"); // Random element assertion
	}

	public void checkState68_RandAssertions5(){
		if(!(isElementPresent(By.xpath("/HTML/BODY/H1[]")))) System.out.println("2874"); // Random element assertion
		element = new DOMElement("TITLE", "414Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "414Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2879"); // Random element assertion
		element = new DOMElement("TITLE", "414Request-URITooLong", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "414Request-URITooLong", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagAttPresent(parentElement , element, childrenElements))) System.out.println("2884"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionTagPresent(parentElement , element, childrenElements))) System.out.println("2891"); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("BODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		if(!(isElementRegionFullPresent(parentElement , element, childrenElements))) System.out.println("2898"); // Random element assertion
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


	private boolean isElementRegionTagPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
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


	private boolean isElementRegionTagAttPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
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


	private boolean isElementRegionFullPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());
			org.w3c.dom.Element sourceElement = null;

			for (int i = 0; i < nodeList.getLength(); i++){
				// check node's text and attributes
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);
				if (!element.getTextContent().equals(sourceElement.getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", "")))
					continue;
				NamedNodeMap elementAttList = sourceElement.getAttributes();
				HashSet<String> elemetAtts = new HashSet<String>();
				for (int j = 0; j < elementAttList.getLength(); j++)
					elemetAtts.add(elementAttList.item(j).getNodeName() + "=\"" + elementAttList.item(j).getNodeValue() + "\"");
				if (!element.getAttributes().equals(elemetAtts))
					continue;
				
				// check parent node's text, tag and attributes
				String parentTagName = sourceElement.getParentNode().getNodeName();
				if (!parent.getTextContent().equals(sourceElement.getParentNode().getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", "")))
					continue;
				if (!parentTagName.equals(parent.getTagName()))
					continue;
				NamedNodeMap parentAttList = sourceElement.getParentNode().getAttributes();
				HashSet<String> parentAtts = new HashSet<String>();
				for (int j = 0; j < parentAttList.getLength(); j++)
					parentAtts.add(parentAttList.item(j).getNodeName() + "=\"" + parentAttList.item(j).getNodeValue() + "\"");
				if (!parent.getAttributes().equals(parentAtts))
					continue;

	
				// check children nodes' text
				HashSet<String> childrenTextFromDOM = new HashSet<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTextFromDOM.add(sourceElement.getChildNodes().item(j).getTextContent().replace("\n", "").replace("\r", "").replace(" ", "").replace("\t", "").replaceAll("[^\\x00-\\x7F]", ""));
				HashSet<String> childrenTextToTest = new HashSet<String>();				
				for (int k=0; k<children.size();k++)
					childrenTextToTest.add(children.get(k).getTextContent());
				if (!childrenTextToTest.equals(childrenTextFromDOM))
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
	String code = com.crawljax.plugins.testilizer.Testilizer.mutateDOMTreeCode(stateID);
		if (code!= null){
			long RandomlySelectedDOMElementID = (long) ((JavascriptExecutor)driver).executeScript(code);
			int MutationOperatorCode = com.crawljax.plugins.testilizer.Testilizer.MutationOperatorCode;
			int StateToBeMutated = com.crawljax.plugins.testilizer.Testilizer.StateToBeMutated;	
			com.crawljax.plugins.testilizer.Testilizer.SelectedRandomElementInDOM[MutationOperatorCode][StateToBeMutated]
					= (int) RandomlySelectedDOMElementID;
		}
	}
 

}
