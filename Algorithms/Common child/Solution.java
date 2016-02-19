import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        
        System.out.println(longestCommSubseq(A, B));
    }
    
    public static int longestCommSubseq (String A, String B) {
        int[][] table = new int[A.length()][B.length()];
        
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    int x = i - 1;
                    int y = j - 1;
                    if (x == -1 || y == -1) {
                        table[i][j] = 1;
                    } else {
                        table[i][j] = table[x][y] + 1;
                    }
                } else {
                    int x, y;
                    if (i == 0)
                        x = 0;
                    else
                        x = table[i - 1][j];
                    
                    if (j == 0)
                        y = 0;
                    else
                        y = table[i][j - 1];
                    
                    if (x >= y)
                        table[i][j] = x;
                    else
                        table[i][j] = y;
                }
            }
        }
        
        return table[A.length() - 1][B.length() - 1];
    }
}