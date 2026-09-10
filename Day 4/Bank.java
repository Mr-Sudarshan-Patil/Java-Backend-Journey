class BankAccount 
{
	public static void main(String bankDetails[])
	{
		String accountHolderName = bankDetails[0];
		int accountNumber = Integer.parseInt(bankDetails[1]);
		float balance = Float.parseFloat(bankDetails[2]);
		boolean status = Boolean.parseBoolean(bankDetails[3]);
		
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		
		if(status == true){
			System.out.println("Your Bank account is Active");
		}else{
			System.out.println("Your Bank Account is In-active");
		}
	}
}