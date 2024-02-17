package lab.assignment.pkg7.pkg2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];

        // Prompt the user to enter the scores
        System.out.print("Enter " + numStudents + " scores seperated by spaces: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Find the best score
        int bestScore = findBestScore(scores);

        // Assign and display grades
        for (int i = 0; i < numStudents; i++) {
            char grade = assignGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }

    public static int findBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }

    public static char assignGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else if (score >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}