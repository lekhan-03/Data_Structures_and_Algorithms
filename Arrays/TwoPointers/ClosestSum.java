
import java.util.Arrays;

class closestSolution {
    int[] closestpair(int[] a, int target) {
        int[] res = new int[2];
        int i = 0, j = a.length - 1;
        int closestsum = Integer.MAX_VALUE;
        while (i < j) {

            int sum = a[i] + a[j];
            int flag = Math.abs(sum - target);
            if (closestsum > flag) {
                closestsum = flag;
                res[0] = i;
                res[1] = j;
            }
            if (sum > target) {
                j--;
            } else
                i++;
        }
        return res;
    }
}
public class ClosestSum{
public static void main(String[] args) {
        closestSolution sol = new closestSolution();

        // Test Case 1: Exact match exists (target 10 -> 2 + 8 = 10)
        printTestCase(sol, new int[]{1, 2, 4, 5, 8, 10}, 10);

        // Test Case 2: Closest sum is slightly below target (target 15 -> 5 + 8 = 13)
        printTestCase(sol, new int[]{1, 3, 5, 8}, 15);

        // Test Case 3: Closest sum is slightly above target (target 6 -> 1 + 6 = 7)
        printTestCase(sol, new int[]{1, 6, 8, 9, 10}, 6);

        // Test Case 4: Array with negative numbers (target 0 -> -3 + 4 = 1)
        printTestCase(sol, new int[]{-5, -3, 1, 4, 8}, 0);

        // Test Case 5: Just two elements
        printTestCase(sol, new int[]{10, 20}, 35);
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(closestSolution sol, int[] a, int target) {
        System.out.println("Input: a = " + Arrays.toString(a) + ", target = " + target);
        
        int[] result = sol.closestpair(a, target);
        
        if (result.length == 2) {
            int val1 = a[result[0]];
            int val2 = a[result[1]];
            System.out.println("Output: Indices " + Arrays.toString(result) + 
                               " (Values: " + val1 + " + " + val2 + " = " + (val1 + val2) + ")\n");
        } else {
            System.out.println("Output: " + Arrays.toString(result) + "\n");
        }
    }
}