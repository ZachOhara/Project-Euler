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

import io.github.zachohara.euler.common.MathUtil;

public class Problem037 {

	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		int current = 10;
		while (total < 200) {
			current++;
			if (isTruncatable(current)) {
				total++;
				sum += current;
				System.out.println(current);
			}
		}
		System.out.println(sum);
	}

	public static boolean isTruncatable(int n) {
		return isTruncatableRtoL(n) && isTruncatableLtoR(n);
	}

	public static boolean isTruncatableRtoL(int n) {
		while (n > 0) {
			if (!MathUtil.isPrime(n))
				return false;
			n /= 10;
		}
		return true;
	}

	public static boolean isTruncatableLtoR(int n) {
		while (n > 0) {
			if (!MathUtil.isPrime(n))
				return false;
			n %= Math.pow(10, MathUtil.length(n) - 1);
		}
		return true;
	}

}
