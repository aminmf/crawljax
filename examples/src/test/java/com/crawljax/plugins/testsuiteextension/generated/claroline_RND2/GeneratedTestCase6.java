package com.crawljax.plugins.testsuiteextension.generated.claroline_RND2;

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
 * Generated @ Fri Apr 18 01:30:04 PDT 2014
 */

public class GeneratedTestCase6 {

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
	public void method6(){
		driver.get(url);
		//From state 0 to state 17
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DL[1]/DT[1]/A[1], element=Element{node=[A: null], tag=A, text=AAOC112        –        Engineering Graphics, attributes={href=/claroline-1.11.7/claroline/course/index.php?cid=AAOC112}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=17, name=state17}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DL[1]/DT[1]/A[1]")).click();
		//From state 17 to state 19
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2NvdXJzZS9pbmRleC5waHA%2FY2lkPUFBT0MxMTI%3D, target=_top}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=19, name=state19}}
		mutateDOMTree(17);
		checkState17_OriginalAssertions();
		checkState17_ReusedAssertions();
		checkState17_GeneratedAssertions();
		checkState17_LearnedAssertions();
		checkState17_AllAssertions();
		checkState17_RandAssertions1();
		checkState17_RandAssertions2();
		checkState17_RandAssertions3();
		checkState17_RandAssertions4();
		checkState17_RandAssertions5();
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 19 to state 12
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={atusa=id11874169_0, onclick=document.location='/claroline-1.11.7/claroline/';return false, type=button, value=Cancel}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=12, name=state12}}
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
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV[1]/FORM[1]/FIELDSET[1]/A[1]/INPUT[1]")).click();
		//From state 12 to state 3
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv, target=_top}}, source=StateVertexImpl{id=12, name=state12}, target=StateVertexImpl{id=3, name=state3}}
		mutateDOMTree(12);
		checkState12_OriginalAssertions();
		checkState12_ReusedAssertions();
		checkState12_GeneratedAssertions();
		checkState12_LearnedAssertions();
		checkState12_AllAssertions();
		checkState12_RandAssertions1();
		checkState12_RandAssertions2();
		checkState12_RandAssertions3();
		checkState12_RandAssertions4();
		checkState12_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 3 to state 5
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2YVc1a1pYZ3VjR2h3UDJ4dloyOTFkRDEwY25WbA%3D%3D, target=_top}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=5, name=state5}}
		mutateDOMTree(3);
		checkState3_OriginalAssertions();
		checkState3_ReusedAssertions();
		checkState3_GeneratedAssertions();
		checkState3_LearnedAssertions();
		checkState3_AllAssertions();
		checkState3_RandAssertions1();
		checkState3_RandAssertions2();
		checkState3_RandAssertions3();
		checkState3_RandAssertions4();
		checkState3_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 5 to state 6
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJZVmMxYTFwWVozVmpSMmgzVURKNGRsb3lPVEZrUkRFd1kyNVdiQSUzRCUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=5, name=state5}, target=StateVertexImpl{id=6, name=state6}}
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
		//From state 6 to state 23
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlpWbU14WVRGd1dWb3pWbXBTTW1nelZVUktOR1JzYjNsUFZFWnJVa1JGZDFreU5WZGlRU1V6UkNVelJBJTNEJTNE, target=_top}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=23, name=state23}}
		mutateDOMTree(6);
		checkState6_OriginalAssertions();
		checkState6_ReusedAssertions();
		checkState6_GeneratedAssertions();
		checkState6_LearnedAssertions();
		checkState6_AllAssertions();
		checkState6_RandAssertions1();
		checkState6_RandAssertions2();
		checkState6_RandAssertions3();
		checkState6_RandAssertions4();
		checkState6_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 23 to state 31
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbHBXYlUxNFdWUkdkMWRXYjNwV2JYQlRUVzFuZWxaVlVrdE9SMUp6WWpOc1VGWkZXbkpWYTFKR1pERnJlVTVXWkdsUlUxVjZVa05WZWxKQkpUTkVKVE5F, target=_top}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=31, name=state31}}
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
		//From state 31 to state 38
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiSEJYWWxVeE5GZFdVa2RrTVdSWFlqTndWMkpZUWxSVVZ6RnVaV3hhVmxWcmRFOVNNVXA2V1dwT2MxVkdXa1pYYmtwV1lURktSMXBFUm5KbFZUVlhXa2RzVWxVeFZqWlZhMDVXWld4S1FrcFVUa1ZLVkU1Rg%3D%3D, target=_top}}, source=StateVertexImpl{id=31, name=state31}, target=StateVertexImpl{id=38, name=state38}}
		mutateDOMTree(31);
		checkState31_OriginalAssertions();
		checkState31_ReusedAssertions();
		checkState31_GeneratedAssertions();
		checkState31_LearnedAssertions();
		checkState31_AllAssertions();
		checkState31_RandAssertions1();
		checkState31_RandAssertions2();
		checkState31_RandAssertions3();
		checkState31_RandAssertions4();
		checkState31_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 38 to state 48
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVNFSllXV3hWZUU1R1pGZFZhMlJyVFZkU1dGbHFUbmRXTWtwWlVXeFNWVlo2Um5WYVYzaGhWbXhXY21SRk9WTk5WWEEyVjFkd1QyTXhWa2RYYTFwWVltdHdWMWxVUmt0U01YQkZVbTVLYkZaVVZsaFhhMlJ6Vld4VmVGWnFXbFpoTURWWFdsZDRTMUZyY0ZWVWExWkxWa1UxUmclM0QlM0Q%3D, target=_top}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=48, name=state48}}
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
		//From state 48 to state 53
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZORlNsbFhWM2hXWlVVMVIxcEdaRlpoTWxKeVZGWmtVMWRHYkhGVWJtUlhUV3R3V2xWWGVGTldWbG8yVW01V1lWWXphR2hXYlhoWFkyMVNSazlXVGs1V1dFRXlWakZrZDFReVRYaFdhMlJZWVRGd1dWbHRkSGRXTVd4VlVtdDBVMDFZUWtaVmJUVkxZa1phVlZac2FGaGhNbEo2VmxkNFZtVkdXbkZYYkZwb1RVUldXRmRzWkRSVE1VWnlZMFpXVldFeFdreFdhMVV4VW1jbE0wUWxNMFElM0Q%3D, target=_top}}, source=StateVertexImpl{id=48, name=state48}, target=StateVertexImpl{id=53, name=state53}}
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
		//From state 53 to state 63
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWk9SbE5zYkZoV00yaFhXbFZWTVZJeGNFZGFSbHBvVFd4S2VWWkdXbXRWTVdSSFlraEdWV0p0VWxoVVYzUjNWMnhXV0dWR1RsZFdiRzh5VlcwMVYxbFdXWHBoUjJoWFlsaG9XRmt5TVZOU2F6bFhWR3MxVjFkRlJYbFdha1pyWkRGUmVWUllhRmRoTWxKWldWUkdkMWRXYkhSa1NHUlhUVmQ0VmxWdGREQlZNREZaVVd0YVZtSlVWa3haYTFwaFZsWmFjMkZHYUdoTmJFbzJWbXhrTkZadFZrZFhia1pZWWtad2IxUlZVbGRYUm1SeldrUlNWRTFWV25sWk1GcFhWbGRGZUZkcmVGZGhNVlY0VlcxamJFMHdVV3hOTUZFbE0wUSUzRA%3D%3D, target=_top}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=63, name=state63}}
		mutateDOMTree(53);
		checkState53_OriginalAssertions();
		checkState53_ReusedAssertions();
		checkState53_GeneratedAssertions();
		checkState53_LearnedAssertions();
		checkState53_AllAssertions();
		checkState53_RandAssertions1();
		checkState53_RandAssertions2();
		checkState53_RandAssertions3();
		checkState53_RandAssertions4();
		checkState53_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//From state 63 to state 83
		//Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1], element=Element{node=[A: null], tag=A, text=Login, attributes={href=/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZJeWFGbFdWM2hxVGtkUmVGcEdaRmRpV0ZKV1ZGZDRTMUl4VVhoWGJrNVhWakJ3V1ZsVldtOVpWbGw2WVVkb1lWWXphR2hWYlhoWFkyMVNSMVJyTlZOU1ZuQmhWbTE0YTAxSFNYaGlSbHBPVTBkb2NWVXdWa3RXTVd4MFRsVk9iR0pJUWtoV01qVlBWakF4V0dSNlNsWldla1YzVm1wQmVGSldXbkpqUm1oWFlrWndNbGRXVWtkV01WcHlUVlZzWVZKVWJGaFZiR2hEWWpGYVdFMUlhR2xOVmtwSVdXdGFiMkpHVGtoVmJHaFZWbXh3TTFSV1duTmpiSEJKVkd4YVRsWllRa2hXYWtreFdWWlplRmRyV2xSaVYyaFhWRmR3UjFVeGNGWmFSVnBzWWtoQ1NGWXlNWE5oVms1R1UycFdWMDFXY0ZSV1JFcEdaREExVjFwSGNGTmlTRUoyVmxkd1ExbFdaRmRpUm14cVVsZFNjMVp0ZUhOT1ZsSnpZVWQwV0ZJd2NFaFpNRnB6VmpGS2MxTnJhRmhXYkhCb1ZHMTRTMk14Vm5OWGJXeFRUVlZ3VGxaclkzaE9SbGw1VkZob1UySnJOVlpaYTFVeFZERnNXV05GV214aVJuQXdXa1ZhYTFack1WWk5WRkpYVm0xb2VsWnNXbXRUUjBaSlVXeGFhVlpGVlhkV2JYaGhZekpTU0ZacmJHRlNNMEpVV1d0YWQwNUdXbFZUYm1SV1RWWktlbFl5TlZOV2JVcDFVV3hvVm1KVVJuWlpNbmh6WTJ4a2NtUkdhRmROUm5CTFYxWldZVmxYUmxkVFdHeG9Va1Z3V0ZsVVJuZGpiRlp4VTJ4T1UwMVdXakZWYlhoVFlWWkplV0ZHYkZkV00yaHhWR3RrVW1WR2NFZGFSbVJwVjBaS1YxWkdaRFJUTVVsNFZWaG9XR0pyTlZoV2FrSjNWMVpzVmxkdE9WcFdiR3cyV1ZWa2IxbFdXWHBoUjJoV1lsaG9XRmt5TVZOU01WSnlUbFpPVTFadVFtaFdiVEUwWVRBeFNGTllhR2xTYkhCUFZUQmtiMk5XVlhkV2EzUlhUVmQ0TUZSc1ZrOWlSMHBKVVd0b1YwMXFWbEJXYWtGNFYwZFNObE5zV2xkbGExWXpWbTF3UW1WR1NsZFhia3BxVW0xb1dGbHJXbmROYkdSWFZXdGtWMDFXY0hsVVZsWnpXVlpLVldKR2FGWmlSMmhFV1dwR1lWZEZNVWxoUjJ4T1ZtdHdTVmRYZEdGaU1rcEhWR3RvVm1KSGFGWldiWGgzVFRGU1YxZHVUbXBpU0VKS1ZrZDRZVlJzV2xsUmEyaFhZV3RyZUZkV1dscGxSbVJ5VjJ4U2FWWXlhRmhXUm1SM1VqRlZlR05HV21GU1ZuQnpXV3RvUTFOR1dYbE5XRTVvVm1zMVIxVXljRmRXTURGWFkwWlNWMUpGY0VkYVJFRXhWakZ3U0dOR1RtbFRSVW95Vm14a2QxRXhiRmRhUm1ScFVtMTRjVlZzWkZOak1WcDBaVWhPVDFac1NucFpWV1F3VjBaSmQyTkZhRnBOUm5CNlZtcEdTMk14VG5KaFJtaFhZa2hDYjFaSE1UUlRNazE0Vm01T1dHSlhlRlJVVmxaM1ZHeGFjbGt6YUU5U2JHdzFWa1pvYjFVeVNuSk9WbHBhWVRGVmVGWkVSbk5YVjA1R1YyMTRhVkp1UVhkWGExWmhZVEZhY2sxV1drNVdSa3BZVm0weGIyVnNXbk5YYlhSVVVqQmFTbFZYZUdGaFZscEdWbGhrVjJKWWFHaFpla3BUVTBaYWNtSkhSbE5OTUVwVlYxZDBZV1F3TlVkWGJGWlVZbTFTVjFSV1drdGxiRmw1VGxaT1YySlZjREZWVjNodlZtMUtWVkp1V2xwTmJtaDZXVEo0YTJOdFVrZGhSbVJPVW01Q1RGWXhXbGRaVm14WVVteGtWRmRIZUc5VmExWjNWMFpzVlZKdVpHcGlSbHA0VlRKNFQxVXdNVmRYYWtaV1lsaG9WRmxXV2s5U2JFNXpZa1pvVjAweWFGaFhiRlpXVFZaSmVHTkZaR0ZTYkhCdlZGZDRTMlZXV2tkWGJYUldUVmRTU0ZscmFFZFdWMHAwVld4b1ZWWXpVak5XTW5oWFYwZFdSMVJzWkZkaVJ6aDVWbGN3TVZZeGJGZFhXSEJvVWpKb1dGbHNhRzlYUm10NVRWWk9VMkY2YkZoV1IzTXhWakZrUmxKWWJGZGhhMXB5V2tSR1VtVldVbGxoUm1Sb1RXeEtXbGRXVWtka01XUlhZa2hTYTFOSFVsaFVWbVEwVm14V2RHUkVRbFpOUkVaYVZWZDBZVlp0U2xWV2EzaGFZVEZ3YUZac1dtRmpNa1pIWVVkb1RtSkZiekpXYlhoclRrWmFkRlpyWkZoaWExcFpXV3RhZDJJeFVsWlZiR1JZVW0xU2VsZHJVbE5XUlRGV1YyNXNXazFHY0ZoV2JHUkdaVVprY21WR1pHaE5WbFkwVmxjeGFtSkZNSGRWVjNoT1RVWkZiRTB3VVNVelJBJTNEJTNE, target=_top}}, source=StateVertexImpl{id=63, name=state63}, target=StateVertexImpl{id=83, name=state83}}
		mutateDOMTree(63);
		checkState63_OriginalAssertions();
		checkState63_ReusedAssertions();
		checkState63_GeneratedAssertions();
		checkState63_LearnedAssertions();
		checkState63_AllAssertions();
		checkState63_RandAssertions1();
		checkState63_RandAssertions2();
		checkState63_RandAssertions3();
		checkState63_RandAssertions4();
		checkState63_RandAssertions5();
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys("nainy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("nainy");
		driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/UL[1]/LI[1]/SPAN[1]/A[1]")).click();
		//Sink node at state 83
		mutateDOMTree(83);
		checkState83_OriginalAssertions();
		checkState83_ReusedAssertions();
		checkState83_GeneratedAssertions();
		checkState83_LearnedAssertions();
		checkState83_AllAssertions();
		checkState83_RandAssertions1();
		checkState83_RandAssertions2();
		checkState83_RandAssertions3();
		checkState83_RandAssertions4();
		checkState83_RandAssertions5();
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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/A[href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[[]"))); // Random element assertion
		element = new DOMElement("FORM", "Search", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php?logout=true\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"coursesearchbox_keyword\"","name=\"coursesearchbox_keyword\"","type=\"text\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions2(){
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/H3[class=\"blockHeader\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions3(){
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV[id=\"loginBox\"]"))); // Random element assertion
		element = new DOMElement("LABEL", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H3", "Authentication", new ArrayList<String>(Arrays.asList("class=\"blockHeader\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Authentication", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState0_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/A[href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"]"))); // Random element assertion
	}

	public void checkState0_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/H3[]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON[@tabindex=\"3\" and @type=\"submit\"]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "SoftwareEng", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "SoftwareEng", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState17_OriginalAssertions(){
	}

	public void checkState17_ReusedAssertions(){
	}

	public void checkState17_GeneratedAssertions(){
	}

	public void checkState17_LearnedAssertions(){
	}

	public void checkState17_AllAssertions(){
	}

	public void checkState17_RandAssertions1(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"tabbedCourse\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"courseLeftSidebar\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"courseRightContent\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"clearer\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "rightContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[id=\"campusFooterLeft\"]"))); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2NvdXJzZS9pbmRleC5waHA%2FY2lkPUFBT0MxMTI%3D\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "Assignments", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/work/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/work/work.php?cidReset=true&cidReq=AAOC112\"","id=\"CLWRK\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState17_RandAssertions2(){
		element = new DOMElement("A", "Coursedescription", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/course_description/index.php?cidReset=true&cidReq=AAOC112\"","id=\"CLDSC\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/course_description/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Coursedescription", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[12]/A[@class=\"item\" and @@href=\"/claroline-1.11.7/claroline/wiki/wiki.php?cidReset=true&cidReq=AAOC112\" and @id=\"CLWIKI\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[7]/A[@class=\"item\" and @@href=\"/claroline-1.11.7/claroline/learnPath/learningPathList.php?cidReset=true&cidReq=AAOC112\" and @id=\"CLLNP\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Claroline>AAOC112", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState17_RandAssertions3(){
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"clearer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Manager(s)forAAOC112:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"courseManager\""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Manager(s)forAAOC112:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("UL", "Claroline>AAOC112", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode firstBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline>", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState17_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV/DIV[class=\"clearer\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "Manager(s)forAAOC112:mmnainy", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Announcement", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/announcements/announcements.php?cidReset=true&cidReq=AAOC112\"","id=\"CLANN\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/announcements/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Announcement", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[3]/A/IMG[@alt=\"\" and @@class=\"clItemTool\" and @src=\"/claroline-1.11.7/claroline/calendar/icon.png\"]"))); // Random element assertion
	}

	public void checkState17_RandAssertions5(){
		element = new DOMElement("A", "AAOC112", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("UL", "AAOC112", new ArrayList<String>(Arrays.asList("class=\"coursesTabs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"1                         current\""))));
childrenElements.add(new DOMElement("LI", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Manager(s)forAAOC112:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?body=AAOC112&subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"courseManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[[class=\"clearer\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Announcement", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/announcements/announcements.php?cidReset=true&cidReq=AAOC112\"","id=\"CLANN\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/announcements/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Announcement", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState19_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[id=\"userBannerRight\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/CREDITS.txt\" and @rel=\"Author\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline>AAOC112", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline>AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Assignments", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/work/work.php?cidReset=true&cidReq=AAOC112\"","id=\"CLWRK\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/work/icon.png\""))));
childrenElements.add(new DOMElement("#text", "Assignments", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState19_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[]"))); // Random element assertion
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"courseRightContent\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"courseContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[9]/A/IMG[@alt=\"\" and @@class=\"clItemTool\" and @src=\"/claroline-1.11.7/claroline/phpbb/icon.png\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/claroline.js?1368609538\" and @type=\"text/javascript\"]"))); // Random element assertion
	}

	public void checkState19_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[13]/A[@class=\"item\" and @@href=\"/claroline-1.11.7/module/CLCHAT/index.php?cidReset=true&cidReq=AAOC112\" and @id=\"CLCHAT\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV/DIV/DIV/UL/LI[3]/A[@class=\"item\" and @@href=\"/claroline-1.11.7/claroline/calendar/agenda.php?cidReset=true&cidReq=AAOC112\" and @id=\"CLCAL\"]"))); // Random element assertion
		element = new DOMElement("LI", "Document", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Document", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/document/document.php?cidReset=true&cidReq=AAOC112\"","id=\"CLDOC\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[3]/DIV[2]/DIV/FORM/FIELDSET/BR[]"))); // Random element assertion
	}

	public void checkState19_RandAssertions5(){
		element = new DOMElement("IMG", "Users", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/user/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/user/user.php?cidReset=true&cidReq=AAOC112\"","id=\"CLUSR\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "Announcement", new ArrayList<String>(Arrays.asList("alt=\"\"","class=\"clItemTool\"","src=\"/claroline-1.11.7/claroline/announcements/icon.png\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("class=\"item\"","href=\"/claroline-1.11.7/claroline/announcements/announcements.php?cidReset=true&cidReq=AAOC112\"","id=\"CLANN\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "AAOC112", new ArrayList<String>(Arrays.asList("class=\"1                         current\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"coursesTabs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"qtip \"","href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\"","title=\"Engineering Graphics\""))));
