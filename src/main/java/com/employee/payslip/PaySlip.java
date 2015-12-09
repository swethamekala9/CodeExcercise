package com.employee.payslip;

import java.util.ArrayList;
import java.util.List;

/**
 * @author swetha
 * Reads the Input from the csv file and prints the output on the console 
 *
 */
public class PaySlip
{
	public static void main( String[] args )
    {
    	String csvFile = "C:/devel/EmployeeList.csv";
    	List<Employee> jobs = new ArrayList<Employee>();
    	ReadEmployeeList read = new ReadEmployeeList();
    	read.readCSV(csvFile, jobs);
    	
    	try {
            	for(Employee job: jobs){
            		
            		String fullName = job.getFirstName()+" "+job.getLastName();
            		String payperiod = read.calcPayPeriod(job.getMonth());
	            	int grossIncome =read.calcGrossIncome(job.getAnnualSalary());
	            	int netIncome=(int)(read.calcGrossIncome(job.getAnnualSalary())-read.calcIncomeTax(job.getAnnualSalary()));
	            	int incomeTaxAmount = (int)read.calcIncomeTax(job.getAnnualSalary());
	            	System.out.println("Payslip information for Employee is:");
	            	System.out.println( fullName+","+ payperiod +"," +grossIncome+"," 
	            		 +incomeTaxAmount+","+netIncome+","+read.calcSuper(grossIncome,job.getSuperRate()) );
            	}
           
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
    	
    }
	
	
}
