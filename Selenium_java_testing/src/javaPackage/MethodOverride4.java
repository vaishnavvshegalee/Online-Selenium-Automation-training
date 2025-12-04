package javaPackage;

public class MethodOverride4 extends MethodOverride3 {
	@Override
	public void cook() {
		System.out.println("mom is cooking");
	}

	public void angry() {
		System.out.println("father is angry");
	}

	public static void main(String[] args) {

		MethodOverride3 mo3 = new MethodOverride4();
		mo3.cook(); // executed- present in both classes and child one's executed.
		mo3.eat();// executed- present in the parent class.
		// mo3.angry(); // error- dynamic method dispatch concept.

		// if you want to call angry method then create a separate object because the
		// method is present only in the child class only,
		// so create an object of child class
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.angry();
		
	}

}
