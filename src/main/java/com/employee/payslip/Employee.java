package com.employee.payslip;

public class Employee {
	String firstName;
	String lastName;
	int annualSalary;
    int superRate;
    String month;
    
    public Employee(String firstName, String lastName, int annualSalary, int superRate, String month){
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
        this.month = month;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getSuperRate() {
		return superRate;
	}

	public void setSuperRate(int superRate) {
		this.superRate = superRate;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	

}
