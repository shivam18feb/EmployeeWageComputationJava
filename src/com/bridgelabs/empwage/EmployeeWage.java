package com.bridgelabs.empwage;

public class EmployeeWage {
	int IS_PRESENT = 1;
	int WAGE_PER_HRS = 20;
	int FULL_DAY_HRS = 8;
	
	public boolean checkIsPresent(double empCheck) {
		if(empCheck == IS_PRESENT) {
			return true;
		}
		else {
			return false;
		}
			
	}
	 public int calcDailyEmpWage() {
		 int dailyEmpWage = WAGE_PER_HRS * FULL_DAY_HRS;
		 return dailyEmpWage;
	 }

}
