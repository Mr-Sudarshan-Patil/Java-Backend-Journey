package com.Array2;

public class ArrayClass {
	public static void main(String args[]) {
		int arr[][] = new int[3][];
		arr[][] = {{1,2,3}, {2,3}, {1,2,3,5}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
