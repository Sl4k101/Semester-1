/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.assignment.pkg6.pkg2;

/**
 *
 * @author sl4k
 */
public class Q5 {
        public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit Conversion Table:");
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%d\t%.2f%n", celsius, fahrenheit);
        }

        System.out.println("\nFahrenheit to Celsius Conversion Table:");
        System.out.println("Fahrenheit\tCelsius");
        for (int fahrenheit = 32; fahrenheit <= 212; fahrenheit += 10) {
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%d\t%.2f%n", fahrenheit, celsius);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
