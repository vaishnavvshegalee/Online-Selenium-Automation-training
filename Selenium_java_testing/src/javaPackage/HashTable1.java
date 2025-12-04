package javaPackage;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Jan");
		ht.put(2, "Feb");
		ht.put(3, "Mar");
		ht.put(4, "Apr");
		ht.put(5, "May");
		ht.put(6, "Jun");
		ht.put(7, "Jul");
		ht.put(8, "Aug");
		ht.put(9, "Sept");
		ht.put(10, "Oct");
		ht.put(11, "Nov");
		ht.put(12, "Dec");
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht.get(4));
		System.out.println(ht.get(5));
		System.out.println(ht.get(6));
		System.out.println(ht.get(7));
		System.out.println(ht.get(8));
		System.out.println(ht.get(9));
		System.out.println(ht.get(10));
		System.out.println(ht.get(11));
		System.out.println(ht.get(12));
	}

}
