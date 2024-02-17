
package lab.assignment.pkg8.pkg1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("I for integer, D for double: ");
            char identifier = input.next().charAt(0);

            if (identifier == 'D') {
                double[] array = new double[10];
                System.out.print("Enter 10 values separated by spaces: ");
                for (int i = 0; i < 10; i++) {
                    array[i] = input.nextDouble();
                }
                System.out.println("Average is: " + average(array));
                break;

            } else if (identifier == 'I') {
                int[] array = new int[10];
                System.out.print("Enter values separated by spaces: ");
                for (int i = 0; i < 10; i++) {
                    array[i] = input.nextInt();
                }
                System.out.println("Average is: " + average(array));
                break;

            } else {
                System.out.println("Invalid identifier. Please enter 'I' for integer or 'D' for double.");
            }
        }
    }

    public static double average(double[] array) {
        double average = 0;
        for (int i = 0; i < 10; i++) {
            average += array[i];
        }
        return average / 10;
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i = 0; i < 10; i++) {
            average += array[i];
        }
        return average / 10;
    }
}