package com.inheritance.single3;
//11. Vehicle and Car
//Create a parent class Vehicle with a method start().
//Create a child class Car with a method
//drive(). Call both methods using a Car object.

class Vehicle
{
	public void start() {
		System.out.println("Start the car");
	}
}

class Car extends Vehicle 
{
	public void drive() {
		System.out.println("Drive");
	}
}

public class Driver {
	public static void main(String args[]) {
		Car car1 = new Car();
		car1.start();
		car1.drive();
	}
}
