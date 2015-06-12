import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static HashMap<Integer, String> hourMapping = new HashMap<Integer, String>();
	public static HashMap<Integer, String> minuteMapping = new HashMap<Integer, String>();
	public static void main (String[] args) {

		initializeHashMaps();

		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();

		int flagNext = 0;

		StringBuilder finalString = new StringBuilder();
		String hourString, minuteString, minuteStringConnect, toPast;

		if (minute > 1) {
			minuteStringConnect = "minutes";
		} else {
			minuteStringConnect = "minute";
		}

		if (minute > 30) {
			toPast = "to";
			flagNext = 1;
			if (hour == 12) {
				hourString = hourMapping.get(1);
			} else {
				hourString = hourMapping.get(hour + 1);
			}
			minuteString = minuteMapping.get(60 - minute);
		} else {
			toPast = "past";
			flagNext = 0;
			hourString = hourMapping.get(hour);
			minuteString = minuteMapping.get(minute);
		}

		if (minute == 0) {
			finalString.insert(0,hourString);
			finalString.append(" o'clock");
		} else {
			finalString.insert(0,minuteString);
			finalString.append(" ");
			if ((minute != 15) && (minute != 30) && (minute != 45)) {
				finalString.append(minuteStringConnect);
				finalString.append(" ");	
			}
			
			finalString.append(toPast);
			finalString.append(" ");
			finalString.append(hourString);
		}
		System.out.println(finalString);

	}

	public static void initializeHashMaps() {

		hourMapping.put(1, "one");
		hourMapping.put(2, "two");
		hourMapping.put(3, "three");
		hourMapping.put(4, "four");
		hourMapping.put(5, "five");
		hourMapping.put(6, "six");
		hourMapping.put(7, "seven");
		hourMapping.put(8, "eight");
		hourMapping.put(9, "nine");
		hourMapping.put(10, "ten");
		hourMapping.put(11, "eleven");
		hourMapping.put(12, "twelve");

		minuteMapping.put(1, "one");
		minuteMapping.put(2, "two");
		minuteMapping.put(3, "three");
		minuteMapping.put(4, "four");
		minuteMapping.put(5, "five");
		minuteMapping.put(6, "six");
		minuteMapping.put(7, "seven");
		minuteMapping.put(8, "eight");
		minuteMapping.put(9, "nine");
		minuteMapping.put(10, "ten");
		minuteMapping.put(11, "eleven");
		minuteMapping.put(12, "twelve");
		minuteMapping.put(13, "thirteen");
		minuteMapping.put(14, "fourteen");
		minuteMapping.put(15, "quarter");
		minuteMapping.put(16, "sixteen");
		minuteMapping.put(17, "seventeen");
		minuteMapping.put(18, "eighteen");
		minuteMapping.put(19, "nineteen");
		minuteMapping.put(20, "twenty");
		minuteMapping.put(21, "twenty one");
		minuteMapping.put(22, "twenty two");
		minuteMapping.put(23, "twenty three");
		minuteMapping.put(24, "twenty four");
		minuteMapping.put(25, "twenty five");
		minuteMapping.put(26, "twenty six");
		minuteMapping.put(27, "twenty seven");
		minuteMapping.put(28, "twenty eight");
		minuteMapping.put(29, "twenty nine");
		minuteMapping.put(30, "half");
	}
}