childrenElements.add(new DOMElement("A", "AAOC112", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_OriginalAssertions(){
	}

	public void checkState12_ReusedAssertions(){
	}

	public void checkState12_GeneratedAssertions(){
	}

	public void checkState12_LearnedAssertions(){
	}

	public void checkState12_AllAssertions(){
	}

	public void checkState12_RandAssertions1(){
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "mmnainy-English", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy-English", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("FORM", "Search", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"coursesearchbox_keyword\"","name=\"coursesearchbox_keyword\"","type=\"text\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H3", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET[style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"]"))); // Random element assertion
	}

	public void checkState12_RandAssertions2(){
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\""))));
childrenElements.add(new DOMElement("FIELDSET", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions3(){
		element = new DOMElement("LABEL", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]"))); // Random element assertion
		element = new DOMElement("FORM", "Search", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"coursesearchbox_keyword\"","name=\"coursesearchbox_keyword\"","type=\"text\""))));
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("type=\"submit\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BUTTON", "Search", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/SCRIPT[type=\"text/javascript\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions4(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
childrenElements.add(new DOMElement("H3", "Authentication", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/SPAN[id=\"institution\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/claroline/../favicon.ico\" and @rel=\"shortcut icon\"]"))); // Random element assertion
		element = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState12_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/P[]"))); // Random element assertion
		element = new DOMElement("A", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/course/index.php?cid=AAOC112\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState3_OriginalAssertions(){
	}

	public void checkState3_ReusedAssertions(){
	}

	public void checkState3_GeneratedAssertions(){
	}

	public void checkState3_LearnedAssertions(){
	}

	public void checkState3_AllAssertions(){
	}

	public void checkState3_RandAssertions1(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@name=\"sourceGid\" and @@type=\"hidden\" and @value=\"\"]"))); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL[class=\"menu\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[class=\"breadcrumbTrails\"]"))); // Random element assertion
	}

	public void checkState3_RandAssertions2(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcv\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState3_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[[id=\"userBanner\"]"))); // Random element assertion
		element = new DOMElement("A", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[[class=\"spacer\"]"))); // Random element assertion
	}

	public void checkState3_RandAssertions4(){
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState3_RandAssertions5(){
		element = new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV[id=\"platformManager\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[id=\"campusFooterLeft\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"menu\""))));
