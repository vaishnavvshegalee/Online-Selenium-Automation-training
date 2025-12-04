package javaPackage;

import org.testng.annotations.Test;

public class TestNGDemo7 {

//	Note: Always remember group names are case sensitive - sanity,Sanity two different
//	Note: Suppose you added the include as "Regression" & exclude as "Sanity" - priority goes to exclude one not checking the is included or not
	@Test(groups = "Regression")
	public void a() {
		System.out.println("hello a test method");
	}
	
	@Test(groups = {"Regression","Smoke"})
	public void b() {
		System.out.println("hello b test method");
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void c() {
		System.out.println("hello c test method");
	}
	@Test(groups = "Sanity")
	public void d() {
		System.out.println("hello d test method");
	}
}
