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

public class ProgramTimer {

	static long programStart = 0;

	public static void startTimer() {
		programStart = System.currentTimeMillis();
	}

	public static void displayTime() {
		long stopTime = System.currentTimeMillis();
		System.out.println(String.format("%.3f", ((double)(stopTime - programStart)/1000)) + " seconds");
	}

}
