
import java.util.Scanner;

public class seventhPattern {

    static void print7th(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            //Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //Spaces
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }

            //Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        print7th(a);
        System.out.println("Reverse of the Pattern");
        // reverseThirdPattern(a);
    }
}
