package javaapplication2;
//lab assignment 2.2 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 5 2023)

public class LabAssignment22 {

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }

    public static void Q1() {
        //defining all necesarry varaibles for formula
        double investementAmount = 1000;
        double annualInterest = 0.0325;
        double numberOfYears = 1;
        //implementing the monthly compounded interest formula with the variables defined above
        System.out.println("Q1:\nThe future investment value is " + (investementAmount * Math.pow(1 + annualInterest / 12, numberOfYears * 12)));
    }

    public static void Q2() {
        //Defining all floating point numbers
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
        //creating the collumn labeles
        System.out.println("Q2:\na    b    pow(a, b)");
        //displaying the floating point numbers and there integers
        System.out.println(a1 + "    " + b1 + "    " + (int) Math.pow(a1, b2));
        System.out.println(a2 + "    " + b2 + "    " + (int) Math.pow(a2, b2));
        System.out.println(a3 + "    " + b3 + "    " + (int) Math.pow(a3, b3));
        System.out.println(a4 + "    " + b4 + "    " + (int) Math.pow(a4, b4));
        System.out.println(a5 + "    " + b5 + "    " + (int) Math.pow(a5, b5));
    }

    public static void Q3() {
        int minutes = 1000000000;
        // convert the minutes into days (60*24=1440)
        int days = minutes / 1440;
        // convert days into years
        int years = days / 365;
        // calculate how many days are remaining after calculating the years
        int remainingDays = days % 365;
        System.out.println("Q3:\n" + minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}