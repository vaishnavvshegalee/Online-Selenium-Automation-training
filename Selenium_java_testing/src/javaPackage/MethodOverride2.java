package javaPackage;

public class MethodOverride2 extends MethodOverride1 {
	@Override
	public void eat() {
		System.out.println("You are eating");
		super.eat();
	}
	public static void main(String[] args) {
		MethodOverride1 mo2 = new MethodOverride2();
		mo2.eat();
	}

}
