
package lab.assignment.pkg8.pkg1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 values separated by spaces: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double min = findMin(numbers);

        System.out.println("The minimum number is " + min);
    }

    public static double findMin(double[] array) {

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}