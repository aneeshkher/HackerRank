import java.util.Scanner;
import java.lang.StringBuffer;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int flag = 1;
        for (int z = 0; z < testCases; z++) {
            String word = scan.next();
            int index = isPalindrome(word);
            if (index == -1) {
                System.out.println(-1);
            } else {
                if (checkPalindrome(word, index)) {
                    System.out.println(index);
                } else if (checkPalindrome(word, word.length() - 1 - index)) {
                    System.out.println(word.length() - 1 - index);
                }
            }
        }
    }
    
    public static int isPalindrome (String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static boolean checkPalindrome(String word, int index) {
        StringBuffer sb = new StringBuffer(word.substring(0, index));
        sb = sb.append(word.substring(index+1));
        if (isPalindrome(new String(sb)) == -1) {
            return true;
        } else {
            return false;
        }
    }
}
