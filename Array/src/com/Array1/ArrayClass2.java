package com.Array1;

public class ArrayClass2 {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5,6};
		boolean isArrayMatch = true;
		
		if(arr1.length == arr2.length) {
//			System.out.println(arr1.length);
//			System.out.println(arr2.length);
			for(int i=0; i<arr1.length; i++) {
//				System.out.println("i: " + i);
				if(arr1[i] == arr2[i]){
//					System.out.print(arr1[i] + " " + arr2[i] + "\n");
					isArrayMatch = true;
				}else {
					isArrayMatch = false;
					break;
				}
			}
		}else{
			isArrayMatch = false;
		}
		
		if(isArrayMatch) {
			System.out.println("Both Array are same");
		}else {
			System.out.println("Not Match");
		}
	}
}
