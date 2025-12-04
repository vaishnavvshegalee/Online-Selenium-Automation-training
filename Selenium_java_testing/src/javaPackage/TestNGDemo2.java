package javaPackage;

import org.testng.annotations.Test;

public class TestNGDemo2 {

//	
	@Test(priority = -8)
	public void z() {
		System.out.println("z");
	}
	
	@Test
	public void p() {
		System.out.println("p");
	}
	
	@Test(priority = 0)
	public void m() {
		System.out.println("m");
	}
	@Test(priority = -8)
	public void j() {
		System.out.println("j");
	}
}
