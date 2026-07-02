
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqArrayElements {
    static List<int[]> countFreq(int [] arr){
        HashMap <Integer,Integer> Map1=new HashMap<Integer,Integer>();
        List <int[]>L1=new ArrayList<>();

        for (int i: arr){
            int freq=0;
            if(Map1.containsKey(i)) freq=Map1.get(i);
            freq++;
            Map1.put(i,freq);
        }
        for (Map.Entry<Integer, Integer> en : Map1.entrySet()) {
            int key = en.getKey();
            int val = en.getValue();
            L1.add(new int[]{key,val});            
        }
        return L1;

    } 
    public static void main(String[] args) {
   int[] test1 = {1, 2, 2, 3, 1, 4, 1};
        System.out.println("Test Case 1: Mixed duplicates " +Arrays.toString(test1));
        printResult(countFreq(test1));

        // Test Case 2:
        int[] test2 = {5, 5, 5, 5};
        System.out.println("Test Case 2: All identical elements " + Arrays.toString(test2));
        printResult(countFreq(test2));

        // Test Case 3:
        int[] test3 = {10, 20, 30, 40};
        System.out.println("Test Case 3:  " + Arrays.toString(test3));
        printResult(countFreq(test3));

        // Test Case 4: 
        int[] test4 = {};
        System.out.println("Test Case 4: " + Arrays.toString(test4));
        printResult(countFreq(test4));

        // Test Case 5: 
        int[] test5 = {-1, 2, -1, -3, 2, 0};
        System.out.println("Test Case 5:  " + Arrays.toString(test5));
        printResult(countFreq(test5));
    }

    // Helper method to print the List<int[]> in a readable format
    private static void printResult(List<int[]> result) {
        if (result.isEmpty()) {
            System.out.println("  -> [Empty Result]\n");
            return;
        }
        for (int[] pair : result) {
            System.out.println("  -> Element: " + pair[0] + ", Frequency: " + pair[1]);
        }
        System.out.println();
    }
}