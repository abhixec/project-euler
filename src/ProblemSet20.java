import java.math.BigInteger;


public class ProblemSet20 {
public static BigInteger factorial(int n){
	if(n ==0 || n ==1){
		return BigInteger.valueOf(1);
	}
	
	return  BigInteger.valueOf(n).multiply(factorial(n-1));
}
public static long sum_of_digits(BigInteger n){
	long sum=0;
	while(n !=BigInteger.ZERO){
		BigInteger b=n.mod(BigInteger.TEN);
		
		sum=sum+b.longValue();
		n=n.divide(BigInteger.TEN);
		
	}
	return sum;
}
public static void main(String args[]){
	long a=10l;
	System.out.println(factorial(100));
	System.out.println(sum_of_digits(factorial(100)));
}
}
