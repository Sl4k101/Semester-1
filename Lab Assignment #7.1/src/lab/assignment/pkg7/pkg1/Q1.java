package lab.assignment.pkg7.pkg1;

public class Q1 {
    public static void main(String[] args) {
displayComission();
    }

    public static double computeComission(double salesAmount) {
        salesAmount *= 100;
        int temp = (int) salesAmount;
        salesAmount = (double) temp / 100.0;
        if (salesAmount >= 0.01 && salesAmount <= 5000) { // Calculating the commision When the amount is less than 5000
            return salesAmount * 0.08;
        } else if (salesAmount >= 5000.01 && salesAmount <= 10000) { // Calculating the commision When the amount is less than 10000
            return (5000 * 0.08) + ((salesAmount - 5000) * 0.10);
        } else if (salesAmount >= 10000.01) {
            return (5000 * 0.08) + (5000 * 0.1) + ((salesAmount-10000)*0.12);// Calculating the commision When the amount is more than 10000
        } else {
            System.out.println("Error invalid input");
        }
        return 5;
    }
    public static void displayComission() {
                System.out.println("Cost     Commission");
        for (double cost = 10000; cost <= 100000; cost += 5000) {
            System.out.printf("%.2f %.2f%n", cost, computeComission(cost));
        }
    }
}
