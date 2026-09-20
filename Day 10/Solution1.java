import java.util.Arrays;
class Solution1 
{
	public static void main(String args[])
	{
		int[] digits = {9};

		int length = digits.length;

       	int sum=0;
        for(int a:digits){
			System.out.println(a);
            sum = (sum*10) + a;
			
        }
		sum +=1;
      
		System.out.println(sum);

		int[] arr;
		if (sum > Math.pow(10, length) - 1) {
            arr = new int[length + 1];
        } else {
            arr = new int[length];
        }
		
		
		int i=arr.length-1;
	
        
        while(sum>0){
            int lastDigit = sum%10;
            arr[i] = lastDigit;
            sum = sum/10;
            i--;
        }
        System.out.println(Arrays.toString(arr));
	}
	
}