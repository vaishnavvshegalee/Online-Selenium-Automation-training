package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
//		enter username
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		
//		fetch the input box value
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		
//		explicitly wait
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
		}

}
