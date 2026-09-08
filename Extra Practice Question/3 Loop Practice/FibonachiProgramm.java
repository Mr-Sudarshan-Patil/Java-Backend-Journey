// Fibonachi Number Print: 0, 1, 1, 2, 3, 5, 8, 13

import java.util.Scanner;

public class FibonachiProgramm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how much series of fibonachi you want: ");
		int num = sc.nextInt();
		int previousNumber = 0;
		int currentNumber = 1;
		
		System.out.print(previousNumber + " " + currentNumber + " ");
		
		for(int count = 2; count <= num; count++)
		{
			int nextNumber = previousNumber + currentNumber;
			System.out.print(nextNumber + " ");
			
			// Swapping
			
			
			previousNumber = currentNumber;
			currentNumber = nextNumber;
		}
	}
}