package edu.escuelaing.arem.firstWorkshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeanAndStandardDeviation{
	
	private static final String FILENAME = "input.in";
	public static LinkedList<Double> numbers = new LinkedList<Double>();
	public static double amountNumbers , meanValue ;
	
	
	
	public static double standardDeviation() throws Exception {
		double stDeviationValue = 0.0;
		for(int i  = 0 ; i < amountNumbers ; ++i) {
			stDeviationValue += Math.pow(numbers.getNode(i)-meanValue, 2);
		}
		double sqrt = stDeviationValue/(amountNumbers-1.0);
		return Math.sqrt(sqrt);		
	}	
	
	public static double mean() throws Exception {
		meanValue = 0.0;
		for(int i  = 0 ; i < amountNumbers ; ++i) {
			System.out.println(i);
			meanValue+=numbers.getNode(i);
		}
		meanValue/=amountNumbers;
		return meanValue;	
	}
	
	
	public static void main(String args[]) throws Exception {
		try{
			BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		    String strCurrentLine;
		    amountNumbers = 0;
		    while ((strCurrentLine = br.readLine()) != null){
		    	numbers.add(Double.parseDouble(strCurrentLine));
		    	amountNumbers++;
		    }
		    System.out.println("The value of mean is "+ mean());
		    System.out.println("The value of standard deviation is "+ standardDeviation());
		    
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		
	}
	
	
	

	

}
