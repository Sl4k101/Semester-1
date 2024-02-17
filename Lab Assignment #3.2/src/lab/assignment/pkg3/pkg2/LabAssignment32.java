package lab.assignment.pkg3.pkg2;
//lab assignment 3.2 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 11 2023)

import java.util.Scanner;

public class LabAssignment32 {

    public static void main(String args[]) {
//        Q1();
//        Q2();
//        Q3();
//        Q4();
        Q5();
    }

    public static void Q1() {
        // Define the month and year
        Scanner input = new Scanner(System.in);
        System.out.print("Input Month: ");
        int month = input.nextInt();
        System.out.print("Input Year: ");
        int year = input.nextInt();

        // Determine if it's a leap year
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;

        // Use a switch statement to display the number of days in the month
        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                if (leapYear == false) {
                    System.out.println("February " + year + " has 28 days");
                } else {
                    System.out.println("February " + year + " has 29 days");
                }
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
            default:
                // Handle invalid input
                System.out.println("Invalid Input");
        }
    }

    public static void Q2() {
        // Define the input integer
        Scanner input = new Scanner(System.in);
        System.out.print("enter a three-digit integer: ");
        int intInput = input.nextInt();

        // Extract individual digits
        int digit1 = (int) intInput % 10;
        int digit3 = (int) (intInput / 100) % 10;

        // Check if it's a palindrome
        if (digit1 == digit3) {
            System.out.println(intInput + " is a palindrome");
        } else {
            System.out.println(intInput + " is not a palindrome");
        }
    }

    public static void Q3() {
        // Define the weight and cost of the package
        Scanner input = new Scanner(System.in);
        System.out.print("weight of the package: ");
        double weight = input.nextDouble();

        double cost = 0;

        // Determine the shipping cost based on weight
        if (weight > 0 && weight <= 1) {
            cost = 2.5;
        } else if (weight > 1 && weight <= 3) {
            cost = 5.5;
        } else if (weight > 3 && weight <= 10) {
            cost = 8.5;
        } else if (weight > 10 && weight <= 20) {
            cost = 10.5;
        }

        // Display the shipping cost or error messages
        if (weight > 0 && weight < 20) {
            System.out.println("Shipping cost = $" + cost);
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        } else if (weight <= 0) {
            System.out.println("Invalid input");
        }
    }

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
        } else if ((userDigit1 == winningDigit1 || userDigit1 == winningDigit2 || userDigit1 == winningDigit3 || userDigit1 == winningDigit4)
                && (userDigit2 == winningDigit1 || userDigit2 == winningDigit2 || userDigit2 == winningDigit3 || userDigit2 == winningDigit4)
                && (userDigit3 == winningDigit1 || userDigit3 == winningDigit2 || userDigit3 == winningDigit3 || userDigit3 == winningDigit4)
                && (userDigit4 == winningDigit1 || userDigit4 == winningDigit2 || userDigit4 == winningDigit3 || userDigit4 == winningDigit4)) {
            award = 3000;
        } else if (userDigit1 == winningDigit1 || userDigit1 == winningDigit2 || userDigit1 == winningDigit3 || userDigit1 == winningDigit4
                || userDigit2 == winningDigit1 || userDigit2 == winningDigit2 || userDigit2 == winningDigit3 || userDigit2 == winningDigit4
                || userDigit3 == winningDigit1 || userDigit3 == winningDigit2 || userDigit3 == winningDigit3 || userDigit3 == winningDigit4
                || userDigit4 == winningDigit1 || userDigit4 == winningDigit2 || userDigit4 == winningDigit3 || userDigit4 == winningDigit4) {
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

    public static void Q5() {
        // Define the names of the choices for the game (Rock, Paper, Scissors)
        String userName = "";
        String randomName = "";
        // Define user and computer choices for the game
        Scanner input = new Scanner(System.in);
        System.out.print("Input your choice (Rock (1), Paper (2), Scissor (3)): ");
        int userInt = input.nextInt();
        double randomDouble = Math.random(); // Generate a random double between 0 and 1
        int randomInt = (int) (randomDouble * 3) + 1; // Convert the random double to an integer (0, 1, or 2)

        // Translate the numeric choices to names (Rock, Paper, Scissors)
        switch (userInt) {
            case 1:
                userName = "Rock";
                break;
            case 2:
                userName = "Paper";
                break;
            case 3:
                userName = "Scissors";
        }
        switch (randomInt) {
            case 1:
                randomName = "Rock";
                break;
            case 2:
                randomName = "Paper";
                break;
            case 3:
                randomName = "Scissors";
        }

        System.out.println("You played: " + userName); // Display the user's choice
        System.out.println("Computer played: " + randomName); // Display the computer's choice

        // Determine and display the game result
        if (userInt == 1 && randomInt == 2) {
            System.out.println("Computer Wins");
        }
        if (userInt == 1 && randomInt == 3) {
            System.out.println("Player Wins");
        }
        if (userInt == 2 && randomInt == 1) {
            System.out.println("Player Wins");
        }
        if (userInt == 2 && randomInt == 3) {
            System.out.println("Computer Wins");
        }
        if (userInt == 3 && randomInt == 1) {
            System.out.println("Computer Wins");
        }
        if (userInt == 3 && randomInt == 2) {
            System.out.println("Player Wins");
        }
        if (userInt == randomInt) {
            System.out.println("Draw");
        }
    }
}
