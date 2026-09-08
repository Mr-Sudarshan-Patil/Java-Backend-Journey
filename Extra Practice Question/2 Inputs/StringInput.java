//String inputs practice
// char practice

import java.util.Scanner;

public class StringInput
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		/*
		
		System.out.println("Enter the First Name: ");
		String firstName = input.next();
		System.out.println("First Name: " + firstName); // if i enter "Sudarshan Patil" it will print only first word after space it will ignore for full input we use nextLine();
		System.out.println("Enter your last Name: ");
		String lastName = input.next();
		System.out.println("Last Name: " + lastName);
		
		System.out.println("==========================================================");
		  // Consume the leftover newline
        input.nextLine();
		System.out.println("Enter your Father Name");
		String fatherName = input.nextLine();
		System.out.println("Father Name is : " + fatherName);
		
		System.out.println("==========================================================");
		System.out.println("Enter your Mother Name");
		String motherName = input.nextLine();
		System.out.println("Mother Name is : " + motherName);
		
		*/
		
		// Character Printing Practices
		
		/*
		
		System.out.println("Enter the first Character");
		
		char a = input.next().charAt(0);
			
		System.out.println("Enter the Second Character");
		
		char b = input.next().charAt(0);
		
		System.out.println("Enter the Third Character");
		
		char c = input.next().charAt(0);
		
		System.out.println("\n\n\n========================================");
		System.out.println("First Char: " + a + " Second Char: " + b + " Third char: " + c);
		System.out.println("==============================================");
		
		*/
		
		System.out.println("Enter the boolean value in true and false");
		
		boolean isPrime = input.nextBoolean();
		
		if(isPrime == true){
			System.out.println("Prime number");
		}else{
			System.out.println("Not a Prime number");
		}
		
	}
}