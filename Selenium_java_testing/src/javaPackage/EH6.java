package javaPackage;

public class EH6 {

	public static void main(String[] args) {
		
		try {
			int n = 10/0;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("finally always executed");
		}

	}

}
