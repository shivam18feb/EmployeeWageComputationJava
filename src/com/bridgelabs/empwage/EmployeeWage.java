package com.bridgelabs.empwage;

public class EmployeeWage {
	static final int IS_PRESENT = 1;
    int WAGE_PER_HR = 20;
    int WORKING_DAYS = 20;
    static final int FULL_TIME_HR = 16;
    static final int PART_TIME_HR = 8;
    static final int FULL_TIME = 1;

    int dailyEmpWage = 0;
    int monthlyWage = 0;
    int totalHr = 0;
    int totalAttendance = 0;
	int companyHr;

    public boolean checkIsPresent(double empCheck){
        if(empCheck == IS_PRESENT){
            return true;
        }
        else{
            return false;
        }
    }
    public int calcDailyEmpWage(int empType){
        
        switch(empType){
            case  FULL_TIME :
                totalHr += FULL_TIME_HR;
                dailyEmpWage =  WAGE_PER_HR * FULL_TIME_HR;
            break;
            default :
                totalHr += PART_TIME_HR; 
                dailyEmpWage = WAGE_PER_HR * PART_TIME_HR;
        }
        return dailyEmpWage;
    }
    public void calcMonthlyWage(String company, int wagePerHr, int workingDays, int companyHr){
        
        this.WAGE_PER_HR = wagePerHr;
        this.WORKING_DAYS = workingDays;
        this.companyHr = companyHr;
        int dailyWage = 0;
        while(totalAttendance <=WORKING_DAYS && totalHr <=companyHr){
            for(int day=1; day<=WORKING_DAYS; day++){
                int empCheck = (int)(Math.random() * 10) % 2;
                if(checkIsPresent(empCheck)){
                    int empType = (int)(Math.random() * 10) % 2;
                    dailyWage = calcDailyEmpWage(empType);   
                    monthlyWage += dailyWage;
                }
            }
        }
        System.out.println("\nMonthly wage of " + company + "'s Employee : " + monthlyWage);
    }
}
