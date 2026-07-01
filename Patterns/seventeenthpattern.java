
import java.util.Scanner;

public class seventeenthpattern {

    static void print17th(int n) {
        
        
        for (int i = 0; i < n; i++) {
            //Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char start='A';
            int breakpoint=(2*i+1)/2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                
                System.out.print(start);
                
                if(j<=breakpoint) start++;
                else start--;
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        print17th(a);
    }
}
