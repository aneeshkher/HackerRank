import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int[] bitmap = new int[256];
        
        for (int i = 0; i < sentence.length(); i++) {
            bitmap[(int)sentence.charAt(i)]++;
        }
        
        int flag = 0;
        for (int i = 65; i < 91; i++) {
            if ((bitmap[i] < 1) && (bitmap[i+32] < 1)) {
                System.out.println("not pangram");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("pangram");
        }
    }
}