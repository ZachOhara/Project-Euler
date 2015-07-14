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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerReadFile {

	public static void main (String[] args) {
		String[] file = getFile("p067_triangle.txt");
		for (int i = 0; i < file.length; i++)
			System.out.println(file[i]);
	}

	public static String[] getFile(String address) {
		File f = new File(address);
		ArrayList<String> output = new ArrayList<String>();
		try {
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				output.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found!");
			e.printStackTrace();
		}
		return output.toArray(new String[output.size()]);
	}

}
