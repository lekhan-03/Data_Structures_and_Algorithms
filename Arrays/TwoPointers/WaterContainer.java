
import java.util.Arrays;

public class WaterContainer {
    static int maxWater(int [] arr){
        int i=0;int j=arr.length-1;
        int maxWater=0;
        while(i<j){
            int curr=Math.min(arr[i],arr[j])*(j-i);
            if(curr>maxWater){
                maxWater=curr;
            }
            if(arr[i]>arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxWater;
    }
 public static void main(String[] args) {
        // Test Case 1: Standard LeetCode example
        printTestCase(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        // Test Case 2: Just two elements
        printTestCase(new int[]{1, 1});

        // Test Case 3: Container ends are the tallest
        printTestCase(new int[]{4, 3, 2, 1, 4});

        // Test Case 4: Peak in the middle
        printTestCase(new int[]{1, 2, 1});

        // Test Case 5: All lines have the same height
        printTestCase(new int[]{5, 5, 5, 5, 5});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        int result = maxWater(arr);
        
        System.out.println("Output: " + result + "\n");
    }
}