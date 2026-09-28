package com.constructor.flifkart;

public class Fashion extends Products {
	String type;
	public Fashion(String _prodName, int _price, String _prodId, String _type) {
		super(_prodName, _price, _prodId);
		this.type = _type;
	}
	
	void printProductDetails() {
		System.out.println("Product Name: " + prodName);
		System.out.println("Price: " + price);
		System.out.println("Product Id: " + prodId);
		System.out.println("Type: " + type);
	}
}
