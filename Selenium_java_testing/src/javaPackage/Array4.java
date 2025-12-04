package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		
		//Defining multidimensional array
		int[][] arr = {{1,2},{3,4},{5,6}};
		
		System.out.println("length"+arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
