package javaPackage;

public class Interface3 implements Interface1,Interface2{
	
	@Override
	public void a() {
		System.out.println("a method");
	}
	@Override
	public void b() {
		System.out.println("b method");
	}
	
	@Override
	public void c() {
		System.out.println("c method");
	}
	public static void main(String[] args) {

		Interface3 i3 = new Interface3();
		i3.a();
		i3.b();
		i3.c();
		System.out.println(Inheritance1.roll);

	}

}
