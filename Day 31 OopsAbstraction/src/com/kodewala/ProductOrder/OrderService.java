package com.kodewala.ProductOrder;

public class OrderService {
	private String[] arr = {"Iphone", "realme x7", "Laptop"};
	
	public void placeOrder(String item) {
		boolean result  = checkItemAvailable(item);
		if(result) {
			orderPlaced();
			orderSaved();
			processPayment();
		}else {
			System.out.println("Product Not-Available");
		}
	
	}
	
	private boolean checkItemAvailable(String item) {
		boolean isProductAvailable = false;
		for(String str: arr) {
			if(str.toLowerCase().equals(item.toLowerCase())) {
				System.out.println(str);
				isProductAvailable = true;
				break;
			}
		}
		return isProductAvailable;
	}
	
	private void orderPlaced() {
		System.out.println("Your order is placed");
	}
	
	private void orderSaved() {
		System.out.println("Your order is saved");
	}
	
	private void processPayment() {
		System.out.println("Process Payment...");
	}
}

