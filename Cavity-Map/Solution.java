import java.util.Scanner;

public class Solution {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] matrix = new String[n];
		int[][] map = new int[n][n];
		char[][] charMap = new char[n][n];
		for (int i = 0; i < n; i++) {
			String row = scan.next();
			matrix[i] = row;
			for (int j = 0; j < n; j++) {
				map[i][j] = Character.getNumericValue(row.charAt(j));
			}
			charMap[i] = row.toCharArray();

		}

		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < n-1; j++) {
				if ((map[i][j] > map[i][j-1])) {
					if (map[i][j] > map[i][j+1]) {
						if (map[i][j] > map[i-1][j]) {
							if (map[i][j] > map[i+1][j]) {
								charMap[i][j] = 'X';
							}		
						}
					}
				} 
			}
		}

        char x = 'X';
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(charMap[i][j])) {
                    System.out.print(Character.getNumericValue(charMap[i][j]));
                } else {
                    System.out.print(x);
                }
            }
			System.out.println("");
		}
	}
}