package lab.assignment.pkg7.pkg1;

import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
        // Prompt the user to enter n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Display the n-by-n matrix
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Generate a random 0 or 1
                int randomValue = (int) (Math.random() * 2);
                System.out.print(randomValue + " ");
            }
            System.out.println();
        }
    }
}
