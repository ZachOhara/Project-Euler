package problems;

public class Problem019 {

	private static int weekday = 1; // 0: Sun, 1: Mon, ... , 6: Sat
	private static int year = 1900;
	private static int month = 1;
	private static int day = 1;

	public static void main(String[] args) {
		int firstSundays = 0;
		while (year <= 2000) {
			if (year >= 1901 && day == 1 && weekday == 0)
				firstSundays++;
			progressDay();
		}
		System.out.println(firstSundays);
	}

	public static void progressDay() {
		weekday++;
		day++;
		if (weekday > 6) {
			weekday = 0;
		}
		if (day > daysInMonth(month, year)) {
			day = 1;
			progressMonth();
		}
	}

	public static void progressMonth() {
		month++;
		if (month > 12) {
			month = 1;
			year++;
		}
	}

	public static int daysInMonth(int month, int year) {
		switch(month) {
		case 9: // September
		case 4: // April
		case 6: // June
		case 11: // November
			return 30;
		case 2: // February
			return isLeapYear(year) ? 29 : 28;
		default:
			return 31;
		}
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0 && !(year % 400 ==0))
				return false;
			return true;
		} else
			return false;
	}

}
