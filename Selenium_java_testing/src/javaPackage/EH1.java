package javaPackage;

public class EH1 {

	public static void main(String[] args) {
		
		try {
			double a = 5/0;
			System.out.println(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("hello");
		

	}

}
