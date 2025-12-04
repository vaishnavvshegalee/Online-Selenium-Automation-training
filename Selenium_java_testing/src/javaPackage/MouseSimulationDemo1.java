package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseSimulationDemo1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.flipkart.com/electronics-big-bang-diwali-sale-store?fm=neo%2Fmerchandising&iid=M_879acb2d-8147-4f1e-af13-b03ea24912a0_1_VMDN1VE1AUK9_MC.65F7IJCA6MTJ&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Electronics_65F7IJCA6MTJ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L0_view-all&cid=65F7IJCA6MTJ");

		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		act.contextClick(electronics);
//		Thread.sleep(3000);
//		
//		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
//		act.moveToElement(men).build().perform();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wt = new WebDriverWait(driver, 10);
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Samsung']"))).click();
//		driver.findElement(By.xpath("//a[@title='Samsung']")).click();
	}

}
