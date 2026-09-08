// Fibonachi Programm with while loop
import java.util.Scanner;

public class FibonachiProgrammWhile
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how much fibo no series you want");
		int num  = sc.nextInt();
		
		int p = 0;
		int i = 1;
		
		System.out.print(p + " " + i + " ");
		
		int count = 2;
		
		int lastFibo = 0;
		while(count<=num){
			int nextNo = p + i;
			lastFibo = nextNo;
			System.out.print(nextNo + " ");
			
			p = i;
			i = nextNo;
			count++;
		}
		
		System.out.println("Last Fibo Number: " + lastFibo);
	
	}
}