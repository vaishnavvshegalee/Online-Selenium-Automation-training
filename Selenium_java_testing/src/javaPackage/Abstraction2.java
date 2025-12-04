package javaPackage;

public class Abstraction2 extends Abstraction1 {

	@Override
	public void eat() {
		System.out.println("i am eating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction2 a2 = new Abstraction2();
		a2.eat();
		a2.doSomething();
	}

}
