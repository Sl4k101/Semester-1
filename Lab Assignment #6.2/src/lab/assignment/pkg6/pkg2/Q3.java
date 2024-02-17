/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg6.pkg2;

import java.util.Scanner;

/**
 *
 * @author sl4k
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Reversed integer: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add extracted digit to reverse
            number /= 10; // Remove the last digit
        }
        return reversed;
    }
}
