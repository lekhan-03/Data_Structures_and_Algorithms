import java.util.Arrays;

class SolutionP3756Short {
    // Note the below solution is not for Very Long String
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int fir = queries[i][0];
            int las = queries[i][1];
            String str = s.substring(fir, las + 1);
            // int n = Integer.parseInt(str);
            int sum = sumandmuli(str);
            res[i] = sum;
        }

        return res;
    }

    public int sumandmuli(String s) {
        long MOD = 1000000007;
        long sum = 0;
        long newnum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) != '0') {
                int dig = s.charAt(i) - '0';
                newnum = (newnum * 10 + dig) % MOD;
                sum = (sum + dig) % MOD;
            }
        }
        return (int) ((sum * newnum) % MOD);
    }

}
//This is optimized one which we can apply for all the strings
class P3756_SolutionLong {
    public int[] sumAndMultiply2(String s, int[][] queries) {
        int MOD = 1000000007;
        int n = s.length();
        long[] prefixSum = new long[n + 1];
        long[] prefixValue = new long[n + 1];
        int[] prefixCount = new int[n + 1];
        long[] power10 = new long[n + 1];
        power10[0] = 1;
        for (int i = 1; i <= n; i++) {
            power10[i] = (power10[i - 1] * 10) % MOD;
        }
        for (int i = 1; i <= n; i++) {
            int dig = s.charAt(i - 1) - '0';
            if (dig != 0) {
                prefixCount[i] = prefixCount[i - 1] + 1;
                prefixSum[i] = (prefixSum[i - 1] + dig) % MOD;
                prefixValue[i] = (prefixValue[i - 1] * 10 + dig) % MOD;
            } else {
                prefixCount[i] = prefixCount[i - 1];
                prefixSum[i] = prefixSum[i - 1];
                prefixValue[i] = prefixValue[i - 1];
            }
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0] + 1;
            int r = queries[i][1] + 1;

            long num = (prefixSum[r] - prefixSum[l - 1] + MOD) % MOD;
            int count = prefixCount[r] - prefixCount[l - 1];
            long valSub = (prefixValue[l - 1] * power10[count]) % MOD;
            long val = (prefixValue[r] - valSub + MOD) % MOD;
            res[i] = (int) ((val * num) % MOD);
        }
        return res;
    }
}

public class P3756_Concate_ZerosII {
    public static void main(String[] args) {
        SolutionP3756Short solShort = new SolutionP3756Short();
        P3756_SolutionLong solLong = new P3756_SolutionLong();

        // Test Case 1: Standard string with interspersed zeros and multiple queries
        // Query 1 [0,4]: "10203" -> 123 * 6 = 738
        // Query 2 [0,2]: "102" -> 12 * 3 = 36
        // Query 3 [2,4]: "203" -> 23 * 5 = 115
        printTestCase(solShort, solLong, "10203", new int[][] { { 0, 4 }, { 0, 2 }, { 2, 4 } });

        // Test Case 2: String with no zeros
        printTestCase(solShort, solLong, "1234", new int[][] { { 0, 3 }, { 1, 2 } });

        // Test Case 3: Substrings that evaluate exactly to zero (middle zeroes)
        printTestCase(solShort, solLong, "50005", new int[][] { { 1, 3 }, { 0, 4 } });

        // Test Case 4: Long numbers with repeated digits
        printTestCase(solShort, solLong, "9990999", new int[][] { { 0, 6 }, { 3, 5 } });
    }

    // Helper method to format, run both solutions, and print exactly as requested
    private static void printTestCase(SolutionP3756Short sol1, P3756_SolutionLong sol2, String s, int[][] queries) {
        System.out.println("Input: s = \"" + s + "\", queries = " + Arrays.deepToString(queries));

        int[] resShort = sol1.sumAndMultiply(s, queries);
        int[] resLong = sol2.sumAndMultiply2(s, queries);

        System.out.println("Output (Short / Brute Force): " + Arrays.toString(resShort));
        System.out.println("Output (Long / Prefix Sums):  " + Arrays.toString(resLong) + "\n");
    }

}
