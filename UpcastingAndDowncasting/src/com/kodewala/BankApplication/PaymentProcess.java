package com.kodewala.BankApplication;

public class PaymentProcess {
	public void processPayment(Payment payment) {
		
		//Payment payment = new UpiPayment(); this created backside here
//		payment.pay(); // Poly
//		payment.work();
		
		if(payment instanceof UpiPayment) {
			UpiPayment up = (UpiPayment) payment;
			up.process1();
		}else if(payment instanceof NetBanking) {
			NetBanking nb = (NetBanking) payment;
			nb.process3();
		}
	}
}
