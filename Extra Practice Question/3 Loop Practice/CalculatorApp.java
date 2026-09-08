import java.util.Scanner;

public class CalculatorApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operation e.g '+, -, *, /, %' for exit 'x or X'");
		
		char op = sc.next().trim().charAt(0);
		
		int result = 0;
		
		while(true){
			if(op=='+' || op == '-' || op == '*' || op == '/' || op == '%')
			{
				System.out.println("Enter Two Number: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if(op == '+'){
					result = num1 + num2;
				}	
				
				if(op == '-'){
					result = num1 - num2;
				}	
				
				if(op == '*'){
					result = num1 * num2;
				}	
				
				if(op == '/'){
					if(num2>0){
						result = num1 / num2;
					}else{
						result = 0;
					}
					
				}	
				
				if(op == '%'){
					result = num1 % num2;
				}		
			 System.out.println("Result is :" + result);
			}
			else if(op=='x' || op == 'X')
			{
				break;
			}
			else
			{
				System.out.println("Invalid operation");
			}
			
		}
	}
}