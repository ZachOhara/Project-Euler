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

public class Problem015 {

	/*
	 * This problem can be easily solved with a simple expression
	 * Just use permutation with indistinguishable elements
	 * The formula for this is as follows:
	 * 
	 *  (2s)!
	 * ------
	 *  s!^2
	 *  
	 *  When s is the length of the side of the field
	 *  
	 *  This implementation cannot be put into Java using normal data types, 
	 *  because a 20x20 square requires the computation of 40!, which exceeds
	 *  the value of Long.MAX_LONG and causes overflow
	 *  
	 *  This could be implemented using a type such as BigInteger, if you
	 *  absolutely *have* to figure out how to program it.
	 *  
	 *  The correct answer is 137846528820
	 */

	public static void main(String[] args) {
		System.out.print("See source comments for solution");
	}

}
