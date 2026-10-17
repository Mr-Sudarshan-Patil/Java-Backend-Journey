package com.constructor2;


class Invoice extends Object  //Invoice class => parent class => Object (Invoice is child of object)
{
	//Static variable belong to class and access to same as all object same
	static int gst = 18;
	
	//Instatnce variable belong to object and it'self having own copy each object
	int ammount;
	String itemName, billingAddress, customerId, customerName;
	
	
	//Creting parameterized constructor to assing the values or filled instatnce variable
	//Consturctor name same as class name
	
	Invoice(int $ammount, String $itemName, String $billingAddress, String $customerId, String $customerName)
	{
		//this means current object: with the help of this we are assing the values
		this.ammount = $ammount;
		this.itemName = $itemName;
		this.billingAddress = $billingAddress;
		this.customerId = $customerId;
		this.customerName = $customerName;
	}
	
	//creating method to printing all the instatnce + static vaiable for each object
	void printInvoice() {
		System.out.println("==========Invoice=============");
		System.out.println("Ammount : " + ammount);
		System.out.println("Item Name: " + itemName);
		System.out.println("Billing Address: " + billingAddress);
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("==============================");
		//Static variable
		System.out.println("GST: " + gst+"%");
		System.out.println("===============================\n\n");
	}
}


public class Driver {
	public static void main(String args[])
	{
		System.out.println("Inside main method\n\n");
		//Creating a object
		
		Invoice inc = new Invoice(60000, "Asus Laptop", "BTM Stage 2", "ord123", "Sudarshan Patil");
		inc.printInvoice();
		
		Invoice inc1 = new Invoice(120000, "Iphone 17 pro", "BTM Stage 2", "ord453", "Ravi Kumar");
		inc1.printInvoice();
		
		Invoice inc3 = new Invoice(18000, "Iphone 17 pro", "BTM Stage 2", "ord453", "Ravi Kumar");
		inc3.printInvoice();
		
	}
}
