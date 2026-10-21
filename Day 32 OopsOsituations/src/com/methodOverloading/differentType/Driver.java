package com.methodOverloading.differentType;

public class Driver {
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Driver d = new Driver();
		System.out.println(d.multiply(5, 6)); // 5*6 = 30 // o/p : 30
		System.out.println(d.multiply(5.6, 4.7)); //5.6 * 4.7 = 26,32
		System.out.println(d.multiply(56, 47)); // 56 * 47 = 2632

	}

}
