package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wt = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,300)");
//		Accept Alert - Using normal
		wt.until(ExpectedConditions.elementToBeClickable(By.id("confirmButton"))).click();
//		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		if(driver.switchTo().alert().getText().equalsIgnoreCase("Do you confirm action?")) {
			System.out.println("Text Verified 👍");
		}
		driver.switchTo().alert().accept();
		System.out.println("Accepted");
		
//		Dismiss Alert - Using javascriptExecutor
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Dismissed!!");
		
//		Prompt Alert - Using javascriptExecutor
		jse.executeScript("document.getElementById('promtButton').click()");
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Vaishnav");
		driver.switchTo().alert().accept();
		System.out.println("Prompted...");
		
		driver.close();
	}

}
