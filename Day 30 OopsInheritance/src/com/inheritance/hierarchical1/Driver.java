package com.inheritance.hierarchical1;

//20. Shape, Circle and Rectangle
//Create a parent class Shape with draw(). Create children Circle and Rectangle. Override
//draw() in both children with different messages.


class Shape
{
	public void draw()
	{
		System.out.println("Shape..");
	}
}

class Circle extends Shape
{	
	public void draw() {
		System.out.println("Circle...");
	}
}

class Rectangle extends Shape
{
	public void draw() {
		System.out.println("Rectangle..");
	}
}


public class Driver {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rectangle rec = new Rectangle();
		rec.draw();
		
	}

}
