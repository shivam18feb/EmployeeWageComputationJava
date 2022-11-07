package com.bridgelabs.empwage;

public class EmployeeWage {
	final int IS_PRESENT = 1;
	final int FULL_TIME = 1;
	int WAGE_PER_HRS;
	int FULL_DAY_HRS = 16;
	int TOTAL_ATTENDANCE = 0;
	int TOTAL_HRS = 0;
	int WORKING_DAYS;
	
	  public EmployeeWage(int workingDays , int wagePerHr){ 
	         this.WORKING_DAYS = workingDays; 
	         this.WAGE_PER_HRS = wagePerHr; 
	     } 
	     public boolean checkIsPresent(int empCheck){ 
	         if(empCheck == IS_PRESENT){  
	             TOTAL_ATTENDANCE++; 
	             return true; 
	         } 
	         else{  
	             return false; 
	         } 
	     } 
	     public int calcDailyEmpWage(int empType){ 
	  
	         int dailyEmpWage = 0; 
	         switch(empType){ 
	             case  FULL_TIME : 
	                 TOTAL_HRS += FULL_DAY_HRS; 
	                 dailyEmpWage =  WAGE_PER_HRS * FULL_DAY_HRS; 
	             break; 
	             default : 
	                 TOTAL_HRS += FULL_DAY_HRS / 2;  
	                 dailyEmpWage = dailyEmpWage / 2; 
	         } 
	         return dailyEmpWage; 
	     } 
	     public int calcMonthlyWage(){ 
	  
	         int monthlyWage = 0; 
	         int dailyWage; 
	      
	         while(TOTAL_ATTENDANCE <=20 && TOTAL_HRS <=100){ 
	             for(int day=1; day<=WORKING_DAYS; day++){ 
	                 int empCheck = (int)(Math.random() * 10) % 2; 
	                 if(checkIsPresent(empCheck)){ 
	                     int empType = (int)(Math.random() * 10) % 2; 
	                     dailyWage = calcDailyEmpWage(empType);    
	                     monthlyWage += dailyWage; 
	                 } 
	             } 
	         } 
	         return monthlyWage; 
	     }
}