childrenElements.add(new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H3", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H4", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState5_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"rightSidebar\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"blockHeader\""))));
childrenElements.add(new DOMElement("H3", "Authentication", new ArrayList<String>(Arrays.asList("type=\"text/javascript\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
childrenElements.add(new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FORM", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("P", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H4", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Coursesinthiscategory", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState5_RandAssertions3(){
		element = new DOMElement("IMG", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[[for=\"password\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/A[href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI/SPAN/A[@href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhw\" and @target=\"_top\"]"))); // Random element assertion
	}

	public void checkState5_RandAssertions4(){
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BR[[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@name=\"sourceCid\" and @@type=\"hidden\" and @value=\"\"]"))); // Random element assertion
	}

	public void checkState5_RandAssertions5(){
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterCenter\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\"")));
		parentElement = new DOMElement("H3", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Searchfromkeyword", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_OriginalAssertions(){
	}

	public void checkState6_ReusedAssertions(){
	}

	public void checkState6_GeneratedAssertions(){
	}

	public void checkState6_LearnedAssertions(){
	}

	public void checkState6_AllAssertions(){
	}

	public void checkState6_RandAssertions1(){
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@name=\"sourceCid\" and @@type=\"hidden\" and @value=\"\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "PoweredbyClaroline2001-2013", new ArrayList<String>(Arrays.asList("class=\"poweredBy\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterCenter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Poweredby", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","target=\"_blank\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "2001-2013", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\" and @type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceCid\"","type=\"hidden\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions3(){
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL[class=\"menu\"]"))); // Random element assertion
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]"))); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
childrenElements.add(new DOMElement("#comment", "PlatformBanner", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPlatformBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofUserBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "BreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofBreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions4(){
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI/SPAN/A[@href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlpWbU14WVRGd1dWb3pWbXBTTW1nelZVUktOR1JzYjNsUFZFWnJVa1JGZDFreU5WZGlRU1V6UkNVelJBJTNEJTNE\" and @target=\"_top\"]"))); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState6_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]"))); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[[id=\"toolViewOption\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[2]/SPAN[id=\"institution\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@name=\"sourceCid\" and @@type=\"hidden\" and @value=\"\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[class=\"breadCrumbsNode firstBreadCrumbsNode\"]"))); // Random element assertion
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline>Lostpassword", new ArrayList<String>(Arrays.asList("id=\"toolViewOption\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions2(){
		element = new DOMElement("INPUT", "Email:", new ArrayList<String>(Arrays.asList("id=\"Femail\"","maxlength=\"100\"","name=\"Femail\"","size=\"50\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV[id=\"platformManager\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbHBXYlUxNFdWUkdkMWRXYjNwV2JYQlRUVzFuZWxaVlVrdE9SMUp6WWpOc1VGWkZXbkpWYTFKR1pERnJlVTVXWkdsUlUxVjZVa05WZWxKQkpUTkVKVE5F\"","target=\"_top\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions3(){
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline>Lostpassword", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\""))));
childrenElements.add(new DOMElement("UL", "Claroline>Lostpassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[type=\"text/javascript\"]"))); // Random element assertion
		element = new DOMElement("DIV", "Enteryouremailsowecansendyouyourpassword.Email:", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox \"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgTitle\""))));
