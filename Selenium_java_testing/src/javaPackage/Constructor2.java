package javaPackage;

public class Constructor2 {
	
	int id;
	String name;
	String address;
	
	Object Constructor2(){
		System.out.println("default constructor");
		return address;
	}
	
	Constructor2(int id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name+" "+address);
	}
	public static void main(String[] args) {
//		Constructor2 c2 = new Constructor2();
		Constructor2 c3 = new Constructor2(1,"john","Uk");
		c3.displayInfo();
		Constructor2 c4 = new Constructor2(2,"peter","Uk");
		c4.displayInfo();
	}

}
