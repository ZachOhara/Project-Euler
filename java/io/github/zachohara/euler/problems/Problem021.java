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

public class Problem021 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a < 10000; a++) {
			for (int b = a + 1; b < 10000; b++) {
				if (areAmicable(a, b))
					sum += a + b;
			}
			if (a % 100 == 0)
				System.out.println(a);
		}
		System.out.println(sum);
	}

	public static boolean areAmicable(int a, int b) {
		return MathUtil.sumDivisors(a) == b
				&& MathUtil.sumDivisors(b) == a;
	}

}
