package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		
		int a = 10; // Local Variable
		int b = 5; // Local Variable
		int c = 20; // Local Variable
		
		// Logical AND(&&) Operator: 1st condition is false, 2nd condition will not check.
		System.out.println(a<b && a<c); // false 
		System.out.println(a<b ^ a<c); // true
		
		
		System.out.println(0 ^ 0);
		System.out.println(1 ^ 1);
		System.out.println(1 ^ 0);
		System.out.println(0 ^ 1);
		

	}

}
