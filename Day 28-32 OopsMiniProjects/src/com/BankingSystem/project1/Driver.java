package com.BankingSystem.project1;

public class Driver {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("Sudarshan Patil", 5000, 4.5);
//		sa.printAccountDetails();
//		sa.deposite(5500, "");
		sa.deposite(0);
		System.out.println(sa.getBalance());
		sa.withDrawAmmount(4000); // when withdraw 4000 in 5000 remain 1000 error to maintain balnace
		//System.out.println(sa.getBalance());

	}

}
