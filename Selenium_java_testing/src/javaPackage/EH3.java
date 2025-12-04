package javaPackage;

public class EH3 {

	public static void main(String[] args) {
		
		String s = "Selenium";
		int n=0;
		try {
			n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(n);

	}

}
