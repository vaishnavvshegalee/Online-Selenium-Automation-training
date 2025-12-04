package javaPackage;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr;
		if(n>=1 && n<=5) {
		arr = new int[n];
		}else {
			throw new Exception("Give the correct size of the arr(1-5)");
		}
		
		System.out.println("length:"+arr.length);
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are:");
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
