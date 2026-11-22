package com.polymorphism.calculator;


//Question 1 — Compile-time polymorphism
//Create a Calculator class that demonstrates method overloading. It must have methods named add
//that can add (1) two integers, (2) three integers, (3) two double values, and (4) two integers plus a third
//optional-style value represented through a different parameter list of your choice. In main, call every
//version. Explain how Java decides which overloaded method to use

//compile time ==> method overloading

class Calculator
{
	public void add(int a, int b) {
		System.out.println("2 integer add method: a + b = " + (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("3 integer add method: a + b + c = " + (a+b+c));
	}
	
	public void add(double a, double b) {
		System.out.println("2 double add method: a + b = " + (a+b));
	}
	
}
public class Driver {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		obj.add(3, 5, 6); // poly happen here accordingly to parameter automatical java call the method
		obj.add(4.5, 6.0);
		obj.add(5, 4);
	}

}
