
public class ProblemSet7 {
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
	public static int nth_prime(int n){
		int count=0;
		int i=1;
		while(count<=n){
			if(is_prime(i)){
				count ++;
				System.out.println("count " + count + "i " +i);
			}
			i++;
		}
		return i;
	}
	
	public static void main(String args[]){
		nth_prime(10001);
	}
}
