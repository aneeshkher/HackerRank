import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String array = scan.nextLine();
		String[] firstLine = array.split("\\s+");
		int lengthOfFreeway = Integer.parseInt(firstLine[0]);
		int testCases = Integer.parseInt(firstLine[1]);

		String width = scan.nextLine();
		String[] widthArrayString = width.split("\\s+");
		if (widthArrayString.length != lengthOfFreeway) {
			System.out.println ("Please enter consistent data");
			System.exit(1);
		}
		String[] tests = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			tests[i] = scan.nextLine();
		}


		for (int i = 0; i < testCases; i++) {
			String[] test = tests[i].split("\\s+");
			int start = Integer.parseInt(test[0]);
			int end = Integer.parseInt(test[1]);
			int minimum = getMinimum(widthArrayString, start, end);
			// System.out.println("Minimum between indices: "
			// 	+ start + " and " + end + " is: " + minimum);
			System.out.println(minimum);

		}
	}

	private static int getMinimum (String[] width, int start, int end) {
		int minimum = 3;
		// int length = width.length();
		for (int i = start; i <= end; i++) {
			if (Integer.parseInt(width[i]) < minimum) {
				minimum = Integer.parseInt(width[i]);
			} 
		}
		return minimum;
	}
}