
import java.util.*;

public class SelectionSort {

    static void selctionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Standard unsorted array
        printTestCase(new int[]{64, 25, 12, 22, 11});

        // Test Case 2: Array already sorted
        printTestCase(new int[]{1, 2, 3, 4, 5});

        // Test Case 3: Array sorted in reverse order
        printTestCase(new int[]{9, 8, 7, 6});

        // Test Case 4: Array with duplicate values
        printTestCase(new int[]{4, 1, 3, 9, 4, 1});

        // Test Case 5: Array with negative numbers
        printTestCase(new int[]{0, -10, 15, -2, 8});
    }

    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));

        selctionSort(arr, arr.length);

        System.out.println("Output: " + Arrays.toString(arr) + "\n");
    }
}
