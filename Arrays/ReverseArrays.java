import java.util.Arrays;
public class ReverseArrays {
    static void reverseArray(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
public static void main(String[] args) {
        // Test Case 1: Odd length array
        printTestCase(new int[]{1, 2, 3, 4, 5});

        // Test Case 2: Even length array
        printTestCase(new int[]{10, 20, 30, 40});

        // Test Case 3: Array with negative numbers
        printTestCase(new int[]{-1, -2, 5, 9});

        // Test Case 4: Single element array (should remain unchanged)
        printTestCase(new int[]{99});

        // Test Case 5: Empty array (should safely do nothing)
        printTestCase(new int[]{});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        // Call the reverse method
        reverseArray(arr);
        
        System.out.println("Output: " + Arrays.toString(arr) + "\n");
    }
}