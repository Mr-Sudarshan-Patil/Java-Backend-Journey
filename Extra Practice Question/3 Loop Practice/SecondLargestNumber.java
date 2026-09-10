import java.util.Scanner;

public class SecondLargestNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("below 10 not accepted, Enter No: ");
		int num = sc.nextInt();

		int max1 = 0;
		int max2 = 0;
		
		if(num > 10){
			while(num>0)
			{
				int lastDigit = num % 10;
				if(lastDigit >= max1)
				{
					max2 = max1;
					max1 = lastDigit;
					
				}else{
					if(lastDigit >= max2){
						max2 = lastDigit;
					}
				}
				num = num/10;
			}
			
		}
		
			if(max1 == max2) 
			{
				System.out.println("No Second Highest number");
			}else{
				System.out.println("The Second Highest Number is: " + max2);
			}
	}
}