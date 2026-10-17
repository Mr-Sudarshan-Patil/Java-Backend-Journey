package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder("Kodewala"); // StringBuilder object is mutable
//		str.append(" Accademy");
//		System.out.println(str);
//		System.out.println(str.length());
//		
//		final String x = "Ja";
//		String s1 = x + "va";
//		String s2 = "Java";
//		System.out.println(s1 == s2);
//		
//		String s1 = new String("Spring");
//		String s2 = s1.intern();
//		System.out.println(s1 == s2);
//		System.out.println(s2 == "Spring");
		
//		String s2 = new String("java");
//		s2.intern();
//		String s1 = "java";
//		System.out.println(s1 == s2);
	
		String s3 = new String("kode") + new String("wala");
		s3.intern();
	
		System.out.print(s3 == s3.intern());
	}

}
