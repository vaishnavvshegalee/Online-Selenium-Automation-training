package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.facebook.genericPage.CommonMethods;

public class PageFactoryLoginPage extends CommonMethods{
	
	public PageFactoryLoginPage() throws Exception{
		super();
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement Login;
	
	public void enterEmail(String testData) {
		Email.sendKeys(testData);
	}
	
	public void enterPass(String testData) {
		Password.sendKeys(testData);
	}
	
	public void clickLogin() {
		Login.click();
	}
}
