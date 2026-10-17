package com.kodewal.string4;

public class StringClass4 {
	public static void main(String args[]) {
		String s = "This" + "is from" + "Kodewala Academy";
		System.out.println(s);
		
		String s1 = "Kodewala";
		String s2 = "Accademy";
		String s3 = s1 + s2;
		String s4 = "KodewalaAccademy";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.intern().equals(s4));
	}
}
