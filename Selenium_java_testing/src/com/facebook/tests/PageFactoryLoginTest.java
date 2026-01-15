package com.facebook.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.genericPage.CommonMethods;
import com.facebook.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods{

	public PageFactoryLoginTest() throws Exception {
		super();
	}
	@Test
	public void loginTest() {
		PageFactoryLoginPage pfl = PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfl.enterEmail(testDataPropRef.getProperty("testData1"));
		pfl.enterPass(testDataPropRef.getProperty("testData2"));
		pfl.clickLogin();
	}
}
