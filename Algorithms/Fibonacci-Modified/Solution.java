import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputLine = scan.nextLine();
		String[] input = inputLine.split("\\s+");

		BigInteger first = new BigInteger(input[0]);
		BigInteger second = new BigInteger(input[1]);
		int nth = Integer.parseInt(input[2]);
		BigInteger answer = new BigInteger("0");
		BigInteger temp = new BigInteger("0");

		for (int i = 2; i < nth; i++) {
			BigInteger tempF = new BigInteger("0");
			BigInteger tempS = new BigInteger("0");
			tempF = first;
			tempS = second;
			temp = second.multiply(second);
			answer = temp.add(first);
			first = tempS;
			second = answer;
		}
		System.out.println(answer);
	}
}