package com.encapsulation.bankaccount;

public class BankAccount {
	final public String accountHolder;
	final public String accountNumber;
	private int balance;
	private int deposit;
	private int withdraw;
	BankAccount(String _accountHolder, String _accountNumber, int _balance){
		this.accountHolder = _accountHolder;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}
	
	//setter for deposit (deposit) and withdraw (credit)
	
	public void deposit(int depositAmmount)
	{
		this.deposit = depositAmmount;
		balance += depositAmmount;
	}
	
	public void creadit(int creaditAmmount) {
		this.withdraw = creaditAmmount;
		if(creaditAmmount<0 || creaditAmmount > balance) {
			System.out.println("Insufficient");
		}else {
			balance -= creaditAmmount;
		}
	}
	
	public void printDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Deposit Ammount: " + deposit);
		System.out.println("Withdraw Ammount: " + withdraw);
	}
	public int getter() {
		return balance;
	}
	
}
