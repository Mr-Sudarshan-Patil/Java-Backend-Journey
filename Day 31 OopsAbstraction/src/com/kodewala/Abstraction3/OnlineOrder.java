package com.kodewala.Abstraction3;

public class OnlineOrder {
	public void placeOrder() {
		validateOrder();
		genBill();
		System.out.println("Place Order");
	}
	
	private void validateOrder() {
		System.out.println("Validate Order");
	}
	
	private void genBill()
	{
		System.out.println("Generate Bill");
	}
}
