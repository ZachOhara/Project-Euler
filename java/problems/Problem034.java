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

package problems;

import common.MathUtil;

public class Problem034 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i < Integer.MAX_VALUE; i++) {
			if (i == factorialDigitSum(i)) {
				sum += i;
				System.out.println(i + ", sum=" + sum);
			}
		}
	}

	public static int factorialDigitSum(int n) {
		int sum = 0;
		int[] digits = MathUtil.getDigits(n);
		for (int i : digits)
			sum += MathUtil.factorial(i);
		return sum;
	}

}
