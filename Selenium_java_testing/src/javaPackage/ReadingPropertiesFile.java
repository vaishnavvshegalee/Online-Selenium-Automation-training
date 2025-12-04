package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {

//		Specify the location of config properties file
		File src1 = new File(
				"E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\config.properties");
//		FileInputStream
		Properties pro1 = new Properties();
		FileInputStream fis1 = new FileInputStream("E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\config.properties");
		
//		Create properties class object to read the properties file
		pro1.load(fis1);
		
//		Specify the location of locators properties file
		File src2 = new File(
				"E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\locators.properties");
//		FileInputStream
		FileInputStream fis2 = new FileInputStream(src2);
		
//		Create properties class object to read the properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		
//		Specify the location of testData properties file
		File src3 = new File(
				"E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\testdata.properties");
//		FileInputStream
		FileInputStream fis3 = new FileInputStream(src3);
		
//		Create properties class object to read the properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		
//		Setting the property of chrome driver and passing chromedriver path
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		WebDriverWait wt = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.get(pro1.getProperty("URL_1"));
		
//		getProperty() method will accept key and return value of that key
		
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("testData1"));
		driver.findElement(By.xpath(pro2.getProperty("Pass"))).sendKeys(pro3.getProperty("testData2"));
		driver.findElement(By.xpath(pro2.getProperty("Login"))).click();
		
//		wt.until(ExpectedConditions.alertIsPresent()).accept();
		String iWindow = driver.getWindowHandle();
		System.out.println(iWindow);
		

		
	}

}
