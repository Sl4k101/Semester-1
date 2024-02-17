
package pkgfinal.project;

public class Book {
    private String title;
    private String author;
    private int year;
    private int[] saleNumbers;

    // First constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.saleNumbers = new int[6];
    }

    // Second constructor
    public Book(String title, String author, int year, int[] saleNumbers) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.saleNumbers = new int[6];
        System.arraycopy(saleNumbers, 0,this.saleNumbers, 0 , saleNumbers.length);
    }

    // Accessor methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int[] getSaleNumbers() {
        return saleNumbers;
    }

    // Mutator methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSaleNumbers(int[] saleNumbers) {
         System.arraycopy(saleNumbers, 0,this.saleNumbers, 0 , saleNumbers.length);
    }

    // Overloaded method to set sale numbers for a specific month
    public void setSaleNumbers(int sold, int month) {
        saleNumbers[month] = sold; // Assuming month numbers start from 1
    }

    // Overloaded method to get sale numbers for a specific month
    public int getSaleNumbers(int month) {
        return saleNumbers[month]; // Assuming month numbers start from 1
    }

    // Method to calculate total sales
    public int getTotal() {
        int total = 0;
        for (int sales : saleNumbers) {
            total += sales;
        }
        return total;
    }
}