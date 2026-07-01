import java.util.Scanner;

public class ninthPattern {
    static void print9th(int n){
        char start='A';
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                int print=(int)start+j;
                System.out.print((char)print);
            }
            System.out.println();
        }
        
    }
    static void print9thdown(int n){
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<=i;j++){
                int print=(char)'A'+j;
                System.out.print((char)print);
            }
            System.out.println();
        }
    }
    static void print16th(int n){
        
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                int print=(int)'A'+i;
                System.out.print((char)print);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a = in.nextInt();
        print9th(a);
        System.out.println("Reverse of the Pattern");
        print9thdown(a);
        System.out.println("The 16th Pattern in Striver Sheet");
        print16th(a);
       /*
        A
        AB
        ABC
        ABCD
        ABCDE
        Reverse of the Pattern
        ABCDE
        ABCD
        ABC
        AB
        A 
        */ 

        
    }
    
}
