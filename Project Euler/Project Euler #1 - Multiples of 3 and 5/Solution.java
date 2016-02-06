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
            
            int threes = (n-1)/3;
            BigInteger b3 = new BigInteger("0");
            int t1 = threes + 1;
            b3 = b3.add(BigInteger.valueOf(threes));
            b3 = b3.multiply(BigInteger.valueOf(t1));
            b3 = b3.multiply(BigInteger.valueOf(3));
            b3 = b3.divide(BigInteger.valueOf(2));
            
            int fives = (n-1)/5;
            BigInteger b5 = new BigInteger("0");
            int f1 = fives + 1;
            b5 = b5.add(BigInteger.valueOf(fives));
            b5 = b5.multiply(BigInteger.valueOf(f1));
            b5 = b5.multiply(BigInteger.valueOf(5));
            b5 = b5.divide(BigInteger.valueOf(2));
            
            int fifteens = (n-1)/15;
            BigInteger b15 = new BigInteger("0");
            int fif1 = fifteens + 1;
            b15 = b15.add(BigInteger.valueOf(fifteens));
            b15 = b15.multiply(BigInteger.valueOf(fif1));
            b15 = b15.multiply(BigInteger.valueOf(15));
            b15 = b15.divide(BigInteger.valueOf(2));
            
            BigInteger answer = new BigInteger("0");
            answer = answer.add(b5);
            answer = answer.add(b3);
            answer = answer.subtract(b15);
            
            System.out.println(answer);
        }
    }
}