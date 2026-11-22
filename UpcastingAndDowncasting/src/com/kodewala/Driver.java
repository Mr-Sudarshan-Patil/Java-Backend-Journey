package com.kodewala;

public class Driver {

	public static void printDetail(double a) {
		System.out.print(a);
	}
	
	public static void printDetail2(int a)
	{
		System.out.println("Child: " + a);
	}
	
	public static void main(String[] args) {
		int a = 4;
		
		printDetail(a);
		printDetail2(a);
		Integer b = new Integer(4);
		
		Double d1 = new Double(5.6);
		System.out.println(d1);
		Object b1 = b;
		
		System.out.println(b);
		System.out.println(b1);
		
		
	}

}
