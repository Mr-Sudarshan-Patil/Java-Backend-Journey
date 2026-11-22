package com.inheritance.ecommers;

public class Product {
	String productName;
	String description;
	String status;
	String type;
	
	public Product(String productName, String description, String status, String type) {
		super();
		this.productName = productName;
		this.description = description;
		this.status = status;
		this.type = type;
	}
	
	public void printProductDetails() {
		System.out.println("===========");
		System.out.println("Product Name: " + productName);
		System.out.println("Description: " + description);
		System.out.println("Status: " + status);
		System.out.println("Type : " + type);
		System.out.println("===========");
	}
	
}
