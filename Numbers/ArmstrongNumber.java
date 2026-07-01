import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int len=String.valueOf(n).length();
        int res=0;
        int x=n;
        while (x>0){
            int rem=x%10;
            res+=Math.pow(rem,len);
            x/=10;

        }
        return res==n;

    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        if(isArmstrong(num)) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");
    }
}
