package javaPackage;

public class TypingCastingNarrowing {

	public static void main(String[] args) {
		// Narrowing - Manual casting( Big size value try to store into the small data type.)
		double b = 5.9;
		int a = (int) b; // directly assign then it will cause an error (type mismatch).
		System.out.println(a);

	}

}
