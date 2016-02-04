import java.math.BigInteger;


public class ProblemSet16 {

public static void main(String args[]){
//	Long a= (long) Math.pow(2, 1000);System.out.println(a);
//	System.out.println(sum_of_digits(a));
	int result = 0;

	String val = BigInteger.valueOf(2).pow(1000).toString();

	for(char a : val.toCharArray()){
	    result = result + Character.getNumericValue(a);
	}
	System.out.println("val ==>" + result);
}
}
