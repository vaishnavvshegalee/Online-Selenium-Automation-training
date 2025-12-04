package javaPackage;

public class Array3 {
	static int[] arr = {22,2,44,5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(b>arr[i]) {
				System.out.println(b);				
			}else {
				System.out.println("ABCD");
			}
		}
	}

}
