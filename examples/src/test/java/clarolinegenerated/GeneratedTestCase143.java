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

public class GeneratedTestCase143 {

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
	public void method143(){
		try {
			driver.get(url);
			//From state 0 to state 1
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON, element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=1, name=state1}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV/DIV/FORM/FIELDSET/BUTTON")).click();
			//From state 1 to state 76
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A, element=Element{node=[A: null], tag=A, text=Create a course site, attributes={class=userCommandsItem, href=/claroline-1.11.7/claroline/course/create.php}}, source=StateVertexImpl{id=1, name=state1}, target=StateVertexImpl{id=76, name=state76}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DIV[2]/DIV[2]/DIV/DIV/DIV/UL/LI/A")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.id("courseSettings")).getText().matches("^[\\s\\S]* Access allowed to anybody[\\s\\S]*$")); // original assertion
			//From state 76 to state 82
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[2]/LEGEND/A, element=Element{node=[A: null], tag=A, text=Optionnal settings, attributes={class=doCollapse, href=#}}, source=StateVertexImpl{id=76, name=state76}, target=StateVertexImpl{id=82, name=state82}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[2]/LEGEND/A")).click();
			//From state 82 to state 83
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A, element=Element{node=[A: null], tag=A, text=Advanced options, attributes={class=doCollapse, href=#}}, source=StateVertexImpl{id=82, name=state82}, target=StateVertexImpl{id=83, name=state83}}
			driver.findElement(By.id("course_departmentName")).clear();
			driver.findElement(By.id("course_departmentName")).sendKeys("ECE");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/FIELDSET[3]/LEGEND/A")).click();
			//From state 83 to state 84
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=changeProperties, type=submit, value=Ok}}, source=StateVertexImpl{id=83, name=state83}, target=StateVertexImpl{id=84, name=state84}}
			driver.findElement(By.id("course_userLimit")).clear();
			driver.findElement(By.id("course_userLimit")).sendKeys("60");
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/FORM/DL/DT/INPUT")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*You have just created the course website[\\s\\S]*$")); // original assertion
			//From state 84 to state 85
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=84, name=state84}, target=StateVertexImpl{id=85, name=state85}}
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