package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	
//	Skipping the test case 1st way
	//@Test
	public void a() {
		System.out.println("hello a test method");
	}
	
//	skipping the test case 2nd way
	@Test(enabled = false) 
	public void b() {
		System.out.println("hello b test method");
	}
	@Test(enabled = true)
	public void c() {
		System.out.println("hello c test method");
	}
	
//	rerun the test case n times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("hello d test method");
	}
	
//	skipping the test case 3rd way
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("hello e test method");
	}

//	Skipping the test 4th way (not recommended in the market) 
	@Test
	public void f() {
		System.out.println("hello f test method");
//		throw new SkipException("Skipping f test method"); this will failed 
	}
}
