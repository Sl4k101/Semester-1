//lab assignment 4.2 introduction to programming
//Submitted by Matthew Cheung for Istiaque Shahriar (Setpember 29 2023)
package lab.assignment.pkg4.pkg2;

import java.util.Scanner;

public class LabAssignment42 {

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
    }

    public static void Q1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a phrase (s1): ");
        String s1 = input.nextLine();

        System.out.print("Input a second phrase (s2): ");
        String s2 = input.nextLine();

        System.out.println("the length of s1 is: " + s1.length() + " characters");
        System.out.println("the character in the 1st position of s1 is: " + s1.charAt(1));
        System.out.println("s1 and s2 combined is: " + s1.concat(s2));
        System.out.println("string s1 upercase is: " + s1.toUpperCase());
        System.out.println("string s2 lowercase is: " + s2.toLowerCase());
        System.out.println("string s2 without whitespace is: " + s2.trim());
    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a phrase (s1): ");
        String s1 = input.nextLine();

        System.out.print("Input a second phrase (s2): ");
        String s2 = input.nextLine();

        System.out.println("Checking if s1 = s2: " + s1.equals(s2));
        System.out.println("Checking if s1 = s2 (Ignore case): " + s1.equalsIgnoreCase(s2));
        System.out.println("Returned value from comparing s1 to s2: " + s1.compareTo(s2));
        System.out.println("Returned value from comparing s1 to s2 (Ignoring case): " + s1.compareToIgnoreCase(s2));
        System.out.println("checking if the prefix of s1 is \"he\": " + s1.startsWith("He"));
        System.out.println("checking if the suffix of s1 is \"lo\": " + s1.endsWith("lo"));
    }

    public static void Q3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a phrase (s1): ");
        String s1 = input.nextLine();

        System.out.println("s1 starting from the 2nd character is : " + s1.substring(1));
        System.out.println("s1 starting from the 2nd character and ending on the 4th character is: " + s1.substring(1, 4));
    }

    public static void Q4() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a phrase (s1): ");
        String s1 = input.nextLine();

        System.out.print("Input a second phrase (s2): ");
        String s2 = input.nextLine();

        int fromIndex = 3;
        char ch = 'e';

        String description1 = "Return the index of the first occurrence of ch in the string. \n Output: ";
        String description2 = "Returns the index of the first occurrence of ch after fromIndex in the string. \n Output: ";
        String description3 = "Returns the index of the first occurrence of string s2 in this string. \n Output: ";
        String description4 = "Returns the index of the first occurrence of string s2 in this string after fromIndex. \n Output: ";
        String description5 = "Returns the index of the last occurrence of ch in the string. \n Output: ";
        String description6 = "Returns the index of the last occurrence of ch before fromIndex in this string. \n Output: ";
        String description7 = "Returns the index of the last occurrence of string s2. \n Output: ";
        String description8 = "Returns the index of the last occurrence of string s2 before fromIndex. \n Output: ";

        System.out.println(description1 + s1.indexOf(ch));
        System.out.println(description2 + s1.indexOf(ch, fromIndex));
        System.out.println(description3 + s1.indexOf(s2));
        System.out.println(description4 + s1.indexOf(s2, fromIndex));
        System.out.println(description5 + s2.lastIndexOf(ch));
        System.out.println(description6 + s2.lastIndexOf(ch, fromIndex));
        System.out.println(description7 + s2.lastIndexOf(s2));
        System.out.println(description8 + s2.lastIndexOf(s2, fromIndex));
    }

    public static void Q5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanVar = scanner.nextBoolean();

        System.out.print("Enter a character: ");
        char charVar = scanner.next().charAt(0);

        System.out.print("Enter an integer: ");
        int intVar = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleVar = scanner.nextDouble();

        System.out.print("Enter a scientific notation double: ");
        double scientificVar = scanner.nextDouble();

        System.out.print("Enter a string: ");
        String stringVar = scanner.next();

        System.out.printf("Boolean: %b, Character: %c, Integer: %d, Double: %.2f, Scientific: %e, String: %s%n",
                booleanVar, charVar, intVar, doubleVar, scientificVar, stringVar);
    }
}
