package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a++); // 10, 11
		System.out.println(a++);// 11, 12
		System.out.println(++a); //13,13
		System.out.println(a++ + ++a); // 13,14,15,15 -> 28
		System.out.println(a++); //15,16
		System.out.println(a++ + ++a);//16,17,18,18
		System.out.println(++a - a++);//19 - 19,19 -> 1
		System.out.println(" -------------------------- ");
		
//		System.out.println(b++ + b--); // 10,11,11,10 ->21
//		System.out.println(++b - b++); // 11 - 11 = 0,12
//		System.out.println(b++); // 12
//		System.out.println(b++ + b++); //10 ,11,11,12 ->21
//		System.out.println(--b - b--);//11,11,10 ->0
//		System.out.println(b); // 10
		System.out.println(b-- + ++b);//10,9,10,10 => 20
	}

}
