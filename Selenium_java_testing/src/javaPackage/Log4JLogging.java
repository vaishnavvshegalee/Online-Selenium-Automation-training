package javaPackage;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Log4JLogging {

	public static void main(String[] args) {
		
//		create a logger instance 
		Logger logger = Logger.getLogger("Log4JLogging"); // pass the class ref where logger is present
		
//		Configure log4j.properties file
		PropertyConfigurator.configure("E:\\Testing_Course_by_Shammi_jha\\javaWorkspace\\Selenium_java_testing\\Repository\\log4j.properties");

//		open the browser instance
		
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		logger.info("open browser instance");
//		maximize window
		driver.manage().window().maximize();
		logger.info("window maximized");
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Waiting...");
		
//		launch the Application
		driver.get("https://www.facebook.com/");
		logger.info("Application launched");
		
//		web element is displayed or not
		try {
			driver.findElement(By.id("email")).isDisplayed();
			logger.info("web element found");
		} catch (Exception e) {
			logger.error("web element not found");
		}
		
		driver.quit();
		logger.info("broswer closed");
	}

}
