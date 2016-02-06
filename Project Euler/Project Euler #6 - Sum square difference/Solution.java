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
            int nPlusOne = n + 1;
            int twoNPlusOne = 2 * n + 1;
            BigInteger sumOfSquares = new BigInteger("0");
            BigInteger squareOfSum = new BigInteger("0");
            
            squareOfSum = squareOfSum.add(BigInteger.valueOf(n));
            squareOfSum = squareOfSum.multiply(BigInteger.valueOf(nPlusOne));
            squareOfSum = squareOfSum.divide(BigInteger.valueOf(2));
            squareOfSum = squareOfSum.pow(2);
            
            sumOfSquares = sumOfSquares.add(BigInteger.valueOf(n));
            sumOfSquares = sumOfSquares.multiply(BigInteger.valueOf(nPlusOne));
            sumOfSquares = sumOfSquares.multiply(BigInteger.valueOf(twoNPlusOne));
            sumOfSquares = sumOfSquares.divide(BigInteger.valueOf(6));
            
            BigInteger answer = new BigInteger("0");
            answer = squareOfSum.subtract(sumOfSquares);
            System.out.println(answer);
        }
    }
}