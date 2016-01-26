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
        String str1 = scan.next();
        String str2 = scan.next();
        
        int[] first = new int[256];
        int[] second = new int[256];
        
        for (int i = 0; i < str1.length(); i++) {
            first[(int)str1.charAt(i)]++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            second[(int)str2.charAt(i)]++;
        }
        
        int count = 0;
        for (int i = 0; i < 256; i++) {
            count = count + Math.abs((first[i] - second[i]));
        }
        System.out.println(count);
    }
}