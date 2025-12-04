package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenShotOnFailure2 {

//	create a class of TakeScreenShotOnFailure1 because i want the ss
	TakeScreenShotOnFailure1 ts1 = new TakeScreenShotOnFailure1();
	
	@Test
	public void doLogin() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ts1.driver = new ChromeDriver();
		ts1.driver.manage().window().maximize();
		ts1.driver.get("https://www.facebook.com/");
		ts1.driver.findElement(By.id("wrong-email")).clear();
		
	}
	
	@AfterMethod
	public void captureSs(ITestResult result1) throws Exception{
		ts1.captureScreenShot(result1);
		
	}
	
}
