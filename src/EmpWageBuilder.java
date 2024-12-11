public class EmpWageBuilder {
    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    public EmpWageBuilder(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
    }

    public void computeEmployeeWage() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

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

    public int getTotalWage() {
        return totalWage;
    }

    private int getWorkingHours() {
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
    @Override
    public String toString() {
        return "Company: " + companyName + ", Total Wage: " + totalWage;
    }
}