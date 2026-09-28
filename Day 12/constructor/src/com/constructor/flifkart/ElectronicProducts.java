package com.constructor.flifkart;

public class ElectronicProducts extends Products {
	int warranty;
	
	public ElectronicProducts(String _prodName, int _price, String _prodId, int _warrenty) {
		super(_prodName, _price, _prodId);
		this.warranty = _warrenty;
	}
	
	void printProductDetails() {
		System.out.println("Product Name: " + prodName);
		System.out.println("Price: " + price);
		System.out.println("Product Id: " + prodId);
		System.out.println("Warrenty: " + warranty);
	}
}
