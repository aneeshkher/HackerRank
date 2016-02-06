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
        int flag = 0;
        for (int i = 0; i < testCases; i++) {
            int n = scan.nextInt();
            for (int j = n; j > 0; j+=n) {
                flag = 0;
                for (int k = 1; k < n; k++) {
                    if (j % k != 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(j);
                    flag = 0;
                    break;
                }
            }
        }
    }
}