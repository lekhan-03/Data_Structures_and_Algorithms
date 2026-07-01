import java.util.Scanner;

public class eighthPattern {
    static void print8th(int n){
        int start=1;
        for (int i=0; i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(start +" ");
                start+=1;
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        print8th(a);
        System.out.println("Reverse of the Pattern");
    }
    
}
