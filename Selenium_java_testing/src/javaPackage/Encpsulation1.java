package javaPackage;

public /* final */ class Encpsulation1 {
//	when you declared the class as a final then it will not inherited.
	String name; // Global variable
	int b; // Global variable
	final int c = 2;
	
	public void c() {
//		c = 5; - final variable can not change the value.
	}
	
//	final method
	final void d() {
		System.out.println("final method");
	}
	
	
}
