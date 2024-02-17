
package lab.assignment.pkg9.pkg1;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read and create the first sorted list
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        // Read and create the second sorted list
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        // Merge the two sorted lists
        int[] mergedList = merge(list1, list2);

        // Display the merged list
        System.out.print("The merged list is: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int size1 = list1.length;
        int size2 = list2.length;
        int[] mergedList = new int[size1 + size2];

        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (list1[i] < list2[j]) {
                mergedList[k] = list1[i];
                i++;
            } else {
                mergedList[k] = list2[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            mergedList[k] = list1[i];
            i++;
            k++;
        }

        while (j < size2) {
            mergedList[k] = list2[j];
            j++;
            k++;
        }

        return mergedList;
    }
}
