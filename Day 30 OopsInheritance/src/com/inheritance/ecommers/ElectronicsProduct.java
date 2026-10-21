package com.inheritance.ecommers;

public class ElectronicsProduct extends Product {
	int warenty;

	public ElectronicsProduct(String prod, String des, String status, String type, int _warenty) {
		super(prod, des, status, type);
		this.warenty = _warenty;
	}
	
	public void printElectronicsProductDetails() {
		printProductDetails();
		System.out.println("Warrenty: " + warenty);
	}

}
