class FundTransfer
{
	public static void main(String args[])
	{
		System.out.println("Enter in main");
		
		int ammount  = Integer.parseInt(args[0]);
		String senderAccountNo = args[1];
		String reciverAccountNo = args[2];
		
		//
		
		boolean result = FundTransfer.doTransaction(ammount , senderAccountNo , reciverAccountNo);
		
		String message = (result) ? "Transaction successfull" : "Transaction Failed";
		
		System.out.println(message);
		
		System.out.println("End main method");
		
	}
	
	static boolean doTransaction(int ammount, String senderAccountNo, String reciverAccountNo){
		
		System.out.println("Enter is doTransaction method()");
		//System.out.printf("Ammount is: %.2f%n , Sender Account No is: %.2f%n , ReciverAccountNo : %.2f%n",  ammount,senderAccountNo, reciverAccountNo);
		
		System.out.println("Ammount is: " + ammount + " " +"Sender Account No is: " + senderAccountNo + " " + "ReciverAccountNo "+reciverAccountNo);
		
		System.out.println("End doTransaction Method");
		
		return true;
	
	}
}

/*
Enter in main
Enter is doTransaction method()
Ammount is: 200 Sender Account No is: 234223424 ReciverAccountNo 234234234
End doTransaction Method
Transaction successfull
End main method

*/