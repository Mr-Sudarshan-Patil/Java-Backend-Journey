package com.kodewal.string6;

public class Driver {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Kodewala"); // StringBuilder object is mutable
		System.out.println(str.length());
		str.append(" Accademy");
		System.out.println(str);
		System.out.println(str.length());
		
//		String name = "Sagar";
//		System.out.println(name.length());
//		
//		for(int i=0; i<str.length(); i++) {
//			System.out.println("i: " + i);
//		}
		
	}
}
