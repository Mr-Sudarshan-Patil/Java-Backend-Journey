package com.switch2;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String food = sc.nextLine();
		System.out.println("User Choose this food: " + food);
		System.out.println("Enter the quantity:  ");
		int quantity = sc.nextInt();

		switch (food) {
		case "Burger": {
			int price = 120;
			int totalPrice = price * quantity;
			int discount = calculateDiscount(totalPrice);
			FoodOrderInfo ord = new FoodOrderInfo(food, totalPrice, quantity, discount);
			ord.printOrderDetails();
			break;
		}
		case "Pizza": {
			int price = 200;
			int totalPrice = price * quantity;
			int discount = calculateDiscount(totalPrice);
			FoodOrderInfo ord = new FoodOrderInfo(food, totalPrice, quantity, discount);
			ord.printOrderDetails();
			break;
		}

		case "Sandwich": {
			int price = 100;
			int totalPrice = price * quantity;
			int discount = calculateDiscount(totalPrice);
			FoodOrderInfo ord =new FoodOrderInfo(food, totalPrice, quantity, discount);
			ord.printOrderDetails();
			break;
		}

		case "Pasta": {
			int price = 180;
			int totalPrice = price * quantity;
			int discount = calculateDiscount(totalPrice);
			FoodOrderInfo ord =new FoodOrderInfo(food, totalPrice, quantity, discount);
			ord.printOrderDetails();
			break;
		}

		default:
			System.out.println("Invalid Food Item");
			break;
		}
	}

	public static int calculateDiscount(int totalPrice) {
		int discount = 0;
		if (totalPrice > 1000) {
			discount = (totalPrice * 20 / 100);
		} else if (totalPrice > 500) {
			discount = (totalPrice * 10 / 100);
		} else {
			discount = 0;
		}

		return discount;
	}
}
