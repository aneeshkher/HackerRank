import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        long[] myFibArray = new long[3];  
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            String next = scan.next();
            long n = Long.parseLong(next);
            long count = 0;
            myFibArray[0] = (long)0;
            myFibArray[1] = (long)1;
            for (int j = 2; j > 0; j++) {
                long fib = myFibArray[1] + myFibArray[0];
                myFibArray[0] = myFibArray[1];
                myFibArray[1] = fib;
                if (fib <= n) {
                    if (fib % 2 == 0) {
                        count = count + fib;
                    }    
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
    
    public static long fibo (long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}