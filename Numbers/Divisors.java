import java.util.Scanner;

public class Divisors {
    static void printDivisors(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" is a Divisor");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        printDivisors(num);
        
    }
}
