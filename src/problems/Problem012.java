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

public class Problem012 {

	public static void main(String[] args) {
		int cumul = 1;
		int curr = 1;
		while (MathUtil.countFactors(cumul) <= 500) {
			curr++;
			cumul += curr;
			if (curr % 100 == 0)
				System.out.println(curr + ", " + cumul + ", " + MathUtil.countFactors(cumul));
		}
		System.out.println(cumul);
	}

}
