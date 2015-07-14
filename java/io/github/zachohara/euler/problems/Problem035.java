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

public class Problem035 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isCircularPrime(i))
				total++;
			if (i % 10000 == 0)
				System.out.println(i + " : " + total);
		}
		System.out.println(total);
	}

	public static boolean isCircularPrime(int n) {
		int len = MathUtil.length(n);
		for (int i = 0; i < len; i++) {
			if (!MathUtil.isPrime(n))
				return false;
			n = rotate(n);
		}
		return true;
	}

	public static int rotate(int n) {
		int last = n % 10;
		n /= 10;
		n += last * Math.pow(10, MathUtil.length(n));
		return n;
	}

}
