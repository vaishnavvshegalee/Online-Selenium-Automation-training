package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {
	
//		Setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
	
//		Maximize my window
		driver.manage().window().maximize();
		
//		Opening the url using get() 
		driver.get("https://www.facebook.com/");
		
//		Opening the url using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
//		Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
//		Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
//		Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward(); 
		
//		Fetch the current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

//		fetch the title of the web page		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
//		close the browser instance
		Thread.sleep(2000);
		driver.close();
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vaishnav@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
//		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	
	
	}

}
