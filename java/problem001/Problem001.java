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

package problem001;

public class Problem001 {
	
	public static void main(String[] args) {
		int sum = multiplesOf(3, 5, 1000);
		System.out.println(sum);
	}
	
	/**
	 * Finds the sum of all natural numbers less than {@code max} that are multiples of
	 * {@code a} or {@code b}.
	 *
	 * @param a the first factor.
	 * @param b the second factor.
	 * @param max the limit of numbers that will be summed.
	 * @return the sum of all n 1 <= n < max such that (n % a == 0 || n % b == 0).
	 */
	public static int multiplesOf(int a, int b, int max) {
		int sum = 0;
		for (int i = 1; i < max; i++) {
			if (i % a == 0 || i % b == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}
