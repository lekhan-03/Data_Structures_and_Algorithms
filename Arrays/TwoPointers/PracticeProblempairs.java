/*Given a sorted array of positive distinct integers, check if there exists a pair where arr[j] = 2 * arr[i] (one element is exactly double another).

Example: [1, 2, 3, 5, 8] → true (1×2=2, or 2×2=4... wait check: 1,2 → 2=2×1 ✓) */

import java.util.Arrays;

class SolutionPairs {
    boolean calPairs(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length) {
            if (i == j) {
                j++;
                continue;
            }
            if (arr[j] == 2 * arr[i])
                return true;
            else if (arr[j] > 2 * arr[i])
                i++;
            else
                j++;
        }
        return false;
    }
}

public class PracticeProblempairs {
    public static void main(String[] args) {
        SolutionPairs sol = new SolutionPairs();

        // Test Case 1: The provided example
        printTestCase(sol, new int[] { 1, 2, 3, 5, 8 });

        // Test Case 2: The edge case that breaks the `i < j` loop condition (1 * 2 < 5,
        // i catches up, finds 5 * 2 = 10)
        printTestCase(sol, new int[] { 1, 5, 10 });

        // Test Case 3: Pair exists further down the array
        printTestCase(sol, new int[] { 1, 3, 4, 7, 8, 10 });

        // Test Case 4: No such pair exists
        printTestCase(sol, new int[] { 1, 3, 5, 7, 9 });

        // Test Case 5: Target pair involves the very last elements
        printTestCase(sol, new int[] { 3, 7, 11, 22 });
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(SolutionPairs sol, int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));

        boolean result = sol.calPairs(arr);

        System.out.println("Output: " + result + "\n");
    }

}