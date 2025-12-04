package javaPackage;

import java.util.HashMap;

// HashMap : is used for table mapping, it is used on the basis of key value. ( Unsynchronized). 

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "Mar");
		hm.put(4, "Apr");
		hm.put(5, "May");
		hm.put(6, "Jun");
		hm.put(7, "Jul");
		hm.put(8, "Aug");
		hm.put(9, "Sept");
		hm.put(10, "Oct");
		hm.put(11, "Nov");
		hm.put(12, "Dec");
		
		
		System.out.println(hm.get(12));
		
	}

}
