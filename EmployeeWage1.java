package com.assingment;

public class EmployeeWage1 {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    final int EMP_RATE_PER_HOUR = 20;
    final int NUM_OF_WORKING_DAYS = 20;
    final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        EmployeeWage empWageBuilder = new EmployeeWage();
        empWageBuilder.computeEmpWage();
    }

    public void computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int attendance = (int) (Math.random() * 10) % 3;
            switch (attendance) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " Hours: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
