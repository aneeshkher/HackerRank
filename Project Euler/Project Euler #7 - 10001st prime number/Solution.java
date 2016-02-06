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
        int[] primes = new int[10002];
        primes[0] = 0;
        primes[1] = 2;
        int iter = 3;
        int count = 1;
        while (count <= 10000 ) {
            if (isPrime(iter)) {
                count++;
                primes[count] = iter;
            }
            iter = iter + 2;
        }
        for (int i = 0; i < testCases; i++) {
            int n = scan.nextInt();
            System.out.println(primes[n]);
        }
    }
    
    public static boolean isPrime (int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}