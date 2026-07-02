
import java.util.*;

public class HighestOccurance {

    static int highestOcc(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int highfreq=0;
        int ele=0;
        for (int i : arr) {
            int freq = 0;
            if (m.containsKey(i)) {
                freq = m.get(i);
            }
            freq++;
            m.put(i, freq);
        }
        for (Map.Entry<Integer,Integer> en: m.entrySet()){
            int key = en.getKey();
            int val = en.getValue();
            if(val>highfreq){
                highfreq=val;
                ele=key;
            }

        }
        return ele;
    }

  public static void main(String[] args) {
        // Test Case 1:
        printTestCase(new int[]{1, 2, 2, 1, 3});

        // Test Case 2: 
        printTestCase(new int[]{5, 5, 5, 5});

        // Test Case 3: 
        printTestCase(new int[]{10, 20, 30, 40});

        // Test Case 4:
        printTestCase(new int[]{});

        // Test Case 5: 
        printTestCase(new int[]{-1, 2, -1, -3, 2, -1});
    }

    private static void printTestCase(int[] nums) {
        System.out.println("Input: nums = " + Arrays.toString(nums));
        int result = highestOcc(nums);
        System.out.println("Output: " + result + "\n");
    }
}