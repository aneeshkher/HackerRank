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
            int n = scan.nextInt();
            int lower = n/999;
            int difference = 999 - lower;
            int iter = 0;
            int product = 999 * lower;
            int highest = 0;
            while (iter < difference) {
                int upper = 999 - iter;
                int tempIter = 0;
                product = upper * lower;
                while (product <= n) {
                    if (isPalindrome(product)) {
                        if (product > highest) {
                            highest = product;
                        }
                    }
                    tempIter++;
                    product = upper * (lower + tempIter);
                }
                iter++;
            }
            System.out.println(highest);
        }
        
    }
    
    public static boolean isPalindrome (int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < (number.length())/2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}