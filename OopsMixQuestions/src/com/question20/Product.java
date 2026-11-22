package com.question20;

public class Product {
	//this price private to hide directly access price
	private double price;
	
	//setters overloading
	
	//setter 1: same name method setPrice set the price 
	
	public void setPrice(double _price) {
		validatePrice(_price);
	}
	//setter 2 : same name method setPrice with price+discount
	
	//
	public void setPrice(double _price, double discount) {
		validatePrice(_price);
		this.price  += (this.price * discount) / 100;  
	}
	
	
	//core funcationality hide
	
	private void validatePrice(double _price) {
		if(_price<=0) {
			System.out.println("Product prise should not be 0");
		}else {
			this.price = _price;
		}
	}
	
	//getter 
	
	public double getPrice() {
		return price;
	}
	
	
}
