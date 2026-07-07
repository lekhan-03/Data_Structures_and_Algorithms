class SolutionP3754 {
    public long sumAndMultiply(int n) {
        int num=n;
        int sum= 0;
        int prod=1;
        int newNum=0;
        while(num!=0){
            int dig=num%10;
            if(dig!=0){
                sum=sum+dig;
                newNum+=dig*prod;
                prod*=10;
           }
            num/=10;
        }
        return (long) newNum*sum;
        
    }
}
public class P3754_Concate_zero_multiply_SumI {
    public static void main(String[] args) {
        SolutionP3754 sol = new SolutionP3754();

        // Test Case 1: Number with interspersed zeros (10203 -> newNum: 123, sum: 6)
        printTestCase(sol, 10203);

        // Test Case 2: Number with no zeros (123 -> newNum: 123, sum: 6)
        printTestCase(sol, 123);

        // Test Case 3: Trailing zeros (5000 -> newNum: 5, sum: 5)
        printTestCase(sol, 5000);

        // Test Case 4: Number is exactly zero 
        printTestCase(sol, 0);

        // Test Case 5: Repeated non-zero digits with zeros (50505 -> newNum: 555, sum: 15)
        printTestCase(sol, 50505);
    }

    // Helper method to format and print exactly as requested
    private static void printTestCase(SolutionP3754 sol, int n) {
        System.out.println("Input: n = " + n);
        
        long result = sol.sumAndMultiply(n);
        
        System.out.println("Output: " + result + "\n");
    }
}