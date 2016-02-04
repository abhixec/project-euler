
public class ProblemSet6 {
public static int square(int n){
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i*i;
	}
	return sum;
}
public static int square_sum(int n){
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i;
	}
	return sum*sum;
}
public static void main(String args[]){
	int a=100;
	System.out.println(square(a));
	System.out.println(square_sum(a));
	int difference=square_sum(a)-square(a);
	System.out.println(difference);
}
}
