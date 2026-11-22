package com.kodewala.class1.interface1;

public class FlightBooking implements IDiscount {
	@Override
	public void calculateDiscount(int ammount, int rate) {
		
		System.out.println("Calculate Flight Ticket Discount");
		System.out.println("Price of Ticket: " + ammount);
		int finalFare = ammount - (ammount * rate / 100);
		System.out.println("Final Fare Price Affter Discount : " + finalFare);
	
		System.out.println("=============================");
		System.out.println("Gst: " + IDiscount.gst);
		System.out.println("=============================");
		
		//IDiscount.gst = 100;//The final field IDiscount.gst cannot be assigned
	}
	
	public void play() {
		System.out.println("This just demo for do downcasting");
	}
}
