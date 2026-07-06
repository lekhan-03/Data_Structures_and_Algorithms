
import java.util.Arrays;


class Solution {

    public int trapRain(int[] arr) {
        int i = 0, j = arr.length - 1;
        int res = 0;
        int leftMax = 0, rightMax = 0;
        while (i < j) {
            if (arr[i] < arr[j]) {
                if (arr[i] > leftMax) {
                    leftMax = arr[i];
                } else {
                    res = res + leftMax - arr[i];
                }
                i++;
            } else {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                } else {
                    res=res+rightMax-arr[j];
                  
                }
                  j--;
            }
        }
        return res;
    }
}

public class P42TrapRainWater {
public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Standard LeetCode example 1
        printTestCase(sol, new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

        // Test Case 2: Standard LeetCode example 2
        printTestCase(sol, new int[]{4, 2, 0, 3, 2, 5});
        printTestCase(sol, new int[]{2, 2, 2, 2, 2});

        printTestCase(sol, new int[]{5, 1, 1, 1, 5});
        printTestCase(sol, new int[]{1, 2, 3, 2, 1});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution sol, int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        int result = sol.trapRain(arr);
        
        System.out.println("Output: " + result + "\n");
    }
}
