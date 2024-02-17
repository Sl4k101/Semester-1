
package lab.assignment.pkg7.pkg2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        int[] counts = new int[101];
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100 (end with 0): ");
        int number;

        do {
            number = input.nextInt();

            if (number >= 1 && number <= 100) {
                counts[number]++;
            }
        } while (number != 0);

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                String times = (counts[i] > 1) ? "times" : "time";
                System.out.println(i + " occurs " + counts[i] + " times" + times);
            }
        }
    }
}
