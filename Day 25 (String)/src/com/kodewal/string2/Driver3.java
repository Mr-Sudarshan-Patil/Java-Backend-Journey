package com.kodewal.string2;

public class Driver3 {
	public static void main(String[] args) {
		String s = "Kodewala";
		String s1 = "Kodewala" + "Accademy";
		String s2 = s.concat("Accademy");
		System.out.println(s1==s2);
		System.out.println(s1 == s2.intern());
	}
}
