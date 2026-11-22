package com.inheritance.single4;
//Create a parent class Shape with a method area(). Create a child class Circle and override
//area() with its own message. Call it using a Circle object.

class shape
{
	public void area() {
		System.out.println("Shape class");
	}
}

class Circle extends shape {
	@Override
	public void area() {
		System.out.println("Circle class");
	}
}
public class Driver {
	public static void main(String args[]) {
		Circle c = new Circle();
		c.area();
	}
}
