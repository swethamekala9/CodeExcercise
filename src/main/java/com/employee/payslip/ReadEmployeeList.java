package com.employee.payslip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadEmployeeList {
	
	public  void readCSV(String csvFile, List<Employee> jobs){
	     
		BufferedReader br = null;
	    String line = "";
	    String cvsSplitBy = ",";
	    
	        
	    try {
	    	
	    		br = new BufferedReader(new FileReader(csvFile));
	    		while ((line = br.readLine()) != null) {
	    			
	    			String[] printInputs = line.split(cvsSplitBy);
	    			jobs.add(new Employee(printInputs[0],printInputs[1],Integer.parseInt(printInputs[2]),Integer.parseInt(printInputs[3]),printInputs[4])); 
	    					
	    		}// End of while
	    
	     }
	    catch (FileNotFoundException e) {
	    	 e.printStackTrace();
	     }
	    catch (IOException e) {
	    	 e.printStackTrace();
	     }
	    finally {
	    	 	if (br != null) {
	    	 		try {
	    			 		br.close();
	    	 		} 
	    	 		catch (IOException e) {
	    	 				e.printStackTrace();
	    	 		}
	    	 	}
	     }

	    }
	
	/**
	 * 
	 * Calculates  the Super for that particular Month 
	 *
	 */
	public int calcSuper(int grossIncome,int superRate) {
		
		int superAmount = Math.round((grossIncome * superRate)/100);
		return superAmount;
	}
	
	/**
	 * 
	 * Calculates  the Gross Income for that particular Month 
	 *
	 */
	public int calcGrossIncome(int annualSalary) {
		
		int grossIncome = Math.round(annualSalary/12);
		return grossIncome;
	}
	
	
	/**
	 * 
	 * Calculates  the IncomeTax for that particular Month 
	 *
	 */
	public double calcIncomeTax(int annualSalary) {
		double incomeTax;
		if (annualSalary > 0 && annualSalary<= 18200)
		{
			incomeTax = 0;
		}
		else if (annualSalary > 18200 && annualSalary<= 37000 ) {
			
			incomeTax = (int)( (0.19 * (annualSalary - 18200)))/12;
			
		}
		else if (annualSalary > 37000 && annualSalary<= 80000) {
			
			incomeTax = Math.round((3572+(double)(0.325 * (annualSalary - 37000)))/12);
		}
		else if (annualSalary > 80000 && annualSalary<= 180000) {
			
			incomeTax =  Math.round((17547+(double)(0.37 * (annualSalary - 80000)))/12);
		}
		else{
			incomeTax =  Math.round((54547+(double)(0.45 * (annualSalary - 180000)))/12);
		}
		
		
		return incomeTax;
	}
	
	
	
	
	
	/**
	 * 
	 * Calculates  the Pay Period for that particular Month 
	 *
	 */
	public  String calcPayPeriod(String period) {

		String payPeriod = "";
		  		
		if(period.equalsIgnoreCase("january"))
		{
			payPeriod = "01 January - 31 January";
		}
		else if (period.equalsIgnoreCase("February")) {
			
			payPeriod = "01 February - 28 February";
		}
		else if (period.equalsIgnoreCase("March")) {
			
			payPeriod = "01 March - 31 March";
		}
		else if (period.equalsIgnoreCase("April")) {
			
			payPeriod = "01 April - 30 April";
		}
		else if (period.equalsIgnoreCase("May")) {
			
			payPeriod = "01 May - 31 May";
		}
		else if (period.equalsIgnoreCase("June")) {
			
			payPeriod = "01 June - 30 June";
		}
		else if (period.equalsIgnoreCase("July")) {
			
			payPeriod = "01 July - 31 July";
		}
		else if (period.equalsIgnoreCase("August")) {
			
			payPeriod = "01 August - 31 August";
		}
		else if (period.equalsIgnoreCase("September")) {
			
			payPeriod = "01 September - 30 September";
		}
		else if (period.equalsIgnoreCase("October")) {
			
			payPeriod = "01 October - 31 October";
		}
		else if (period.equalsIgnoreCase("November")) {
			
			payPeriod = "01 November - 30 November";
		}
		else if (period.equalsIgnoreCase("December")) {
			
			payPeriod = "01 December - 31 December";
		}
		
		return payPeriod;
    }

}
