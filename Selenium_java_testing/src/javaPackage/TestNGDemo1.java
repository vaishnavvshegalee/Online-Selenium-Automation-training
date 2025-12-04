package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGDemo1 {
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void test1() {
		System.out.println("2nd time");
	}
	
	@Test
	public void test2() {
		System.out.println("3rd time");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterTest()
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
}
