class Account
{
	public static void main()
	{
		System.out.println("Enter in main method");
		
		//calling public method in another class
		AccountStatus.printDetails();
		
		System.out.println("End main method");
	}
	
	protected static void infoDetails(){
		System.out.println("It is private method");
	}
}


class AccountStatus
{

	public static void printDetails(){
		System.out.println("Enter in account status method that is public");
		
		Account.infoDetails();
	}
}