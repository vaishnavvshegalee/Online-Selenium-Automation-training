package javaPackage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
//		driver.findElement(By.xpath("//a[@data-secid='nav_moneywiz']")).click();
//		driver.findElement(By.xpath("//a[text()='Gainers']")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total "+allCompanies.size());
		
//		for scrolling
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scrollBy(0,700)");
		
		System.out.println(jse.executeScript("document.getElementById('bsetab')"));
//		jse.executeScript("document.getElementById('bsetab').click()");
		
		for(int i=0;i<allCompanies.size();i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase("Nureca Ltd")) {
				allCompanies.get(i).click();
			}
				
		}
	}

}
