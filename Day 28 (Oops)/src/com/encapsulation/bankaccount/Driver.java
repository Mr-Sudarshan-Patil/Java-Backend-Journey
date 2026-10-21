package com.encapsulation.bankaccount;

public class Driver {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount("Sudarshan","2343433443", 5000);
		user1.printDetails();
		System.out.println(user1.getter());
		user1.creadit(200);
		System.out.println(user1.getter());
		user1.creadit(5600);
		System.out.println(user1.getter());
		
	}

}
