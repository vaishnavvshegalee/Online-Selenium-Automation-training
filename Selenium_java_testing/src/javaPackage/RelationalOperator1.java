package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		
		int a = 300;
		int b = 300;
		
		if(a == b) {
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is not equal to b");
		}
		
		String p = "HELLO";
		String q = "hello";
		
		// String comparison - 1st way - case sensitive 
		if(p == q) {
			System.out.println("p is equal to q for 1st way");
		}else {
			System.out.println("p is not equal to q for 1st way");
		}
		
		// String comparison - 2nd way - case sensitive
		if(p.equals(q)) {
			System.out.println("p is equal to q for 2nd way");
		}else {
			System.out.println("p is not equal to q for 2nd way");
		}
		
		// String comparison - 3rd way - case insensitive
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p is equal to q for 3rd way");
		}else {
			System.out.println("p is not equal to q for 3rd way");
		}
		
			}

}
