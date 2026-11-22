package com.inheritance.ecommers;

public class Clothings extends Product{
	String brand;
	String material;
	
	public Clothings(String productName, String description, String status, String type, String brand,
		String material) {
		super(productName, description, status, type);
		this.brand = brand;
		this.material = material;
	}
	
	public void printClothingDetails() {
		printProductDetails();
		System.out.println("Brand : " + brand);
		System.out.println("Material : " + material);
	}
	
	
}
