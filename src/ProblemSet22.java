import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;


public class ProblemSet22 {
	
	public static int name_value(String name){
		char[] name_ar=name.toCharArray();
		int sum=0;
		for(int i=0;i<name_ar.length;i++){
			sum=sum+"ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(name_ar[i])+1;
			
		}
		System.out.println(sum);
		return sum;
	}
public static void main(String args[]) throws IOException{
	try {
		FileReader fr=new FileReader("/Users/abhinav/Documents/workspace/Euler/files/ProblemSet22.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		long sum=0l;
		int count=1;
		while((line=br.readLine()) !=null){
//			System.out.println(line);
			String[] names=line.split(",");
			Arrays.sort(names);
			for(int i = 0;i<names.length;i++){
				System.out.println(names[i]);
				System.out.println(name_value(names[i])+ " "+ count);
				sum=sum+name_value(names[i])*count;
				count++;
			
			}
//			System.out.println(name_value(line) + " "  + count);
			
		}
		System.out.println(sum);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	System.out.println(name_value("COLIN"));
//	int i = 1;
//	System.out.println((char)(i+'A'-1));
//	System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf('Z')+1);
}
}
