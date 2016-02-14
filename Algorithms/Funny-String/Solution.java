import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int z = 0; z < testCases; z++) {
            String temp = scan.next();
            StringBuffer word = new StringBuffer(temp);
            StringBuffer rev = new StringBuffer(temp);
            for (int i = 0; i < word.length()/2; i++) {
                // Swap the chars
                char first = rev.charAt(i);
                rev.setCharAt(i, rev.charAt(rev.length() - i - 1));
                rev.setCharAt(rev.length() - i - 1, first);
            }
            int flag = 0;
            for (int i = 0; i < word.length() - 1; i++) {
                if (Math.abs(word.charAt(i) - word.charAt(i + 1)) != 
                    Math.abs(rev.charAt(i) - rev.charAt(i + 1))) {
                    System.out.println("Not Funny");
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                System.out.println("Funny");
            }
        }
    }
}