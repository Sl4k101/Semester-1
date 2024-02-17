/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.assignment.pkg6.pkg1;

import java.util.Scanner;

/**
 *
 * @author sl4k
 */
public class LabAssignment61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1While();
        Q3While();
        Q2While();
        Q4While();
        Q5While();
        Q1DoWhile();
        Q3DoWhile();
        Q2DoWhile();
        Q4DoWhile();
        Q5DoWhile();
        Q1For();
        Q3For();
        Q2For();
        Q4For();
        Q5For();
    }

    public static void Q1While() {
        //5.1 Q2 While loop (original)
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

    public static void Q1DoWhile() {

    }

    public static void Q1For() {

    }

    public static void Q2While() {
        //5.1 Q4 While loop (Original)
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

    public static void Q2DoWhile() {

    }

    public static void Q2For() {

    }

    public static void Q3While() {
        //5.2 Q2 While loop (Original)
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

    public static void Q3DoWhile() {

    }

    public static void Q3For() {

    }

    public static void Q4While() {

    }

    public static void Q4DoWhile() {

    }

    public static void Q4For() {
        //5.2 Q5 For loop (Original)
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

    public static void Q5While() {
        //5.2 Q1 Whileloop (Original)
        int smallestN = 1;
        int largestN = 1;

        // Find the smallest integer n such that n^2 is greater than 12,000
        while (smallestN * smallestN <= 12000) {
            smallestN++;
        }

        System.out.println("The smallest integer n such that n^2 is greater than 12,000 is: " + smallestN);

        // Find the largest integer n such that n^2 is less than 12,000
        while (Math.pow((largestN + 1), 3) < 12000) {
            largestN++;
        }

        System.out.println("The largest integer n such that n^3 is less than 12,000 is: " + largestN);
    }

    public static void Q5DoWhile() {

    }

    public static void Q5For() {

    }

}
