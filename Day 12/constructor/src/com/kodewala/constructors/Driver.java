package com.kodewala.constructors;

public class Driver {
	public static void main(String args[])
	{
		AccountHolder user1 = new AccountHolder(2000, "2342432343", "Sudarshan", "3453534534");
		AccountHolder user2 = new AccountHolder(6000, "344464643", "Sudarshan", "9853534535");	
		user1.printAccountDetails();
		user2.printAccountDetails();
	}
}
