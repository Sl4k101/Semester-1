/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg9.pkg1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Call the sort method to sort the characters in the string
        String sortedString = sort(inputString);

        // Display the sorted string
        System.out.println("Sorted string: " + sortedString);
    }

    public static String sort(String s) {
        char[] charArray = s.toCharArray();

        // Implement a simple sorting algorithm (e.g., bubble sort)
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        return sortedString;
    }
}
