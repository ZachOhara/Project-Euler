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

public class Permutation {

	public static void main(String[] args) {
		System.out.println(permutations("", "1234", 0));
	}

	public static int permutations(String prefix, String str, int permutationsBefore) {
		int n = str.length();
		int currentPermutations = 0;
		if (n==0) {
			System.out.println(prefix);
			currentPermutations = 1;
		} else {
			for (int i = 0; i<n; i++) {
				currentPermutations += permutations(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n), permutationsBefore);
			}
		}
		return currentPermutations;
	}

}
