/* Copyright (C) 2015 Zach Ohara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.zachohara.euler.problems;

import java.util.HashMap;

public class Problem017 {

	public static HashMap<Integer, String> numWords;

	//	public static void main(String[] args) {
	//		initNumWords();
	//		int[] tests = {1, 2, 3, 4, 5, 342, 115};
	//		for (int i : tests)
	//			System.out.println(i + " : " + getNumberWord(i));
	//	}

	public static void main(String[] args) {
		initNumWords();
		int sum = 0;
		for (int i = 1; i <= 999; i++)
			sum += getNumberWord(i).length();
		sum += "onethousand".length();
		System.out.println(sum);
	}

	public static String getNumberWord(int n) {
		String word = "";
		if (n >= 100) {
			word += numWords.get(n / 100) + "hundred";
			if (n % 100 != 0)
				word += "and";
		}
		if (n % 100 != 0) {
			if (n % 100 <= 20)
				word += numWords.get(n % 100);
			else
				word += numWords.get((n % 100) - (n % 10)) + numWords.get(n % 10);
		}
		return word;
	}

	public static void initNumWords() {
		numWords = new HashMap<Integer, String>();
		numWords.put(0, "");
		numWords.put(1, "one");
		numWords.put(2, "two");
		numWords.put(3, "three");
		numWords.put(4, "four");
		numWords.put(5, "five");
		numWords.put(6, "six");
		numWords.put(7, "seven");
		numWords.put(8, "eight");
		numWords.put(9, "nine");
		numWords.put(10, "ten");
		numWords.put(11, "eleven");
		numWords.put(12, "twelve");
		numWords.put(13, "thirteen");
		numWords.put(14, "fourteen");
		numWords.put(15, "fifteen");
		numWords.put(16, "sixteen");
		numWords.put(17, "seventeen");
		numWords.put(18, "eighteen");
		numWords.put(19, "nineteen");
		numWords.put(20, "twenty");
		numWords.put(30, "thirty");
		numWords.put(40, "forty");
		numWords.put(50, "fifty");
		numWords.put(60, "sixty");
		numWords.put(70, "seventy");
		numWords.put(80, "eighty");
		numWords.put(90, "ninety");
	}

	/*
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
	 */

}
