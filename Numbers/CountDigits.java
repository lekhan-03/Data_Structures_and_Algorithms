
import java.util.Scanner;



class CountDigits {
    static int count(int num){
        int c=0;
        while(num>0){
            num/=10;
            c++;
        }    
    return c;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = in.nextInt();
        System.out.println(count(a));


    }
    
}
