package javaPackage;

public class IfElse3 {

	public static void main(String[] args) {

		int age = 25;
		int weight = 1000;

		if (age >= 18 && age <= 30) {

			if (weight >= 50 && weight <= 85) {
				System.out.println("Eligible");
			} else if (weight <= 50 && weight > 0) {
				System.out.println("Underweight - Not eligible!!");
			} else if (weight <= 85 && weight > 100) {
				System.out.println("Overweight - not eligible!!");
			} else {
				System.out.println("enter valid weight!!");
			}
		} else if (age < 0 || age > 100) {
			System.out.println("please enter valid age");
		} else {

			System.out.println("not eligible - age is not valid!!");
		}

	}

}
