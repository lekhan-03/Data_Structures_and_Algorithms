import java.util.Arrays;

class EvenSolution {
    void moveEvenEle(int [] a){
        int slow=0;
        for (int fast=0;fast<a.length;fast++){
            if(a[fast]%2==0){
                int temp =a [fast];
                a[fast]=a[slow];
                a[slow]=temp;
                slow++;
            }
        }
    }
}

public class MoveEvens {
    public static void main(String[] args) {
        EvenSolution sol = new EvenSolution();

        // Test Case 1: Standard mix of odd and even numbers
        printTestCase(sol, new int[]{3, 1, 2, 4, 7, 6});

        // Test Case 2: All even numbers (should remain mostly unchanged)
        printTestCase(sol, new int[]{2, 4, 6, 8});

        // Test Case 3: All odd numbers (should remain unchanged)
        printTestCase(sol, new int[]{1, 3, 5, 7});

        // Test Case 4: Array with negative numbers and zero (0 is mathematically even)
        printTestCase(sol, new int[]{-3, -2, 0, 5, 4});

        // Test Case 5: Empty array
        printTestCase(sol, new int[]{});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(EvenSolution sol, int[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        sol.moveEvenEle(a);
        
        System.out.println("Output: " + Arrays.toString(a) + "\n");
    }
}
