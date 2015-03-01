import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();

		String[] tokens = inputLine.split("\\s+");
		int jars = Integer.parseInt(tokens[0]);
		int operations = Integer.parseInt(tokens[1]);

		//System.out.println("Jars: " + jars + " Operations: " + operations);

		ArrayList<Integer> jarList = new ArrayList<Integer>();

		for (int i = 0; i < jars; i++) {
			jarList.add(0);
		}

		/*for (int i : jarList) {
			System.out.print(i);
		}*/

		String[] opString = new String[operations];
		for (int i = 0; i < operations; i++) {
			opString[i] = sc.nextLine();
		}

		for (String operation : opString) {
			String[] performOperations = operation.split("\\s+");
			/*System.out.println("N: " + Integer.parseInt(performOperations[0]) + ". M: " +
				Integer.parseInt(performOperations[1]) + ". Candies: " +
					Integer.parseInt(performOperations[2]));*/
			for (int i = Integer.parseInt(performOperations[0]) - 1; i < Integer.parseInt(performOperations[1]); i++) {
				jarList.set(i,jarList.get(i) + Integer.parseInt(performOperations[2]));
			}
		}

		double sum = 0;
		for (int i = 0; i < jars; i++) {
			sum = sum + jarList.get(i);
		}
		sum = Math.floor(sum/jars);
        Double answer = new Double(sum);
		System.out.println(answer.intValue());
	}
}