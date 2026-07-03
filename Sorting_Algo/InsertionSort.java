import java.util.*;
public class InsertionSort {
    static void insertionSort(int [] arr){
        for (int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
public static void main(String[] args) {

        printTestCase(new int[]{12, 11, 13, 5, 6});

        printTestCase(new int[]{1, 2, 3, 4, 5});

        printTestCase(new int[]{9, 8, 7, 6, 5});

        printTestCase(new int[]{4, 1, 3, 9, 4, 1});

        printTestCase(new int[]{0, -10, 15, -2, 8});
    }

    
    private static void printTestCase(int[] arr) {
        System.out.println("Input: arr = " + Arrays.toString(arr));
        
        
        insertionSort(arr);
        
        System.out.println("Output: " + Arrays.toString(arr) + "\n");
    }
}