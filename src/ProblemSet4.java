import java.util.ArrayList;
import java.util.Collections;


public class ProblemSet4 {
	public static boolean is_palindrome(int a){
		String str=""+a;
		//System.out.println(str);
		String reverse = new StringBuffer(str).reverse().toString();
		if(str.equals(reverse)){
			return true;
		}
		return false;
	}
	public static ArrayList<Integer> palindrome(int range){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=1;i<range;i++){
			for(int j=i+1; j<range;j++){
				if(is_palindrome(i*j)){
					result.add(i*j);
				}
			}
		}
		return result;
	}
	public static void main(String args[]){
		int number=1000;
		ArrayList<Integer> a=palindrome(number);
		Collections.sort(a);
		System.out.println(a);
		
	}
}
