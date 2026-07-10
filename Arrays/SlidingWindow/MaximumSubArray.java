import java.util.Arrays;

class SlidingSolution1{
    int maxSum(int[] a, int k){
        int maxsum=0;
        for(int i=0;i<=a.length-k;i++){
            int cursum=a[i];
            for(int j=i+1;j<i+k;j++){
                cursum+=a[j];
                
            }
            if(cursum>maxsum){
                    maxsum=cursum;
                }
        }
        return maxsum;
    }
    //Optimized one 
    int maxSumOpti(int[] a, int k){
        int maxsum=0,sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum+=a[i];
            if(i>=k-1){
                maxsum=Math.max(sum,maxsum);
                sum-=a[i-k+1];
            }
        }
        return maxsum;
    }
}
public class MaximumSubArray {
    public static void main(String[] args) {
        SlidingSolution1 sol = new SlidingSolution1();

        // Test Case 1: Standard array
        printTestCase(sol, new int[]{2, 1, 5, 1, 3, 2}, 3);

        // Test Case 2: Array where the max sum is at the very beginning
        printTestCase(sol, new int[]{10, 20, 2, 3, 4}, 2);

        // Test Case 3: Array where the max sum is at the very end
        printTestCase(sol, new int[]{1, 2, 3, 10, 20}, 2);

        // Test Case 4: The edge case that breaks maxsum=0 (all negative numbers)
        printTestCase(sol, new int[]{-5, -2, -9, -1, -3}, 2);

        // Test Case 5: Window size is exactly the size of the array
        printTestCase(sol, new int[]{5, 5, 5, 5}, 4);
    }

    // Helper method to format, run both solutions, and print exactly as requested
    private static void printTestCase(SlidingSolution1 sol, int[] a, int k) {
        System.out.println("Input: a = " + Arrays.toString(a) + ", k = " + k);
        
        int resultBrute = sol.maxSum(a, k);
        int resultOpti = sol.maxSumOpti(a, k);
        
        System.out.println("Output (Brute Force):     " + resultBrute);
        System.out.println("Output (Sliding Window):  " + resultOpti + "\n");
    }
}
