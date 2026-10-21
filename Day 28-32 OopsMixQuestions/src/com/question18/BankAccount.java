package com.question18;

public class BankAccount {
	private int balance; // hide data to modify and secure purpose with the help of encapsulation
	
	BankAccount(int balance){
		validBalance(balance);
	}
	
	//validBalance is my core functionality in this example i am hiding with abstraction
	private void validBalance(int bal) {
		if(bal<0) {
			System.out.println("Balance ammount not valid");
		}else {
			this.balance = bal;
		}
	}
	private boolean validWithBalance(int withAmmount) {
		if(withAmmount<= balance) {
			return true;
		}else {
			return false;
		}
	}
	private boolean validDepositAmmount(int depAmmount) {
		if(depAmmount<=0) {
			return false;
		}else {
			return true;
		}
	}
	
	
	//setter to modify balance
	
	public void deposit(int depAmmount) {
		if(validDepositAmmount(depAmmount)) {
			this.balance += depAmmount;
		}else {
			System.out.println("Deposite ammount should not be 0");
		}
		
	}
	
	public void withdraw(int withAmmount) {
		if(validWithBalance(withAmmount)) {
			this.balance -= withAmmount;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	//getter To show blance mean only for read purpose
	
	public int getBalance() {
		return balance;
	}
}
