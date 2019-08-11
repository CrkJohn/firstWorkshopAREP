package edu.escuelaing.arem.firstWorkshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeanAndStandardDeviation{
	
	private static final String FILENAME = "input.in";
	public static ArrayList<Double> numbers;
	public static double amountNumbers , meanValue ;
	
	public static double standardDeviation() {
		double stDeviationValue = 0.0;
		for(double n : numbers) {
			stDeviationValue += Math.pow(n-meanValue, 2);
		}
		double sqrt = stDeviationValue/(amountNumbers-1.0);
		return Math.sqrt(sqrt);		
	}	
	
	public static double mean() {
		meanValue = 0.0;
		for(double n : numbers) {
			meanValue+=n;
		}
		meanValue/=amountNumbers;
		return meanValue;	
	}
	
	public static void main(String args[]) {
		try{
			BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		    String strCurrentLine;
		    numbers = new ArrayList<Double>();
		    while ((strCurrentLine = br.readLine()) != null) {
		    	numbers.add(Double.parseDouble(strCurrentLine));
		    }
		    amountNumbers = numbers.size();
		    System.out.println("The value of mean is "+ mean());
		    System.out.println("The value of standard deviation is "+ standardDeviation());
		    
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		
	}
	
	
	

	

}
