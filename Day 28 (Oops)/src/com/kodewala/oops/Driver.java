package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment = new Payment(2000);
		System.out.println(payment.getAmmount());
		payment.doCredit(200);
		System.out.println(payment.getAmmount());
		//payment.ammount = 200000;//The field Payment.ammount is not visible?
		System.out.println(payment.getAmmount());
		
	}

}
