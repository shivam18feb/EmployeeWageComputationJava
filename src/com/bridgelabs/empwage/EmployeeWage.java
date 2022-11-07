package com.bridgelabs.empwage;

public class EmployeeWage {
	final int IS_PRESENT = 1;
	int WAGE_PER_HRS = 20;
	int FULL_DAY_HRS = 16;
	final int FULL_TIME = 1;
	final int WORKING_DAYS = 20;
	
	public boolean checkIsPresent(double empCheck) {
		if(empCheck == IS_PRESENT) {
			return true;
		}
		else {
			return false;
		}
			
	}
	 public int calcDailyEmpWage(int empType) {
		 int dailyEmpWage = 0;
		 switch (empType) {
		 	case FULL_TIME :
		 		dailyEmpWage =WAGE_PER_HRS * FULL_DAY_HRS ;
			 break;
		 default :
			 dailyEmpWage = dailyEmpWage/2;
			}
		 return dailyEmpWage;
	 }
		 public int calcMonthlyWage() {
			 int monthlyWage = 0;
			 int dailyWage;
			 for(int day=1; day<=WORKING_DAYS;day++) {
				 int empCheck = (int)(Math.random()*10)%2;
				 if(checkIsPresent(empCheck)) {
					 int empType =(int)(Math.random()*10)%2;
					 dailyWage = calcDailyEmpWage(empType);
					 monthlyWage += dailyWage;
				 }
			 }
			 return monthlyWage;
	 }

}
