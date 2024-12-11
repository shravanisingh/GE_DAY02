import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();

        System.out.println("Welcome to Employee Wage Computation Program!");
        System.out.print("Enter the number of companies: ");
        int numberOfCompanies = sc.nextInt();

        for (int i = 1; i <= numberOfCompanies; i++) {
            System.out.println("\nEnter details for Company " + i + ":");

            System.out.print("Enter Company Name: ");
            String companyName = sc.next();

            System.out.print("Enter Wage per Hour: ");
            int wagePerHour = sc.nextInt();

            System.out.print("Enter Maximum Working Days per Month: ");
            int maxWorkingDays = sc.nextInt();

            System.out.print("Enter Maximum Working Hours per Month: ");
            int maxWorkingHours = sc.nextInt();

            empWageBuilder.addCompany(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        }

        empWageBuilder.computeWages();
        empWageBuilder.printCompanyWages();

        sc.close();
    }
}