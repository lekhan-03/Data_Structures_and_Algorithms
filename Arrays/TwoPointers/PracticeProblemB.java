
import java.util.Arrays;

class Solution{
    public int[] squareArray(int [] a){
        int i=0,j=a.length-1,k=a.length-1;
        int [] res=new int[a.length];
        while(i<=j){
            int prodi=a[i]*a[i];
            int prodj=a[j]*a[j];
            if(prodi>prodj){
                res[k]=prodi;
                i++;
                k--;
            }else{
                res[k]=prodj;
                j--;
                k--;
            }
        }
        return res;
    }
}
public class PracticeProblemB {
   public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Mix of negative and positive numbers
        printTestCase(sol, new int[]{-4, -1, 0, 3, 10});

        // Test Case 2: All negative numbers
        printTestCase(sol, new int[]{-7, -3, -2, -1});

        // Test Case 3: All positive numbers
        printTestCase(sol, new int[]{1, 2, 3, 4, 5});

        // Test Case 4: Array with duplicates and zeroes
        printTestCase(sol, new int[]{-3, -3, 0, 2, 2});

        // Test Case 5: Single element
        printTestCase(sol, new int[]{-5});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(Solution sol, int[] arr) {
        System.out.println("Input: a = " + Arrays.toString(arr));
        
        int[] result = sol.squareArray(arr);
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}