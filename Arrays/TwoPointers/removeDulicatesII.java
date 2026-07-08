import java.util.Arrays;

class Solution80{
    public int removeDuplicates(int[] a) {
        if(a.length<=2){
            return a.length;
        }
        int slow=1;
       for(int fast=2;fast<a.length;fast++){
        if(a[fast]!=a[slow-1]){
            slow+=1;
            a[slow]=a[fast];
        }
       }
       return slow+1; 
    }
}

public class removeDulicatesII {
    public static void main(String[] args) {
        Solution80 sol = new Solution80();

        // Test Case 1: Standard LeetCode example 1
        printTestCase(sol, new int[]{1, 1, 1, 2, 2, 3});

        // Test Case 2: Standard LeetCode example 2
        printTestCase(sol, new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});

        // Test Case 3: The edge case that breaks the original logic (no duplicates)
        printTestCase(sol, new int[]{1, 2, 3, 4, 5});

        // Test Case 4: Array with all identical elements (should trim down to exactly two)
        printTestCase(sol, new int[]{9, 9, 9, 9, 9});

        // Test Case 5: Array smaller than 2 elements
        printTestCase(sol, new int[]{1});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution80 sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        int k = sol.removeDuplicates(a);
        
        // Creating a subarray of just the valid elements using the returned length 'k'
        int[] validElements = Arrays.copyOfRange(a, 0, k);
        
        System.out.println("Output: " + k + ", Valid Array = " + Arrays.toString(validElements) + "\n");
    }
}

