class Solution {

   public static void main(String args[]){
	String s = "abc";
	int result = Solution.reverseDegree(s);
	System.out.println("Total is : " + result);
   }
   
    public static int reverseDegree(String s) {
        String ch = s;
        int sum = 0;
		int c = 1;
        for(int i=0; i<ch.length(); i++){
			System.out.println("Sum is: " + sum);
			
            sum = sum + (c * (123 - (int) ch.charAt(i)));
			
			System.out.println("After calculation Sum is: " + sum);
			c++;
        }
        return sum;
    }
}