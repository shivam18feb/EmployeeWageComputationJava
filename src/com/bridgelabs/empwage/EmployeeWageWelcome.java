package com.bridgelabs.empwage;

public class EmployeeWageWelcome {
	public static void main (String args[]) {
		
		System.out.println(" Welcome to Employee Wage Computation Program"); // Master Branch  
		EmployeeWage emp = new EmployeeWage();
		int wage = emp.calcMonthlyWage();
		System.out.println("Montly Wage is :" +wage);
		
	}
}