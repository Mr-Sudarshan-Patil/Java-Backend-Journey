package com.methodOverriding.problem2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose your payment method: \n 1. Card \n 2.UPI");
		int num = sc.nextInt();

		if (num == 1) {
			// Do payment with card
			Card pay = new Card();
			pay.doPayment();
		} else if (num == 2) {
			// Do Payment with UPI
			UPI upi = new UPI();
			upi.doPayment();
		} else {
			System.out.println("Invalid Input");
		}

	}

}
