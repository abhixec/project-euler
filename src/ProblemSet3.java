import java.util.ArrayList;


public class ProblemSet3 {
	public static boolean is_prime(long n){
		if( n == 1 || n ==2 ){
			return true;
		}
		for (long i=2;i < n ; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
	public static ArrayList<Long> prime_factors(long n){
		ArrayList<Long> prime_factorsl=new ArrayList<Long>();
		for(long i =2; i <n; i++){
			if (n % i ==0 ){
				if(is_prime(i)){
					prime_factorsl.add(i);
				}
			}
		}
		return prime_factorsl;
	}
	
	/*
	 * The most efficient way
	 */
	public static void primeFactors(long n)
	{
	    // Print the number of 2s that divide n
	    while (n%2 == 0)
	    {
	        System.out.println("2");
	        n = n/2;
	    }
	 
	    // n must be odd at this point.  So we can skip one element (Note i = i +2)
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {
	        // While i divides n, print i and divide n
	        while (n%i == 0)
	        {
	            System.out.println(i);
	            n = n/i;
	        }
	    }
	 
	    // This condition is to handle the case when n is a prime number
	    // greater than 2
	    if (n > 2)
	        System.out.println(n);
	}
	public static void main(String args[]){
		long number=600851475143l;
//		System.out.println(is_prime(number));
//		System.out.println(prime_factors(number));
		primeFactors(number);
	}
}
