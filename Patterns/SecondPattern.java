
import java.util.Scanner;

public class SecondPattern {

    static void printSecondPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void reverseSecond(int a){
        for (int i = a; i >0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

  

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        printSecondPattern(a);
        System.out.println("The Reverse of this Pattern");
        reverseSecond(a);
        System.out.println("The Comibined Pattern is :");
        printSecondPattern(a);
        reverseSecond(a);
    }
}
