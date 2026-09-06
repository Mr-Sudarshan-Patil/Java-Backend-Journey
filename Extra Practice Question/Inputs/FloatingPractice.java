import java.util.Scanner;

public class FloatingPractice
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.println("Enter the float number 1 ");
		float num1 = input.nextFloat();
		
		System.out.println("Enter the second float number ");
		float num2 = input.nextFloat();
		
		
		float total = num1 + num2;
		System.out.println("Total is : " + total);
		*/
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		float total = num1 + num2;
		
		System.out.println("Total sum is :" + total);
		
	}
}