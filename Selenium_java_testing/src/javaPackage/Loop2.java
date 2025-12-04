package javaPackage;

public class Loop2 {

	public static void main(String[] args) {
		
		//for each loop - enhanced for loop
		/*
		 syntax:-
		 int[] nums = {1,2,3,4,5};
		 for(int i:nums){
		 System.out.println(i);
		 }
		 
		 * */
		 String[] fruits = {"Mango","banana","guava","grapes"};
		 for(String i:fruits){
		 System.out.println(i+" ");
		 }
		 
//		 defining a Object array
		 Object a[] = {"Selenium",10.5,3>2,'c',5};
		 for(Object b:a) {
			 System.out.println(b);
		 }
	}

}
