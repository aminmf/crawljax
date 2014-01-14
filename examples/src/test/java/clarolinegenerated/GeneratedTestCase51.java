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

public class GeneratedTestCase51 {

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
	public void method51(){
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
			//From state 2 to state 137
			//Eventable{eventType=click, identification=text Send a message to all users, element=Element{node=[A: null], tag=A, text=Send a message to all users, attributes={href=../messaging/sendmessage.php?cmd=rqMessageToAllUsers}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=137, name=state137}}
			driver.findElement(By.linkText("Send a message to all users")).click();
			//From state 137 to state 138
			//Eventable{eventType=click, identification=id message_fontselect_open, element=Element{node=[A: null], tag=A, text=▼, attributes={class=mceOpen, href=javascript:;, id=message_fontselect_open, onclick=return false;, onmousedown=return false;, tabindex=-1}}, source=StateVertexImpl{id=137, name=state137}, target=StateVertexImpl{id=138, name=state138}}
			driver.findElement(By.id("message_subject")).clear();
			driver.findElement(By.id("message_subject")).sendKeys("Hello");
			driver.findElement(By.id("message_fontselect_open")).click();
			//From state 138 to state 139
			//Eventable{eventType=click, identification=cssSelector #mce_18_aria > span.mceText, element=Element{node=[SPAN: null], tag=SPAN, text=Courier New, attributes={class=mceText, style=font-family:courier new,courier, title=Courier New}}, source=StateVertexImpl{id=138, name=state138}, target=StateVertexImpl{id=139, name=state139}}
			driver.findElement(By.id("message_subject")).clear();
			driver.findElement(By.id("message_subject")).sendKeys("Hello");
			driver.findElement(By.cssSelector("#mce_18_aria > span.mceText")).click();
			//From state 139 to state 140
			//Eventable{eventType=click, identification=cssSelector span.mceIcon.mce_bold, element=Element{node=[SPAN: null], tag=SPAN, text=, attributes={class=mceIcon mce_bold}}, source=StateVertexImpl{id=139, name=state139}, target=StateVertexImpl{id=140, name=state140}}
			driver.findElement(By.id("message_subject")).clear();
			driver.findElement(By.id("message_subject")).sendKeys("Hello");
			driver.findElement(By.cssSelector("span.mceIcon.mce_bold")).click();
			//From state 140 to state 141
			//Eventable{eventType=click, identification=cssSelector span.mceIcon.mce_italic, element=Element{node=[SPAN: null], tag=SPAN, text=, attributes={class=mceIcon mce_italic}}, source=StateVertexImpl{id=140, name=state140}, target=StateVertexImpl{id=141, name=state141}}
			driver.findElement(By.id("message_subject")).clear();
			driver.findElement(By.id("message_subject")).sendKeys("Hello");
			driver.findElement(By.cssSelector("span.mceIcon.mce_italic")).click();
			//From state 141 to state 142
			//Eventable{eventType=click, identification=name send, element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={name=send, type=submit, value=Send}}, source=StateVertexImpl{id=141, name=state141}, target=StateVertexImpl{id=142, name=state142}}
			driver.findElement(By.id("message_subject")).clear();
			driver.findElement(By.id("message_subject")).sendKeys("Hello");
			driver.findElement(By.name("send")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxInfo")).getText().matches("^[\\s\\S]*Message sent[\\s\\S]*$")); // original assertion
			//From state 142 to state 109
			//Eventable{eventType=click, identification=text Logout, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=142, name=state142}, target=StateVertexImpl{id=109, name=state109}}
			driver.findElement(By.linkText("Logout")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.id("loginBox")).getText().matches("^[\\s\\S]*Authentication[\\s\\S]*$")); // original assertion
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