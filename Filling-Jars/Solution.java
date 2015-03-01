import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Long sum = new Long(0);
        long one, three;
        int two;
        Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();

		String[] tokens = inputLine.split("\\s+");
		long jars = Long.parseLong(tokens[0]);
		int operations = Integer.parseInt(tokens[1]);

		//System.out.println("Jars: " + jars + " Operations: " + operations);

		//ArrayList<Long> jarList = new ArrayList<Long>(jars);

		/*for (int i = 0; i < jars; i++) {
			jarList.add((long)0);
		}*/

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
			/*for (int i = Integer.parseInt(performOperations[0]) - 1; i < Integer.parseInt(performOperations[1]); i++) {
				jarList.set(i,jarList.get(i) + Integer.parseInt(performOperations[2]));
			}*/
            one = Long.parseLong(performOperations[0]);
            two = Integer.parseInt(performOperations[1]);
            three = Long.parseLong(performOperations[2]);
            sum = sum + (two - one + 1)*three;
		}

		//System.out.println(sum);
		/*for (int i = 0; i < jars; i++) {
			sum = sum + jarList.get(i);
		}*/
		//Double temp = new Double(0.0);
		double temp = sum.doubleValue();
		double t1 = temp/jars;
		//sum = Math.floor(temp/jars);
		// double ans = Math.floor(t1);
		Double ans = new Double(Math.floor(t1));
        //long answer = new Double(sum).longValue();
		//System.out.println(answer);
		System.out.println(ans.longValue());
	}
}
