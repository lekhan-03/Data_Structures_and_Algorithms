import java.util.*;

class Solution3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List <List<Integer>> res= new ArrayList<>();
       for (int k=0;k<nums.length-2;k++){
        if(k>0 && nums[k]==nums[k-1]) continue;
        int i=k+1, j=nums.length-1;
        int target=-nums[k];
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                List <Integer> triplet=new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(nums[j]);
                triplet.add(nums[k]);

                res.add(triplet);
                i++;
                j--;
                while(i<j && nums[i]==nums[i-1]) i++;
                while(i<j && nums[j]==nums[j+1]) j--;

            
            }else if(sum>target){
                j--;
            }else i++;
        }
       }
       return res;
    }
}
public class prob15_3Sum {
  public static void main(String[] args) {
        Solution3Sum sol = new Solution3Sum();

        // Test Case 1: Standard LeetCode example
        printTestCase(sol, new int[]{-1, 0, 1, 2, -1, -4});

        // Test Case 2: Array with no valid combinations that equal 0
        printTestCase(sol, new int[]{0, 1, 1});

        // Test Case 3: Array with all zeros (should return one triplet [0, 0, 0])
        printTestCase(sol, new int[]{0, 0, 0, 0});

        // Test Case 4: Array with positive numbers only
        printTestCase(sol, new int[]{1, 2, 3, 4});

        // Test Case 5: Array with multiple duplicates requiring heavy skipping
        printTestCase(sol, new int[]{-2, 0, 0, 2, 2});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution3Sum sol, int[] nums) {
        System.out.println("Input: nums = " + Arrays.toString(nums));
        
        List<List<Integer>> result = sol.threeSum(nums);
        
        System.out.println("Output: " + result + "\n");
    }
}