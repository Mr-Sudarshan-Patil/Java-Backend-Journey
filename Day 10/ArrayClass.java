import java.util.Arrays;
import java.util.Scanner;
class ArrayClass
{
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		/*
		int[] arr = {1,2,3,4,5};
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		*/
		
		//int[] arr2 = new int[3];

	/*
		System.out.println(arr2[2]); // 0
		System.out.println(Arrays.toString(arr2)); //[I@1dbd16a6  [0,0,0,0,0]
	*/
		/*
		
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		
		for(int i: arr2){
			System.out.print(i + " ");
		}
		
		*/
		
		String firstName = "Sudarshan";
		String[] arr = new String[10];
		
		
		for(int i=0; i<firstName.length(); i++){
			
			arr[i] = firstName.charAt(i) + " ";
		}
		
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		

	}
}