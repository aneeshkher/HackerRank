import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            String first = scan.next();
            String second = scan.next();
            
            int[] count1 = new int[256];
            int[] count2 = new int[256];
            
            for (int j = 0; j < first.length(); j++) {
                count1[(int)first.charAt(j)]++;
            }
            
            for (int j = 0; j < second.length(); j++) {
                count2[(int)second.charAt(j)]++;
            }
            
            if (first.length() < second.length()) {
                int j;
                for (j = 0; j < first.length(); j++) {
                    if (count2[(int)first.charAt(j)] > 0) {
                        System.out.println("YES");
                        break;
                    }
                }
                if (j == first.length()) {
                    System.out.println("NO");
                }
            } else {
                int j;
                for (j = 0; j < second.length(); j++) {
                    if (count1[(int)second.charAt(j)] > 0) {
                        System.out.println("YES");
                        break;
                    }
                }
                if (j == second.length()) {
                    System.out.println("NO");    
                }
            }
        }
    }
}