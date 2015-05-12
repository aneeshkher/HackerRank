import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int[] numbers = new int[testCases];
		String[] answerString = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			numbers[i] = scan.nextInt();
		}

		int answerFlag = 0;
		for (int i = 0; i < testCases; i++) {

			int number = numbers[i];
			for (int j = 0; j <= number; j+=5) {
				int numberOfThrees = j;
				int numberOfFives = number - j;
				if (checkSplit(numberOfFives, numberOfThrees)) {
					answerFlag = 1;
					answerString[i] = constructString(numberOfFives,numberOfThrees);
					break;
				}

			}
			if (answerFlag == 0) {
				answerString[i] = "-1";
			} else {
				answerFlag = 0;
			}
		}

		for (int i = 0; i < testCases; i++) {
			System.out.println(answerString[i]);
		}
	}

	private static boolean checkSplit (int numberOfFives,
		int numberOfThrees) {
		if ((numberOfThrees % 5) == 0) {
			if ((numberOfFives % 3) == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private static String constructString (int numberOfFives, 
		int numberOfThrees) {

		String answer = "";
		char[] fives = new char[numberOfFives];
		char[] threes = new char[numberOfThrees];

		Arrays.fill(fives,'5');
		Arrays.fill(threes,'3');
		String fiveString = new String(fives);
		String threeString = new String(threes);
		answer = fiveString.concat(threeString);
		return answer;
	}
}