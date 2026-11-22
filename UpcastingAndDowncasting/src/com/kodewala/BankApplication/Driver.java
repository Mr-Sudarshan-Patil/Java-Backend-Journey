package com.kodewala.BankApplication;

public class Driver {

	public static void main(String[] args) {
		
//		Payment p1 = new Payment();
//		
//		PaymentProcess p = new PaymentProcess();
//		p.processPayment(p1);
//		
		
		//Child Object create and pass then i have to create seperate three payment process and make programm lenthy instested we create polyimorphism and make only one paymentProcess handle all the payment type 
		
		//Step 1: withought poly and upcasting
		
//		void processUpi(UpiPayment u) {
//		    u.pay();
//		}
//
//		void processCard(CardPayment c) {
//		    c.pay();
//		}
//
//		void processNetBanking(NetBanking n) {
//		    n.pay();
//		}
		
		
		
		PaymentProcess p = new PaymentProcess();
		
		UpiPayment u = new UpiPayment();
		CardPayment c = new CardPayment();
		NetBanking n = new NetBanking();
		
		Payment[] payments = {u, c, n};
		
		p.processPayment(new UpiPayment());
		p.processPayment(c);
		p.processPayment(n);
		
		System.out.println("==============");
		
		
		
		Payment p1 = new UpiPayment();
		Payment p2 = new CardPayment();
		Payment p3 = new NetBanking();
		
		p.processPayment(p1);
		p.processPayment(p2);
		p.processPayment(p3);
	}

}
