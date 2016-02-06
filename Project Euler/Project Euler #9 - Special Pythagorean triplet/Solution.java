import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int z = 0; z < testCases; z++) {
            int N = scan.nextInt();
            int largest = 1;
            int product = 1;
            int flag = 0;
            for (int a = 1; a < N/2; a++) {
                int num = (N * N) + (2 * a * a) - (2 * a * N);
                int denominator = (2 * N) - (2 * a);
                if (num % denominator == 0) {
                    flag = 1;
                    int c = num/denominator;
                    int b = N - a - c;
                    product = a * b * c;
                    if (product > largest) {
                        largest = product;
                    }
                }
            }
            if (flag == 1) {
                System.out.println(largest);    
            } else {
                System.out.println(-1);
            }  
        }
    }
}