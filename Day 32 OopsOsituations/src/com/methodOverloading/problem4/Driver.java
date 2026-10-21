package com.methodOverloading.problem4;

public class Driver {
	public String add(String firstName, String lastName) {
		return firstName + lastName;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Driver obj = new Driver();
		
		System.out.println(obj.add(5, 5));
		System.out.println(obj.add("Sudarshan", " Patil"));

	}

}
