package com.bridgelabs.empwage;

public class EmployeeWage {
	int IS_PRESENT = 1;
	int WAGE_PER_HRS = 20;
	int FULL_DAY_HRS = 16;
	int FULL_TIME = 1;
	
	public boolean checkIsPresent(double empCheck) {
		if(empCheck == IS_PRESENT) {
			return true;
		}
		else {
			return false;
		}
			
	}
	 public int calcDailyEmpWage(double empType) {
		 int dailyEmpWage = WAGE_PER_HRS * FULL_DAY_HRS;
		 if (empType == FULL_TIME) {
			 System.out.println("Emp Type : Full time");
			 System.out.println("Daily Emp Wage : "+dailyEmpWage);
		 }
		 else {
			 System.out.println("Emp Type : Part Time");
			 System.out.println("Daily Emp Wage : "+(dailyEmpWage/2));
			 
		 }
		 return dailyEmpWage;
	 }

}
