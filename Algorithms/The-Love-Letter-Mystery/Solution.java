import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		sc.nextLine();
		
		String s1[] = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			s1[i] = sc.nextLine();
			
		}
		TestLLM t1 = new TestLLM();
		for (int i = 0; i < testCases; i++) {
			t1.makePalindrome(s1[i]);
		}
        
    }
}

class TestLLM {
	public void makePalindrome (String word) {
		
		int stringLength = word.length();
		int flag = stringLength % 2;
		int half = (int)Math.floor(stringLength/2);
		int j, difference;
		difference = 0;
		for (int i = 0; i < half; i++) {
			j = stringLength - i - 1;
			difference = difference + Math.abs(word.charAt(i) - word.charAt(j));
		}
		System.out.println(difference);
	}
}