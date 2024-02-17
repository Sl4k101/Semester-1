package lab.assignment.pkg7.pkg1;

public class Q3 {
        public static void main(String[] args) {
        // Display the number of days in years from 2000 to 2020
        for (int year = 2000; year <= 2020; year++) {
            int days = numberOfDaysInAYear(year);
            System.out.println("Year " + year + " has " + days + " days.");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        // Check if it's a leap year (divisible by 4)
        boolean isLeapYear = (year % 4 == 0);

        // If it's a leap year, it has 366 days; otherwise, it has 365 days
        return isLeapYear ? 366 : 365;
    }
}
