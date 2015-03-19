package com.crawljax.plugins.testilizer.casestudies.addressbook.originaltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	testLoginAdmin.class,
	testUserAdded.class,
	testUserSearchOk.class,
	testPrint.class,
	testView.class,
	testPrintMail.class,
	testModifyUserAddress.class,
	testAddGroup.class,
	testSampleGroupHeader.class,
	testModifyGroupName.class,
	testRemoveGroup.class,
	testUserDeleted.class,
	testUserSearchKo.class,
})

public class AddressBook_TestSuite_Selenium {}
