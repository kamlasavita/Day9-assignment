package com.assingment;

public class EmployeeWage {
  static final int IS_PART_TIME = 1;
  static final int IS_FULL_TIME = 2;
  public static void main(String[] args) {
      int empRatePerHour = 20;
      int numOfWorkingDays = 20;
      int maxHourPerManth = 100;
      String company = "ABC";
      int totalEmpWage = computeEmpWage(company, empRatePerHour, numOfWorkingDays, maxHourPerManth);
      System.out.println("Total Employee Wage for " + company + ": " + totalEmpWage);

      // Computer employee wage for company 1
      int empRateHour1 = 25;
      int numOfWorkingDay1 = 22;
      int maxHoursPerMonth1 = 120;
      String company1 = "XYZ";
      int totalEmpWage1 = computeEmpWage(company1, empRateHour1, numOfWorkingDay1, maxHoursPerMonth1);
      System.out.println("Total Employee wage for " + company1 + ": " + totalEmpWage1);
  }
    private static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerManth) {
      int empHrs = 0;
      int totalEmpHrs = 0;
      int totalWorkingDays = 0;
      while (totalEmpHrs < maxHourPerManth && totalWorkingDays < numOfWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Employee Wage for " + company + ": " + totalEmpWage);
        return totalEmpWage;
    }
}
