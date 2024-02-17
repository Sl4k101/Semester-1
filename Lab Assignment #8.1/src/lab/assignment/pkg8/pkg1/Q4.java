
package lab.assignment.pkg8.pkg1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 values separated by spaces: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        int minIndex = findMinIndex(numbers);

        System.out.println("The index of the minimum number is " + minIndex);
    }

    public static int findMinIndex(double[] array) {

        double min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}