package com.crawljax.plugins.testilizer.casestudies.cookerybook.originaltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CoursesViewIsFormedCorrectlyTest.class,
	ChangePresentationStyleGloballyTest.class,
	ChangePresentationStyleOnRecipeTest.class,
	ChaningStyleChangesForAllRecipesTest.class,
	BreadcrumbsCorrectlyFormedTest.class,
	GridViewIsFormedCorrectlyTest.class,
	})

public class CookeryBook_TestSuite_Selenium {}
