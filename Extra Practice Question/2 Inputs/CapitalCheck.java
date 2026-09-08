//identify if charecter wheter capital and smallcase latter

import java.util.Scanner;

public class CapitalCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(0);
		
		System.out.println(ch);
		
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("Capital Letter");
		}
		else if(ch >= 'a' && ch <= 'z'){
			System.out.println("Small Case Letter");
		}else{
			System.out.println("You not enter eigther 'A-Z' or 'a-z' you entered another key");
		}
	}
}