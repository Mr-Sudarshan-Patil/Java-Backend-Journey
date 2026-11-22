package com.kodewala.exception2.class4;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Main Strat");
		PaymentMgmt p = new PaymentMgmt();
		try {
			p.doPayment("43823823", 2000);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main End");

	}

}
