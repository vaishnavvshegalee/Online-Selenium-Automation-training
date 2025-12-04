package javaPackage;

public class EH5 {

	public static void main(String[] args) {
		
		try {
			int n = 10/5;
		} finally {
			System.out.println("finally always executed");
		}

	}

}
