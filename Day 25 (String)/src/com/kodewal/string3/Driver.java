package com.kodewal.string3;

public class Driver {
	public static void main(String args[]) {
		String s = new String("Hello"); // scp("Hello") + heap("Hello");
		String s3 = s.concat("World"); // scp("World") + heap("HelloWorld");
		
		System.out.println("=====SCP=======");
		System.out.println("World: " + s3.intern());
		System.out.println("s    : " + s.intern());
		System.out.println("s3   : " + s3.intern());
		System.out.println("===============");

		System.out.println("=====Heap======");
		System.out.println("s : " + s);
		System.out.println("s3: " + s3);
		System.out.println("===============");
		
	
	}
}
