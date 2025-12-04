package javaPackage;

public class Static5 {
	
	String a; // global variable
	int b; // global variable
	static int c = 4;
	
	public static void a() {
		System.out.println("Hello static");
	}
	
	public static void main(String[] args) {
		
		Static5 s5 = new Static5();
		s5.a = "Selenium";
		s5.b = 10;
		c = 2;
		
		a(); // hello static
		System.out.println(s5.a); // selenium
		System.out.println(s5.b); // 10
		System.out.println(c); // 2
	}

}
