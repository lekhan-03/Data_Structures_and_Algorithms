import java.util.Arrays;

class SolutionBoat {
    public int numRescueBoats(int[] a, int lim) {
        Arrays.sort(a);
        int i = 0, j = a.length - 1, count = 0;
        while (i <= j) {
            // int max = Math.max(a[i], a[j]);
            if (a[i] + a[j] <= lim) {
                i++;
            }
            j--;

            count++;
        }
        return count;
    }
}

public class P881_boatProblem {
    
    public static void main(String[] args) {
        SolutionBoat sol = new SolutionBoat();

        // Test Case 1: Perfect pair
        printTestCase(sol, new int[]{1, 2}, 3);

        // Test Case 2: Mixed weights, some pairs, some single trips
        printTestCase(sol, new int[]{3, 2, 2, 1}, 3);

        // Test Case 3: Everyone weighs exactly the limit (no pairs possible)
        printTestCase(sol, new int[]{5, 5, 5, 5}, 5);

        // Test Case 4: Lots of light people, but a boat only holds a max of 2 people
        printTestCase(sol, new int[]{1, 1, 1, 1}, 3);

        // Test Case 5: Standard mixed array
        printTestCase(sol, new int[]{3, 5, 3, 4}, 5);
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(SolutionBoat sol, int[] a, int lim) {
        System.out.println("Input: a = " + Arrays.toString(a) + ", lim = " + lim);
        
        int result = sol.numRescueBoats(a, lim);
        
        System.out.println("Output: " + result + "\n");
    }
}
