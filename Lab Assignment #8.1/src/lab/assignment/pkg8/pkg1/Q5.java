
package lab.assignment.pkg8.pkg1;

public class Q5 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        System.out.print("Original order: ");
        for (int i = 0; i < 10; i++) {
            randomArray[i] = (int) (Math.random() * 61) + 20; // Random number between 20 and 80
            System.out.print(randomArray[i] + " ");
        }
        System.out.print("\nReversed order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(Printreversed(randomArray)[i] + " ");
        }
        System.out.print("\nShuffled order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(Printshuffled(randomArray)[i] + " ");
        }

        System.out.println("\nSum is: " + findSum(randomArray));
        System.out.println("Average is: " + findAverage(randomArray));
        System.out.println("Largest value is: " + findLargest(randomArray));
        System.out.println("Smallest value is: " + findSmallest(randomArray));

    }

    public static double findSum(int[] randomArray) {
        double sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            sum += randomArray[i];
        }
        return sum;
    }

    public static double findAverage(int[] randomArray) {
        double sum = findSum(randomArray);
        return sum / randomArray.length;
    }

    public static int findLargest(int[] randomArray) {
        int largest = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > largest) {
                largest = randomArray[i];
            }
        }
        return largest;
    }

    public static int findSmallest(int[] randomArray) {
        int smallest = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] < smallest) {
                smallest = randomArray[i];
            }
        }
        return smallest;
    }

    public static int[] Printreversed(int[] randomArray) {
        int[] reversed = new int[10];
        for (int i = 0; i < 10; i++) {
            reversed[i] = randomArray[9 - i];
        }
        return reversed;
    }

    public static int[] Printshuffled(int[] randomArray) {
        int[] shuffled = new int[randomArray.length];
        for (int i = 0; i < 10; i++) {
            shuffled[i] = randomArray[i];
        }
        for (int i = 0; i < 10; i++) {
            int j = ((int) Math.random() * randomArray.length);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;

        }
        return shuffled;
    }

}