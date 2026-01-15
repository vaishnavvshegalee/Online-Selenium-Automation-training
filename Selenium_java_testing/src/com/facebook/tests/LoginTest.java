package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest{

	
	@Test
	public void loginTest() throws Exception {
		LoginPage lp = new LoginPage();
		
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPass();
		
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPass();
		
//		String actulText = lp.fetchFacebookText();
//		assertEquals(actulText, "Facebook helps you connect and share with the people in your life.");
//		Thread.sleep(2000);
//		lp.readExcelData("Email", 3, 1, "ExcelSheetName");
//		Thread.sleep(2000);
//		lp.readExcelData("Pass", 3, 2, "ExcelSheetName");
	}
	
	@AfterMethod
	public void takingScreenShot(ITestResult result) throws Exception {
		LoginPage lp = new LoginPage();
		lp.capturingScreenShot(result);
	}
	
	@AfterClass
	public void closeApplication() throws Exception {
		Thread.sleep(2000);
		MasterPage.driver.quit();
	}
	
}
