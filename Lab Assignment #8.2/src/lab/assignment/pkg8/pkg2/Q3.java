
package lab.assignment.pkg8.pkg2;

public class Q3 {
        public static void main(String[] args) {
        int[] inputArray = new int[10];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            inputArray[i] = input.nextInt();
        }

        int[] distinctArray = eliminateDuplicates(inputArray);

        System.out.print("The distinct numbers are: ");
        for (int value : distinctArray) {
            System.out.print(value + " ");
        }

    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctArray = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (list[i] == distinctArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                distinctArray[size] = list[i];
                size++;
            }
        }

        int[] result = new int[size];
        System.arraycopy(distinctArray, 0, result, 0, size);

        return result;
    }
}
