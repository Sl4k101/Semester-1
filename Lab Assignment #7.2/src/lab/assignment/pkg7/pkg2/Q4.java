
package lab.assignment.pkg7.pkg2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100]; // Assuming a maximum of 100 scores
        int totalScores = 0;
        int sum = 0;

        // Input loop
        System.out.println("Enter scores (negative number to end input): ");
        int score;
        while (true) {
            score = input.nextInt();
            if (score < 0) {
                break; // End input when a negative number is entered
            }
            scores[totalScores] = score;
            sum += score;
            totalScores++;
        }

        // Calculate the average
        double average = (double) sum / totalScores;

        // Count scores above and below average
        int aboveAverage = 0;
        int belowAverage = 0;

        for (int i = 0; i < totalScores; i++) {
            if (scores[i] >= average) {
                aboveAverage++;
            } else {
                belowAverage++;
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Scores above or equal to the average: " + aboveAverage);
        System.out.println("Scores below the average: " + belowAverage);

        input.close();
    }
}

