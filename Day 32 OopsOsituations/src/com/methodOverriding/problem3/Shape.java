package com.methodOverriding.problem3;

public class Shape {
	public void displayType() {
		System.out.println("Shapes");
	}
}


class Circle extends Shape
{
	public void displayType() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape
{
	public void displayType() {
		System.out.println("Rectangle");
	}
}