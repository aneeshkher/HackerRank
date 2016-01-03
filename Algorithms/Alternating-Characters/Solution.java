import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int temp, j, count;
		char first;
        
        String s1[] = new String[100000];
		Scanner scan = new Scanner(System.in);

		int testCases = scan.nextInt();
        
        scan.nextLine();
        
        for (int i = 0; i < testCases; i++) {
			count = 0;
			s1[i] = scan.nextLine();
        }
        
        for (int i = 0; i < testCases; i++) {
			count = 0;
			for (j = 1; j < s1[i].length(); j++) {
				if (s1[i].charAt(j) == s1[i].charAt(j-1)) {
					count++;
				}
			}
			System.out.println(count);
		}

		scan.close();
    }
}