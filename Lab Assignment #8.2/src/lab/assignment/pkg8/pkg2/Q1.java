
package lab.assignment.pkg8.pkg2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number a set of numbers ending with -1: ");
        int[] excludedNumber = new int[54];
        for (int i = 0; i < excludedNumber.length; i++) {
            excludedNumber[i] = input.nextInt();
            if (excludedNumber[i] == -1) {
                break;
            }
        }
        int randomNum = getRandom(excludedNumber);
        System.out.println("Random number: " + randomNum);
}

    public static int getRandom(int... numbers) {
        int randomNum;
        boolean isExcluded;
        do {
            randomNum = (int) (Math.random() * 54) + 1;
            isExcluded = false;
            for (int i = 0; i < numbers.length; i++) {
                int excluded = numbers[i];
                if (randomNum == excluded) {
                    isExcluded = true;
                    break;
                }
            }

        } while (isExcluded);

        return randomNum;
    }
}
