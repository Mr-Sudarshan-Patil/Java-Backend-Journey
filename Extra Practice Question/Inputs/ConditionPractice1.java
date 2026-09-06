// Question: take and age from the user and tell if age is greater than 18 then he is eligible for the voting and less than 18 then he is not eligible

import java.util.Scanner;

public class ConditionPractice1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, Enter your Age : ");
		
		byte userAge = input.nextByte();
		
		if(userAge >= 100 || userAge <= 0)
		{
			System.out.println("You are not human");
		}
		else{
			if(userAge > 55){
				System.out.println("No need to go outside, all politicians are brastachari, please focous on your health");
			}
			else if(userAge > 18)
			{
				System.out.println("Eligible for Vote");
			}
			else{
				System.out.println("Not Eligible for Vote");
			}
		}
		
	}
}