package com.inheritance.ecommers;

public class Driver {

	public static void main(String[] args) {
		//General Product
		
		Product prod1 = new Product("Iphone", "This is iphone", "Availabe", "Electronics");
		prod1.printProductDetails();
		
		ElectronicsProduct elcProd = new ElectronicsProduct("Iphone", "This is iphone", "Available", "Electronics",2);
		elcProd.printElectronicsProductDetails();
		
		Clothings cloth1 = new Clothings("Tshirt", "This is fabric tishirt", "Available", "Clothing", "Zara", "fabric");
		cloth1.printClothingDetails();

	}

}
