package javaPackage;


class VaishnavException extends Exception{
	
	public VaishnavException(String str) {
//		to call the parent class constructor from child class constructor use super();
		super(str);
	}
}
public class EH7 {

	public static void main(String[] args) {
//		int i = 5/0;
		
		try {
			int j = 20 / 4;
		} finally {
			System.out.println("Finally get always executed");
			
			try {
				int i = 5/0;
				throw new VaishnavException("This is my custom exception");
			} catch (VaishnavException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("exception handled");
		
		
	}
}
