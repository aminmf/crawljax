package clarolinegenerated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.crawljax.util.DomUtils;

/*
 * Generated @ Sat Jan 11 23:08:10 PST 2014
 */

public class GeneratedTestCase66 {

	private WebDriver driver;
	private String url;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	private DOMElement element;
	private DOMElement parentElement;
	private ArrayList<DOMElement> childrenElements = new ArrayList<DOMElement>();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		url = "http://localhost:8888/claroline-1.11.7/index.php";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
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
	public void method66(){
		try {
			driver.get(url);
			//From state 0 to state 144
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=144, name=state144}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 144 to state 2
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=144, name=state144}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV/UL/LI[3]/SPAN/A")).click();
			//From state 2 to state 43
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A, element=Element{node=[A: null], tag=A, text=Configuration, attributes={href=tool/config_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=43, name=state43}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI/A")).click();
			//From state 43 to state 53
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A, element=Element{node=[A: null], tag=A, text=Assignments, attributes={href=config_edit.php?config_code=CLWRK}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=53, name=state53}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL[4]/LI[2]/A")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*ets how the assignment property \"default works visibility\" acts\\. It will change the visibility of all the new submissions or it will change the visibility of all submissions already done in the assignment and the new one\\.[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*For assignments list[\\s\\S]*$")); // original assertion
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*/<COURSEID>/work/[\\s\\S]*$")); // original assertion
			//From state 53 to state 56
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A, element=Element{node=[A: null], tag=A, text=Quota, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=quota}}, source=StateVertexImpl{id=53, name=state53}, target=StateVertexImpl{id=56, name=state56}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/UL/LI[2]/A")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.name("editConfClass")).getText().matches("^[\\s\\S]*Maximum size of a document that a user can uploa[\\s\\S]*$")); // original assertion
			//From state 56 to state 57
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=56, name=state56}, target=StateVertexImpl{id=57, name=state57}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Assignments, \\(CLWRK\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			//From state 57 to state 60
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Submissions, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=submissions}}, source=StateVertexImpl{id=57, name=state57}, target=StateVertexImpl{id=60, name=state60}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[3]/A")).click();
			//From state 60 to state 61
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}}
			driver.findElement(By.id("label_clwrk_endDateDelay")).clear();
			driver.findElement(By.id("label_clwrk_endDateDelay")).sendKeys("365");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/TABLE/TBODY/TR[3]/TD[2]/INPUT")).click();
			//From state 61 to state 67
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A, element=Element{node=[A: null], tag=A, text=View all, attributes={href=/claroline-1.11.7/claroline/admin/tool/config_edit.php?config_code=CLWRK&section=viewall}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=67, name=state67}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[3]/UL/LI[4]/A")).click();
			//From state 67 to state 8
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=67, name=state67}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
		} catch (Exception e) {
			fail(e.getMessage());
		}
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


	private boolean isElementPatternPresent(DOMElement parent, DOMElement element, ArrayList<DOMElement> children) {
		try {
			String source = driver.getPageSource();
			Document dom = DomUtils.asDocument(source);

			NodeList nodeList = dom.getElementsByTagName(element.getTagName());

			org.w3c.dom.Element sourceElement = null;

			boolean parentTagMatched = false;
			boolean childrenTagMatched = false;

			for (int i = 0; i < nodeList.getLength(); i++){
				sourceElement = (org.w3c.dom.Element) nodeList.item(i);

				String parentTagName = sourceElement.getParentNode().getNodeName();

				ArrayList<String> childrenTagName = new ArrayList<String>();				
				for (int j=0; j<sourceElement.getChildNodes().getLength();j++)
					childrenTagName.add(sourceElement.getChildNodes().item(j).getNodeName());

				if (parentTagName.equals(parent.getTagName()))
					parentTagMatched = true;

				childrenTagMatched = true;
				for (int k=0; k<children.size();k++)
					if (!childrenTagName.get(k).equals(children.get(k).getTagName())){
						childrenTagMatched = false;
						break;
					}

				if (parentTagMatched && childrenTagMatched)
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


	void mutateDOMTree(){
	}

	public class DOMElement {
		private String tagName;
		private String textContent;
		private ArrayList<String> attributes = new ArrayList<String>();

		public DOMElement(String tagName, String textContent, ArrayList<String> attributes){
			this.tagName = tagName;
			this.textContent = textContent;
			for (int i=0; i<attributes.size();i++)
				this.attributes.add(attributes.get(i));
		}

		public String getTagName() {
			return tagName;
		}

		public String getTextContent() {
			return textContent;
		}

		public ArrayList<String> getAttributes() {
			return attributes;
		}
	}	 

}