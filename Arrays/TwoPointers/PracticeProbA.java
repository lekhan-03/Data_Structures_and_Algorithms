

import java.util.Arrays;



public class PracticeProbA {

    static int[] twoSub(int[] arr, int target){
        int i=0,j=1;
        while(j<arr.length){
            int sub=arr[j]-arr[i];
            if(sub==target) return new int[]{i+1,j+1};
            else if(sub>target)i++;
            else j++;
        }

        return new int[] {};
    }
public static void main(String[] args) {

        printTestCase(new int[]{1, 5, 8, 10, 15}, 7);


        printTestCase(new int[]{2, 3, 5, 10, 50, 80}, 45);

        printTestCase(new int[]{1, 2, 3, 5, 10}, 1);

        printTestCase(new int[]{1, 2, 4, 8, 16}, 10);


        printTestCase(new int[]{1, 2, 2, 3, 4}, 0);
    }

    private static void printTestCase(int[] arr, int target) {
        System.out.println("Input: arr = " + Arrays.toString(arr) + ", target = " + target);
        
        int[] result = twoSub(arr, target);
        
        System.out.println("Output: " + Arrays.toString(result) + "\n");
    }
}
