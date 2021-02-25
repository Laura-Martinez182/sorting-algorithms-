
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;



public class Main {
	
	static BufferedWriter objWriter;
	static BufferedReader objReader;
	

    public static void main(String[] args) throws IOException {
    	
    	objReader = new BufferedReader(new InputStreamReader(System.in));
		objWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(objReader.readLine());
        System.out.println(" ");

        for (int i=1;i<=n;i++) {
            String[] cases = objReader.readLine().split(" ");
            double[] ages = new double[cases.length];
           

            for (int j=0;j < cases.length;j++) {
                ages[j] = Double.parseDouble(cases[j]);
                
            }
            
            
            bubbleSort(ages);
 }

        
        
        objWriter.close();
        objReader.close();
}



    public static void bubbleSort(double[] ages) throws IOException {

        int changes = 0;
        double pass = 0;
        for(int i= 1; i<ages.length;i++) {
            for(int j=0;j<ages.length-i;j++) {
                if(ages[j]>ages[j+1]) {
                    double temp = ages[j];
                    ages[j] = ages[j+1];
                    ages[j+1] = temp;
                    changes++;
                  
                }
                
               
            }
            
       
            pass++;
        }

        
        
        DecimalFormat df = new DecimalFormat("#.00");
        objWriter.write(df.format(changes/pass)+ "-");
       
        for(int c = 0; c < ages.length; c++) {
            objWriter.write(String.valueOf(ages[c]) + " ");
        }
        objWriter.write("\n");
        
        objWriter.flush();

        
    }
}
   


	

	