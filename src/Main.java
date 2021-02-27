
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;



public class Main {
	
	static BufferedWriter objWriter;
	static BufferedReader objReader;
	

    public static void main(String[] args) throws IOException {
    	
    	objReader = new BufferedReader(new InputStreamReader(System.in));
		objWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(objReader.readLine());
        

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

        DecimalFormat df = new DecimalFormat("#.0#");
        df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setRoundingMode(RoundingMode.DOWN);
        objWriter.write(df.format(changes/pass)+ "-");
        
        String values = "";
        for(int c = 0; c < ages.length; c++) {
             values += ages[c]+ " ";
        	
        }
        	objWriter.write(values.trim());
	        objWriter.write("\n");
	        objWriter.flush(); 
    }

}
   


	

	