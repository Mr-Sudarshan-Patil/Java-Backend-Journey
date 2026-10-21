package com.encapsulation.mobilebrand;

//Mobile Phone: Create a Mobile class with private variables brand and price. Use getters and setters to access them.


public class MobileBrand {
	private String brand;
	private int price;
	
	//setters - setBrand and setPrice
	
	public void setBrand(String _brand) {
		this.brand = _brand;
	}
	
	public void setPrice(int _price) {
		this.price = _price;
	}
	
	//getters
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
