import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("You Enter : " + num);
		int temp = num;
		int reverseNumber = 0;
		
		while(num > 0)
		{
			int lastDigit = num%10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
			num = num / 10;
		}
		System.out.println("Your Reverse Number is : " + reverseNumber);
		
		System.out.println("===============Checking Palindrome Number or Not==================");
		if(reverseNumber == temp) {
			System.out.println("This is Palindrome Number");
		}else{
			System.out.println("This is not a Palindrome Number");
		}
	}
}