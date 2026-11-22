package com.kodewala.exception2.class4;

public class PaymentMgmt {
	public void doPayment(String account, int ammount) throws FoundTransferException {
		try {
			checkBalance(ammount);			
		}catch(Exception e) {
			throw new FoundTransferException("Fund Not avalable");
		}
	}
	
	private boolean checkBalance(int ammount) throws InsufficientBalanceException
	{
		int balance = 1000;
		boolean isValid = false;
		if(ammount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance to fund transfer");
		}
		else {
			System.out.println("Programm runned with valid balance fund transfer");
			isValid =  true;
		}
		
		return isValid;
	}
}
