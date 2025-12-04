package javaPackage;

public class Inheritance4 extends Inheritance3{

	 public Inheritance4(int z) {
		 super(z);
	 }

	public void mult(int x,int y) {
		z = x*y;
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		int x = 10,y=20;
		 
		Inheritance4 i4 = new Inheritance4(10);
		System.out.println(i4.z);
		i4.add(x, y);
		
	}

}
