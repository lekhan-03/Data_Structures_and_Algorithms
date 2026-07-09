import java.util.Arrays;

class Solution66{
    public int[] plusOne(int[] a) {
        for(int i=a.length-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                return a;
            }
            a[i]=0;
        }
        int[] res = new int[a.length+1];
        res[0]=1;
        return res;
        
    }
}

public class plusOne {
    public static void main(String[] args) {
        Solution66 sol = new Solution66();

        // Test Case 1: Standard LeetCode example (no carry)
        printTestCase(sol, new int[]{1, 2, 3});

        // Test Case 2: Standard LeetCode example (single carry)
        printTestCase(sol, new int[]{4, 3, 2, 1});

        // Test Case 3: Carry cascading through multiple digits (but not all)
        printTestCase(sol, new int[]{8, 9, 9, 9});

        // Test Case 4: The ultimate edge case - all 9s
        printTestCase(sol, new int[]{9, 9, 9});

        // Test Case 5: Single digit array
        printTestCase(sol, new int[]{9});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution66 sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        // We pass a clone of the array so we don't accidentally modify our original test case variables if we reuse them
        int[] result = sol.plusOne(a.clone());
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}
