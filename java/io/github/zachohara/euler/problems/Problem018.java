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

public class Problem018 {

	public static String[] triangle = {"75",
		"95 64",
		"17 47 82",
		"18 35 87 10",
		"20 04 82 47 65",
		"19 01 23 75 03 34",
		"88 02 77 73 07 63 67",
		"99 65 04 28 06 16 70 92",
		"41 41 26 56 83 40 80 70 33",
		"41 48 72 33 47 32 37 16 94 29",
		"53 71 44 65 25 43 91 52 97 51 14",
		"70 11 33 28 77 73 17 78 39 68 17 57",
		"91 71 52 38 17 14 91 43 58 50 27 29 48",
		"63 66 04 68 89 53 67 30 73 16 69 87 40 31",
	"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};

	public static int[][] triangleInt;
	public static int[][] sums;

	public static void main(String[] args) {
		getIntArray();
		mainProcedure();
	}

	public static void getIntArray() {
		triangleInt = new int[triangle.length][triangle.length];
		int[] row;
		String digit;
		// converts the string array declared in the beginning to a two-dimensional integer array
		for (int i = 0; i < triangle.length; i++) {
			row = new int[i+1];
			for (int j = 0; j < i + 1; j++) {
				digit = triangle[i].substring(j*3, j*3+2);
				row[j] = Integer.parseInt(digit);
			}
			triangleInt[i] = row;
			System.out.println(toString(row));
		}
	}

	public static void mainProcedure() {
		// initialize sums[][]
		sums = new int[triangle.length][triangle.length];
		for (int i = 0; i < triangle.length; i++) {
			int[] row = new int[triangleInt[i].length];
			sums[i] = row;
		}

		/*debugging output:
		for (int i = 0; i < sums.length; i++)
			System.out.print(sums[i].length + ", ");
		System.out.println();*/

		// the last row of sums will be equal to the last row of triInt
		sums[sums.length-1] = triangleInt[triangleInt.length-1];
		for (int i = triangle.length - 1; i > 0; i--) {
			assimilateSums(i-1);
		}
		System.out.println();
		System.out.println("The largest sum is " + sums[0][0]);
		System.out.println();
	}

	public static void assimilateSums(int level) {
		for (int i = 0; i < sums[level].length; i++) {
			int bestPath = Math.max(sums[level+1][i], sums[level+1][i+1]);
			sums[level][i] = bestPath + triangleInt[level][i];
		}
	}

	public static String toString(int[] n) {
		String str = "";
		for (int i = 0; i < n.length; i++) {
			str += Integer.toString(n[i]) + ", ";
		}
		return str;
	}

}
