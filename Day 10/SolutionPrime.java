// Online Java Compiler (Editor)
// Write and run Java online using this editor.



class SolutionPrime {

    public static void main(String args[]){
        boolean result = isPrime(7);
        System.out.println(result);
    }
    
    static boolean isPrime(int n)
    {
        // code here
		boolean isPrime = true;
        if(n<=1)
        {
            isPrime =  false; // 0 1
        }
     
        int c = 2;    
        while(c*c < n)   // 4 < 7  // 3*3 
        {
            if(n%c == 0)   // false
            {
                isPrime =  false;
            }
        }
        
        if(c*c > n)  // 4 > 7
        {
            isPrime = true;
        }
        
        isPrime = false; // return false
		
		
		System.out.println("check status: " + isPrime);
        return isPrime;
    }      
}