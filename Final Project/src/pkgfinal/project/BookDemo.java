
package pkgfinal.project;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array named bookArray with 7 elements of type Book
        Book[] bookArray = new Book[7];

        // Write loops to ask the user to enter each book data
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Book " + (i + 1) + " (using first constructor):");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            bookArray[i] = new Book(title, author, year);
            System.out.println("Enter sale numbers for each month (separated by spaces): ");
            for (int j = 0; j < 6; j++) {
                bookArray[i].setSaleNumbers(scanner.nextInt(), j);
            }
            scanner.nextLine();
        }

        for (int i = 4; i < 7; i++) {
            System.out.println("Enter details for Book " + (i + 1) + " (using second constructor):");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.println("Enter sale numbers for each month (separated by spaces): ");
            int[] sales = new int[6];
            for (int j = 0; j < sales.length; j++) {
                sales[j] = scanner.nextInt();
            }
            bookArray[i] = new Book(title, author, year, sales);
            scanner.nextLine();
        }

        // Use selection sort algorithm to sort the bookArray based on the highest sale
        // in descending order
        for (int i = 0; i < bookArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < bookArray.length; j++) {
                if (bookArray[j].getTotal() > bookArray[maxIndex].getTotal()) {
                    maxIndex = j;
                }
            }
            // Swap books
            Book temp = bookArray[i];
            bookArray[i] = bookArray[maxIndex];
            bookArray[maxIndex] = temp;
        }

        // Display the result
        System.out.println("\nBooks sorted by total sales (descending order):");
        int count = 0;
        for (int i = 0; i < bookArray.length; i++) {
            if (i != 0) {
                if (bookArray[i].getTotal() != bookArray[i - 1].getTotal()) {
                    count += 1;
                }
            } else if (i == 0) {
                count++;
            }
            System.out.println(count + ". \nTitle: " + bookArray[i].getTitle() + "\nAuthor: " + bookArray[i].getAuthor()
                    + "\nYear: "
                    + bookArray[i].getYear() + "\nTotal Sales: " + bookArray[i].getTotal());
        }
    }
}
