
package pkgfinal.outline;

public class FinalOutline {

    private String title;
    private String author;
    private int year;
    private int[] saleNumbers;

    // Constructors
    public FinalOutline(String title, String author, int year) {
        // Initialize variables
    }

    public FinalOutline(String title, String author, int year, int[] saleNumbers) {
        // Initialize variables
    }

    // Accessor methods
    public String getTitle() {
        // Return title
    }

    public String getAuthor() {
        // Return author
    }

    public int getYear() {
        // Return year
    }

    public int[] getSaleNumbers() {
        // Return saleNumbers
    }

    // Mutator methods
    public void setTitle(String title) {
        // Set title
    }

    public void setAuthor(String author) {
        // Set author
    }

    public void setYear(int year) {
        // Set year
    }

    public void setSaleNumbers(int[] saleNumbers) {
        // Set saleNumbers
    }

    // Overloaded method to set sale numbers for a specific month
    public void setSaleNumbers(int sold, int month) {
        // Set saleNumbers for the specified month
    }

    // Overloaded method to get sale numbers for a specific month
    public int getSaleNumbers(int month) {
        // Return saleNumbers for the specified month
    }

    // Method to calculate total sales
    public int getTotal() {
        // Calculate and return total sales
    }
}
