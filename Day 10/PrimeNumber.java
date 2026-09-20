public class PrimeNumber
{
	public static void main(String[] args) {
	
		
		int num = 6;
	    boolean result = checkPrime(num);
	    System.out.println(result);
	}
	
	static boolean checkPrime(int num){
	    if(num<=1){
	        return false;
	    }
	    int c = 2;
		while(c*c<num)
		{
		    
		    if(num%c == 0){
		        return false;
		    }
		    c++;
		}
		
		if(c*c > num){
		    return true;
		}
		return false;
	}
}