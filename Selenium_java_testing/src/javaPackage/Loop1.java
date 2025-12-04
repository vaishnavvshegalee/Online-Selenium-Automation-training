package javaPackage;

public class Loop1 {


	public static void main(String[] args) {
//		for loop
		
		int count = 0;
		int i = 1;
	for(i=1;i<=5;i++) {
		if(i%2 == 0) {
			System.out.println(i+" Vaishnya");
//			break;
			count++;
		}
	}
	System.out.println(count);
	System.out.println(i);

	}

}
