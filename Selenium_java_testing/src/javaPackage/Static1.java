package javaPackage;

public class Static1 {

	int x = 500; // Global variable
	String s = "Hello"; // Global variable
	static int y = 100; // static variable

	//static variable
	public static void method1() {
		String s = "hi"; //local variable
		System.out.println(s); // calling x variable
	}
	
	//Non-static variable
	public void method2() {
		int i = 100; // local variable
		System.out.println(i); //calling i variable
	}
	public static void main(String[] args) {
	}

}
