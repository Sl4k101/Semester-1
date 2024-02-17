
package lab.assignment.pkg7.pkg2;

import java.util.Scanner;

public class Q2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            int[] original = new int[10];
            int[] reversed = new int[10];
    
            // Read 10 integers
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                original[i] = input.nextInt();
            }
    
            // Reverse the order
            for (int i = 0; i < 10; i++) {
                reversed[i] = original[9 - i];
            }
    
            // Display the reversed numbers
            System.out.println("Reversed order:");
            for (int i = 0; i < 10; i++) {
                System.out.print(reversed[i] + " ");
            }
        }
    }
