package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {

		int a = 10; // Local Variable
		int b = 10; // Local Variable
		int c = 20; // Local Variable

		// Logical AND(&&) Operator: 1st condition is false, 2nd condition will not
		// check.
//		System.out.println(a < b && a++ < c); // false
//		System.out.println(a); // 10
//		System.out.println(a < b ^ a++ > c); // true
//		System.out.println(a); // 11
		
		System.out.println(a++ == b);
		System.out.println(a == b);
		System.out.println(a+" "+b);
	}

}
