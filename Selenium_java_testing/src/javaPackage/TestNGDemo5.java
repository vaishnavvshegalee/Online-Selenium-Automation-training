package javaPackage;

import org.testng.annotations.Test;

public class TestNGDemo5 {

	@Test
	public void a() {
		System.out.println("hello a test method");
	}
	
	@Test(invocationCount = 2,priority=-1,enabled = true & false)
	public void b() {
		System.out.println("hello b test method");
	}
	@Test
	public void c() {
		System.out.println("hello c test method");
	}
}
