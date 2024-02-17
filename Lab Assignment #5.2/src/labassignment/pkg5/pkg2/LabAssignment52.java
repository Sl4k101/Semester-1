/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labassignment.pkg5.pkg2;

import java.util.Scanner;

public class LabAssignment52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1Small();
        Q1Large();
        Q2();
        Q3PatternA();
        Q3PatternB();
        Q3PatternC();
        Q3PatternD();
        Q4();
        Q5();
    }

    public static void Q1Small() {
        int smallestN = 1;

        // Find the smallest integer n such that n^2 is greater than 12,000
        while (smallestN * smallestN <= 12000) {
            smallestN++;
        }

        System.out.println("The smallest integer n such that n^2 is greater than 12,000 is: " + smallestN);
    }

    public static void Q1Large() {
        int largestN = 1;

        // Find the largest integer n such that n^2 is less than 12,000
        while (Math.pow((largestN + 1), 3) < 12000) {
            largestN++;
        }

        System.out.println("The largest integer n such that n^3 is less than 12,000 is: " + largestN);
    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The smallest factors of " + number + " are: ");

        for (int factor = 2; factor <= number; factor++) {
            while (number % factor == 0) {
                System.out.print(factor + ", ");
                number /= factor;
            }
        }
    }

    public static void Q3PatternA() {
        System.out.println("\nPattern A:"); // Header

        int n = 6; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void Q3PatternB() {
        System.out.println("\nPattern B:"); // Header

        int n = 6; // Number of rows

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void Q3PatternC() {
        System.out.println("\nPattern C:"); // Header

        int n = 6; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for formatting
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print("  ");
            }

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to the next line
        }
    }

    public static void Q3PatternD() {
        System.out.println("\nPattern D:"); // Header

        int n = 6; // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print leading spaces to align numbers to the left
            for (int spaces = n - i; spaces > 0; spaces--) {
                System.out.print("  ");
            }

            // Print numbers in reverse order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Move to the next line
        }
    }

    public static void Q4() {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows (1 to 15): ");
        int numRows = input.nextInt();

        if (numRows >= 1 && numRows <= 15) {
            for (int currentRow = 1; currentRow <= numRows; currentRow++) {
                // Print leading spaces
                for (int spaces = numRows - currentRow; spaces > 0; spaces--) {
                    System.out.print("  "); // Two spaces for formatting
                }

                // Print increasing numbers
                for (int currentNum = 1; currentNum < currentRow; currentNum++) {
                    System.out.print(currentNum + " ");
                }

                // Print decreasing numbers
                for (int currentNum = currentRow; currentNum >= 1; currentNum--) {
                    System.out.print(currentNum + " ");
                }

                // Move to the next row
                System.out.println();
            }
        } else {
            System.out.println("Please enter a valid number between 1 and 15.");
        }
    }

    public static void Q5() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the characters of the original string in reverse order
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}
