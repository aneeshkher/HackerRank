import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for (int i = 0; i < T; i++) {
            int count = 0;
            String testCase = scan.next();
            if (testCase.length() % 2 != 0) {
                System.out.println(-1);
            } else {
                char[] first = (testCase.substring(0, testCase.length()/2)).toCharArray();
                char[] second = (testCase.substring(testCase.length()/2, testCase.length())).toCharArray();
                
                int[] bitmap1 = new int[256];
                int[] bitmap2 = new int[256];
                
                for (int j = 0; j < testCase.length()/2; j++) {
                    bitmap1[(int)first[j]]++;
                }
                
                for (int j = 0; j < testCase.length()/2; j++) {
                    bitmap2[(int)second[j]]++;
                }
                
                for (int j = 0; j < 256; j++) {
                    count = count + Math.abs(bitmap1[j] - bitmap2[j]);
                }
                
                System.out.println(count/2);
            }
            
        }
    }
}