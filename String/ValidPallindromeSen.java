public class ValidPallindromeSen {
    static boolean ValidPalindrome(String str){
        String ori=str.replaceAll("[^a-zA-Z0-9]", "");
        String fin= ori.toLowerCase();
        int i=0,j=fin.length()-1;
        while(i<j){
            if(fin.charAt(i)!=fin.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    static boolean ValPal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
public static void main(String[] args) {
        printTestCase("A man, a plan, a canal: Panama");

        printTestCase("race a car");

        printTestCase(" ");

        printTestCase("123a321");

        printTestCase(".,!? ");
    }

    private static void printTestCase(String str) {
        System.out.println("Input: str = \"" + str + "\"");
        
        boolean result = ValidPalindrome(str);
        
        System.out.println("Output: " + result + "\n");
    }
}