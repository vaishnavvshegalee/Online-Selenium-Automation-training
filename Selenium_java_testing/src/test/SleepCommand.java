package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SleepCommand {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();

//		Thread.sleep(10000);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")))
				.sendKeys("Admin");
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")))
				.sendKeys("admin@1234");
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

		if (myWait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-login-error']")))
				.isDisplayed()) {
			System.out.println("Wrong credentials!!!");
			driver.wait();
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
