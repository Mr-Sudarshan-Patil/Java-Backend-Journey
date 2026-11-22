package com.kodewala.managefund;

public class FundTransfer {

	private String accountHolder;
	private String accountNumber;
	private int balance;
	private int ammount;

	public FundTransfer(String accountHolder, String accountNumber, int balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	//setter: to add ammount transaction in this account
	
	public void doDebit(int ammount) {
		this.ammount = ammount;
		if(ammount<0) {
			System.out.println("Negative ammount");
			
		}else {
			if(ammount>0 || ammount < balance) {
				balance = balance - ammount;
			}else {
				System.out.println("Insufficient transaction");
			}
		}
	}
	//getter to print detail
	public void printDetail() {
		System.out.println("Account info: ");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Fund Transfer Ammount: " + ammount);
	}
	
	public int getBalance() {
		return balance;
	}
	
}
