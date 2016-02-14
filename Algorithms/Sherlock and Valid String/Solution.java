import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String sherlock = scan.next();
        int[] bitmap = new int[256];
        for (int i = 0; i < sherlock.length(); i++) {
            bitmap[(int)sherlock.charAt(i)]++;
        }
        // printBitmap(bitmap);
        int count = 0;
        int countDiff = 0;
        int violate = 0;
        int k;
        for (k = 97; k < 123; k++) {
            if (bitmap[k] != 0) {
                break;
            }
        }
        for (int i = 97; i < 123; i++) {
            if (bitmap[i] != 0) {
                if (bitmap[k] != bitmap[i]) {
                    count = count + Math.abs(bitmap[k] - bitmap[i]);
                    countDiff++;
                    violate = i;
                }
            }
        }
        
        if (count < 2) {
            System.out.println("YES");
        } else {
            if (countDiff == 1) {
                if (bitmap[violate] == 1) {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static void printBitmap(int[] bitmap) {
        for (int i = 97; i < 123; i++) {
            System.out.print(bitmap[i] + " ");
        }
        System.out.println("");
    }
    
    public static void printDiffMap (int[] diff) {
        for (int i = 0; i < 25; i++) {
            System.out.print(diff[i] + " ");
        }
        System.out.println("");
    }
}