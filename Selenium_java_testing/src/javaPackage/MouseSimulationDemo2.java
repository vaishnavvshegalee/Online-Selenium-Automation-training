package javaPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulationDemo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
////		most imp
//		driver.switchTo().frame(0);
		List allFrames = driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<allFrames.size();i++) {
			driver.switchTo().frame(i);
			try {
				WebElement draggable = driver.findElement(By.id("draggable"));
				WebElement droppable = driver.findElement(By.id("droppable"));
				
				if(draggable.isDisplayed()) {
					Actions act = new Actions(driver);
					act.dragAndDrop(draggable, droppable).build().perform();	
					driver.switchTo().defaultContent();
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		

	}

}
