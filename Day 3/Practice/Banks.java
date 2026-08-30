class BankingManagements 
{
	public static void main(String args[]) {
		System.out.println("Practice with different banking methods");
		printBankdetails();
	}
	
	public static void printBankdetails() 
	{
		System.out.println("This is HDFC Bank & your are calling method inside class");
	}
	
	/*
	private static void printBankdetails() 
	{
		System.out.println("This is HDFC Bank & your are calling method inside class");
	} */
	
}

class IcicBankDetails
{
	public static void main(String args[])
	{
		System.out.println("===========Icic Bank===================");
		BankingManagements.printBankdetails(); // with public identifier i will work
		//BankingManagements.printBankdetails(); // Private identifier i will give an error
		
		/*
		error: printBankdetails() has private access in BankingManagements
                BankingManagements.printBankdetails();
		*/
		
	}
}

class BankOfIndia
{
	public static void main(String args[])
	{
		System.out.println("============Bank of India====================");
		BankingManagements.printBankdetails();
	}
}