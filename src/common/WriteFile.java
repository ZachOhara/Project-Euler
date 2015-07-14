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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteFile {

	private static PrintStream output = null;

	public static void create(String filename) {
		try {
			output = new PrintStream(new File(filename + ".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void create() {
		create("output");
	}

	public static void write(String line) {
		output.println(line);
	}

	public static void writePrint(String line) {
		write(line);
		System.out.println(line);
	}

}
