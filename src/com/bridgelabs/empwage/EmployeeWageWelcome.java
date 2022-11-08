package com.bridgelabs.empwage;

public class EmployeeWageWelcome {
	public static void main(String[] args){
		 	EmployeeWage company1 = new EmployeeWage();
	        company1.calcMonthlyWage("Genpact", 250, 60, 160);
	        EmployeeWage company2 = new EmployeeWage();
	        company2.calcMonthlyWage("Infosys", 50, 25, 170);
	        EmployeeWage company3 = new EmployeeWage();
	        company3.calcMonthlyWage("tata", 200, 15, 120);
    }
}