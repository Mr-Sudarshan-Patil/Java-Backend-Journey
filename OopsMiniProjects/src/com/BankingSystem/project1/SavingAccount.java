package com.BankingSystem.project1;

public class SavingAccount extends BankAccount{
	private double intrestRate = 4.5;
	
	SavingAccount(String accountHolderName, double balance, double intrestRate){
		super(accountHolderName, balance);
		this.intrestRate = intrestRate;
	}
	
	public String displayAccountType() {
		return "Saving Account";
	}
	
	public void printAccountDetails() {
		System.out.println("=========Account Information===============");
		System.out.println("Account Holder Name: " + getName());
		System.out.println("Account Balance: " + getBalance());
		System.out.println("Notes: " + getNote());
		System.out.println("Account Type :" + displayAccountType());
		System.out.println("===========================================");
	}
}
