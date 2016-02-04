import java.util.HashSet;


public class ProblemSet10 {
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
	public static long sum_prime(int n){
		long sum=0;
		for(int i=2;i<=n;i++){
			if(is_prime(i)){
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String args[]){
		int n=2000000;
		System.out.println(sum_prime(n));
	}
	
}
