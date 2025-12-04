package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo6 {

	@Test
	public void z() {
//	for verification purpose we always use assert
		Assert.assertTrue(3<12);
		System.out.println("hello z test method.");
	}
	
	@Test
	public void a() {
//	for verification purpose we always use assert
		Assert.assertTrue(3>12);
		System.out.println("hello a test method.");
	}
	
	
//	if we want to b method is completely depends the use "dependsOnMethods ={"",""}" pass the param 
	@Test(dependsOnMethods = {"z","a"})
	public void b() {
		System.out.println("hello b test method.");
	}

}
