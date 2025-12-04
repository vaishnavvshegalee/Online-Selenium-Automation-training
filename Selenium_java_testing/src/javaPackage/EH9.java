package javaPackage;

// throws : used to declared the multiple exceptions
public class EH9 {

	public static void main(String[] args) throws ArithmeticException, InterruptedException, VaishnavException {
		a(15);
		a(25);

	}

	public static void a(int age) throws VaishnavException {
		try {
			if (age < 18)
				throw new VaishnavException("Age is less than 18, not eligible");
			else
				System.out.println("Eligible");
		} catch (VaishnavException e) {
			System.out.println("Custom exception handled");
		}

	}

}
