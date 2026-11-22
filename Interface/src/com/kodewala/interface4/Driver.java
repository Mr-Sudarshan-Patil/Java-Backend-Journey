package com.kodewala.interface4;

public class Driver {

	public static void main(String[] args) {
		IAccount account = (ah, balance) ->{
			System.out.println("Open Account");
			System.out.println("Account Holder: " + ah);
			System.out.println("Balance: " + balance);
		};
		
		account.openAccount("Sudarshan Patil", 45000); 

	}

}
