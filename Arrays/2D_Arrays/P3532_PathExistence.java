import java.util.Arrays;

class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[]  groupId=new int[n];
        int countGroup=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                countGroup++;
            }
            groupId[i]=countGroup;
        }
        boolean[] res=new boolean[queries.length];
        for (int i=0; i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==r){
                res[i]=true;
            }
            res[i]= (groupId[l]==groupId[r]);
        }
        return res;
    }
}
public class P3532_PathExistence{
public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Standard array
        // Groups for maxDiff = 2: [1, 2] (diff 1), [5] (diff 3), [8, 9] (diff 1)
        // Group IDs: [0, 0, 1, 2, 2]
        printTestCase(sol, 5, new int[]{1, 2, 5, 8, 9}, 2, new int[][]{
            {0, 1}, // true (1 to 2)
            {0, 2}, // false (1 to 5, gap is too big)
            {3, 4}, // true (8 to 9)
            {1, 1}  // true (same node)
        });

        // Test Case 2: All elements are close enough (only 1 group)
        printTestCase(sol, 4, new int[]{10, 12, 13, 15}, 3, new int[][]{
            {0, 3}, // true
            {1, 2}  // true
        });

        // Test Case 3: No elements are close enough (every element is its own group)
        printTestCase(sol, 4, new int[]{10, 20, 30, 40}, 5, new int[][]{
            {0, 1}, // false
            {2, 3}, // false
            {0, 3}  // false
        });

        // Test Case 4: Array with negative numbers
        printTestCase(sol, 5, new int[]{-10, -8, -1, 0, 5}, 3, new int[][]{
            {0, 1}, // true (-10 to -8, diff is 2)
            {1, 2}, // false (-8 to -1, diff is 7)
            {2, 3}  // true (-1 to 0, diff is 1)
        });
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution sol, int n, int[] nums, int maxDiff, int[][] queries) {
        System.out.println("Input: n = " + n + ", nums = " + Arrays.toString(nums) + 
                           ", maxDiff = " + maxDiff + ", queries = " + Arrays.deepToString(queries));
        
        boolean[] result = sol.pathExistenceQueries(n, nums, maxDiff, queries);
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}