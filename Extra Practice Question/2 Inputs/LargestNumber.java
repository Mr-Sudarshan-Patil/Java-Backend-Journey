//Quetion take a 3 integers from the input and find the largest number in 3 numbers
import java.util.Scanner;

public class LargestNumber
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

/*
		if(num1 > num2 && num1 > num3) {
			System.out.println("The largest number is num1 : " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("The largest number is num2: " + num2);
		}
		else{
			System.out.println("The largest number is num3: " + num3);
		}
	
	
*/
/*
		int max = num1;

		if(max < num2){
			max = num2;
		}
		if(max < num3){
			max = num3;
		}
		
		System.out.println(max);
*/

		int max = Math.max(num3, Math.max(num1, num2));
		System.out.println(max);
		
	
	}
}