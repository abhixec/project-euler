
public class ProblemSet9 {
	// a+b+c=1000
	//Not the best solution
	public static int pythagorean_triplet(){
		double sum=0;
		int n=1000;
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				sum=Math.pow(i,2)+Math.pow(j,2);
				if(Math.sqrt(sum) ==(int)Math.sqrt(sum) ){  
					System.out.println(i+" "+j+" "+sum);
					if(i+j+(int)Math.sqrt(sum)==1000){
						System.out.println("Product : "+ i*j*(int)Math.sqrt(sum));
					}
				}
			}
		}
		return 0;
	}
	public static void main(String args[]){
		pythagorean_triplet();

		
	}
}
