package com.ecommers;

public class UserClass {
	public static void main(String args[]) {
		
		//Creating object for default
		ProductClass prod = new ProductClass();
		prod.printProductDetails();
		
		//Creating object for product and description
		ProductClass prod1 = new ProductClass("Asus Laptop", "Powerful, lightweight, and reliable for everyday work, study, and entertainment.");
		prod1.printProduct();
		
		//Creating object for all parameters
		ProductClass prod2 = new ProductClass("Asus Laptop", 60000, "Powerful, lightweight, and reliable", 23);
		prod2.printProductDetails();
		
	}
}
 