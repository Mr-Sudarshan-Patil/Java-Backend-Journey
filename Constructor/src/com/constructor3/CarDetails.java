package com.constructor3;

public class CarDetails {
	
	String carName;
	double price;
	String brand;
	private String model;
	private int year;
	private boolean isRunning;
	
	CarDetails(String _carName, double _price, String _brand, String _model, int _year, boolean _isRunning){
		this.carName = _carName;
		this.price = _price;
		this.brand = _brand;
		this.model = _model;
		this.year = _year;
		this.isRunning = _isRunning;
	}
	
	
	void printCarDetails(){
		System.out.println("====================");
		System.out.println("Car Name: " + carName);
		System.out.println("Price: " + price);
		System.out.println("Brand Name: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		if(isRunning) {
			System.out.println("Working Condition");
		}else {
			System.out.println("Not is working condition");
		}

		System.out.println("====================");
	}

}
