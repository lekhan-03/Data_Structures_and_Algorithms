import java.util.Scanner;

public class SecondPattern{
    static void printSecondPattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a= in.nextInt();
        printSecondPattern(a);
        
    }
}