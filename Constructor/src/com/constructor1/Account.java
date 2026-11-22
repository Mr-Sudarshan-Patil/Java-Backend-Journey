package com.constructor1;

public class Account {
	int ammount;
	String name;
	
	Account() {
		 // Default constructor
	}
	
	Account(int _ammount, String _name)
	{
		this.ammount = _ammount;
		this.name = _name;
	}
	
	void printDetails() {
		System.out.println("Ammount: " + ammount);
		System.out.println("Name: " + name);
	}
	
}
