package com.inheritance.hierarchical3;

//22. Vehicle, Car, Bike and Truck
//Create a parent class Vehicle with fuelType(). Create three children: Car, Bike and Truck,
//each with its own method. Call all methods.

class Vehicle
{
	public void fuelType() {
		System.out.println("fuel");
	}
}

class Car extends Vehicle
{
	public void fuelType() {
		System.out.println("===Car=====");
		System.out.println("Disel");
		System.out.println("===========");
	}
}

class Bike extends Vehicle
{
	public void fuelType() {
		System.out.println("===Bike=====");
		System.out.println("Petrol");
		System.out.println("===========");
	}
}

class Truck extends Vehicle
{
	public void fuelType() {
		System.out.println("===Truck=====");
		System.out.println("Disel");
		System.out.println("===========");
	}
}
public class Driver {

	public static void main(String[] args) {
		Car c = new Car();
		c.fuelType();
		
		Bike b = new Bike();
		b.fuelType();
		
		Truck t = new Truck();
		t.fuelType();
	}

}
