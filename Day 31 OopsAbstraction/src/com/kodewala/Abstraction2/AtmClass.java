package com.kodewala.Abstraction2;

public class AtmClass {
	private String cardNo;
	private int balance;
	private boolean isValidCard;
	
	AtmClass(String card, int balance){
		this.cardNo = card;
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println(verifyCard(cardNo));
		if(isValidCard) {
			System.out.println("Balance is: " + balance);
		}
	}
	
	private String verifyCard(String cardNo) {
		if(cardNo.equals("564556")) {
			isValidCard = true;
			return "Correct Card Details";
		}else {
			isValidCard = false;
			return "Incorrect card Details";
		}
	}
	
}
