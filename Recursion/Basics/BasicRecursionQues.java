
import java.util.Arrays;
import java.util.Scanner;

public class BasicRecursionQues {

    // static int c=0;
    static void printing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(1);
        // 3c++;
        printing(n - 1);
    }

    static void printingname(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Name");
        printingname(n - 1);

    }
    static int count = 1;

    static void print1toN(int n) {
        if (count == n + 1) {
            return;
        }
        System.out.println(count);
        count++;
        print1toN(n);
    }

    static void printNto1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    static int sumOfN(int N) {
        if (N < 0) {
            return 0;
        }
        return N + sumOfN(N - 1);
    }
    static int factroial(int n){
        if(n<=1){
            return 1;
        }
        return n*factroial(n-1);
    }
    static void reverseArray(int[] a,int l,int r){
        if(l>=r){
            return;
        }
        int temp= a[l];
        a[l]=a[r];
        a[r]=temp;
        reverseArray(a, l+1, r-1);
         
    }
    static boolean isPal(String str, int i,int j){
        if(i>j/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j-i)){
            return false;
        }
        return isPal(str, i+1, j);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a= {1,2,3,4};
        String str="malayalam";
        int i=0,j=str.length()-1;
        int l=0,r=a.length-1;
        System.out.println("Enter the number of times to print one using Recursion:");
        int n = in.nextInt();
        System.out.println("N number of times 1");
        printing(n);
        System.out.println("'Name' n number of times");
        printingname(n);
        System.out.println("Printing 1 to N");
        print1toN(n);
        System.out.println("Printing N to 1");
        printNto1(n);
        System.out.println("The Sum of N numbers is : " + sumOfN(n));
        System.out.println("The Factorial of the given Number is "+factroial(n));
        System.out.println("Array before Reversing "+Arrays.toString(a));
        reverseArray(a, l, r);
        System.out.println("Array after Reversing: "+Arrays.toString(a));
        System.out.println(isPal(str, i, j));
        

    }
}
