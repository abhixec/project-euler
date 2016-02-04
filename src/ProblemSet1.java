
public class ProblemSet1 {
	public static int sum_multiples_of_n(int range){
		int sum=0;
		for(int i = 0; i<range; i++ ){
			if(i %3 == 0 || i% 5 ==0){
			sum+=i;
			}
		}
		return sum;
	}
	public static void main(String args[]){
		int c= sum_multiples_of_n(1000);
		System.out.println(c);
	}
}
