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

import com.crawljax.forms.RandomInputValueGenerator;
import com.crawljax.util.DomUtils;

/*
 * Generated @ Mon Jan 13 00:25:00 PST 2014
 */

public class GeneratedTestCase87 {

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
	public void method87(){
		try {
			driver.get(url);
			//From state 0 to state 177
			//Eventable{eventType=click, identification=cssSelector button[type="submit"], element=Element{node=[BUTTON: null], tag=BUTTON, text=Enter, attributes={tabindex=3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=177, name=state177}}
			driver.findElement(By.id("login")).clear();
			driver.findElement(By.id("login")).sendKeys("nainy");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("nainy");
			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			//From state 177 to state 2
			//Eventable{eventType=click, identification=text Platform administration, element=Element{node=[A: null], tag=A, text=Platform administration, attributes={href=/claroline-1.11.7/claroline/admin/, target=_top}}, source=StateVertexImpl{id=177, name=state177}, target=StateVertexImpl{id=2, name=state2}}
			driver.findElement(By.linkText("Platform administration")).click();
			//From state 2 to state 118
			//Eventable{eventType=click, identification=text Modules, element=Element{node=[A: null], tag=A, text=Modules, attributes={href=module/module_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=118, name=state118}}
			driver.findElement(By.linkText("Modules")).click();
			//From state 118 to state 119
			//Eventable{eventType=click, identification=cssSelector img[alt="Properties"], element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Properties, src=/claroline-1.11.7/web/img/settings.png?1232379976}}, source=StateVertexImpl{id=118, name=state118}, target=StateVertexImpl{id=119, name=state119}}
			driver.findElement(By.cssSelector("img[alt=\"Properties\"]")).click();
			//From state 119 to state 120
			//Eventable{eventType=click, identification=text Visible, element=Element{node=[A: null], tag=A, text=Visible, attributes={href=/claroline-1.11.7/claroline/admin/module/module.php?module_id=1&cmd=makeVisible&item=GLOBAL, onclick=return confirmMakeVisible();, title=Make module visible in all courses}}, source=StateVertexImpl{id=119, name=state119}, target=StateVertexImpl{id=120, name=state120}}
			driver.findElement(By.linkText("Visible")).click();
			mutateDOMTree();
			assertTrue(closeAlertAndGetItsText().matches("^ Are you sure you want to make this module visible in all courses [\\s\\S]$")); // original assertion
			//From state 120 to state 121
			//Eventable{eventType=click, identification=text Local settings, element=Element{node=[A: null], tag=A, text=Local settings, attributes={href=module.php?module_id=1&item=LOCAL}}, source=StateVertexImpl{id=120, name=state120}, target=StateVertexImpl{id=121, name=state121}}
			driver.findElement(By.linkText("Local settings")).click();
			//From state 121 to state 122
			//Eventable{eventType=click, identification=text About, element=Element{node=[A: null], tag=A, text=About, attributes={href=module.php?module_id=1&item=About}}, source=StateVertexImpl{id=121, name=state121}, target=StateVertexImpl{id=122, name=state122}}
			driver.findElement(By.linkText("About")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.id("claroBody")).getText().matches("^[\\s\\S]*Course description[\\s\\S]*$")); // original assertion
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