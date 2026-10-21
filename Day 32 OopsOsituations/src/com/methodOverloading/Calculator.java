package com.methodOverloading;

public class Calculator {
	//method1: with 2 parameter 
	public void add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b)); //a+b = total a+b
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c)); // a+b+c=total a+b+c
	} 
	
	public void add(String firstName, String lastName) {
		System.out.println("Full Name: " + (firstName + lastName));
	}
	
	
	public static void main(String args[]) {
		Calculator obj = new Calculator();
		obj.add(4, 5); // call first method beacause of passing two parameter and java automic understand which method use and this is call method overloading same name but different parameters
		// obj.add(4, 5); output: 4+5=9
		obj.add(3,6,100);  // output 3+6+100=109
		obj.add("Sudarshan", " patil"); //output: "Sudarshan patil" 	
	}
	
}
