package com.mobilebrand;

public class MobileBrand {
	String brand;
	String model;
	int price;
	
	private String InternalFeature;
	
	public MobileBrand(String a, String b, int c, String d){
		this.brand = a;
		this.model = b;
		this.price = c;
		this.InternalFeature = d;
	}
	
	public void printDetails() {
		System.out.println("Brand Name: " + brand);
		System.out.println("Model Name: " + model);
		System.out.println("price: " + price);
		System.out.println("features: " + InternalFeature);
	}
}
