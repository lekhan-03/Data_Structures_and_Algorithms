import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Test Case 1: Standard unsorted array
        printTestCase(new int[]{64, 34, 25, 12, 22, 11, 90});

        // Test Case 2: Array already sorted
        printTestCase(new int[]{1, 2, 3, 4, 5});

        // Test Case 3: Array sorted in reverse order
        printTestCase(new int[]{9, 8, 7, 6, 5});

        // Test Case 4: Array with duplicate values
        printTestCase(new int[]{4, 1, 3, 9, 4, 1});

        // Test Case 5: Array with negative numbers
        printTestCase(new int[]{0, -10, 15, -2, 8});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        // Call the sort method
        bubbleSort(arr);
        
        System.out.println("Output: " + Arrays.toString(arr) + "\n");
    }
}