import java.util.Arrays;

class duplicatesSolution {
    int remDupli(int[] a) {
        int slow = 0;
        for (int fast = 1; fast < a.length; fast++) {
            if (a[slow] != a[fast]) {
                slow++;
                a[slow] = a[fast];
            }
        }
        return slow + 1;
    }
}

public class RemoveDuplicates {
public static void main(String[] args) {
        duplicatesSolution sol = new duplicatesSolution();

        // Test Case 1: Standard LeetCode example 1
        printTestCase(sol, new int[]{1, 1, 2});

        // Test Case 2: Standard LeetCode example 2
        printTestCase(sol, new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        // Test Case 3: No duplicates present
        printTestCase(sol, new int[]{1, 2, 3, 4, 5});

        // Test Case 4: All elements are the exact same
        printTestCase(sol, new int[]{9, 9, 9, 9, 9});

        // Test Case 5: Empty array
        printTestCase(sol, new int[]{});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(duplicatesSolution sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        int k = sol.remDupli(a);
        
        // Creating a subarray of just the valid unique elements to display them clearly
        int[] uniqueElements = Arrays.copyOfRange(a, 0, k);
        
        System.out.println("Output: " + k + ", Unique Array = " + Arrays.toString(uniqueElements) + "\n");
    }

}