childrenElements.add(new DOMElement("DIV", "Enteryouremailsowecansendyouyourpassword.", new ArrayList<String>(Arrays.asList("class=\"claroDialogMsg msgForm\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Email:", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions4(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[2]/DIV[id=\"platformManager\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[id=\"campusBannerRight\"]"))); // Random element assertion
		element = new DOMElement("TD", "Lostpassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"commandList\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LEGEND", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AuthenticationRequired", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("H1", "Lostpassword", new ArrayList<String>(Arrays.asList("class=\"toolTitle mainTitle\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState23_RandAssertions5(){
		element = new DOMElement("A", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"toolTitleBlock\""))));
childrenElements.add(new DOMElement("#comment", "Pagecontent", new ArrayList<String>(Arrays.asList("class=\"claroDialogBox \""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("DIV", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Enteryouremailsowecansendyouyourpassword.Email:", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPageContent", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "Claroline", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState31_OriginalAssertions(){
	}

	public void checkState31_ReusedAssertions(){
	}

	public void checkState31_GeneratedAssertions(){
	}

	public void checkState31_LearnedAssertions(){
	}

	public void checkState31_AllAssertions(){
	}

	public void checkState31_RandAssertions1(){
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
childrenElements.add(new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "Login", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState31_RandAssertions2(){
		element = new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("BR", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]"))); // Random element assertion
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState31_RandAssertions3(){
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterCenter\"]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV/SPAN/A[@href=\"/claroline-1.11.7/index.php\" and @target=\"_top\"]"))); // Random element assertion
	}

	public void checkState31_RandAssertions4(){
		element = new DOMElement("UL", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"breadcrumbTrails\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\""))));
childrenElements.add(new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@type=\"submit\" and @value=\"Ok\"]"))); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState31_RandAssertions5(){
		element = new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("FIELDSET", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[id=\"campusBannerRight\"]"))); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("name=\"sourceUrl\"","type=\"hidden\"","value=\"aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbHBXYlUxNFdWUkdkMWRXYjNwV2JYQlRUVzFuZWxaVlVrdE9SMUp6WWpOc1VGWkZXbkpWYTFKR1pERnJlVTVXWkdsUlUxVjZVa05WZWxKQkpUTkVKVE5F\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/H3[class=\"blockHeader\"]"))); // Random element assertion
		element = new DOMElement("INPUT", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("class=\"inputLogin\"","id=\"login\"","name=\"login\"","size=\"12\"","tabindex=\"1\"","type=\"text\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV[id=\"loginBox\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LEGEND[]"))); // Random element assertion
		element = new DOMElement("P", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\""))));
