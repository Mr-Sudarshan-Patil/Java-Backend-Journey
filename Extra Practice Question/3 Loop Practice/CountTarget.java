import java.util.Scanner;

public class CountTarget 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = 12374737;
		System.out.println("Your number is : " + num);
		System.out.println("Which target i have to found");
		int target = sc.nextInt();  // 7
		int count = 0; // 0
		while(num>0){ 
			int LastDigit  = num % 10;
			if(LastDigit==target){
				count++;
			}
			
			num = num / 10;
		}
		System.out.println("Count is : " + count);
	}
}