package javaPackage;

public class EncpsulationDemo1 {
	
	public String name;
	public String degn;
	private int salary;
	private int age;
	
	private Object inputData;
	
	public EncpsulationDemo1(String name,String degn,int salary,int age) {
		this.name = name;
		this.degn = degn;
		this.salary = salary;
		this.age = age;	
	}
	
	public void setName(String n) {
		inputData = n;
	}
	
	public void setRollNo(int r) {
		inputData = r;
	}
	
	public Object getDetailss() {
		return inputData;
	}
	
	public void getDetails() {
		System.out.println(name+" "+degn+" "+salary+" "+age);
	}
	
}
