
import java.util.Scanner;

public class ReverseNum {
    static int revNum(int n){
        int x=n;
        int rev=0;
        while(x>0){
            int rem= x%10;
            rev=rev*10+rem;
            x/=10;
        }
        return rev;
    }
    static void checkPallindrome(int n){
        if(n==revNum(n)){
            System.out.println("Number is pallindrome.");
        }else{
            System.out.println("Number is not pallindrome");
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        System.out.println("Reverse of the Number is "+revNum(num));
        checkPallindrome(num);
        
    }
}
