package com.kodewala;

class Account
{
	public String openAccount(String name, int balance)
	{
		System.out.println("Open Account...");	
		return "Some String";
	}
	
	public static String method1(String name) {
		System.out.println("Hello..Account Class");
		return "Some string";
	}
	
}

class SavingAccount extends Account
{
	@Override
	public String openAccount(String name, int balance)
	{
		System.out.println("Saving Account Open");
		return "Some Other String";
	}
//	
//	@Override
	public static String method1(String name) {
		System.out.println("Hello..SavingClass");
		return "Some other string";
	}
}
public class Driver {
	public static void main(String args[]) {
		
		Account a = new Account();
		System.out.println(a.openAccount("Ravi Bhai", 65000));
		
		System.out.println("===========");
		SavingAccount sa = new SavingAccount();
		System.out.println(sa.openAccount("Sudarshan Patil", 75000));
		
		System.out.println("============");
		System.out.println(Account.method1("Sudarshan"));
		
		System.out.println("============");
	}
}
