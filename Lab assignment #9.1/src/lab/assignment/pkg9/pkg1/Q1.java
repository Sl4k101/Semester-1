
package lab.assignment.pkg9.pkg1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int i = input.nextInt();
        int[] values = new int[i];
            System.out.print("Enter values: ");
        for (int j = 0; j < i; j++) {
            values[j] = input.nextInt();
        }

        if (isConsecutiveFour(values)) {
            System.out.println("Consecutive four");
        } else {
            System.out.println("Not consecutive four");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                count++;
            } 
            else {
                count = 0;
            }
            if (count == 3) {
                return true; // Four consecutive equal values found because 3 equal connections.
            }
        }
        return false;
    }
}
