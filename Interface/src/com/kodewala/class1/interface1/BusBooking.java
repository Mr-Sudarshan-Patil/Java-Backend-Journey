package com.kodewala.class1.interface1;

public class BusBooking implements IDiscount{
	@Override
	public void calculateDiscount(int ammount , int rate)
	{
		System.out.println("No Discount on Bus Booking");
		System.out.println("Total Fare is: " + ammount);
	}
}
