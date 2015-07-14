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

public class Problem027 {

	public static void main(String[] args) {
		int maxA = 0;
		int maxB = 0;
		int maxPrimes = 0;
		for (int a = -999; a < 1000; a++) {
			for (int  b = -999; b < 1000; b++) {
				int primes = primesFor(a, b);
				if (primes > maxPrimes) {
					maxPrimes = primes;
					maxA = a;
					maxB = b;
					System.out.println(primes + ", " + a + ", " + b);
				}
			}
		}
		System.out.println(maxA * maxB);
	}

	//	public static void main(String[] args) {
	//		System.out.println(primesFor(1, 41));
	//		System.out.println(primesFor(-79, 1601));
	//	}

	public static int primesFor(int a, int b) {
		int n = 0;
		while (MathUtil.isPrime((n*n) + (n*a) + b)) {
			n++;
		}
		return n;
	}

}
