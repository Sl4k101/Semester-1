
package lab.assignment.pkg10.pkg2;

import java.util.Scanner;

public class BusDriverDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create two BusDriver objects
        BusDriver driver1 = new BusDriver();
        BusDriver driver2 = new BusDriver();

        // Get user input for the first driver g
        System.out.println("Enter details for Driver 1:");
        enterDriverDetails(driver1, input);

        // Get user input for the second driver
        System.out.println("\nEnter details for Driver 2:");
        enterDriverDetails(driver2, input);

        // Display details and monthly salary for both drivers
        displayDriverDetails(driver1);
        displayDriverDetails(driver2);
    }

    private static void enterDriverDetails(BusDriver driver, Scanner input) {
        System.out.print("Enter ID: ");
        driver.setID(input.nextInt());

        System.out.print("Enter Name: ");
        driver.setName(input.next());

        System.out.print("Enter Days Worked: ");
        driver.setDaysWorked(input.nextInt());

        System.out.print("Enter Daily Salary: ");
        driver.setDailySalary(input.nextDouble());
    }

    private static void displayDriverDetails(BusDriver driver) {
        System.out.println("\nDriver Details:");
        System.out.println("ID: " + driver.getID());
        System.out.println("Name: " + driver.getName());
        System.out.println("Days Worked: " + driver.getDaysWorked());
        System.out.println("Daily Salary: $" + driver.getDailySalary());
        System.out.println("Monthly Salary: $" + driver.calcSalary());
    }
}