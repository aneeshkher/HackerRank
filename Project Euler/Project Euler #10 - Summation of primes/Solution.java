import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int limit = 1000001;
        int[] composites = new int[limit];
        int start = 2;
        while (start * start < limit) {
            // Generate all composite numbers as multiples of start
            for (int i = 2; i*start < limit; i++) {
                composites[i * start] = 1;
            }
                
            // Find the next start as the first "0" number after 2
            int i = start + 1;
            for (i = start + 1; i < limit; i++) {
                if (composites[i] == 0) {
                    break;
                }
            }
            start = i;
        }
        long[] sumArray = new long[limit];
        int preComputeSum = 0;
        for (int i = 2; i < limit; i++) {
            if (composites[i] == 0) {
                sumArray[i] = sumArray[i - 1] + i;
            } else {
                sumArray[i] = sumArray[i - 1];
            }
        }
        int testCases = scan.nextInt();
        for (int z = 0; z < testCases; z++) {
            int N = scan.nextInt();
            if (N == 1) {
                System.out.println(0);
            } else {
                System.out.println(sumArray[N]);    
            }
            
        }
    }
}