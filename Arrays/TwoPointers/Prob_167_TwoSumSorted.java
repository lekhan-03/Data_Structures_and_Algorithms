package TwoPointers;
import java.util.Arrays;
class Solution{
    public int[] twoSum(int arr[],int target){
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target)return new int[]{i+1,j+1};
            else if(sum>target) j--;
            else i++;
        }
        return new int[]{};
    }
}

public class Prob_167_TwoSumSorted {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Standard sorted array
        printTestCase(sol, new int[]{2, 7, 11, 15}, 9);

        // Test Case 2: Sorted array with negative numbers
        printTestCase(sol, new int[]{-3, 2, 3, 90}, 0);

        // Test Case 3: Pair is at the extreme ends
        printTestCase(sol, new int[]{1, 3, 5, 8, 10}, 11);

        // Test Case 4: No valid pair exists (returns empty array)
        printTestCase(sol, new int[]{1, 2, 3, 4}, 10);
    }

    // Helper method to format and print exactly as requested
    public static void printTestCase(Solution sol, int[] arr, int target) {
        System.out.println("Input: arr = " + Arrays.toString(arr) + ", target = " + target);
        
        int[] result = sol.twoSum(arr, target);
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}
