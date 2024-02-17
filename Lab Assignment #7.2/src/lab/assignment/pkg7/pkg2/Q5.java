
package lab.assignment.pkg7.pkg2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // Array to store the input numbers
        int distinctCount = 0;

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();

            if (!isInArray(numbers, distinctCount, number)) {
                numbers[distinctCount] = number;
                distinctCount++;
            }
        }

        System.out.println("The number of distinct numbers is " + distinctCount);
        System.out.print("The distinct numbers are: ");

        for (int i = 0; i < distinctCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // Helper function to check if a number is already in the array
    public static boolean isInArray(int[] arr, int count, int number) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
