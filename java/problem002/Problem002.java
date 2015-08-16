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

package problem002;

import java.util.List;

import common.MathUtil;

public class Problem002 {
	
	public static void main(String[] args) {
		int sumEvens = evenFibSum(4000000);
		System.out.println(sumEvens);
	}
	
	/**
	 * Finds the sum of all even fibonacci numbers up to the given max.
	 *
	 * @param max the maximum fibonacci number to sum.
	 * @return the sum of even numbers in the fibonacci sequence up to {@code max}
	 */
	public static int evenFibSum(int max) {
		List<Integer> fibList = MathUtil.fibonacciTo(max);
		int sumEvens = 0;
		for (int i : fibList) {
			if (i % 2 == 0) {
				sumEvens += i;
			}
		}
		return sumEvens;
	}
	
}
