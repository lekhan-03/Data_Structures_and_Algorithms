
import java.util.Scanner;

public class FirstPattern{
    static void printPatternOne(int n,int m){
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a= in.nextInt();
        System.out.println("Enter the Number of columns");
        int b= in.nextInt();
        printPatternOne(a, b);
    }
}