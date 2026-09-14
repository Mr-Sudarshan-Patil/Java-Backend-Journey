import java.util.Scanner;

class NewSwitchCase
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String fruits = sc.next();
		
		switch(fruits){
			case "mango" -> System.out.println("Mango");
			case "banana" -> System.out.println("Banana");
			case "grapes" -> System.out.println("grapes");
			default -> System.out.println("Invalid Outputs");
		}
	}
}