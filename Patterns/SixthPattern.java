
import java.util.Scanner;

public class SixthPattern {

    static void print6th(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        print6th(a);
        System.out.println("Reverse of the Pattern");
        // reverseThirdPattern(a);
    }
}
