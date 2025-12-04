package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShotOnFailure1 {

//	Global declaration
	WebDriver driver;
	
//	ITestResult is an interface as well as listener - will provide the test case execution status and test name 
	public void captureScreenShot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
//			Create ref of TakesScreenshot interface and typecasted
			TakesScreenshot ts = (TakesScreenshot) driver; // typecasting
			
//			Use getScreenShotAs() to captured the screenshot in file format
			File sourceFile = ts.getScreenshotAs(OutputType.FILE); // not yet operable copy to the another location with proper extension (.png)
			
//			copy the file to specific location
			File destFolder = new File("./screenshots/failures/"+result.getName()+".png");
			FileUtils.copyFile(sourceFile, destFolder); // FileUtils not by default coming, for that to add the external jars (selenium 2.53 something)
			System.out.println(result.getName()+" method() failed, screenshot captured.");
			
		}
	}
}
