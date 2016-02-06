import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int j = 0; j < testCases; j++) {
            long largest = 1;
            long n = scan.nextLong();
            long root = Math.round(Math.sqrt(n));
            for (long i = 1; i <= root; i++) {
                if (n % i == 0) {
                    long factor = n/i;
                    if (isPrime(factor)) {
                        largest = factor;
                        break;
                    } else if (isPrime(i)) {
                        largest = i;
                    }
                }
            }
            System.out.println(largest);
        }
    }
    
    public static boolean isPrime (long n) {
        long root = Math.round(Math.sqrt(n));
        for (long i = 2; i <= root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}