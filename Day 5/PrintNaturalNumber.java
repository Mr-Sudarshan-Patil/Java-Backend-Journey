//print 1 to nth number: take input from the commandline argument 

public class PrintNaturalNumber
{
	public static void main(String arr[])
	{
		int num1 = Integer.parseInt(arr[0]);
		
		for(int i=1; i<=num1; i++)
		{
			System.out.println(i);
		}
	}
}
