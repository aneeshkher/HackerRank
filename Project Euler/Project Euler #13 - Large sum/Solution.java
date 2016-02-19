import java.util.Scanner;
import java.lang.Character;
import java.lang.Integer;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] numbers = new String[N];
        for (int z = 0; z < N; z++) {
            numbers[z] = scan.next();
        }
        
        int limit = 50;
        char[] sum = new char[60];
        int carry = 0;
        int length = 10;
        for (int m = 0; m < limit; m++) {
            int digitSum = 0;
            for (int i = 0; i < N; i++) {
                digitSum = digitSum + Character.getNumericValue(numbers[i].charAt(limit - m - 1));
            }
            digitSum = digitSum + carry;
            String digitSumString = Integer.toString(digitSum);
            if (m == limit - 1) {
                int temp = 0;
                int k;
                for (k = m; k < m + digitSumString.length(); k++) {
                    sum[k] = digitSumString.charAt(digitSumString.length() - 1 - temp);
                    temp++;
                }
                length = k;
            } else {
                sum[m] = digitSumString.charAt(digitSumString.length() - 1);
            }
            
            if (digitSumString.length() > 1) { 
                carry = Integer.parseInt(digitSumString.substring(0, digitSumString.length() - 1));
            } else {
                carry = 0;
            }
        }
        for (int a = 0; a < 10; a++) {
            System.out.print(sum[length - 1]);
            length--;
        }
    }
}