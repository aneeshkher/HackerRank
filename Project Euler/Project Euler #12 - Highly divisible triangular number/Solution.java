import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int z = 0; z < testCases; z++) {
            int N = scan.nextInt();
            for (int i = N; i > 0; i++) {
                int triNumber = (i * (i + 1)) / 2;
                int divisors = 0;
                if (i % 2 == 0) {
                    divisors = getDivCount(i/2) * getDivCount(i + 1);
                } else {
                    divisors = getDivCount(i) * getDivCount((i + 1) / 2);
                }
                //int divisors = getFactors(triNumber);
                if (divisors > N) {
                    System.out.println(triNumber);
                    break;
                }
            }
        }
    }
    
    public static int getFactors (int n) {
        int limit = n;
        int count = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < limit; i++) {
            if (n % i == 0) {
                limit = n / i;
                if (limit != i) {
                    count++;
                }
                count++;
            }
        }
        return count;
    }
    
    public static int getDivCount (int n) {
        int squareRoot = (int)Math.round(Math.sqrt(n));
        int count = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i <= squareRoot; i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
                //count = count + 2;
            }
        }
        
        return count;
    }
}