
package lab.assignment.pkg9.pkg2;

import java.util.Scanner;

public class LabAssignment92 {

    public static void main(String[] args) {
//        Q1();
//        Q1A();
//        Q2();
//        Q2A();
//        Q3();
//        Q3A();
//        Q4();
//        Q4A();
//        Q5();
//        Q5A();
//        Q6();
//        Q6A();
//        Q7();
        Q7A();
//        Q8();
//        Q8A();
//        Q9();
//        Q9A();
//        Q10();
//        Q10A();
    }

    //2.1 Q1
    public static void Q1() {
        // 2.1 question 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println("Q1:\nmiles = " + miles + "\nKilometers = " + kilometers);
    }

    public static void Q1A() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double[] conversion = { 1, 1.6 };
        conversion[0] = input.nextDouble();
        System.out.println(conversion[0] + " miles =  " + conversion[0] * conversion[1] + " kilometers ");
    }

    //2.2 Q2
    public static void Q2() {
        // Defining all floating point numbers
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int b1 = 2;
        int b2 = 3;
        int b3 = 4;
        int b4 = 5;
        int b5 = 6;
        // creating the collumn labeles
        System.out.println("Q2:\na    b    pow(a, b)");
        // displaying the floating point numbers and there integers
        System.out.println(a1 + "    " + b1 + "    " + (int) Math.pow(a1, b2));
        System.out.println(a2 + "    " + b2 + "    " + (int) Math.pow(a2, b2));
        System.out.println(a3 + "    " + b3 + "    " + (int) Math.pow(a3, b3));
        System.out.println(a4 + "    " + b4 + "    " + (int) Math.pow(a4, b4));
        System.out.println(a5 + "    " + b5 + "    " + (int) Math.pow(a5, b5));
    }

    public static void Q2A() {
        // Defining all integer numbers in arrays
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 4, 5, 6 };

        // creating the column labels
        System.out.println("Q2:\na   b   pow(a, b)");

        // displaying the integers and their corresponding powers
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "   " + b[i] + "   " + (int) Math.pow(a[i], b[i]));
        }
    }

    // 3.1 Q4
    public static void Q3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input values three values: \n");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if (a < b && b < c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a < c && c < b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b < a && a < c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b < c && c < a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c < a && a < b) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (c < b && b < a) {
            System.out.println(c + ", " + b + ", " + a);
        }
    }

    public static void Q3A() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input three values: \n");
        int[] values = new int[3];

        for (int i = 0; i < 3; i++) {
            values[i] = input.nextInt();
        }

        // Sort the array manually
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted values: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 3.2 Q4
    public static void Q4() {
        // Generate a random 4-digit lottery number
        int winningLottoNumber = (int) (Math.random() * 10000);

        // Define the user's lottery entry
        Scanner input = new Scanner(System.in);
        System.out.print("lotto Entry: ");
        int lottoEntry = input.nextInt();

        // Extract individual digits from both numbers
        int winningDigit1 = (int) winningLottoNumber % 10;
        int winningDigit2 = (int) (winningLottoNumber / 10) % 10;
        int winningDigit3 = (int) (winningLottoNumber / 100) % 10;
        int winningDigit4 = (int) (winningLottoNumber / 1000);
        int userDigit1 = (int) lottoEntry % 10;
        int userDigit2 = (int) (lottoEntry / 10) % 10;
        int userDigit3 = (int) (lottoEntry / 100) % 10;
        int userDigit4 = (int) (lottoEntry / 1000);
        int award = 0;

        // Compare the user's entry with the winning number and determine the award
        if (lottoEntry == winningLottoNumber) {
            award = 10000;
        } else if ((userDigit1 == winningDigit1 || userDigit1 == winningDigit2 || userDigit1 == winningDigit3
                || userDigit1 == winningDigit4)
                && (userDigit2 == winningDigit1 || userDigit2 == winningDigit2 || userDigit2 == winningDigit3
                        || userDigit2 == winningDigit4)
                && (userDigit3 == winningDigit1 || userDigit3 == winningDigit2 || userDigit3 == winningDigit3
                        || userDigit3 == winningDigit4)
                && (userDigit4 == winningDigit1 || userDigit4 == winningDigit2 || userDigit4 == winningDigit3
                        || userDigit4 == winningDigit4)) {
            award = 3000;
        } else if (userDigit1 == winningDigit1 || userDigit1 == winningDigit2 || userDigit1 == winningDigit3
                || userDigit1 == winningDigit4
                || userDigit2 == winningDigit1 || userDigit2 == winningDigit2 || userDigit2 == winningDigit3
                || userDigit2 == winningDigit4
                || userDigit3 == winningDigit1 || userDigit3 == winningDigit2 || userDigit3 == winningDigit3
                || userDigit3 == winningDigit4
                || userDigit4 == winningDigit1 || userDigit4 == winningDigit2 || userDigit4 == winningDigit3
                || userDigit4 == winningDigit4) {
            award = 1000;
        }

        // Display the result
        if (award == 0) {
            System.out.println("You lost!");
        } else if (award > 0) {
            System.out.println("Winner! you won: $" + award);
        } else {
            System.out.println("ERROR try again");
        }
    }

    public static void Q4A() {
        // Generate a random 4-digit lottery number
        int winningLottoNumber = (int) (Math.random() * 10000);

        // Define the user's lottery entry
        Scanner input = new Scanner(System.in);
        System.out.print("Lotto Entry: ");
        int lottoEntry = input.nextInt();

        // Extract individual digits from both numbers
        int[] winningDigits = new int[4];
        int[] userDigits = new int[4];

        for (int i = 0; i < 4; i++) {
            winningDigits[i] = winningLottoNumber % 10;
            userDigits[i] = lottoEntry % 10;

            winningLottoNumber /= 10;
            lottoEntry /= 10;
        }

        int award = 0;

        boolean hasMatch = false;
        for (int i = 0; i < 4; i++) {
            if (winningDigits[i] == userDigits[i]) {
                hasMatch = true;
                break;
            }
        }

        if (hasMatch) {
            award = 10000;
        } else {
            int matchingDigits = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (winningDigits[i] == userDigits[j]) {
                        matchingDigits++;
                        break;
                    }
                }
            }

            if (matchingDigits == 4) {
                award = 3000;
            } else if (matchingDigits > 0) {
                award = 1000;
            }
        }

        // Display the result
        if (award == 0) {
            System.out.println("You lost!");
        } else {
            System.out.println("Winner! You won: $" + award);
        }
    }

    // 4.1 Q6
    public static void Q5() {
        int lowNumber = 65;
        int highNumber = 90;
        int resultNumber = (int) Math.floor(Math.random() * (1 + highNumber - lowNumber)) + lowNumber;
        char letter = (char) resultNumber;
        System.out.println(letter);
    }

    public static void Q5A() {
        int lowNumber = 65;
        int highNumber = 90;

        System.out.print("Enter the number of random letters to generate: ");
        Scanner input = new Scanner(System.in);
        int numLetters = input.nextInt();

        if (numLetters > 0) {
            for (int i = 0; i < numLetters; i++) {
                int resultNumber = (int) Math.floor(Math.random() * (1 + highNumber - lowNumber)) + lowNumber;
                char letter = (char) resultNumber;
                System.out.print(letter + " ");
            }
            System.out.println(); // Add a newline at the end
        } else {
            System.out.println("Invalid input. Please enter a positive number of letters to generate.");
        }
    }

    // 5.4 Q2
    public static void Q6() {
        // Constants
        final double conversionRate = 1.609;

        // Header
        System.out.println("Miles   Kilometers");

        // Initialize the mile counter
        int miles = 1;

        // Display the table using a while loop
        while (miles <= 10) {
            double kilometers = miles * conversionRate;
            System.out.printf("%-7d %.3f\n", miles, kilometers);
            miles++;
        }
    }

    public static void Q6A() {
        // Constants
        final double conversionRate = 1.609;
        final int numRows = 10;
        final int numColumns = 2;

        // Create a 2D array to store miles and kilometers
        double[][] milesToKilometers = new double[numRows][numColumns];

        // Header
        System.out.println("Miles   Kilometers");

        // Initialize the mile counter
        int miles = 1;

        // Fill the 2D array with miles and kilometers
        for (int row = 0; row < numRows; row++) {
            double kilometers = miles * conversionRate;
            milesToKilometers[row][0] = miles;
            milesToKilometers[row][1] = kilometers;
            miles++;
        }

        // Display the table using a for loop
        for (int row = 0; row < numRows; row++) {
            System.out.printf("%-7.0f %.3f\n", milesToKilometers[row][0], milesToKilometers[row][1]);
        }
    }

    // 5.4 Q4
    public static void Q7() {
        int count = 0;
        int number = 100;

        while (number <= 200) {
            if ((number % 5 == 0) ^ (number % 6 == 0)) {
                System.out.print(number + " ");
                count++;

                // Print 10 numbers per line
                if (count % 10 == 0) {
                    System.out.println();
                }
            }

            number++;
        }
    }

    public static void Q7A() {
       int count = 0;
        int number = 100;
        int[] resultNumbers = new int[100]; // Assuming there are at most 100 numbers

        while (number <= 200) {
            if ((number % 5 == 0) ^ (number % 6 == 0)) {
                resultNumbers[count] = number;
                count++;

                // Print 10 numbers per line
                if (count % 10 == 0) {
                    printNumbers(resultNumbers, count);
                    count = 0;
                }
            }

            number++;
        }

        // Print any remaining numbers
        if (count > 0) {
            printNumbers(resultNumbers, count);
        }
    }

    private static void printNumbers(int[] numbers, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // 5.2 Q5
    public static void Q8() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the characters of the original string in reverse order
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    public static void Q8A() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Convert the original string to a character array
        char[] charArray = originalString.toCharArray();

        // Reverse the character array in-place
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        String reversedString = new String(charArray);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // 6.1 #Q5While
    public static void Q9() {
        // 5.2 Q1 Whileloop (Original)
        int smallestN = 1;
        int largestN = 1;

        // Find the smallest integer n such that n^2 is greater than 12,000
        while (smallestN * smallestN <= 12000) {
            smallestN++;
        }

        System.out.println("The smallest integer n such that n^2 is greater than 12,000 is: " + smallestN);

        // Find the largest integer n such that n^2 is less than 12,000
        while (Math.pow((largestN + 1), 3) < 12000) {
            largestN++;
        }
    }

    public static void Q9A() {
        int smallestN = 1;
        int largestN = 1;
        int n = 1;

        int[] results = new int[2]; // Store the smallest and largest n values

        while (n <= 12000) {
            if (n * n <= 12000) {
                smallestN = n;
            }
            if (Math.pow(n + 1, 3) < 12000) {
                largestN = n;
            }
            n++;
        }

        results[0] = smallestN;
        results[1] = largestN;

        System.out.println("The smallest integer n such that n^2 is greater than 12,000 is: " + results[0]);
        System.out.println("The largest integer n such that n^2 is less than 12,000 is: " + results[1]);
    }

    // 6.1 Q4For
    public static void Q10() {
        // 5.2 Q5 For loop (Original)
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Iterate through the characters of the original string in reverse order
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

    }

    public static void Q10A() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Initialize an array to store the reversed string characters
        char[] reversedChars = new char[originalString.length()];

        // Iterate through the characters of the original string in reverse order
        for (int i = originalString.length() - 1, j = 0; i >= 0; i--, j++) {
            reversedChars[j] = originalString.charAt(i);
        }

        // Create a string from the reversed characters array
        String reversedString = new String(reversedChars);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

}