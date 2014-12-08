package problems;

import common.NumberWord;

public class Problem017 {

	public static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
		"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	public static void main(String[] args) {
		attempt2();
	}
	
	public static void attempt1() {
		NumberWord[] numbers = new NumberWord[1001];
		for (int i = 1; i <= 1000; i++) {
			numbers[i] = new NumberWord(i);
		}
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += numbers[i].letterCount();
		}
		System.out.println(sum);
	}
	
	public static void attempt2() {
		int sum = 0;
		for (int i = 1; i<= 1000; i++) {
			sum += lengthOf(i);
		}
		System.out.println(sum);
	}
	
	public static int lengthOf(int n) {
		if (n == 1000) {
			return "onethousand".length();
		} else if (n < 20) {
			return ones[n].length();
		} else if (n < 100) {
			return  (tens[n/10] + ones[n%10]).length();
		} else if (n == 100) {
			return "onehundred".length();
		} else {
			return (ones[n/100] + "hundredand").length() + lengthOf(n%10);
		}
			
	}

}
