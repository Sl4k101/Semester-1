/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg9.pkg1;

    import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the size of the matrix
        int rows = 3;
        int columns = 4;

        double[][] matrix = new double[rows][columns];

        // Ask the user to enter the matrix row by row
        System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Calculate and display the sum of each column
        for (int j = 0; j < columns; j++) {
            double columnSum = sumColumn(matrix, j);
            System.out.println("Sum of the elements at column " + j + " is " + columnSum);
        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double columnSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            columnSum += matrix[i][columnIndex];
        }
        return columnSum;
    }
}
