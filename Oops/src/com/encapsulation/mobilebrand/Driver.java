package com.encapsulation.mobilebrand;

public class Driver {
	public static void main(String args[]) {
		MobileBrand mobile1 = new MobileBrand();
		mobile1.setBrand("Iphone");
		mobile1.setPrice(125000);
	
		String brand  = mobile1.getBrand();
		int price = mobile1.getPrice();
		System.out.println(brand);
		System.out.println(price);
	}
}
