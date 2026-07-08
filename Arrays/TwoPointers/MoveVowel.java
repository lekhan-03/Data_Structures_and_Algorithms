import java.util.Arrays;

class moveVowels{
    void vowelsLast(char [] a ){
        int slow=a.length-1;
        for(int fast=a.length-1; fast>=0;fast--){
            if(a[fast]=='a'||a[fast]=='e'||a[fast]=='i'||a[fast]=='o'||a[fast]=='u'){
                char temp= a[fast];
                a[fast]=a[slow];
                a[slow]=temp;
                slow--;
            }
        }
    }
}
public class MoveVowel {
    public static void main(String[] args) {
        moveVowels sol = new moveVowels();

        // Test Case 1: Standard word (hello -> hll eo)
        printTestCase(sol, new char[]{'h', 'e', 'l', 'l', 'o'});

        // Test Case 2: Vowels are at the beginning (apple -> ppl ae)
        printTestCase(sol, new char[]{'a', 'p', 'p', 'l', 'e'});

        // Test Case 3: No vowels at all (should remain unchanged)
        printTestCase(sol, new char[]{'r', 'h', 'y', 't', 'h', 'm'});

        // Test Case 4: All vowels (should remain unchanged)
        printTestCase(sol, new char[]{'a', 'e', 'i', 'o', 'u'});

        // Test Case 5: Mixed case to test uppercase handling
        printTestCase(sol, new char[]{'E', 'x', 'a', 'm', 'p', 'l', 'e'});
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(moveVowels sol, char[] a) {
        System.out.println("Input: a = " + Arrays.toString(a));
        
        sol.vowelsLast(a);
        
        System.out.println("Output: " + Arrays.toString(a) + "\n");
    }
}
