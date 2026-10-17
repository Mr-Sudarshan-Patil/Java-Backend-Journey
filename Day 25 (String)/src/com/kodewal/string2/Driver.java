package com.kodewal.string2;

public class Driver {
	public static void main(String args[]) {
		String s = "Kodewala";
		String s2 = "Academy";
		String s1 = new String("Kodewala");
		Driver2 obj = new Driver2("Kodewala");

		System.out.println("Content of s in scp : " + s.intern());
		System.out.println("Content of s1 in scp: " + s1.intern());
		System.out.println("Check content s==s1: " + (s==s1.intern()));
		System.out.println(s.equals(s1));
		System.out.println(s.equals(obj));
		System.out.println(s==obj.intern());
	}
}
