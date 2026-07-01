
import java.util.Scanner;

public class ThirdPattern {
    static void printThirdPattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a= in.nextInt();
        printThirdPattern(a);

    }
}
