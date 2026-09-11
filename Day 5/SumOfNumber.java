//Write a program to add two number

public class SumOfNumber
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		System.out.println("Sum is : " + sum);
	}
}