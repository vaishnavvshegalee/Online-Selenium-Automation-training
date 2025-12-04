package javaPackage;

public class Static4 {
	
	static int z = 5; // static variable
	int y = 1; // Global variable

	// static method
	public static void a() {
		z = 10;
		System.out.println(z);
	}
	
	// non-static method
	public void b() {
		z = 15;
		System.out.println(z);
	}
	public static void main(String[] args) {
		System.out.println(z);
		a();
		Static4 s4 = new Static4();
		s4.b();
	}

}
