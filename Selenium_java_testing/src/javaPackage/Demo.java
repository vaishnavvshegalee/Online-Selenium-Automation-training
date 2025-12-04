package javaPackage;

class Demo {
	private int empID;
	private String name;
	private int salary;

	public void setter(int id, String user, int salary) {
		this.empID = id;
		this.name = user;
		this.salary = salary;
	}

	public void getter() {
		System.out.println(empID + " " + name + " " + salary);
	}
}
