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
        for (int z = 0; z < testCases; z++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            String number = scan.next();
            int largest = 0;
            for (int i = 0; i < number.length() - K + 1; i++) {
                int product = 1;
                for (int j = i; j < i + K; j++) {
                    product = product * Character.getNumericValue(number.charAt(j));
                }
                if (product > largest) {
                    largest = product;
                }
            }
            System.out.println(largest);
        }
    }
}