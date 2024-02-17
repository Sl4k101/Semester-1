
package finalexampractical;

public class Employee {
    // Class Attributes
    private String name;        // The name of the employee
    private int hours_Worked;   // The hours worked by the employee
    private double hourly_Rate; // The hourly rate of the employee

    // No-arg Constructor
    public Employee() {
        // Initialize with default values
        this.name = "";
        this.hours_Worked = 0;
        this.hourly_Rate = 0.0;
    }

    // Regular Constructor
    public Employee(String name, int hours_Worked, double hourly_Rate) {
        this.name = name;
        this.hours_Worked = hours_Worked;
        this.hourly_Rate = hourly_Rate;
    }

    // Accessor Methods (Getters)
    public String getName() {
        return name;
    }

    public int getHours_Worked() {
        return hours_Worked;
    }

    public double getHourly_Rate() {
        return hourly_Rate;
    }

    // Mutator Methods (Setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setHours_Worked(int hours_Worked) {
        this.hours_Worked = hours_Worked;
    }

    public void setHourly_Rate(double hourly_Rate) {
        this.hourly_Rate = hourly_Rate;
    }

    // getSalary method
    public double getSalary() {
        if (hours_Worked <= 40) {
            return hourly_Rate * hours_Worked;
        } else {
            return (40 * hourly_Rate) + ((hours_Worked - 40) * (hourly_Rate * 2));
        }
    }

    // toString method
    public String toString() {
        return "Employee " +
                "name = " + name +
                ", hours Worked = " + hours_Worked +
                ", hourly Rate = " + hourly_Rate +
                ", salary = " + getSalary() +
                '}';
    }
}

