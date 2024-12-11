import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            computeEmployeeWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        }

        sc.close();
    }

    public static void computeEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        System.out.println("\nCalculating wages for " + companyName + "...");
        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
            totalWorkingDays++;
            int dailyHours = getWorkingHours();
            totalWorkingHours += dailyHours;
            if (totalWorkingHours > maxWorkingHours) {
                totalWorkingHours -= dailyHours;
                break;
            }
            int dailyWage = dailyHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": Worked " + dailyHours + " hours, Earned: " + dailyWage);
        }
        System.out.println("Total Wage for " + companyName + ": " + totalWage);
        System.out.println("Total Days Worked: " + totalWorkingDays + ", Total Hours Worked: " + totalWorkingHours);
    }

    private static int getWorkingHours() {
        int empCheck = (int) (Math.random() * 3);
        switch (empCheck) {
            case 0: // Absent
                return 0;
            case 1: // Part-time
                return 4;
            case 2: // Full-time
                return 8;
            default:
                return 0;
        }
    }
}