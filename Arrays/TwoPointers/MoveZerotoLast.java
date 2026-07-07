import java.util.Arrays;

class SolutionZero{
    int [] moveZeros(int [] a){
        int slow=0;
        for (int fast=0;fast<a.length;fast++){
            if(a[fast]!=0){
                int temp= a[fast];
                a[fast]=a[slow];
                a[slow]=temp;
                slow++;
            }
        }
        return a;
    }
}
public class MoveZerotoLast {
    public static void main(String[] args) {
        SolutionZero sol = new SolutionZero();

        // Test Case 1: Standard LeetCode example
        printTestCase(sol, new int[]{0, 1, 0, 3, 12});

        // Test Case 2: Array with no zeroes
        printTestCase(sol, new int[]{1, 2, 3, 4, 5});

        // Test Case 3: Array with all zeroes
        printTestCase(sol, new int[]{0, 0, 0, 0});

        // Test Case 4: Zeroes are already at the end
        printTestCase(sol, new int[]{4, 2, 0, 0});

        // Test Case 5: Zeroes are all at the beginning
        printTestCase(sol, new int[]{0, 0, 1, 2, 3});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(SolutionZero sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        int[] result = sol.moveZeros(a);
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}
