
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(objReader.readLine());
		
		for (int i=1;i<=n;i++) {
			String[] cases = objReader.readLine().split(" ");
			double[] ages = new double[cases.length];
			
			for (int j=0;j < cases.length;j++) {
				ages[j] = Double.parseDouble(cases[j]);
			 
			}
			
			bubbleSort(ages);
			 
			  
			 
		}
		
	}
	
	
	public static void bubbleSort(double[] ages) throws IOException {
		int changes = 1;
		for(int i= 1; i<ages.length && changes>0;i++) {
			changes = 0;
		    for(int j=0;j<ages.length-i;j++) {
		    	if(ages[j]>ages[j+1]) {
					double temp = ages[j];
					ages[j] = ages[j+1];
					ages[j+1] = temp;
					changes++;
		    	}
			}
			
		}
		
		  BufferedWriter objWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		  objWriter.write(changes+"");
		  objWriter.write(Arrays.toString(ages));
		
	}
}
	

	