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
import com.crawljax.plugins.diffcrawler.DiffCrawler;
import com.crawljax.plugins.jsmodify.AstInstrumenter;
import com.crawljax.plugins.jsmodify.JSModifyProxyPlugin;
import com.crawljax.plugins.proxy.WebScarabProxyPlugin;


/**
 * Example of running Crawljax with the DiffCrawler plugin on a single-page web app.
 */
public final class DiffCrawlerExample {

	private static final long WAIT_TIME_AFTER_EVENT = 300;
	private static final long WAIT_TIME_AFTER_RELOAD = 50;
	private static final String URL = "http://localhost:8888/jquery.mb.gallery/demo.html";

	/**
	 * Run this method to start the crawl.
	 * 
	 * @throws IOException
	 *             when the output folder cannot be created or emptied.
	 */
	public static void main(String[] args) throws IOException {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().insertRandomDataInInputForms(false);
		builder.setMaximumRunTime(300, TimeUnit.SECONDS);

		// click these elements
		builder.crawlRules().clickDefaultElements();
		builder.crawlRules().click("div").withAttribute("class", "clickable");

		// but don't click these
		//builder.crawlRules().dontClick("a").withAttribute("class", "ignore");
		//builder.crawlRules().dontClick("a").underXPath("//DIV[@id='footer']");

		// Set timeouts
		builder.crawlRules().waitAfterReloadUrl(WAIT_TIME_AFTER_RELOAD, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterEvent(WAIT_TIME_AFTER_EVENT, TimeUnit.MILLISECONDS);

		// Add a condition that this XPath doesn't exits
		builder.crawlRules().addCrawlCondition("No spans with foo as class",
		        new NotXPathCondition("//*[@class='foo']"));

		// Set some input for fields
		builder.crawlRules().setInputSpec(getInputSpecification());

		// This will generate a nice output in the output directory.
		File outFolder = new File("output");
		if (outFolder.exists()) {
			FileUtils.deleteDirectory(outFolder);
		}
		builder.addPlugin(new DiffCrawler(outFolder));
		
		// Create a Proxy for the purpose of code instrumentation
		WebScarabProxyPlugin proxyPlugin = new WebScarabProxyPlugin();
		JSModifyProxyPlugin modifier = new JSModifyProxyPlugin(new AstInstrumenter());
		modifier.excludeDefaults();
		proxyPlugin.addPlugin(modifier);
		builder.addPlugin(proxyPlugin);

		// Configure the proxy to use the port 8084 (you can change this of course)
		builder.setProxyConfig(ProxyConfiguration.manualProxyOn("127.0.0.1", 8084));

		// For this version of DiffCrawler we use only one browser.
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.FIREFOX, 1));

		CrawljaxRunner crawljax = new CrawljaxRunner(builder.build());
		crawljax.call();

	}

	private static InputSpecification getInputSpecification() {
		InputSpecification input = new InputSpecification();
		Form contactForm = new Form();
		contactForm.field("male").setValues(true, false);
		contactForm.field("female").setValues(false, true);
		contactForm.field("name").setValues("Bob", "Alice", "John");
		contactForm.field("phone").setValues("1234567890", "1234888888", "");
		contactForm.field("mobile").setValues("123", "3214321421");
		contactForm.field("type").setValues("Student", "Teacher");
		contactForm.field("active").setValues(true);
		input.setValuesInForm(contactForm).beforeClickElement("button").withText("Save");
		return input;
	}

}
