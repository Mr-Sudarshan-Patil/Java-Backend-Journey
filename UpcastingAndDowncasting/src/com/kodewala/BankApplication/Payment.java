package com.kodewala.BankApplication;

public class Payment {
	void pay() {
		System.out.println("Payment.pay().....Payment");
	}
	
	public void work()
	{
		System.out.println("Child method of UpiPayment");
	}

}

class UpiPayment extends Payment {
	@Override
	public void pay() {
		System.out.println("UpiPayment.pay()......UpiPayment");
	}
	
	public void work()
	{
		System.out.println("Child method of UpiPayment");
	}
	
	
	public void process1()
	{
		System.out.println("Child method of UpiPayment.. Process 1");
	}
}

class CardPayment extends Payment 
{
	@Override
	public void pay()
	{
		System.out.println("CardPayment.pay()......CardPayment");
	}
	
	public void work()
	{
		System.out.println("Child method of CardPayment");
	}
	
	public void process2()
	{
		System.out.println("Child method of CardPayment..Process 2");
	}
}

class NetBanking extends Payment
{
	@Override 
	public void pay()
	{
		System.out.println("NetBanking.pay()....NetBanking");
	}
	
	public void work()
	{
		System.out.println("Child method of NetBanking");
	}
	
	public void process3()
	{
		System.out.println("Child method of NetBanking..Process 3");
	}
	
}
