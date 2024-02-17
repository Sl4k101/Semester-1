
package lab.assignment.pkg10.pkg2;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two Employee objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // Get user input for the first employee
        System.out.println("Enter details for Employee 1:");
        enterEmployeeDetails(employee1, input);

        // Get user input for the second employee
        System.out.println("\nEnter details for Employee 2:");
        enterEmployeeDetails(employee2, input);

        // Display details and salary for both employees
        displayEmployeeDetails(employee1);
        displayEmployeeDetails(employee2);
    }

    private static void enterEmployeeDetails(Employee employee, Scanner input) {
    System.out.print("Enter Name: ");
    employee.setName(input.nextLine());

    System.out.print("Enter Hours Worked: ");
    employee.setHoursWorked(input.nextInt());
    input.nextLine();  // Consume newline character

    System.out.print("Enter Hourly Rate: ");
    employee.setHourlyRate(input.nextDouble());
    input.nextLine();  // Consume newline character
    }

    private static void displayEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Hourly Rate: $" + employee.getHourlyRate());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
