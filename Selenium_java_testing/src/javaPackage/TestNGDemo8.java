package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo8 {
	
	WebDriver driver;
	@BeforeClass
	public void setEnv() {

		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	
	@DataProvider
	public Object[][] dataset() throws Exception{
//		Specify the location of testData properties file
		File src3 = new File(
				"E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\testdata.properties");
//		FileInputStream
		FileInputStream fis3 = new FileInputStream(src3);
		
//		Create properties class object to read the properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
//		create array for data assigning
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = pro3.getProperty("testData1");
		arr[0][1] = pro3.getProperty("testData2");
		
		arr[1][0] = "testData1";
		arr[1][1] = "testData2";
		
		arr[2][0] = "testData1";
		arr[2][1] = "testData2";
		
		return arr;
	}
	
	@Test(dataProvider = "dataset")
	public void enterData(String username, String password) throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	

}
