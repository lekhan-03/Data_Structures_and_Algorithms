import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        if(isPrime(num)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
