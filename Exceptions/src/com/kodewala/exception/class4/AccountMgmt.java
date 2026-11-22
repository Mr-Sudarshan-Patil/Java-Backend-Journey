package com.kodewala.exception.class4;

public class AccountMgmt {
	public void openAccount(String accNo) {
		System.out.println("Open Account ... START");
		activateAccount(accNo);
		System.out.println("Open Account ... End");
	}
	
	private void activateAccount(String accNo) {
		System.out.println("activateAccount .. Start");
		boolean isResult = true;
//		checkAccountStatus(accNo);
		try {
			isResult = checkAccountStatus(accNo);
			System.out.println(isResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("ActivateAccount ... END");
	}
	
	private boolean checkAccountStatus(String accNo) throws NullPointerException
	{
		try {			
			accNo.startsWith("SBI");
		}catch(NullPointerException e) {
			throw new NullPointerException("Account name not start with SBI and should be null");
		}
		return false;
	}
}
