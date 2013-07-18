package com.crawljax.core;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.crawljax.core.ExitNotifier.ExitStatus;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.test.BrowserTest;
import com.crawljax.test.RunWithWebServer;

@Category(BrowserTest.class)
public class UnblockOnBrowserTimeOutTest {

	@ClassRule
	public static final RunWithWebServer SERVER = new RunWithWebServer("/site");

	@Test(timeout = 50_000)
	public void maximumDepthIsOblidged() throws Exception {
		System.out.println(SERVER.getSiteUrl());
		CrawljaxConfigurationBuilder builder = SERVER.newConfigBuilder("timeout.html")
		        .crawlRules().setEventTimeOut(5, TimeUnit.SECONDS).done();

		CrawljaxRunner runner = new CrawljaxRunner(builder.build());
		runner.call();
		assertThat(runner.getReason(), is(ExitStatus.EXHAUSTED));
	}

}
