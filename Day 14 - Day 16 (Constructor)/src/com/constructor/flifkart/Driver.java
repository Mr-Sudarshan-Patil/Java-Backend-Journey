package com.constructor.flifkart;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicProducts prod1 = new ElectronicProducts("Iphone", 125000, "ord342", 2);
		prod1.printProductDetails();
		
		System.out.println();
		
		Fashion prod = new Fashion("Zudio T-shirt", 600, "ord543", "Fabric");
		prod.printProductDetails();
		
	}

}
