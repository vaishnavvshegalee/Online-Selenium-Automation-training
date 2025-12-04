package javaPackage;

public class EH4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			arr[7] = 50;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Exception handled");
		
	}

}
