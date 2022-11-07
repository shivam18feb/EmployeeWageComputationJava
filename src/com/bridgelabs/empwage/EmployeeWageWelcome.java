package com.bridgelabs.empwage;

public class EmployeeWageWelcome {
	public static void main (String args[]) {
		
		System.out.println(" Welcome to Employee Wage Computation Program"); // Master Branch  
		EmployeeWage emp = new EmployeeWage();
		double empCheck = Math.floor(Math.random()*10) % 2;
		emp.checkIsPresent(empCheck);
		
	}

}
