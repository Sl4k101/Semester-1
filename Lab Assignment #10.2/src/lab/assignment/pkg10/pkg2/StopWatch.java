package lab.assignment.pkg10.pkg2;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Getter for startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter for endTime
    public long getEndTime() {
        return endTime;
    }

    // Method to start the stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Method to stop the stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Method to get elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Create a StopWatch
        StopWatch stopwatch = new StopWatch();

        // Create an array of 100,000 numbers
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        // Measure the execution time of sorting using selection sort
        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();

        // Display the elapsed time
        System.out.println("Sorting 100,000 numbers using selection sort took "
                + stopwatch.getElapsedTime() + " milliseconds.");
    }

    // Selection Sort algorithm
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

