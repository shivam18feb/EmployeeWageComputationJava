package com.bridgelabs.empwage;

public class EmployeeWageWelcome {
	public static void main(String[] args){
	    
        EmployeeWage emp = new EmployeeWage();
        System.out.println("Monthly wage :" + emp.calcMonthlyWage());
    }
}