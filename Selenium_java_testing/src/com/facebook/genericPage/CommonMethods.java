package com.facebook.genericPage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
	}

//	get text of web element 
	public void getWebElementText(String xpathKey) {
		String getTextOfWebElement = driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey))).getText();
		System.out.println(getTextOfWebElement);
	}
	
//	click method
	public void clickOnWebElement(String xpathKey) {
		driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey))).click();
	}
	
//	Clear method
	public void clearData(String xathKey) {
		driver.findElement(By.xpath(locatorsPropRef.getProperty(xathKey))).clear();
	}
	
//	Entering data
	public void EnteringData(String xpathKey, String data) {
		driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey))).sendKeys(testDataPropRef.getProperty(data));
	}
	
//	Mouse hover
	public void moveToElement(String xpathKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey)))).build().perform();
	}

}
