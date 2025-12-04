package javaPackage;

public class Static2 {

	int roll; // Declaring Global variable
	static String name; // Declaring Global variable
	String college ="DCA"; // Declaring Global variable
	
	public void callStatic() {
		String college = "KLE";
		System.out.println(college);
	}
	public static void main(String[] args) {
		
//		Object creation
//		className RefName = new className();
		Static2 s2 = new Static2();
		s2.callStatic();
		System.out.println(s2.roll); // 0
		System.out.println(name); // null
		System.out.println(s2.college); // null

	}

}
