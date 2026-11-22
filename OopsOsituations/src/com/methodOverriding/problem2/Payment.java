package com.methodOverriding.problem2;

public class Payment {
	public void doPayment() {
		System.out.println("Process Payment");
	}
}

class Card extends Payment{
	public void doPayment() {
		System.out.println("Payment with card");
	}
}

class UPI extends Payment
{
	public void doPayment() {
		System.out.println("Payment with UPI");
	}
}
