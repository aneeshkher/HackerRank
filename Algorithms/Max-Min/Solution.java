import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int k = scan.nextInt();

		int[] numbers = new int[number];
		
		for (int i = 0; i < number; i++) {
			numbers[i] = scan.nextInt();
		}

		Arrays.sort(numbers);

		int minimum = getUnfairness(numbers, k);
		System.out.println(minimum);


	}

	private static int getUnfairness (int[] numbers, int k) {
		int length = numbers.length;
		int minimum = 0;
		int minIndex = 0;
		int flagMin = 0;
		int startIndex = 0;
		//int endIndex = k - 1;
		for (;startIndex <= length - k; startIndex++) {
			int endIndex = startIndex + k - 1;
			if (flagMin == 0) {
				flagMin = 1;
				minimum = numbers[endIndex] - numbers[startIndex];
			} else {
				int difference = numbers[endIndex] - numbers[startIndex];
				if (difference < minimum) {
					minimum = difference;
				}
			}
		}
		return minimum;
	}
}