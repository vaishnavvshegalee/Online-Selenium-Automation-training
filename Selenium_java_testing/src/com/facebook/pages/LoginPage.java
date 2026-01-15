package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods{
	
	public LoginPage() throws Exception {
		super();
	}
	
//	click on email field
	public void clickEmail() {
		clickOnWebElement("Email");
		handleLoggerFile("LoginPage", "clicked on email field");
	}
	
//	enter email
	public void enterEmail() {
		EnteringData("Email", "testData1");
		handleLoggerFile("LoginPage", "Entered email");
	}
	
//	clear email field
	public void clearEmail() {
		clearData("Email");
		handleLoggerFile("LoginPage", "Cleared email field");
	}
	
	
//	click on password
	public void clickPassword() {
		clickOnWebElement("Pass");
		handleLoggerFile("LoginPage", "Clicked on password field");
	}
	
//	Enter password
	public void enterPass() {
		EnteringData("Pass", "testData2");
		handleLoggerFile("LoginPage", "Entered Password field");
	}
	
//	Clear pass field
	public void clearPass() {
		clearData("Pass");
		handleLoggerFile("LoginPage", "Cleared Password field");
	}
	
//	fetching FecbookText
	public String fetchFacebookText() {
		String text = getWebElementText("facebookText");
		handleLoggerFile("LoginPage", "Fetching login page text");
		return text;
	}
	
//	click on login button
	public void clickLoginButton() {
		clickOnWebElement("LoginButton");
		handleLoggerFile("LoginPage", "Clicked login button");
	}
}
