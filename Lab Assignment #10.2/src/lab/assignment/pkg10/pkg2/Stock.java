package lab.assignment.pkg10.pkg2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }

    // Method to calculate the percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Getter for symbol
    public String getSymbol() {
        return symbol;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    // Setter for previousClosingPrice
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Getter for currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    // Setter for currentPrice
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public static void main(String[] args) {
        // Create Stock object
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation", 34.5);

        // Set current price
        oracleStock.setCurrentPrice(34.35);

        // Display the price-change percentage
        System.out.println("Stock Symbol: " + oracleStock.getSymbol());
        System.out.println("Stock Name: " + oracleStock.getName());
        System.out.println("Previous Closing Price: $" + oracleStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + oracleStock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + oracleStock.getChangePercent() + "%");
    }
}