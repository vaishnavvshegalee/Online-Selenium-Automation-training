package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

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

//	click list of web elements
	public void clickListOfWebElements(String xpathKey, String testdata) {
		List<WebElement> webElements = driver.findElements(By.xpath(locatorsPropRef.getProperty(xpathKey)));
		for (int i = 0; i < webElements.size(); i++) {
			if (webElements.get(i).getText().equalsIgnoreCase(testDataPropRef.getProperty(testdata))) {
				webElements.get(i).click();
				break;
			}
		}
	}

//	select dropdown value using visible text
	public void selectDropDownValue(String xpathKey, String testData) {
		WebElement ele = driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(testDataPropRef.getProperty(testData));
	}

// Read Excel data
	public void readExcelData(String xpathKey, int rowNo, int columnNo, String excelSheetName) throws Exception {
		File src = new File(".\\src\\com.facebook.resources\\Facebook_Test_Cases_Selenium.xlsx");
		FileInputStream fis = new FileInputStream(src);

//		Loading the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(excelSheetName);
		String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();

		driver.findElement(By.xpath(locatorsPropRef.getProperty(xpathKey))).sendKeys(abc);
		wb.close();

	}

//	Handling Explicit Wait  - visibilityOfElementLocated
	public void handlingExplicitWait(String xpathKey, String testdata) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorsPropRef.getProperty(xpathKey))))
				.sendKeys(testDataPropRef.getProperty(xpathKey));

	}

//	Handling Explicit Wait - elementToBeClickable
	public void handleElementToBeClickable(String xpath) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorsPropRef.getProperty(xpath)))).click();
		;
	}

//	Handle log file
	public void handleLoggerFile(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(configPropRef.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}

//	Capturing a screenshot 
	public void capturingScreenShot(ITestResult res) throws Exception {
		if (ITestResult.FAILURE == res.getStatus()) {
//			create ref of TakesScreenShot Interface and Typecasting
			TakesScreenshot ts = (TakesScreenshot) driver; // Typecasting

//			use getScreenshotAs() to capture the ss in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

//			Copy the file to specific location
			File destFolder = new File("./screenshots" + res.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);

			System.out.println(res.getName() + " method() failed, screenshot captured.");
		}
	}
}
