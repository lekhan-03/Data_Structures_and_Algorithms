import java.util.Arrays;

class Solution1250{
    public boolean isGoodArray(int[] nums) {
       int gcdValue=nums[0];
       for (int num: nums){
        gcdValue=gcd(gcdValue,num);
        if(gcdValue==1){
            return true;
        }
       } 
       return false;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a= temp;
        }
        return a;
    }
}

public class GoodArray{
    public static void main(String[] args) {
        Solution1250 sol = new Solution1250();

        // Test Case 1: Standard LeetCode example (GCD of all numbers evaluates to 1)
        printTestCase(sol, new int[]{12, 5, 7, 23});

        // Test Case 2: Subsets have common divisors, but the overall array GCD is 1
        // (gcd(6, 10) = 2 -> gcd(2, 15) = 1)
        printTestCase(sol, new int[]{6, 10, 15});

        // Test Case 3: All numbers share a common divisor of 3 (Not a good array)
        printTestCase(sol, new int[]{3, 6, 9, 12});

        // Test Case 4: All numbers share a common divisor of 2
        printTestCase(sol, new int[]{2, 4, 6, 8, 10});

        // Test Case 5: Single element that is 1 (Base edge case)
        printTestCase(sol, new int[]{1});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution1250 sol, int[] nums) {
        System.out.println("Input: nums = " + Arrays.toString(nums));
        
        boolean result = sol.isGoodArray(nums);
        
        System.out.println("Output: " + result + "\n");
    }
}