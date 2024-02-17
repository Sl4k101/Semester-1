
package lab.assignment.pkg10.pkg2;

    public class Employee {
        
    private String name;
    private int hours_Worked;
    private double hourly_Rate;

    // Constructors
    public Employee() {
    }

    public Employee(String n, int hW, double hR) {
        name = n;
        hours_Worked = hW;
        hourly_Rate = hR;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getHoursWorked() {
        return hours_Worked;
    }

    public void setHoursWorked(int hW) {
        hours_Worked = hW;
    }

    public double getHourlyRate() {
        return hourly_Rate;
    }

    public void setHourlyRate(double hR) {
        hourly_Rate = hR;
    }

    // Method to calculate salary
    public double getSalary() {
        if (hours_Worked <= 40) {
            return hours_Worked * hourly_Rate;
        } else {
            // For overtime, hourly rate is doubled
            return (40 * hourly_Rate) + ((hours_Worked - 40) * (2 * hourly_Rate));
        }
    }
}
