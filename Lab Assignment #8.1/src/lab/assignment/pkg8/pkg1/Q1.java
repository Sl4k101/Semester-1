
package lab.assignment.pkg8.pkg1;

public class Q1 {
    public static void main(String[] args) {
        int[] counts = new int[10]; // Array to store counts for digits 0-9

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int randomDigit = (int) (Math.random() * 10); // Generates a random number from 0 to 9
            counts[randomDigit]++; // Increment the count for the generated digit
        }

        // Display the counts for each number
        for (int i = 0; i < 10; i++) {
            System.out.println("Count of " + i + "s: " + counts[i]);
        }
    }
}