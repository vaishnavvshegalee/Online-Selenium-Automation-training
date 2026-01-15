package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {

	public static WebDriver driver;
	public Properties configPropRef;
	public Properties locatorsPropRef;
	public Properties testDataPropRef;

//	Constructor Implementation
	public MasterPage() throws IOException,FileNotFoundException {

//		config properties file loading
		FileInputStream configProperties = new FileInputStream(".\\src\\com\\facebook\\repository\\config.properties");
		configPropRef = new Properties();
		configPropRef.load(configProperties);

//		locators properties file loading
		FileInputStream locatorsProperties = new FileInputStream(
				".\\src\\com\\facebook\\repository\\locators.properties");
		locatorsPropRef = new Properties();
		locatorsPropRef.load(locatorsProperties);

//		testData properties file loading
		FileInputStream testDataProperties = new FileInputStream(
				".\\src\\com\\facebook\\repository\\testData.properties");
		testDataPropRef = new Properties();
		testDataPropRef.load(testDataProperties);

//		Launching the browser - chrome/firefox/edge
		if (configPropRef.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\com\\facebook\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (configPropRef.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", ".\\src\\com\\facebook\\drivers\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		} else if (configPropRef.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".src\\com\\facebook\\drivers\\edgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("No Browser Found");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(configPropRef.getProperty("URL_1"));
		driver.findElement(By.xpath(locatorsPropRef.getProperty("Email")))
				.sendKeys(testDataPropRef.getProperty("testData1"));
		
	}
	
	

}
