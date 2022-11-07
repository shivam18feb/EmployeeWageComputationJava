package com.bridgelabs.empwage;

public class EmployeeWageWelcome {
	public static void main (String args[]) {
		
		System.out.println(" Welcome to Employee Wage Computation Program"); // Master Branch  
		EmployeeWage emp = new EmployeeWage();
		int empCheck = (int)(Math.random()*10) % 2;
		int empType = (int) (Math.random()*10) % 2;
		
		if(emp.checkIsPresent(empCheck)) {
			emp.calcDailyEmpWage(empType);
			}
		else {
		System.out.println("Its Absent");
		
		}

	}
}