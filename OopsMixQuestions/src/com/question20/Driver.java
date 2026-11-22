package com.question20;

public class Driver {

	public static void main(String[] args) {
		Product prod = new Product();
		prod.setPrice(500);
		System.out.println(prod.getPrice());
		
		prod.setPrice(500, 10);
		System.out.println(prod.getPrice());
	}

}
