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

public class Problem007 {

	public Problem007() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int primes = 1;
		int n = 1;
		while (primes < 10001) {
			n++;
			if (MathUtil.isPrime(n))
				primes++;
		}
		System.out.println("" + n + MathUtil.isPrime(n));
	}

	public static void isPrime_test() {
		System.out.println(MathUtil.isPrime(3));
		System.out.println(MathUtil.isPrime(4));
		System.out.println(MathUtil.isPrime(5));
		System.out.println(MathUtil.isPrime(6));
		System.out.println(MathUtil.isPrime(7));
		System.out.println(MathUtil.isPrime(24));
		System.out.println(MathUtil.isPrime(31));
		System.out.println(MathUtil.isPrime(51));
	}

}
