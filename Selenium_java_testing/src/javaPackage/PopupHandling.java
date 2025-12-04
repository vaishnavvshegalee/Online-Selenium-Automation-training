package javaPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
//		step 1 -> Tab handling
//		driver.findElement(By.id("tabButton")).click();
////		get the total nums of open tabs
//		Set<String> allWindowsId = driver.getWindowHandles();
//		String parentWindow = driver.getWindowHandle();
//		System.out.println("All windows id: "+allWindowsId);
//		System.out.println("Parent window id:"+parentWindow);
//		
//		for(String tab:allWindowsId) {
//			driver.switchTo().window(tab);
//			if(tab.equalsIgnoreCase(parentWindow)) {
//				System.out.println("parent tab title:"+driver.getTitle());
//			}else {
//				System.out.println("Child tab url:"+driver.getCurrentUrl());
//			}
//		}
		
//		Step 2 : Window handling 
//		String 
//		driver.switchTo().window(parentWindow);
//		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('windowButton').click()");
//		get the total nums of open tabs
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String window:allWindows) {
			
			driver.switchTo().window(window);
			System.out.println("ID:"+window);
			System.out.println("Title: "+driver.getTitle());
			System.out.println("Url: "+driver.getCurrentUrl());
		}
		driver.quit();
		System.out.println("alll handled ");
	}

}
