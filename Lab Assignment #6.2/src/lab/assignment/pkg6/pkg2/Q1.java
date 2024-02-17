/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.assignment.pkg6.pkg2;

import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user to enter an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        // Compute and display the sum of the digits
        int sum = sumDigits(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumDigits(long n) {
        int sum = 0;

        // Use a loop to repeatedly extract and sum the digits
        while (n != 0) {
            int digit = (int)(n % 10); // Extract the last digit
            sum += digit; // Add the digit to the sum
            n /= 10; // Remove the last digit
        }

        return sum;
    }
}



