package com.crawljax.examples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.condition.NotXPathCondition;
import com.crawljax.core.CrawljaxRunner;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.ProxyConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.oraclecomparator.OracleComparator;
import com.crawljax.oraclecomparator.comparators.EditDistanceComparator;
import com.crawljax.oraclecomparator.comparators.ScriptComparator;
import com.crawljax.oraclecomparator.comparators.SimpleComparator;
import com.crawljax.oraclecomparator.comparators.XPathExpressionComparator;
import com.crawljax.plugins.crawloverview.CrawlOverview;
import com.crawljax.plugins.proxy.JSInjectorProxyAddon;
import com.crawljax.plugins.proxy.WebScarabProxyPlugin;
import com.crawljax.plugins.testsuiteextension.TestSuiteExtension;

import com.crawljax.plugins.testsuiteextension.jsinstrumentor.JSModifyProxyPlugin;
import com.crawljax.plugins.testsuiteextension.jsinstrumentor.AstInstrumenter;

/**
 * Example of running Crawljax with the TestSuiteExtension plugin on a single-page web app.
 */
public final class TestSuiteExtensionExample {

	private static final long WAIT_TIME_AFTER_EVENT = 300;
	private static final long WAIT_TIME_AFTER_RELOAD = 50;
	//only for random crawling approach => 
	private static final String URL = "http://localhost:8888/phormer331/admin.php";
	//private static final String URL = "http://localhost:8888/phormer331/";
	//private static final String URL = "http://localhost:8888/claroline-1.11.7/index.php?logout=true";
	//private static final String URL = "http://localhost:8888/wolfcms/?/admin/";
	//private static final String URL = "https://localhost:9443/admin/carbon/admin/login.jsp"; // eshop 1
	//private static final String URL = "https://localhost:9443/store/login"; // eshop2
	
	

	
	/**
	 * Run this method to start the crawl.
	 * 
	 * @throws IOException
	 *             when the output folder cannot be created or emptied.
	 */
	public static void main(String[] args) throws IOException {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().insertRandomDataInInputForms(false);
		builder.setMaximumRunTime(500, TimeUnit.SECONDS); // for phormer 200 + 300
		//builder.setMaximumRunTime(1600, TimeUnit.SECONDS); // for claroline 1200 + 300
		//builder.setMaximumRunTime(1500, TimeUnit.SECONDS); // for claroline 1200 + 300
		//builder.setMaximumRunTime(750, TimeUnit.SECONDS); // for wolfcms 450 + 300
		// builder.setMaximumRunTime(600, TimeUnit.SECONDS); // for eshop1 300 + 300
		//builder.setMaximumRunTime(500, TimeUnit.SECONDS); // for eshop2 150 + 300
		builder.setMaximumDepth(0);

		// Phormer
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='item']")));

		// WolfCMS
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='node level-1 no-children']")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='node odd']")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='node even']")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='snippet node odd']")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='snippet node even']")));
		
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//*[@class='unreadMessage']")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//DT")));
		
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//DD")));
		
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//TR")));
		

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//UL")));

		builder.crawlRules().addOracleComparator(
		        new OracleComparator("XPathExpressionComparator", new XPathExpressionComparator("//LI")));

		
		
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("ScriptComparator", new ScriptComparator()));
		builder.crawlRules().addOracleComparator(
		        new OracleComparator("SimpleComparator", new SimpleComparator()));

		// click these elements
		builder.crawlRules().clickDefaultElements();
		builder.crawlRules().click("div").withAttribute("class", "clickable");

		// but don't click these
		builder.crawlRules().dontClick("a").withText("%delete%");		
		builder.crawlRules().dontClick("a").withText("%Delete%");
		builder.crawlRules().dontClick("a").withText("%Del%");
		builder.crawlRules().dontClick("option").withAttribute("value", "del");
		builder.crawlRules().dontClick("option").withText("%Del%");
		builder.crawlRules().dontClick("option").withText("%del%");
		builder.crawlRules().dontClick("input").withAttribute("value", "   Delete it!   ");
		builder.crawlRules().dontClick("INPUT").withAttribute("value", "   Delete it!   ");
		builder.crawlRules().dontClick("INPUT").withText("   Delete it!   ");
		builder.crawlRules().dontClick("INPUT").withText("%Del%");
		builder.crawlRules().dontClick("INPUT").withText("%del%");
		
		//builder.crawlRules().dontClick("a").underXPath("//DIV[@id='footer']");

		// Set timeouts
		builder.crawlRules().waitAfterReloadUrl(WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterEvent(WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

		// Add a condition that this XPath doesn't exits
		builder.crawlRules().addCrawlCondition("No spans with foo as class",
		        new NotXPathCondition("//*[@class='foo']"));

		// Set some input for fields
		builder.crawlRules().setInputSpec(getInputSpecification());

		//builder.addPlugin(new CrawlOverview());
		builder.addPlugin(new TestSuiteExtension());
		
		
		// Create a Proxy for the purpose of code instrumentation
		/*WebScarabProxyPlugin proxyPlugin = new WebScarabProxyPlugin();
		JSModifyProxyPlugin jsModifier = new JSModifyProxyPlugin(new AstInstrumenter());
		jsModifier.excludeDefaults();
		proxyPlugin.addPlugin(jsModifier);
		builder.addPlugin(proxyPlugin);
		// Configure the proxy to use the port 8084 (you can change this of course)
		builder.setProxyConfig(ProxyConfiguration.manualProxyOn("127.0.0.1", 8084));
		*/
		
		// For this version we use only one browser.
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.FIREFOX, 1));

		
		CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());
		crawljax.call();
	}

	private static InputSpecification getInputSpecification() {
		InputSpecification input = new InputSpecification();
		Form contactForm = new Form();
		//contactForm.field("male").setValues(true, false);
		//contactForm.field("female").setValues(false, true);
		//contactForm.field("name").setValues("Bob", "Alice", "John");
		//contactForm.field("phone").setValues("1234567890", "1234888888", "");
		
		
		contactForm.field("loginAdminPass").setValues("editor"); // phormer
		
		//contactForm.field("login-username").setValues("admin");  // wolfcms
		//contactForm.field("login-password").setValues("admin");

		//contactForm.field("active").setValues(true);
				
		//contactForm.field("login").setValues("nainy");     // claroline
		//contactForm.field("password").setValues("nainy");

		//contactForm.field("username").setValues("admin");     // estore
		//contactForm.field("password").setValues("admin");

		
		input.setValuesInForm(contactForm).beforeClickElement("input");//. .withText("Save");
		return input;
	}

}
