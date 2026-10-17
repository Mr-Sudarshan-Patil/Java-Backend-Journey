package com.kodewala.makemytrip;

public class Driver {
	public static void main(String args[]) {
		TripDiscount trip1 = new TripDiscount();
		int discount = trip1.getDiscount("Btm", "Kodewala", 12000);
		System.out.println("Total Discount: " + discount);
	}
}
