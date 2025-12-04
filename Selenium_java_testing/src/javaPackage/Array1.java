package javaPackage;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		// Declaring an int array
				int[] arr = new int[5];
				
				System.out.println("arr length:"+arr.length);
				
				Scanner sc = new Scanner(System.in);
				
				for(int i =0;i<arr.length;i++) {
					arr[i] = sc.nextInt();
				}
				
				for(int i:arr) {
					System.out.println(i);
				}

	}

}
