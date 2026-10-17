package com.kodewala.discount;

public class Driver {

	public static void main(String[] args) {
		double purchaseAmmount = 900;
		String TypeCust = "Gold";
		double discount = 0;
		Driver dis = new Driver();
		discount = dis.api(purchaseAmmount, TypeCust);
		
		System.out.println("==================");
		System.out.println("Type: " + TypeCust);
		System.out.println("Purchase Ammount: " + purchaseAmmount);
		System.out.println("Discount: " + discount);
		System.out.println("=================");
		
	}

	public double api(double _purchaseAmmount, String _TypeCust) {
		if (_purchaseAmmount > 1000) {
			switch (_TypeCust) {
			case "Gold" -> {
				double _discount = (_purchaseAmmount * 20 / 100);
				if (_discount < 2500) {
					return _discount;
				} else {
					return 2500;
				}
			}

			case "Silver" -> {
				double _discount = (_purchaseAmmount * 10 / 100);
				if (_discount < 2500) {
					return _discount;
				} else {
					return 2500;
				}
			}

			case "Regular" -> {
				double _discount = (_purchaseAmmount * 5 / 100);
				if (_discount < 2500) {
					return _discount;
				} else {
					return 2500;
				}

			}

			default -> System.out.print("Invalid type");

			}
		} else {
			return 0;
		}
		return _purchaseAmmount;
		
	}

}
