import java.util.Scanner;

public class ConditionPractice
{
	public static void main(String args[]){
	
		// Bonus: if sallary is greater than 10000 then 2000 bonus and if lesser than 10000 then bonus is 1000 and print the ending total sallary
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your sallary : ");
		int sallary = input.nextInt();
		
		if(sallary > 10000) 
		{
			sallary += 2000;
		}
		else
		{
			sallary += 1000;
		}
		
		System.out.println("Your Total Sallary After Adding Bonus: " + sallary);
	}
}