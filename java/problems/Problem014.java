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

public class Problem014 {

	public static void main(String[] args) {
		int maxIndex = 0;
		int maxCollatz = 0;
		for (int i = 1; i <= 1000000; i++) {
			if (collatz(i) > maxCollatz) {
				maxIndex = i;
				maxCollatz = collatz(i);
			}
		}
		System.out.println("The collatz sequence of " + maxIndex + " has " + maxCollatz + " terms");
	}

	public static int collatz(int n0) {
		int l = 0;
		long n = (long)(n0);
		while (n > 1) {
			l += 1;
			if ((n%2) == 0) {
				n = n/2;
			} else {
				n = 3*n + 1;
			}
		}
		return l;
	}

}
