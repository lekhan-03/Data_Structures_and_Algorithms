import java.util.Arrays;
public class PalindromeArray {
    static boolean isPalindrome(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
   
        printTestCase(new int[]{1, 2, 3, 2, 1});

        printTestCase(new int[]{1, 2, 2, 1});

        printTestCase(new int[]{1, 2, 3, 4, 5});

        printTestCase(new int[]{99});

        printTestCase(new int[]{});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        boolean result = isPalindrome(arr);
        
        System.out.println("Output: " + result + "\n");
    }
}