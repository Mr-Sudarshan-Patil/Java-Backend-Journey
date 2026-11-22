package com.kodewala.exception5;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()..Start");
		Account acc = new Account();
		String accNo = null;
		acc.doActivate(accNo);
		System.out.println("Driver.main()..end");
	}

}

class Account
{
	
     void doActivate(String accNo) {
	  System.out.println("Account.doActivate()..Start");
	  boolean  result = validAccount(accNo);
	  System.out.println(result);
	  System.out.println("Account.doActivate()..end");
     }
     
      boolean validAccount(String accNo) {
    	  System.out.println("Account.validAccount()..Start");
    	  boolean isValid = false;
    	  try {
    		  isValid = accNo.startsWith("SBI");
    	  }
    	  catch(NullPointerException e) {
    		  System.out.println("Account Number is Null");
    		  e.printStackTrace();
    	  }
    	 
    	  System.out.println("Account.validAccount()..end");
    	  
    	  return isValid;
     }
}
