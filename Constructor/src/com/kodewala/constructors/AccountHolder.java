package com.kodewala.constructors;

public class AccountHolder {
	int ammount;
	String account;
	String name;
	String phoneNumber;
	int intrestRate = 3;
	
	AccountHolder(int _ammount, String _account, String _name, String _phoneNumber){
		this.ammount = _ammount;
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}
	
	void printAccountDetails() {
		System.out.println("==================");
		System.out.println("Ammount: " + ammount);
		System.out.println("Account Number: " + account);
		System.out.println("Name: " + name);
		System.out.println("PhoneNumber: " + phoneNumber);
		System.out.println("IntrestRate: " + intrestRate+"%");		
		System.out.println("==================");
	}
}
