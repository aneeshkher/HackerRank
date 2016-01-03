import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;	

public class Solution {
	private static ArrayList<Long> fibNumbers = new ArrayList<Long>();
	public static void main(String[] args) {
		long a = 1;
		fibNumbers.add(a);
		fibNumbers.add(a);
		Scanner scan = new Scanner(System.in);

		int testCases = scan.nextInt();
		long[] numbers = new long[testCases];
		for (int i = 0; i < testCases; i++) {
			numbers[i] = scan.nextLong();

			if (numbers[i] < 1) {
				System.out.println("IsNotFibo");
			} else {
				long answer = getFib(numbers[i]);
				if (answer == -1) {
					System.out.println("IsNotFibo");
				} else {
					System.out.println("IsFibo");
				}
			}

		}
	}

	public static long getFib(long number) {
		if (number == 1) {
			return (long)1;
		} else if (number > 1) {
			if (fibNumbers.contains(number)) {
				return number;
			}
			int i = 1;
			long answer = 2;
			while (answer < number) {
				answer = fibNumbers.get(i) + fibNumbers.get(i-1);
				if (!fibNumbers.contains(answer)) {
					fibNumbers.add(answer);
				}
				i++;
			}
			if (answer == number) {
				return answer;
			} else {
				return (long)-1;
			}
		} else {
			return (long)-1;
		}
	}

	public static int fibonacci (int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}