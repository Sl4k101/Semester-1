/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg9.pkg1;

    import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Declare an integer array with the specified size
        int[] numbers = new int[size];

        // Ask the user to enter integer values into the array
        System.out.print("Enter " + size + " integer values: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the contents of the array using an enhanced for loop
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Calculate and display the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of array elements: " + sum);

        // Calculate and display the average of array elements
        double average = (double) sum / size;
        System.out.println("Average of array elements: " + average);

        // Find and display the highest value in the array
        int highest = numbers[0];
        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
        }
        System.out.println("Highest value in the array: " + highest);

        // Find and display the lowest value in the array
        int lowest = numbers[0];
        for (int number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
        }
        System.out.println("Lowest value in the array: " + lowest);
    }
}
