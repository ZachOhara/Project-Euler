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

package common;

public class OharaMath {

	public static int signum(int i) {
		return (int)Math.signum((double)i);
	}

	public static int gcd(int a, int b) { // greatest common divisor of two numbers
		a = Math.abs(a);
		b = Math.abs(b);
		int gcd = 1;
		for (int divisor = 1; divisor < Math.min(a, b); divisor++) {
			if (a % divisor == 0 && b % divisor == 0)
				gcd = divisor;
		}
		return gcd;
	}

}
