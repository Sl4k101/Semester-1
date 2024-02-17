package lab.assignment.pkg7.pkg1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValidPassword(String password) {
        // Rule 1: A password must have at least eight characters.
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters.");
            return false;
        }

        int digitCount = 0;

        // Rule 2: A password must contain only letters and digits.
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                System.out.println("A password must contain only letters and digits.");
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: A password must contain at least two digits.
        if (digitCount < 2) {
            System.out.println("A password must contain at least two digits.");
            return false;
        }

        // If all rules are satisfied, the password is valid.
        return true;
    }
}
