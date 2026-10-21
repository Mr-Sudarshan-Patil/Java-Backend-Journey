package com.inheritance.hierarchical4;

//23. Bank, SBI and HDFC
//Create a parent class Bank with getInterestRate(). Create children SBI and HDFC and
//override the method to return 6.5 and 7.0. Print both rates.


class Bank
{
	public void getIntrestRate() {
		System.out.println("Interest");
	}
}

class SBI extends Bank
{
	public void getIntrestRate() {
		System.out.println("6.5%");
	}
}

class HDFC extends Bank
{
	public void getIntrestRate() {
		System.out.println("7.0%");
	}
}

public class Driver {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.getIntrestRate();
		
		HDFC hdfc = new HDFC();
		hdfc.getIntrestRate();

	}

}
