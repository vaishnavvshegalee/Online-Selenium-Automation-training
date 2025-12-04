package javaPackage;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3 > 12);

		System.out.println(obj);
		
		for(Object b : obj) {
			System.out.println(b);
		}
	}

}
