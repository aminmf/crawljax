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

public class GeneratedTestCase38 {

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
	public void method38(){
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
			//From state 2 to state 118
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[3]/A, element=Element{node=[A: null], tag=A, text=Modules, attributes={href=module/module_list.php}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=118, name=state118}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/UL/LI[3]/UL/LI[3]/A")).click();
			//From state 118 to state 119
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[6]/A/IMG, element=Element{node=[IMG: null], tag=IMG, text=, attributes={alt=Properties, src=/claroline-1.11.7/web/img/settings.png?1232379976}}, source=StateVertexImpl{id=118, name=state118}, target=StateVertexImpl{id=119, name=state119}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/TABLE/TBODY/TR/TD[6]/A/IMG")).click();
			//From state 119 to state 124
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DL/DD/A, element=Element{node=[A: null], tag=A, text=Activated, attributes={href=/claroline-1.11.7/claroline/admin/module/module.php?cmd=deactiv&module_id=1&item=GLOBAL, title=Activated - Click to deactivate}}, source=StateVertexImpl{id=119, name=state119}, target=StateVertexImpl{id=124, name=state124}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DL/DD/A")).click();
			//From state 124 to state 125
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DL/DD/A, element=Element{node=[A: null], tag=A, text=Deactivated, attributes={href=/claroline-1.11.7/claroline/admin/module/module.php?cmd=activ&module_id=1&item=GLOBAL, title=Deactivated - Click to activate}}, source=StateVertexImpl{id=124, name=state124}, target=StateVertexImpl{id=125, name=state125}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DL/DD/A")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Module activation succeeded[\\s\\S]*$")); // original assertion
			//From state 125 to state 126
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DL/DD[2]/A, element=Element{node=[A: null], tag=A, text=Automatic, attributes={href=/claroline-1.11.7/claroline/admin/module/module.php?cmd=coursedeactiv&module_id=1&item=GLOBAL, title=Automatic}}, source=StateVertexImpl{id=125, name=state125}, target=StateVertexImpl{id=126, name=state126}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DL/DD[2]/A")).click();
			//From state 126 to state 127
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV[2]/DL/DD[2]/A, element=Element{node=[A: null], tag=A, text=Manual, attributes={href=/claroline-1.11.7/claroline/admin/module/module.php?cmd=courseactiv&module_id=1&item=GLOBAL, title=Manual}}, source=StateVertexImpl{id=126, name=state126}, target=StateVertexImpl{id=127, name=state127}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV[2]/DL/DD[2]/A")).click();
			mutateDOMTree();
			assertTrue(driver.findElement(By.cssSelector("div.claroDialogBox.boxSuccess")).getText().matches("^[\\s\\S]*Module activation at course creation set to AUTOMATIC[\\s\\S]*$")); // original assertion
			//From state 127 to state 98
			//Eventable{eventType=click, identification=xpath /HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A, element=Element{node=[A: null], tag=A, text=Logout, attributes={href=/claroline-1.11.7/index.php?logout=true, target=_top}}, source=StateVertexImpl{id=127, name=state127}, target=StateVertexImpl{id=98, name=state98}}
			driver.findElement(By.xpath("/HTML/BODY/DIV/DIV/DIV[2]/DIV[2]/UL/LI[3]/SPAN/A")).click();
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