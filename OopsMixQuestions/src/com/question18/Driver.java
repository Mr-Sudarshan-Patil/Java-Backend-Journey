package com.question18;

public class Driver {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(5000);
		System.out.println("Balance: " + ba.getBalance());
		
		//temp variable use
		int depAmmount = 100;
		System.out.println("Deposit Ammount: "+ depAmmount);
		ba.deposit(depAmmount);
		System.out.println("Balance: " + ba.getBalance());
		
		int witAmmount = 500;
		System.out.println("Withdraw Ammount: " + witAmmount);
		ba.withdraw(witAmmount);
		System.out.println("Balance: " + ba.getBalance());
	}

}
