import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numOfRocks = scan.nextInt();
        int[] bitmap = new int[256];
        int[] newBitmap = new int[256];
        String firstRock = scan.next();
        for (int z = 0; z < firstRock.length(); z++) {
            if (bitmap[firstRock.charAt(z)] == 0) {
                bitmap[firstRock.charAt(z)]++;
            }
        }
        for (int z = 1; z < numOfRocks; z++) {
            String rock = scan.next();
            for (int i = 0; i < rock.length(); i++) {
                if (bitmap[rock.charAt(i)] == 1) {
                    bitmap[rock.charAt(i)]++;
                }
            }
            for (int i = 97; i < 123; i++) {
                if (bitmap[i] == 1) {
                    bitmap[i] = 0;
                } else if (bitmap[i] > 1) {
                    bitmap[i] = 1;
                }
            }
        }
        
        int count = 0;
        for (int i = 97; i < 123; i++) {
            if (bitmap[i] > 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}