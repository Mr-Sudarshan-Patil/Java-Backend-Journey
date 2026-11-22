package com.kodewala.class1.interface1;

public class Driver {

	public static void main(String[] args) {
		IDiscount obj = new FlightBooking();
		obj.calculateDiscount(4000,50);
		FlightBooking obj1 = (FlightBooking) obj;
		obj1.play();
		System.out.println();
		obj = new BusBooking();
		obj.calculateDiscount(5000, 3);
	}

}
