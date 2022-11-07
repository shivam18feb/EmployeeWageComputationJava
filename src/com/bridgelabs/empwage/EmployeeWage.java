package com.bridgelabs.empwage;

public class EmployeeWage {
	final int IS_PRESENT = 1;
	int WAGE_PER_HRS = 20;
	int FULL_DAY_HRS = 16;
	final int FULL_TIME = 1;
	
	public boolean checkIsPresent(double empCheck) {
		if(empCheck == IS_PRESENT) {
			return true;
		}
		else {
			return false;
		}
			
	}
	 public void calcDailyEmpWage(int empType) {
		 int dailyEmpWage = WAGE_PER_HRS * FULL_DAY_HRS;
		 switch (empType) {
		 	case FULL_TIME :
		 		System.out.println("Emp Type : Full time");
		 		System.out.println("Daily Emp Wage : "+dailyEmpWage);
			 break;
		 default :
			 System.out.println("Emp Type : Part Time");
			 System.out.println("Daily Emp Wage : "+(dailyEmpWage/2));
			 
		 }	
	 }

}
