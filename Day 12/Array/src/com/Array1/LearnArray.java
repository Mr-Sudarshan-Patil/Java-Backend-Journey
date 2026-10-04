package com.Array1;
import java.util.Arrays;
public class LearnArray {

	public static void main(String[] args) {
		
		int product[] = new int[5];
		String str[] = new String[6];
		float arr[]=new float[5];
		System.out.println(Arrays.toString(product)); //[0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(str));//[null, null, null, null, null, null]
		System.out.println(Arrays.toString(arr));//[0.0, 0.0, 0.0, 0.0, 0.0]
		boolean isBol[] = new boolean[5];
		System.out.println(Arrays.toString(isBol));//[false, false, false, false, false]
		
		int prod[] = new int[10];
		prod[9]=20;
		prod[2]=33;
//		prod[10]=24; // error index 10 out of bounds for length 10;
		System.out.println(Arrays.toString(prod)); //[0, 0, 33, 0, 0, 0, 0, 0, 0, 20]
		
//		int prod2[] = {1,2,3,4,5,6,23,23,53,23};
//		prod2[100] = 40;
//		System.out.println(Arrays.toString(prod2));//[1, 2, 3, 4, 5, 6, 23, 23, 53, 23]
//	
	
		//compare two arr
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,3,4};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		char arr3[]=new char[3];
		System.out.print(Arrays.toString(arr3));
	}

}
