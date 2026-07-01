import java.util.Scanner;

public class GCD {
    static int getGCD(int n1,int n2){
        int min=Math.min(n1, n2);
        int gcd=1;
        for (int i=1;i<=min;i++){
            if(n1%i==0&& n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=in.nextInt();
        System.out.println("Enter the number:");
        int num2=in.nextInt();
        System.out.println("The GCD of the Two Numbers is "+getGCD(num1, num2));
    }
    
}
