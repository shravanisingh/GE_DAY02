public class Main {
    public static void main(String[] args) {
        boolean present = Math.random()>0.5;
        int wagePerHr = 20;
        int empHrs, empWage;
        if(present){
            System.out.println("Employee is PRESENT");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is ABSENT");
            empHrs = 0;
        }
        empWage = empHrs * wagePerHr;
        System.out.println("Employee's Hours are: " + empHrs);
        System.out.println("Employee's Wage is: " + empWage);
    }
}