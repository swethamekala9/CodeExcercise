package com.employee.payslip;

import java.io.BufferedReader;
import java.io.FileReader;



import junit.framework.TestCase;




public class PaySlipTest extends TestCase {
	
	PaySlip testObject=new PaySlip();
	ReadEmployeeList test = new ReadEmployeeList();
	
	public void testCreatePaySlipTestObject() throws Exception {
		
		assertNotNull(testObject);
	}
	
	public void testCreateReadEmployeeListTestObject() throws Exception {
		
		assertNotNull(test);
	}
	
	public void testCreateReadEmployeeListTestObject_readcsv() throws Exception {
		BufferedReader br = null;
	     
	     String cvsSplitBy = ",";
		
		try {
		    
		      br = new BufferedReader(new FileReader("C:/devel/EmployeeList.csv"));
		      String[] printInputs = br.readLine().split(cvsSplitBy);
			  assertEquals("David",printInputs[0] );
			  assertEquals("Rudd",printInputs[1] );
			  assertEquals(60050,Integer.parseInt(printInputs[2]) );
			  assertEquals(9,Integer.parseInt(printInputs[3]) );
			  assertEquals("March",Integer.parseInt(printInputs[4]) );
		     }
		     catch(Exception e)
		     {
		    	 
		     }
	}
	
	public void testSimplePaySlipMethod_calcGrossIncome() throws Exception {
		
		assertEquals(5004,test.calcGrossIncome(60050));
	}
	
	public void testSimplePaySlipMethod_calcPayPeriod() throws Exception {
		
		assertEquals("01 March - 31 March",test.calcPayPeriod("March"));
	}
	
	public void testSimplePaySlipMethod_calcIncomeTax() throws Exception {
		
		assertEquals(922.0,test.calcIncomeTax(60050));
	}
	
	public void testSimplePaySlipMethod_calcnetIncome() throws Exception {
		
		assertEquals(4082.0,test.calcGrossIncome(60050)-test.calcIncomeTax(60050));
	}
	public void testSimplePaySlipMethod_calcSuper() throws Exception {
		
		assertEquals(450,test.calcSuper(5004, 9));
	}
	
	
		
}
