
class PrimeCheck
{
	public static void main(String args[]){
	
		int price = Integer.parseInt(args[0]);
		boolean isPrime = Boolean.parseBoolean(args[1]);
		
		String message = isPrime ? "Free deliver, prime member" : ((price > 500) ? "Free delivery normal coustome" : "no delivery free") ;
		
		System.out.println(message);
		
	}
}