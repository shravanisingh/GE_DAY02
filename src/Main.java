public class Main {
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;
    private static final int wagePerHr = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program!");
        int empHrs = 0, empWagePerMonth = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;
        while (totalEmployeeHrs <= 100 && totalWorkingDays < 20) {
            totalWorkingDays++;
            int employeeType = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeType) {
                case isFullTime:{
                    System.out.println("Employee is doing FULL-TIME");
                    empHrs = 8;
                }
                case isPartTime: {
                    System.out.println("Employee is doing PART-TIME");
                    empHrs = 4;
                }
                default:{
                    System.out.println("Employee is ABSENT");
                    empHrs = 0;
                }
            }
            totalEmployeeHrs += empHrs;
            int empWagePerDay = empHrs * wagePerHr;
            empWagePerMonth += empWagePerDay;
            System.out.println("Employee's Wage per Day is: " + empWagePerDay);
            System.out.println("Employee's Current Total Working Days are: " + totalWorkingDays);
            System.out.println("Employee's Current Total Working Hours are: " + totalEmployeeHrs);
            System.out.println("Employee's Current Total Wage is: " + empWagePerMonth);
        }
        System.out.println("Employee's wage per Month is: " + empWagePerMonth);
    }
}