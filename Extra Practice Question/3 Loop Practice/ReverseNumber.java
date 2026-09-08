import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("You Enter: " + num);
		
		int reverseNo = 0;
		
		while(num>0)
		{
			int lastDigit = num%10;
			reverseNo = (reverseNo * 10) + lastDigit;
			num = num/10;
		}
		
		System.out.println("The Reverse Number is : " + reverseNo);
	}
}	