
package lab.assignment.pkg10.pkg2;

public class BusDriver {
    private int ID;
    private String name;
    private int days_Worked;
    private double daily_Salary;

    // Constructors
    public BusDriver() {
    }

    public BusDriver(int id, String n, int dW, double dS) {
        ID = id;
        name = n;
        days_Worked = dW;
        daily_Salary = dS;
    }

    // Getter and Setter Methods
    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getDaysWorked() {
        return days_Worked;
    }

    public void setDaysWorked(int dw) {
        days_Worked = dw;
    }

    public double getDailySalary() {
        return daily_Salary;
    }

    public void setDailySalary(double ds) {
        daily_Salary = ds;
    }

    // Method to calculate monthly salary
    public double calcSalary() {
        return days_Worked * daily_Salary;
    }
}
