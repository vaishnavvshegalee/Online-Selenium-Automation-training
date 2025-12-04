package javaPackage;

public class EncpsulationDemo2 extends EncpsulationDemo1 {

	private EncpsulationDemo2(String name,String degn,int salary,int age) {
		super(name, degn, salary, age);
	}
	public static void main(String[] args) {
		EncpsulationDemo2 ed2 = new EncpsulationDemo2("Vaishnav","Full-stack developer",50000,26);
		ed2.getDetails();
		ed2.setName("Selenium");
//		ed2.setRollNo(5);
		System.out.println(ed2.getDetailss());
	}

}