childrenElements.add(new DOMElement("#comment", "\"LostPassword\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/inscription.php\""))));
childrenElements.add(new DOMElement("A", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "\"CreateuserAccount\"", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("A", "Createuseraccount", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("BR", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState38_RandAssertions2(){
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
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/P/BR[]"))); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvaW5kZXgucGhwP2xvZ291dD10cnVl\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"loginBox\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState38_RandAssertions3(){
		element = new DOMElement("H3", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"leftContent\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("LABEL", "Searchfromkeyword", new ArrayList<String>(Arrays.asList("for=\"keyword\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "LostpasswordCreateuseraccount", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/lostPassword.php\"")));
		parentElement = new DOMElement("P", "", new ArrayList<String>(Arrays.asList("style=\"padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Lostpassword", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]"))); // Random element assertion
	}

	public void checkState38_RandAssertions4(){
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "Search", new ArrayList<String>(Arrays.asList("class=\"inputSearch\"","id=\"coursesearchbox_keyword\"","name=\"coursesearchbox_keyword\"","type=\"text\"")));
		parentElement = new DOMElement("FORM", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/index.php?logout=true\"","method=\"post\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "UsernamePasswordEnter", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("style=\"border: 0; margin: 10px 0 15px 0; padding: 5px;\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("IMG", "AAOC112EngineeringGraphics", new ArrayList<String>(Arrays.asList("alt=\"Access allowed to anybody (even without login)\"","class=\"access qtip \"","src=\"/claroline-1.11.7/web/img/access_open.png?1232379976\"")));
		parentElement = new DOMElement("DT", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState38_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LEGEND[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[[id=\"campusFooterRight\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/HR[]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@type=\"submit\" and @value=\"Ok\"]"))); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
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
		element = new DOMElement("TITLE", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("HR", "Claroline", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("style=\"width: 180px; margin: 0 auto;\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("action=\"/claroline-1.11.7/claroline/auth/login.php\"","class=\"claroLoginForm\"","method=\"post\""))));
childrenElements.add(new DOMElement("FORM", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState48_RandAssertions2(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[[class=\"spacer\"]"))); // Random element assertion
		element = new DOMElement("LI", "Claroline", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		parentElement = new DOMElement("UL", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbs\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"institution\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroPage\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"platformBanner\""))));
childrenElements.add(new DOMElement("#comment", "PlatformBanner", new ArrayList<String>(Arrays.asList("id=\"userBanner\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"breadcrumbLine\""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofPlatformBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofUserBanner", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "BreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofBreadcrumbLine", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState48_RandAssertions3(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\" and @type=\"text/javascript\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/LABEL[for=\"login\"]"))); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("LI", "", new ArrayList<String>(Arrays.asList("class=\"breadCrumbsNode lastBreadCrumbsNode\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"home\"","src=\"/claroline-1.11.7/web/img/home.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState48_RandAssertions4(){
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/print.css?1301592634\"","media=\"print\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState48_RandAssertions5(){
		element = new DOMElement("DIV", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"claroBody\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM[@action=\"/claroline-1.11.7/claroline/auth/login.php\" and @@class=\"claroLoginForm\" and @method=\"post\"]"))); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[]"))); // Random element assertion
		element = new DOMElement("A", "Login", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/auth/login.php?sourceUrl=aHR0cDovL2xvY2FsaG9zdDo4ODg4L2NsYXJvbGluZS0xLjExLjcvY2xhcm9saW5lL2F1dGgvbG9naW4ucGhwP3NvdXJjZVVybD1hSFIwY0RvdkwyeHZZMkZzYUc5emREbzRPRGc0TDJOc1lYSnZiR2x1WlMweExqRXhMamN2WTJ4aGNtOXNhVzVsTDJGMWRHZ3ZiRzluYVc0dWNHaHdQM052ZFhKalpWVnliRDFoU0ZJd1kwUnZka3d5ZUhaWk1rWnpZVWM1ZW1SRWJ6UlBSR2MwVERKT2MxbFlTblppUjJ4MVdsTXdlRXhxUlhoTWFtTjJXVEo0YUdOdE9YTmhWelZzVERKR01XUkhaM1ppUnpsdVlWYzBkV05IYUhkUU0wNTJaRmhLYWxwV1ZubGlSREZvVTBaSmQxa3dVblprYTNkNVpVaGFXazFyV25wWlZXTTFaVzFTUldKNlVsQlNSMk13VkVSS1QyTXhiRmxUYmxwcFVqSjRNVmRzVFhkbFJYaHhVbGhvVFdGdFRqSlhWRW8wWVVkT2RFOVlUbWhXZWxaelZFUktSMDFYVWtoYU0xcHBVbnBzZFZsV1l6QmtWMDVJWVVoa1VVMHdOVEphUm1oTFlXeHdWMVp1YkdsU1JFWnZWVEJhU21ReGEzZFZibHByWVROa05WcFZhR0ZYYXpGeVYyNXdXbFpYVFRGYVZ6RlRVbGRLTmxWc1FsTlNNazEzVmtWU1MxUXlUWGhpUm14VVlteHdjRlZxU2pSTlZtUnpWRmhrYkZKWWFIaFZiR2h2VkZkR2RGUnFTbGhXUlc4d1dWVmtUMlJGT1ZsVWJXaFhaV3hhZWxaRlVrdFNNREZZVld0b1lVMHhjSEJWYm5CelpGWnNWMWw2UW10V01EVkpXVlZvYTFWVk1IZE9WRXBoVW0xb1RGbFhlSGRXTVZwMVlrZHNVMUpGV25aV1ZFSmhVMjFSZUdFelpGWmliSEJ5V1ZST2EwNVdjRlpoUjBaWVlYcEdlVll5TlhkWGJGcFlWRlJHWVZaNlJsUlZiR1JMVG14V2MxRnNUbE5OYXpFelZtdFdVMU14VVhsVVdHaHBVbTE0VlZsdGVIZGpSbFp4VTJwU1RsWnRVbnBXUm1ocllrWktXV0ZJYUZaaVIyaDJWa1prUjJSR1VuRlRiR2hYVWxjNGQxZFdWbXRVTWxKR1QxWnNWV0pYYUZoYVYzaGhaV3hhUmxWcmRGTk5SRVpaVmxkMGIxbFZNSGhqU0VKV1ltNUNlbHBHV25OV01XdzJVVzEwVjAxRVZrcFhWbFp2WVRGV1ZrMUlaRTlXUlhCb1ZXMHhiMVJHYkZobFNHUlhUVlp3TVZsclpITlZNVXBHVjI1YVYxWkZTbWhWTWpGU1pVZEZlbHBHV21saVNFSjVWMVpTVDJFd05WZGpSbHBvVWpCYVdWbFljRWRsVmxsNVRsaGtXR0pHY0ZsV1JsSkhXVlphTmxKc1VsWmlSMUpNVkcxNFYyTXhSbk5VYkU1T1lYcEZlbFp0ZEZkVk1VMTRWVmhzVlZkSGFIQlZiVEUwVmxac2RHVklaR3BTYkZwNFZUSndVMVJzV25SVmJuQlhVbTFvY2xscldrdFhWMFpKWVVaYWFWSXlhREpXYTFwclVqSlNSMVZ1UmxSaVIyaFlWV3hqTkdReFpGZFdiWFJWVFd4S1IxUXhXbk5XVjBwWVlVWm9ZVll6YUdoYVYzaGhVbXhXY21SR1RrNVNSVnBhVm14a01HSXhiRlpOU0docVUwVktWMWx0TlVObGJIQkhWMjVPVjAxWGR6SlZWekV3VmpBeFJWWnJjRmhXYkZwMldWUkdWMVpyTVVsYVJUbFhVbGhDYjFaWE1IaGlNVkpIWWtab2JGTkhVbGhVVmxwM1RWWnNjbHBJVGxaTlZYQkhWakkxWVZZeFdrWlRiV2hXVFdwR1UxcFZaRVpsYkhCSFYyMXNhVk5GU2pWV01WcFRWREpGZDA1V1pHcFNiSEJ2VldwQ1lWZFdiRmxqUldSc1ZteHNOVlJzYUd0WFIwcEhZMFpzVjFKc1NraFhWbHBoVG14S2MxVnNXbWxTTVVwTlZrY3hORll5VFhoU2JrNVZZa1UxVDFsWWNFWmxiRnAwWkVaa1ZrMVZNVFJXVm1oelZsWmtTR0ZJUWxaaVZFVXdWbXhhYzJSSFZrbGFSM0JUWWtad05GWlVTbmRWTVZKelYyNVNWbUp1UWxoVmJURnZZMnhzY2xkcmRGaFdNRnBLV1ZWYVlXRldTWGxoUkVwWFlURndjbFZxU2xOU01WWjFVbXhTYVZORlNsbFhWM2hXWlVVMVIxcEdaRlpoTWxKeVZGWmtVMWRHYkhGVWJtUlhUV3R3V2xWWGVGTldWbG8yVW01V1lWWXphR2hXYlhoWFkyMVNSazlXVGs1V1dFRXlWakZrZDFReVRYaFdhMlJZWVRGd1dWbHRkSGRXTVd4VlVtdDBVMDFZUWtaVmJUVkxZa1phVlZac2FGaGhNbEo2VmxkNFZtVkdXbkZYYkZwb1RVUldXRmRzWkRSVE1VWnlZMFpXVldFeFdreFdhMVV4VW1jbE0wUWxNMFElM0Q%3D\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Login", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState53_OriginalAssertions(){
	}

	public void checkState53_ReusedAssertions(){
	}

	public void checkState53_GeneratedAssertions(){
	}

	public void checkState53_LearnedAssertions(){
	}

	public void checkState53_AllAssertions(){
	}

	public void checkState53_RandAssertions1(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/index.php\"","rel=\"top\"","title=\"\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/claroline-1.11.7/web/css/print.css?1301592634\" and @@media=\"print\" and @@rel=\"stylesheet\" and @type=\"text/css\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState53_RandAssertions2(){
		element = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterLeft\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "campusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofcampusFooterLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/FORM/FIELDSET/INPUT[[@id=\"login\" and @@name=\"login\" and @@size=\"15\" and @@tabindex=\"1\" and @@type=\"text\" and @value=\"\"]"))); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net\"","rel=\"Copyright\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState53_RandAssertions3(){
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "AdministratorforClaroline:mmnainy", new ArrayList<String>(Arrays.asList("id=\"platformManager\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooterRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "AdministratorforClaroline:", new ArrayList<String>(Arrays.asList("href=\"mailto:m@ga.com?subject=[Claroline]\""))));
childrenElements.add(new DOMElement("A", "mmnainy", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"password\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Password", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState53_RandAssertions4(){
		element = new DOMElement("LABEL", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("for=\"login\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Username", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("id=\"login\"","name=\"login\"","size=\"15\"","tabindex=\"1\"","type=\"text\"","value=\"\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "ClarolineLoginClaroline", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"topBanner\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\""))));
childrenElements.add(new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/LINK[[@href=\"/index.php\" and @@rel=\"top\" and @title=\"\"]"))); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState53_RandAssertions5(){
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/TITLE[]"))); // Random element assertion
		element = new DOMElement("SPAN", "Claroline", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\""))));
childrenElements.add(new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"http://www.claroline.net/documentation.htm\"","rel=\"Help\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "Claroline", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/index.php\"","target=\"_top\"")));
		parentElement = new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("id=\"siteName\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Claroline", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[type=\"text/javascript\"]"))); // Random element assertion
	}

	public void checkState63_OriginalAssertions(){
	}

	public void checkState63_ReusedAssertions(){
	}

	public void checkState63_GeneratedAssertions(){
	}

	public void checkState63_LearnedAssertions(){
	}

	public void checkState63_AllAssertions(){
	}

	public void checkState63_RandAssertions1(){
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/CREDITS.txt\"","rel=\"Author\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI[class=\"breadCrumbsNode lastBreadCrumbsNode\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState63_RandAssertions2(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/web/css/classic/main.css?1337672464\"","media=\"screen, projection, tv\"","rel=\"stylesheet\"","type=\"text/css\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "", new ArrayList<String>(Arrays.asList("onclick=\"document.location='/claroline-1.11.7/claroline/';return false\"","type=\"button\"","value=\"Cancel\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/HEAD/SCRIPT[[@src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\" and @type=\"text/javascript\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV/UL/LI/A/IMG[@alt=\"home\" and @src=\"/claroline-1.11.7/web/img/home.png?1232379976\"]"))); // Random element assertion
	}

	public void checkState63_RandAssertions3(){
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[id=\"platformBanner\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV[3]/DIV[class=\"breadcrumbTrails\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/claroline.ui.js?1358760626\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("INPUT", "AuthenticationRequiredUsernamePassword", new ArrayList<String>(Arrays.asList("type=\"submit\"","value=\"Ok\"")));
		parentElement = new DOMElement("FIELDSET", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState63_RandAssertions4(){
		element = new DOMElement("UL", "Login", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerRight\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Login", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[3]/DIV[3]/SPAN/A[@href=\"http://www.claroline.net\" and @target=\"_blank\"]"))); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.js?1311784942\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("DIV", "Login", new ArrayList<String>(Arrays.asList("class=\"spacer\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBanner\"")));
		childrenElements.clear();
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]"))); // Random element assertion
	}

	public void checkState63_RandAssertions5(){
		element = new DOMElement("LINK", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/../favicon.ico\"","rel=\"shortcut icon\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[[id=\"campusFooter\"]"))); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV/DIV/DIV[[class=\"spacer\"]"))); // Random element assertion
		element = new DOMElement("HR", "", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"campusFooter\"")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SCRIPT", "", new ArrayList<String>(Arrays.asList("src=\"/claroline-1.11.7/web/js/jquery.qtip.js?1329310394\"","type=\"text/javascript\"")));
		parentElement = new DOMElement("HEAD", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState83_OriginalAssertions(){
	}

	public void checkState83_ReusedAssertions(){
	}

	public void checkState83_GeneratedAssertions(){
	}

	public void checkState83_LearnedAssertions(){
	}

	public void checkState83_AllAssertions(){
	}

	public void checkState83_RandAssertions1(){
		element = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("class=\"mceFirst\"","role=\"presentation\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"mceToolbar mceLeft mceFirst mceLast\"","role=\"presentation\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[2]/TBODY/TR/TD[5]/A[@aria-labelledby=\"textContent_pasteword_voice\" and @@class=\"mceButton mceButtonEnabled mce_pasteword\" and @@href=\"javascript:;\" and @@id=\"textContent_pasteword\" and @@onclick=\"return false;\" and @@onmousedown=\"return false;\" and @@role=\"button\" and @@tabindex=\"-1\" and @title=\"Paste from Word\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "TimesNewRoman", new ArrayList<String>(Arrays.asList("class=\"mceText\"","style=\"font-family:times new roman,times\"","title=\"Times New Roman\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-checked=\"false\"","aria-disabled=\"false\"","aria-pressed=\"false\"","href=\"javascript:;\"","id=\"mce_25_aria\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"option\"","tabindex=\"-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "TimesNewRoman", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
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
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "EditHTMLSource", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_code_voice\"","class=\"mceButton mceButtonEnabled mce_code\"","href=\"javascript:;\"","id=\"textContent_code\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Edit HTML Source\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_code\""))));
childrenElements.add(new DOMElement("SPAN", "EditHTMLSource", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_code_voice\"","style=\"display: none;\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState83_RandAssertions2(){
		element = new DOMElement("A", "SelectBackgroundColor", new ArrayList<String>(Arrays.asList("class=\"mceAction mce_backcolor\"","href=\"javascript:;\"","id=\"textContent_backcolor_action\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Select Background Color\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("class=\"mceFirst\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("SPAN", "", new ArrayList<String>(Arrays.asList("class=\"mceAction mce_backcolor\""))));
childrenElements.add(new DOMElement("SPAN", "SelectBackgroundColor", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_backcolor_voice\"","style=\"display:none;\""))));
childrenElements.add(new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("class=\"mceColorPreview\"","id=\"textContent_backcolor_preview\"","style=\"background-color: rgb(136, 136, 136);\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[3]/TBODY/TR/TD[8]/A[@aria-disabled=\"true\" and @@aria-labelledby=\"textContent_row_after_voice\" and @@class=\"mceButton mce_row_after mceButtonDisabled\" and @@href=\"javascript:;\" and @@id=\"textContent_row_after\" and @@onclick=\"return false;\" and @@onmousedown=\"return false;\" and @@role=\"button\" and @@tabindex=\"-1\" and @title=\"Insert Row After\"]"))); // Random element assertion
		element = new DOMElement("SPAN", "Underline(Ctrl+U)", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_underline_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_underline_voice\"","class=\"mceButton mceButtonEnabled mce_underline\"","href=\"javascript:;\"","id=\"textContent_underline\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Underline (Ctrl+U)\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Underline(Ctrl+U)", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV[2]/DIV/TABLE/TBODY/TR[1[@class=\"mceMenuItem mceMenuItemEnabled\" and @id=\"mce_21\"]"))); // Random element assertion
		element = new DOMElement("TD", "Italic(Ctrl+I)", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Italic(Ctrl+I)", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_italic_voice\"","class=\"mceButton mceButtonEnabled mce_italic\"","href=\"javascript:;\"","id=\"textContent_italic\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Italic (Ctrl+I)\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState83_RandAssertions3(){
		element = new DOMElement("SPAN", "Insert/RemoveBulletedList", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_bullist_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_bullist_voice\"","aria-pressed=\"false\"","class=\"mceButton mceButtonEnabled mce_bullist\"","href=\"javascript:;\"","id=\"textContent_bullist\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Remove Bulleted List\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Insert/RemoveBulletedList", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE/TBODY/TR/TD[15]/A/SPAN[[@class=\"mceVoiceLabel mceIconOnly\" and @@id=\"textContent_redo_voice\" and @style=\"display: none;\"]"))); // Random element assertion
		element = new DOMElement("UL", "MydesktopMymessagesPlatformadministration", new ArrayList<String>(Arrays.asList("class=\"menu\"")));
		parentElement = new DOMElement("DIV", "", new ArrayList<String>(Arrays.asList("id=\"userBannerLeft\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Mydesktop", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Mymessages", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("LI", "Platformadministration", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "userBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#comment", "EndofuserBannerLeft", new ArrayList<String>(Arrays.asList(""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("href=\"/claroline-1.11.7/claroline/admin/managing/editFile.php?cmd=rqEdit&file=course_subscription_locked_by_key.inc.html\"")));
		parentElement = new DOMElement("TD", "", new ArrayList<String>(Arrays.asList("align=\"center\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Edit\"","src=\"/claroline-1.11.7/web/img/edit.png?1232379976\""))));
childrenElements.add(new DOMElement("#text", "", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TD", "Insert/RemoveNumberedList", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Insert/RemoveNumberedList", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_numlist_voice\"","aria-pressed=\"false\"","class=\"mceButton mceButtonEnabled mce_numlist\"","href=\"javascript:;\"","id=\"textContent_numlist\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Remove Numbered List\""))));
		assertTrue(isElementRegionFullPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState83_RandAssertions4(){
		element = new DOMElement("TD", "DeleteRow", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "DeleteRow", new ArrayList<String>(Arrays.asList("aria-disabled=\"true\"","aria-labelledby=\"textContent_delete_row_voice\"","class=\"mceButton mce_delete_row mceButtonDisabled\"","href=\"javascript:;\"","id=\"textContent_delete_row\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Delete Row\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "Insert/EditImage", new ArrayList<String>(Arrays.asList("class=\"mceIcon mce_claroimage\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_claroimage_voice\"","class=\"mceButton mceButtonEnabled mce_claroimage\"","href=\"javascript:;\"","id=\"textContent_claroimage\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Insert/Edit Image\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("IMG", "", new ArrayList<String>(Arrays.asList("alt=\"Insert/Edit Image\"","class=\"mceIcon\"","src=\"http://localhost:8888/claroline-1.11.7/claroline/editor/tiny_mce/tiny_mce/plugins/claroimage/img/icon.png\""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("TR", "ArialBlack", new ArrayList<String>(Arrays.asList("class=\"mceMenuItem mceMenuItemEnabled\"","id=\"mce_15\"")));
		parentElement = new DOMElement("TBODY", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("TD", "ArialBlack", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE/TBODY/TR/TD[6]/A[@aria-labelledby=\"textContent_bold_voice\" and @@class=\"mceButton mceButtonEnabled mce_bold\" and @@href=\"javascript:;\" and @@id=\"textContent_bold\" and @@onclick=\"return false;\" and @@onmousedown=\"return false;\" and @@role=\"button\" and @@tabindex=\"-1\" and @title=\"Bold (Ctrl+B)\"]"))); // Random element assertion
		element = new DOMElement("TD", "Italic(Ctrl+I)", new ArrayList<String>(Arrays.asList("style=\"position: relative\"")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("A", "Italic(Ctrl+I)", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_italic_voice\"","class=\"mceButton mceButtonEnabled mce_italic\"","href=\"javascript:;\"","id=\"textContent_italic\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Italic (Ctrl+I)\""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
	}

	public void checkState83_RandAssertions5(){
		element = new DOMElement("SPAN", "BookAntiqua", new ArrayList<String>(Arrays.asList("class=\"mceText\"","style=\"font-family:book antiqua,palatino\"","title=\"Book Antiqua\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-checked=\"false\"","aria-disabled=\"false\"","aria-pressed=\"false\"","href=\"javascript:;\"","id=\"mce_16_aria\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"option\"","tabindex=\"-1\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "BookAntiqua", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagPresent(parentElement , element, childrenElements)); // Random element assertion
		element = new DOMElement("SPAN", "PastefromWord", new ArrayList<String>(Arrays.asList("class=\"mceVoiceLabel mceIconOnly\"","id=\"textContent_pasteword_voice\"","style=\"display: none;\"")));
		parentElement = new DOMElement("A", "", new ArrayList<String>(Arrays.asList("aria-labelledby=\"textContent_pasteword_voice\"","class=\"mceButton mceButtonEnabled mce_pasteword\"","href=\"javascript:;\"","id=\"textContent_pasteword\"","onclick=\"return false;\"","onmousedown=\"return false;\"","role=\"button\"","tabindex=\"-1\"","title=\"Paste from Word\"")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "PastefromWord", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE/TBODY/TR/TD[4]/SPAN/TABLE/TBODY[]"))); // Random element assertion
		element = new DOMElement("TH", "DescriptionEditPreview", new ArrayList<String>(Arrays.asList("")));
		parentElement = new DOMElement("TR", "", new ArrayList<String>(Arrays.asList("")));
		childrenElements.clear();
childrenElements.add(new DOMElement("#text", "Preview", new ArrayList<String>(Arrays.asList(""))));
		assertTrue(isElementRegionTagAttPresent(parentElement , element, childrenElements)); // Random element assertion
		assertTrue(isElementPresent(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/SPAN/TABLE/TBODY/TR/TD/DIV/SPAN/TABLE[2]/TBODY/TR/TD[class=\"mceToolbarStart mceToolbarStartButton mceFirst\"]"))); // Random element assertion
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