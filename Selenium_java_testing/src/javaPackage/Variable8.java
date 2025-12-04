package javaPackage;

public class Variable8 {
	int b = 10; // Global variable
	static int c = 5; // static variable
	
//	static variable
	public static void d() {
		int e = 15; // local variable
		System.out.println(e);
	}
	
//	non-static method
	public void f() {
		int g = 12; // local variable
		System.out.println(g);
	}
	public static void main(String[] args) {
		
		int local = 3; // local variable
		System.out.println(local);  
		//static member calling (static variables and static methods)
		System.out.println(c);
		d();
		
		//non-static member calling
//		-> if you want to call a non-static method in static constrains 
//		   you need create an object of that class
		Variable8 v8 = new Variable8();
		System.out.println(v8.b); // calling non-static variable using class ref
		v8.f(); // calling non-static method using class ref
	}

}
