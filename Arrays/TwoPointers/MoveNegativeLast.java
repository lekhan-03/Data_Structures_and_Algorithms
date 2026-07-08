import java.util.Arrays;

class NegativeSolution{
    void moveNegatives(int [] a){
        int slow=a.length-1,fast=a.length-1;
        while (fast>=0){
            if(a[fast]<0){
                int temp = a[fast];
                a[fast]=a[slow];
                a[slow]=temp;
                slow--; 
            }
            fast--;
        }
    }
}
public class MoveNegativeLast {
    public static void main(String[] args) {
        NegativeSolution sol = new NegativeSolution();

        // Test Case 1: Standard mix of positive and negative numbers
        printTestCase(sol, new int[]{1, -2, 3, -4, 5, -6});

        // Test Case 2: Negatives are already at the end
        printTestCase(sol, new int[]{1, 2, 3, -1, -2});

        // Test Case 3: Negatives are all at the beginning
        printTestCase(sol, new int[]{-1, -2, -3, 4, 5});

        // Test Case 4: Array with zeroes (zeroes should be treated as non-negative)
        printTestCase(sol, new int[]{0, -5, 0, 2, -1});

        // Test Case 5: Empty array
        printTestCase(sol, new int[]{});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(NegativeSolution sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        sol.moveNegatives(a);
        
        System.out.println("Output: " + Arrays.toString(a) + "\n");
    }
}
