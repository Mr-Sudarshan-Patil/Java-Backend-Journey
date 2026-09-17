import java.util.Scanner;

class BankAccount
{
	static int balance = 2000;
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String accountHolder = "Sudarshan Patil";
		String accountNumber = "394878398442839";
		System.out.println("User : " + accountHolder);
		System.out.println("Accound number: " + accountNumber);
		
		System.out.println("1.Balance Checking \n 2. Withdraw \n 3.Deposit");
		int choices = sc.nextInt();
		//2
		
		
		switch(choices)
		{
			case 1 -> 
			{
				BankAccount obj = new BankAccount();
				obj.displayBalance(balance);
			}
			case 2 -> 
			{
				BankAccount obj = new BankAccount();
				System.out.println("Enter the withdrawal ammount : ");
				int withdrawAmmount = sc.nextInt();
				int result = obj.withdrawMethod(withdrawAmmount);
				if(result < 0){
					System.out.println("Invalid Transaction");
				}else{
					obj.displayBalance(result);					
				}
								
			}
			case 3 -> 
			{
				BankAccount obj = new BankAccount();
				System.out.println("Enter the Deposit Ammount : ");
				int depositAmmount = sc.nextInt();
				int result = obj.depositMethod(depositAmmount);
				obj.displayBalance(result);
				
			}
			default -> System.out.println("Invalid Choice");
		
		}
		
		
	}
	
	
	int depositMethod(int depositAmmount){
		BankAccount obj = new BankAccount();
		System.out.println("================[Deposit]================");
		int result = obj.balance + depositAmmount;
		return result;
	}
	
	
	int withdrawMethod(int withdrawAmmount)
	{
		System.out.println("================[Withdraw Ammount]=================");
		BankAccount obj = new BankAccount();
			if(withdrawAmmount > obj.balance)
				{
					return 0;
				}
				else
				{
					int result = obj.balance - withdrawAmmount;
					return result;
				}
			
	}
	
	
	void displayBalance(int totalBalance)
	{
		System.out.println("==========================================");
		System.out.println("======[ Total Balance is : " + totalBalance + " ]=====");
		System.out.println("==========================================");
	}
}