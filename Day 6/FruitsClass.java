import java.util.Scanner;

class FruitsClass
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		String fruits = sc.next();
		
		switch(fruits){
			case "mango":
				System.out.println("Mango");
				break;
			case "banana":
				System.out.println("Banana");
				break;
			case "grapes":
				System.out.println("grapes");
				break;
			default:
				System.out.println("Invalid Outputs");
				break;
		}
	}
}