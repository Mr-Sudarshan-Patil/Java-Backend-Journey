package com.atmmachin;

public class AccountDetail {
	String accountHolder;
	String accountNo;
	int balance;
	
	public AccountDetail(String _accountHolder, String _accountNo, int _balance) {
		this.accountHolder = _accountHolder;
		this.accountNo = _accountNo;
		this.balance = _balance;
	}
	
	public void printAccountDetails() {
		System.out.println("================Account Details=================");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Balance: " + balance);
		System.out.println("================================================");
	}
}
