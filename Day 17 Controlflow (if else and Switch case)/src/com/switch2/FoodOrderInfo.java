package com.switch2;

public class FoodOrderInfo {
	String food;
	int totalAmmount;
	int quantity;
	int discount = 0;
	
	public FoodOrderInfo(String _food, int _totalAmmount, int _quantity, int _discount){
		this.food = _food;
		this.totalAmmount = _totalAmmount;
		this.quantity = _quantity;
		this.discount = _discount;
	}
	
	
	public void printOrderDetails() {
		System.out.println("===================================");
		System.out.println("Food : " + food);
		System.out.println("Total Price: " + totalAmmount);
		System.out.println("Quantity: " + quantity);
		System.out.println("Discount: " + discount);
		System.out.println("After Discount Total Price : " + (totalAmmount-discount));
		System.out.println("==================================");
	}
}
