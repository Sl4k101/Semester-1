package lab.assignment.pkg3.pkg1;
//lab assignment 3.1 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 11 2023)

import java.util.Scanner;

public class LabAssignment31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Q1();
//        Q2();
//        Q3();
        Q4();
    }

    public static void Q1() {
        System.out.println("Q1:");
        //Defining the variables in the quadratic equation
        Scanner input = new Scanner(System.in);
        System.out.print("Input values (a, b and c): \n");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        //solving the numerator for both answers

        double r1Sum = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
        double r2Sum = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
        double discriminant = (Math.pow(b, 2) - 4 * a * c); //solving the discriminant
        // determining how many roots there are and displaying answer
        if (discriminant > 0) {
            System.out.println("The equation has two roots: r1 = " + r1Sum + " and r2 = " + r2Sum);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: r1 = " + r1Sum);
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }
    }

    public static void Q2() {
        System.out.println("Q2:");
        String month = ""; // declaring the month as a word
        double randomDouble = Math.random(); //generate random double
        System.out.println("You generated random double number: " + (int) (randomDouble * 1000) / 1000.0); // displaying generated double
        int randomInt = (int) (randomDouble * 12) + 1; // convert random double to a integer
        System.out.println("You generated random integer number: " + randomInt); // displaying generated integer
        //assinging the random number to a month
        if (randomInt == 1) {
            month = "January";
        }
        if (randomInt == 2) {
            month = "Febuary";
        }
        if (randomInt == 3) {
            month = "March";
        }
        if (randomInt == 4) {
            month = "April";
        }
        if (randomInt == 5) {
            month = "May";
        }
        if (randomInt == 6) {
            month = "June";
        }
        if (randomInt == 7) {
            month = "July";
        }
        if (randomInt == 8) {
            month = "August";
        }
        if (randomInt == 9) {
            month = "September";
        }
        if (randomInt == 10) {
            month = "October";
        }
        if (randomInt == 11) {
            month = "November";
        }
        if (randomInt == 12) {
            month = "December";
        }
        System.out.println("The month is " + month); //printing random month
    }

    public static void Q3() {
        System.out.println("Q3:");
        Scanner input = new Scanner(System.in);
        System.out.print("Input Curent day: ");
        int currentDayInput = input.nextInt();
        System.out.print("Input Future day: ");
        int futureDayInput = input.nextInt();
        int currentDayOutput = currentDayInput % 7;
        int futureDayOutput = ((futureDayInput % 7) + currentDayOutput) % 7;
        String currentDayName = "";
        String futureDayName = "";
        // determining and assigning the current day
        if (currentDayOutput == 1) {
            currentDayName = "Monday";
        }
        if (currentDayOutput == 2) {
            currentDayName = "Tuesay";
        }
        if (currentDayOutput == 3) {
            currentDayName = "Wednesday";
        }
        if (currentDayOutput == 4) {
            currentDayName = "Thursday";
        }
        if (currentDayOutput == 5) {
            currentDayName = "Friday";
        }
        if (currentDayOutput == 6) {
            currentDayName = "Saturday";
        }
        if (currentDayOutput == 7) {
            currentDayName = "Sunday";
            // determining and assigning the future day
        }
        if (futureDayOutput == 1) {
            futureDayName = "Monday";
        }
        if (futureDayOutput == 2) {
            futureDayName = "Tuesay";
        }
        if (futureDayOutput == 3) {
            futureDayName = "Wednesday";
        }
        if (futureDayOutput == 4) {
            futureDayName = "Thursday";
        }
        if (futureDayOutput == 5) {
            futureDayName = "Friday";
        }
        if (futureDayOutput == 6) {
            futureDayName = "Saturday";
        }
        if (futureDayOutput == 7) {
            futureDayName = "Sunday";
        }
        System.out.println("Today's day: " + currentDayOutput);
        System.out.println("Days elapsed since today: " + futureDayOutput);
        System.out.println("Today is " + currentDayName + " and the future day is " + futureDayName);
    }

    public static void Q4() {
        System.out.println("Q4:");
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
}
