package javaPackage;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = {2,56,23,8,1,9,8,6,54,56};
		int min = arr[0];
		for(int i : arr) {
			if(i<min) {
				min = i;
			}
		}
		System.out.println(min);
	}

}
