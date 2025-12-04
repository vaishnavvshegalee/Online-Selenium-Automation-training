package javaPackage;

public class MethodOverload1 {

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		sum(5,5,3);
	}

}
