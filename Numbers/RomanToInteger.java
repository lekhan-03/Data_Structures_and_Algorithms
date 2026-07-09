import java.util.HashMap;

class SolutionRoman{
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
       for(int i=0;i<s.length();i++){
        int currval=roman.get(s.charAt(i));
        if(i<s.length()-1&&currval<roman.get(s.charAt(i+1))){
            res-=currval;
        }else{
            res+=currval;
        }
       }
        return res;
    }
}
public class RomanToInteger{
    public static void main(String[] args) {
        SolutionRoman sol = new SolutionRoman();

        // Test Case 1: Standard simple addition
        printTestCase(sol, "III");

        // Test Case 2: Standard LeetCode example (mix of values)
        printTestCase(sol, "LVIII");

        // Test Case 3: Complex LeetCode example with multiple subtraction cases (1000 + 900 + 90 + 4)
        printTestCase(sol, "MCMXCIV");

        // Test Case 4: Single subtraction case
        printTestCase(sol, "IX");

        // Test Case 5: Single character
        printTestCase(sol, "D");
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(SolutionRoman sol, String s) {
        System.out.println("Input: s = \"" + s + "\"");
        
        int result = sol.romanToInt(s);
        
        System.out.println("Output: " + result + "\n");
    }
}