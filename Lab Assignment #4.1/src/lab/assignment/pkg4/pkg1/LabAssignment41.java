//lab assignment 4.1 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 23 2023)
package lab.assignment.pkg4.pkg1;

import java.util.Scanner;

public class LabAssignment41 {

    public static void main(String[] args) {
//       Q1();
//       Q2();
//        Q3();
//        Q4HexToBinary();
//        Q4VowelOrConsonant();
//        Q5();
        Q6();
    }

    public static void Q1() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code (0-127): ");

        // Read the ASCII code as an integer
        int asciiCode = input.nextInt();

        // Check if the input is within the valid range (0-127)
        if (asciiCode >= 0 && asciiCode <= 127) {
            // Convert the ASCII code to a character and display it
            char character = (char) asciiCode;
            System.out.println("The  character for ASII " + asciiCode + " is " + character);
        } else {
            System.out.println("Invalid input. Please enter an ASCII code between 0 and 127.");
        }

    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");

        // Read the user's input (a single character)
        char inputChar = input.next().charAt(0);

        // Get the Unicode value of the character
        int unicodeValue = (int) inputChar;

        // Display the Unicode value
        System.out.println("The Unicode value for " + inputChar + " is " + unicodeValue);

    }

    public static void Q3() {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer between 0 and 15: ");

        // Read the user input as an integer
        int decimal = input.nextInt();

        // Check if the input is within the valid range (0-15)
        if (decimal >= 0 && decimal <= 15) {
            // Convert the decimal number to its hexadecimal representation
            String hex = Integer.toHexString(decimal).toUpperCase(); // Convert to uppercase

            // Display the result
            System.out.println("Hexadecimal representation: " + hex);
        } else {
            // Invalid input
            System.out.println(decimal + " is an invalid input");
        }
    }

    public static void Q4HexToBinary() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        char hexDigit = input.nextLine().charAt(0);

        String binaryValue;

        switch (hexDigit) {
            case '0':
                binaryValue = "0000";
                break;
            case '1':
                binaryValue = "0001";
                break;
            case '2':
                binaryValue = "0010";
                break;
            case '3':
                binaryValue = "0011";
                break;
            case '4':
                binaryValue = "0100";
                break;
            case '5':
                binaryValue = "0101";
                break;
            case '6':
                binaryValue = "0110";
                break;
            case '7':
                binaryValue = "0111";
                break;
            case '8':
                binaryValue = "1000";
                break;
            case '9':
                binaryValue = "1001";
                break;
            case 'A':
            case 'a':
                binaryValue = "1010";
                break;
            case 'B':
            case 'b':
                binaryValue = "1011";
                break;
            case 'C':
            case 'c':
                binaryValue = "1100";
                break;
            case 'D':
            case 'd':
                binaryValue = "1101";
                break;
            case 'E':
            case 'e':
                binaryValue = "1110";
                break;
            case 'F':
            case 'f':
                binaryValue = "1111";
                break;
            default:
                binaryValue = "Invalid input";
                break;
        }

        System.out.println("Binary value: " + binaryValue);
    }

    public static void Q4VowelOrConsonant() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (Character.isLetter(letter) == false) {
            System.out.println("Invalid input please enter a letter.");
        } else {
            char upperCaseLetter = Character.toUpperCase(letter);

            if (upperCaseLetter == 'A' || upperCaseLetter == 'E' || upperCaseLetter == 'I'
                    || upperCaseLetter == 'O' || upperCaseLetter == 'U') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }
    }

    public static void Q5() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a lowercase or uppercase letter: ");
        char inputChar = input.next().charAt(0);

        // Convert the input to uppercase for uniformity
        inputChar = Character.toUpperCase(inputChar);

        int digit;

        // Use a switch-case statement to map the letter to a number
        switch (inputChar) {
            case 'A':
            case 'B':
            case 'C':
                digit = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                digit = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                digit = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                digit = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                digit = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                digit = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                digit = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                digit = 9;
                break;
            default:
                digit = 0; // Invalid input
        }

        if (digit != 0) {
            System.out.println("The corresponding number is " + digit);
        } else {
            System.out.println("Invalid input");
        }

    }

    public static void Q6() {
        int lowNumber = 65;
        int highNumber = 90;
        int resultNumber = (int) Math.floor(Math.random() * (1 + highNumber - lowNumber)) + lowNumber;
        char letter = (char) resultNumber;
        System.out.println(letter);
    }
}
