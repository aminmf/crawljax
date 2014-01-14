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

public class GeneratedTestCase96 {

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
	public void method96(){
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
			//From state 118 to state 180
			//Eventable{eventType=click, identification=cssSelector .claroTable > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(6) > a:nth-child(1) > img:nth-child(1), element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Properties, src=/claroline-1.11.7/web/img/settings.png?1232379976}}, source=StateVertexImpl{id=118, name=state118}, target=StateVertexImpl{id=180, name=state180}}
			driver.findElement(By.cssSelector(".claroTable > tbody:nth-child(2) > tr:nth-child(11) > td:nth-child(6) > a:nth-child(1) > img:nth-child(1)")).click();
			//From state 180 to state 181
			//Eventable{eventType=click, identification=text Local settings, element=Element{node=[A: null], tag=A, text=Local settings, attributes={href=module.php?module_id=11&item=LOCAL}}, source=StateVertexImpl{id=180, name=state180}, target=StateVertexImpl{id=181, name=state181}}
			driver.findElement(By.linkText("Local settings")).click();
			//From state 181 to state 186
			//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=181, name=state181}, target=StateVertexImpl{id=186, name=state186}}
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			//From state 186 to state 187
			//Eventable{eventType=click, identification=cssSelector input[type="submit"], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={type=submit, value=Ok}}, source=StateVertexImpl{id=186, name=state186}, target=StateVertexImpl{id=187, name=state187}}
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Properties for Wiki, \\(CLWIKI\\) are now effective on server\\.[\\s\\S]*$")); // original assertion
			//From state 187 to state 190
			//Eventable{eventType=click, identification=text About, element=Element{node=[A: null], tag=A, text=About, attributes={href=module.php?module_id=11&item=About}}, source=StateVertexImpl{id=187, name=state187}, target=StateVertexImpl{id=190, name=state190}}
			driver.findElement(By.linkText("About")).click();
			//From state 190 to state 176
			//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=190, name=state190}, target=StateVertexImpl{id=176, name=state176}}
			driver.findElement(By.linkText("Logout")).click();
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