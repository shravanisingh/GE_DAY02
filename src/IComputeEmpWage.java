public interface IComputeEmpWage {
    void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWages();
    void printCompanyWages();
    int getTotalWageByCompany(String companyName);  // Method to get total wage by company
}