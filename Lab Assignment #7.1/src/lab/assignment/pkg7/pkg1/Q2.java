package lab.assignment.pkg7.pkg1;

public class Q2 {
        public static void main(String[] args) {
        char ch1 = '1'; // Start character
        char ch2 = 'z'; // End character
        int numberPerLine = 10; // Characters per line

        printChars(ch1, ch2, numberPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;

        for (char ch = ch1; ch <=ch2; ch++) {
            System.out.print(ch + " ");
            count++;

            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
