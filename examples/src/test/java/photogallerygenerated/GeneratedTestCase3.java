package photogallerygenerated;

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
 * Generated @ Sun Jan 12 20:43:15 PST 2014
 */

public class GeneratedTestCase3 {

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
		url = "http://localhost:8888/phormer331/";
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
	public void method3(){
		try {
			driver.get(url);
			//From state 0 to state 6
			//Eventable{eventType=click, identification=text Admin Page, element=Element{node=[A: null], tag=A, text=Admin Page, attributes={href=admin.php, title=Login to the Administration Region}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}}
			driver.findElement(By.linkText("Admin Page")).click();
			//From state 6 to state 7
			//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Login   }}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=7, name=state7}}
			driver.findElement(By.id("loginAdminPass")).clear();
			driver.findElement(By.id("loginAdminPass")).sendKeys("editor");
			driver.findElement(By.cssSelector("input.submit")).click();
			//From state 7 to state 8
			//Eventable{eventType=click, identification=text Manage Categories, element=Element{node=[A: null], tag=A, text=Manage Categories, attributes={href=?page=categories}}, source=StateVertexImpl{id=7, name=state7}, target=StateVertexImpl{id=8, name=state8}}
			driver.findElement(By.linkText("Manage Categories")).click();
			//From state 8 to state 11
			//Eventable{eventType=click, identification=cssSelector input.submit, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=submit, type=submit, value=   Add Category   }}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=11, name=state11}}
			driver.findElement(By.name("desc")).clear();
			driver.findElement(By.name("desc")).sendKeys("contains photos of all the flowers !");
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys("flowers");
			driver.findElement(By.cssSelector("input.submit")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.method")).getText().matches("^[\\s\\S]*Category \"flowers\" added succesfully![\\s\\S]*$")); // original assertion
			//From state 11 to state 12
			//Eventable{eventType=click, identification=cssSelector a[title="Log Out"], element=Element{node=[A: null], tag=A, text=, attributes={href=?page=logout, title=Log Out}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=12, name=state12}}
			driver.findElement(By.cssSelector("a[title=\"Log Out\"]")).click();
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