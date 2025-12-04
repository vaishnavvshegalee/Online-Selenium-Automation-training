package javaPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionDemo1 {
	
	@Test
	public void TestCase1() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
		
//		assertEqual
		assertEquals(actualText, expectedText);
		System.out.println("assertEqulas test passed");
		
//		assertFalse
		assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isSelected());
		System.out.println("assertFalse is passed, means that is not selected");
		
//		assertTrue
		assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
		System.out.println("assertTrue is passed, means that is displayed");
		
		driver.quit();
	}

}
