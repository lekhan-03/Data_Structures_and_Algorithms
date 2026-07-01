import java.util.Scanner;

public class FifthPattern {
    static void print5thPattern(int n){
        for (int i = 0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
              for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void reversePattern(int n){
        for (int i = 0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
              for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a= in.nextInt();
        print5thPattern(a);
        System.out.println("Reverse of the Pattern");
        reversePattern(a);
    }
}
