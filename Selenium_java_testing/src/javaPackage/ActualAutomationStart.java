package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualAutomationStart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
//		firstname and lastname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("cena");
		
//		date of birth
		driver.findElement(By.xpath("//select[@name='birthday_day']//option[@value='26']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']//option[@value='12']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']//option[@value='1999']")).click();
		
//		Gender (radio button handling 1st way) - not appropriate way
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
		
//		Gender (radio button handling 2nd way) - Appropriate way
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(radios.size());
		
		String expResult = "Male";
		
//		for(WebElement i:radios) {
//			if(i.getText().equals(expResult)) {
//				i.click();
//			}
//		}
		
		for(int i = 0;i<radios.size();i++) {
			if(radios.get(i).getText().equalsIgnoreCase(expResult)) {
				radios.get(i).click();
			}
		}
		
//		register mobile or email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		
//		set password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");
	}

}
