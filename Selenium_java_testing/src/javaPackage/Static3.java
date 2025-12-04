package javaPackage;

public class Static3 {
	int roll; // Declaring a Global variable
	String name; // Declaring a Global variable
	static String college; // Declaring a static variable
	
	private Static3(int r, String n,String clg) {
		roll =r;
		name = n;
		college = clg;
	}
	
	public void getResult() {
		System.out.println(roll+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static3 s3 = new Static3(101,"john","IIT Bombay");
		Static3 s4 = new Static3(102,"peter","IIT Kanpur");
		Static3 s5 = new Static3(103,"alex","IIT Rurkee");
		s3.getResult();
		s4.getResult();
		s5.getResult();
	}

}
