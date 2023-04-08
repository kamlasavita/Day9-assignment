package LFP252_BridgelabzAssignments;

public class EmpWage7Day9 {
    public static int Total_Hours = 100;
    public static int Days = 20, Part_time = 8;
    public static int Wage_per_Hour = 20;
    public static int Full_day_Hour = 8;
    public static int Total_wage = 0;
    public static void main(String[] args) {
         System.out.println("Welcome to Employee wage computation");
         int status = (int) (Math.random() * 2);
         if (status == 0) {
             System.out.println("employee is absent");
         }else if (status  == 1) {
             System.out.println("employee is present");
             new EmpWage7Day9();
         }
    }
    public static void EmpWage7Day9() {
        while (Days > 0 && Total_Hours > 0) {
            int status = (int) (Math.random() * 3);
            if (Total_Hours < 8 && status != 0) {
                System.out.println("remaining Hours " + Days);
                Total_Hours += Wage_per_Hour * Total_Hours;
                System.out.println(Total_wage);
                break;
            }
            switch (status) {
                case 0: {
                    System.out.println("employee is absent");
                    break;
                }
                case 1: {
                    System.out.println("employee is present");
                    Total_wage += Full_day_Hour * Wage_per_Hour;
                    Total_Hours -= Full_day_Hour;
                    break;
                }
                default: {
                    System.out.println("Part time");
                    Total_wage += Wage_per_Hour * Part_time;
                    Total_Hours -= Full_day_Hour;
                    break;
                }
            }
            Days--;
            System.out.println("remaining Hours  " + Days);
            System.out.println(Total_wage);
        }
    }
}
