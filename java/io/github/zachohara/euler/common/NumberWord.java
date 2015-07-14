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

package io.github.zachohara.euler.common;

public class NumberWord {

	static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] multiples = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};

	int decimal;
	String written = "";
	int letterCount = 0;


	public NumberWord(int n) {
		this.decimal = n;
		int firstDigit = n/100;
		int secondDigit = (n/10)%10;
		int thirdDigit = n%10;

		if (firstDigit > 0) {
			this.written += digits[firstDigit] + "hundredand";
		}

		if (secondDigit > 1) {
			this.written += multiples[secondDigit];
		}
		if (secondDigit == 1) {
			this.written += teens[thirdDigit];
		} else if (thirdDigit > 0) {
			this.written += digits[thirdDigit];
		}
		if (n == 1000) {
			this.written = "onethousand";
		}

		this.letterCount = this.written.length();		
		System.out.println(this.written + ", " + this.letterCount);

	}

	public String toString() {
		return this.written;
	}

	public int letterCount() {
		return this.letterCount;
	}

}
