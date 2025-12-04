package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		List<WebElement> birthDays = driver.findElements(By.xpath("//select[@id='day']/option"));
		String day = "26";
//		for(WebElement i:birthDays) {
//			if(i.getText().equalsIgnoreCase(day)) {
//				i.click();
//			}
//		}
		for(int i=0;i<birthDays.size();i++) {
			if(birthDays.get(i).getText().equalsIgnoreCase(day)) {
				birthDays.get(i).click();
			}
		}
		
		List<WebElement> birthMonths = driver.findElements(By.xpath("//select[@id='month']/option"));
		String month = "dec";
		for(WebElement i : birthMonths) {
			if(i.getText().equalsIgnoreCase(month)) {
				i.click();
			}
		}
//		another 2 way
		birthMonths.get(3).click();
		
//		another 3rd way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select birthMonth = new Select(bm);
		birthMonth.selectByVisibleText("Sep");
	
//		get the last selected value
		System.out.println(birthMonth.getFirstSelectedOption().getText());
		
//		another way
		List<WebElement> dropdown = birthMonth.getOptions();
		for(WebElement i :dropdown) {
			if(i.getText().equalsIgnoreCase("Sep")) {
				i.click();
			}
		}
		
//		another way
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("dec");
		
		List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']/option"));
		String year ="1999";
		for(WebElement i : years) {
			if(i.getText().equalsIgnoreCase(year)) {
				i.click(); 
			}
		}
		
	}
}
