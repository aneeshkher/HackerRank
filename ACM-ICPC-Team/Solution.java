import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		//sc.nextLine();

		/*int people = Integer.parseInt(Character.toString(inputLine.charAt(0)));
		int topics = Integer.parseInt(Character.toString(inputLine.charAt(2)));*/
		String[] tokens = inputLine.split("\\s+");
		int people = Integer.parseInt(tokens[0]);
		int topics = Integer.parseInt(tokens[1]);
		if (people < 2) {
			System.exit(1);
		}
		String person[] = new String[500];
		for (int i = 0; i < people; i++) {
			person[i] = sc.nextLine();
		}

		for (int i = 0; i < people; i++) {
			//System.out.println("Input received " + person[i]);
		}

		HashMap<Integer,Integer> teamValues = new HashMap<Integer,Integer>();


		int maximumTopics = 0;
		int j;
		int count = 0;

		for (int i = 0; i < people - 1; i++) {
			for (j = i + 1; j < people; j++) {
				count = 0;
				for (int k = 0; k < topics; k++) {
					if (person[i].charAt(k) == '1' || person[j].charAt(k) == '1') {
						count ++;
					}
				}

				/*System.out.println("Compared " + person[i]);
				System.out.println("    and  " + person[j]);
				System.out.println("Adding " + count + " topic as common");*/
				if (teamValues.containsKey(count)) {
					teamValues.put(count,teamValues.get(count) + 1);
				} else {
					teamValues.put(count,1);
				}	
			}
		}


		for (Map.Entry<Integer,Integer> entry : teamValues.entrySet()) {
			/*System.out.println("Number of topics: " + entry.getKey() + 
				" Teams that know these: " + entry.getValue());*/
			if (entry.getKey() > maximumTopics) {
				maximumTopics = entry.getKey();
			}
		}

		/*System.out.println("Max topics: " + maximumTopics + ". Topics: " +
			teamValues.get(maximumTopics));*/
		System.out.println(maximumTopics);
		System.out.println(teamValues.get(maximumTopics));
	}
}