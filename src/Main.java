public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        double employeeCheck = Math.random();
        int wagePerHr = 20;
        int empHrs, empWage;
        if (employeeCheck > 0.6) {
            System.out.println("Employee is doing FULL-TIME");
            empHrs = 8;
        } else if (employeeCheck > 0.3) {
            System.out.println("Employee is doing PART-TIME");
            empHrs = 4;
        } else {
            System.out.println("Employee is ABSENT");
            empHrs = 0;
        }
        empWage = empHrs * wagePerHr;
        System.out.println("Employee's Hours are: " + empHrs);
        System.out.println("Employee's Wage is: " + empWage);
    }
}