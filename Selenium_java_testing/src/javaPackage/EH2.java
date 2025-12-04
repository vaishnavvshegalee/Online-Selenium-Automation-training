package javaPackage;

public class EH2 {

	public static void main(String[] args) {
		
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error handled");
		}
	}

}
