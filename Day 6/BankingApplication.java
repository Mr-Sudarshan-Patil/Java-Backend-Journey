import java.util.Scanner;

class BankingApplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); {
		System.out.println("1: Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposite");
		System.out.println("4: Exit");
		
		int choice = sc.nextInt();
		float totalBalance = 85000.0f;
		switch(choice){
			
			case 1:
				System.out.println("Balance Checking...");
				System.out.println("Total Balance is :" + totalBalance);
				break;
			case 2:
				System.out.println("Enter the Withdraw Ammount");
				int witdrawAmmount = sc.nextInt();
				
				if(witdrawAmmount > totalBalance){
					System.out.println("Insufficient Balance");
				}else{
					totalBalance -= witdrawAmmount; 
					System.out.println("Remaining Balance :" + (totalBalance));
				}
				break;
			case 3:
				System.out.println("Enter Deposite Ammount");
				int depositAmmount = sc.nextInt();
				totalBalance += depositAmmount;
				System.out.println("Total Balance is: " + totalBalance);
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
		}
	}
}
