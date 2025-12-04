package javaPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImlicitWait {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

//		Thread.sleep(30000); - Always it will wait for 30 seconds - not recommended 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuff works");

		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("total " + allSuggestions.size());
		String exptResult = "How stuff works science";
//		for(WebElement i:allSuggestions) {
//			if(i.getText().equalsIgnoreCase(exptResult)) {
//				i.click();
//			}
//		}
		for (int i = 0; i < allSuggestions.size(); i++) {
			if(allSuggestions.get(i).getText().equalsIgnoreCase(exptResult)) {
				allSuggestions.get(i).click();
				break;
			}
		}
	}

}
