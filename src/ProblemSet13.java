import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;



public class ProblemSet13 {
public static void main(String args[]){
	try {
		FileReader fr=new FileReader("/Users/abhinav/Documents/workspace/Euler/files/ProblemSet13");
		BufferedReader br=new BufferedReader(fr);
		String line;
		BigInteger result=BigInteger.ZERO;
		
		while((line=br.readLine()) !=null){
			BigInteger r=new BigInteger(line);
			result=result.add(r);
		
		}
		System.out.println(result);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
