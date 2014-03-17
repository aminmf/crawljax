package com.crawljax.plugins.testsuiteextension.casestudies.eshop.originaltests;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSearch {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(TestSearch.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
