
package lab.assignment.pkg8.pkg2;

import java.util.Scanner;

public class Q2 {
        public static void main(String[] args) {
        int[] userNumbers = new int[5];

        Scanner input = new Scanner (System.in);
        System.out.print("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            userNumbers[i] = input.nextInt();
        }

        int result = gcd(userNumbers);
        System.out.println("The GCD of the entered numbers is: " + result);
    }
    
    public static int gcd(int... numbers) {

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }

        return result;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
