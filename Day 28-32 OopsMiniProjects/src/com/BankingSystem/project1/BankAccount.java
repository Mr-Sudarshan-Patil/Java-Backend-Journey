package com.BankingSystem.project1;

public class BankAccount {
	private String accountHolder;
	private double balance;
	private String note;
	
	BankAccount(String accountHolder, double balance){
		validateBalance(balance);
		this.accountHolder = accountHolder;
	}
	
	//Core funcationality
	
	private void validateBalance(double balance) {
		if(balance < 2000) {
			System.err.println("Minimum balance maintain 2000 and above");
		}else {
			this.balance = balance;
		}
	}
	private boolean validateDepositAmmount(int depAmmount) {
		if(depAmmount>0) {
			return true;
		}else {
			return false;
		}
	}
	private boolean validateWithAmmount(int withAmmount) {
		if(withAmmount>this.balance) {
			return false;
		}else {
			return true;
		}
	}
	
	//setter to modify : 
//	method 1 deposit : adding ammount in balance
	
	public void deposite(int depAmmount) {
		boolean result = validateDepositAmmount(depAmmount);
		if(result) {
			this.balance +=depAmmount;
		}else {
			System.out.println("Deposite ammount should not be a 0");
		}
	}
	
	//Overloaded Method
	public void deposite(int depAmmount, String description) {
		boolean result = validateDepositAmmount(depAmmount);
		if(result) {
			this.balance +=depAmmount;
		}else {
			System.out.println("Deposite ammount should not be a 0");
		}
		this.note = description;
	}
	
	public void withDrawAmmount(int withAmmount) {
		boolean result = validateWithAmmount(withAmmount);
		if(result) {
			this.balance -= withAmmount;
			validateBalance(this.balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public String getName()
	{
		return accountHolder;
	}	
	public double getBalance() {
		return balance;
	}
	public String getNote() {
		return note;
	}
	
	public String displayAccountType() {
		return "Noramal Account";
	}
	
}
