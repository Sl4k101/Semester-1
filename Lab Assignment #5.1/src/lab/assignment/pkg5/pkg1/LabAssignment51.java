//lab assignment 5.1 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 23 2023)
package lab.assignment.pkg5.pkg1;

import java.util.Scanner;

public class LabAssignment51 {

    public static void main(String[] args) {
        Q1();
        Q3();
        Q2();
        Q4();
        Q5();
    }

    public static void Q1() {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int countPositive = 0;
        int countNegative = 0;
        int num = 1;
        System.out.println("Enter integers (0 to stop):");

        while (num != 0) {
            num = input.nextInt();

            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;
            }

            total += num;
        }

        if (countPositive + countNegative == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) total / (countPositive + countNegative);
            System.out.println("Count of positive numbers: " + countPositive);
            System.out.println("Count of negative numbers: " + countNegative);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        }
    }

    public static void Q2() {
        // Constants
        final double conversionRate = 1.609;

        // Header
        System.out.println("Miles   Kilometers");

        // Initialize the mile counter
        int miles = 1;

        // Display the table using a while loop
        while (miles <= 10) {
            double kilometers = miles * conversionRate;
            System.out.printf("%-7d %.3f\n", miles, kilometers);
            miles++;
        }
    }

    public static void Q3() {
        double initialTuition = 10000.0; // Initial tuition for the first year
        double annualIncreaseRate = 0.05; // Annual tuition increase rate (5%)

        double tuition = initialTuition;
        double totalCost = 0;
        int year = 1;

        // Calculate tuition for the next 10 years using a while loop
        while (year <= 10) {
            totalCost += tuition;
            tuition += tuition * annualIncreaseRate; // Calculate tuition for the next year
            if (year == 10) {
                System.out.println("Year " + year + ": $" + tuition);
            }
            year++;
        }

        // Calculate the total cost of four years' worth of tuition after the tenth year
        double fourYearsTotalCost = 0;
        int yearsAfterTenthYear = 1;

        while (yearsAfterTenthYear <= 4) {
            tuition += (tuition * annualIncreaseRate); // Calculate tuition for the next year
            fourYearsTotalCost += tuition;
            yearsAfterTenthYear++;
        }

        System.out.println("Total cost of four years' worth of tuition after the tenth year: $" + fourYearsTotalCost);
    }

    public static void Q4() {
        int count = 0;
        int number = 100;

        while (number <= 200) {
            if ((number % 5 == 0) ^ (number % 6 == 0)) {
                System.out.print(number + " ");
                count++;

                // Print 10 numbers per line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            number++;
        }
    }

    public static void Q5() {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows (1 to 15): ");
        int numRows = input.nextInt();
        input.close();

        if (numRows >= 1 && numRows <= 15) {
            int currentRow = 1;

            while (currentRow <= numRows) {
                // Print leading spaces
                int spaces = numRows - currentRow;
                while (spaces > 0) {
                    System.out.print("  "); // Two spaces for formatting
                    spaces--;
                }

                // Print increasing numbers
                int currentNum = 1;
                while (currentNum < currentRow) {
                    System.out.print(currentNum + " ");
                    currentNum++;
                }

                // Print decreasing numbers
                while (currentNum >= 1) {
                    System.out.print(currentNum + " ");
                    currentNum--;
                }

                // Move to the next row
                System.out.println();
                currentRow++;
            }
        } else {
            System.out.println("Please enter a valid number between 1 and 15.");
        }
    }
}
