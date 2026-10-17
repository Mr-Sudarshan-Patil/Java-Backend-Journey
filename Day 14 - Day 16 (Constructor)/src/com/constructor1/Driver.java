package com.constructor1;

public class Driver {

	public static void main(String[] args) {
		
		
		//Creating Object for Default Constructor 
		Account obj = new Account();
		obj.printDetails();
		
		System.out.println();
		//Creating objects for parameterize constructors
		Account acc = new Account(2000, "Sudarshan \n");
		acc.printDetails();
		
		
		Account acc1 = new Account(2000, "Ravi Kumar \n");
		acc1.printDetails();
		
		Account acc2 = new Account(2000, "Chandan Kumar \n");
		acc2.printDetails();

	}

}
