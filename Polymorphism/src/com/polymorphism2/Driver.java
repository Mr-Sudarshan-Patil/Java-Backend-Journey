package com.polymorphism2;


/*
 * Question 3 — Upcasting versus downcasting
Create a parent class Vehicle and a subclass Bike. Give Vehicle a method start(), and give Bike an
overridden start() plus a subclass-only method kickStart(). Write a program that upcasts a Bike object
to a Vehicle reference, calls start(), then safely downcasts it back to Bike and calls kickStart(). Explain
the reference type and actual object type at each step
 * 
 * */

class Vehicle 
{
	public void start() {
		System.out.println("Vehicle.start()....Vehicle");
	}
}

class Bike extends Vehicle
{
	@Override
	public void start() {
		System.out.println("Bike.start()....Bike");
	}
	
	public void kiskStart() {
		System.out.println("Bike.kiskStart()...Bike");
	}
}

public class Driver {

	public static void main(String[] args) {
		//upcasting: parent access child class object
		Vehicle obj = new Bike();
		obj.start();
//		
//		obj.kiskStart(); // error this method own it child only
		
		Bike b = (Bike) obj;
		Bike b1 = new Bike();
		b.kiskStart();
		
		System.out.println("Upcast object" + obj.hashCode());
		System.out.println("Downcast object" + b.hashCode());
		System.out.println("Child object" + b1.hashCode());
		System.out.println(obj.equals(b));
		System.out.println(obj.equals(b1));
		System.out.println(b.equals(b1));

	}

}
