package javaPackage;

public class Inheritance3 {

	int z; // Global variable

	public void add(int x, int y) {
		z = x + y;
		System.out.println(z);
	}
	
	public void substract(int x,int y) {
		z = x - y;
		System.out.println(z);
	}
	
	public Inheritance3(int z) {
		this.z = z;
		System.out.println("constructor call");
		
	}
}
