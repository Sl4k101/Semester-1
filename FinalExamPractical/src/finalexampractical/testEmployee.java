
package finalexampractical;

import java.util.Scanner;

public class testEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[2]; // Create an array of two Employees

        // Getting user input for the first employee
    System.out.println("Enter details for the first employee:");
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Hours Worked: ");
    int hours = Integer.parseInt(scanner.nextLine());
    System.out.print("Hourly Rate: ");
    double rate = Double.parseDouble(scanner.nextLine());

        // Create the first Employee using the regular constructor
        employees[0] = new Employee(name, hours, rate);

        // Getting user input for the second employee
       System.out.println("Enter details for the second employee:");
    employees[1] = new Employee(); // Create the second Employee using the no-arg constructor

    System.out.print("Name: ");
    name = scanner.nextLine();
    employees[1].setName(name);

    System.out.print("Hours Worked: ");
    hours = Integer.parseInt(scanner.nextLine());
    employees[1].setHours_Worked(hours);

    System.out.print("Hourly Rate: ");
    rate = Double.parseDouble(scanner.nextLine());
    employees[1].setHourly_Rate(rate);

    // Calling richEmployee method
    richEmployee(employees[0], employees[1]);

    // Display the details of both employees
    System.out.println("Details of both employees:");
    System.out.println(employees[0]);
    System.out.println(employees[1]);
    }

    public static void richEmployee(Employee emp1, Employee emp2) {
        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println(emp1.getName() + " is the richer employee with a salary of " + emp1.getSalary());
        } else if (emp2.getSalary() > emp1.getSalary()) {
            System.out.println(emp2.getName() + " is the richer employee with a salary of " + emp2.getSalary());
        } else {
            System.out.println("Both employees have the same salary.");
        }
    }
}

