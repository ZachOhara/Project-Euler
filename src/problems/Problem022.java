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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import common.ScannerReadFile;

public class Problem022 {

	public static Hashtable<String, Integer> letterValues = new Hashtable<String, Integer>();

	public static void main(String[] args) {
		populateLetters();
		String allNames = ScannerReadFile.getFile("resource/p022_names.txt")[0];
		//System.out.println(allNames.length());
		//System.out.println(allNames.toString());

		String[] namesArray = separateNames(allNames);
		System.out.println(namesArray.length);
		// sort names array alphabetically
		Arrays.sort(namesArray);
		System.out.println(Arrays.toString(namesArray));

		long total = 0;
		int currentScore;
		for (int i = 0; i < namesArray.length; i++) {
			currentScore = 0;
			for (int j = 0; j < namesArray[i].length(); j++)
				currentScore+=letterValues.get(namesArray[i].substring(j, j+1));
			total += currentScore * (i + 1);
			if (total < 0)
				System.out.print("overflow! " + total);
		}
		System.out.println(total);
	}

	public static String[] separateNames(String allnames) {
		ArrayList<String> names = new ArrayList<String>();
		int i = 0;
		String currentName;
		while (i < allnames.length()) {
			currentName = "";
			while (i < allnames.length() && !allnames.substring(i, i+1).equals(",")) {
				if (!allnames.substring(i, i+1).equals("\""))
					currentName += allnames.substring(i, i+1);
				i++;
			}
			i++;
			//System.out.println("Added " + currentName + " to the list");
			names.add(currentName.toLowerCase());
		}
		return names.toArray(new String[names.size()]);
	}

	public static void populateLetters() {
		letterValues.put("a", 1);
		letterValues.put("b", 2);
		letterValues.put("c", 3);
		letterValues.put("d", 4);
		letterValues.put("e", 5);
		letterValues.put("f", 6);
		letterValues.put("g", 7);
		letterValues.put("h", 8);
		letterValues.put("i", 9);
		letterValues.put("j", 10);
		letterValues.put("k", 11);
		letterValues.put("l", 12);
		letterValues.put("m", 13);
		letterValues.put("n", 14);
		letterValues.put("o", 15);
		letterValues.put("p", 16);
		letterValues.put("q", 17);
		letterValues.put("r", 18);
		letterValues.put("s", 19);
		letterValues.put("t", 20);
		letterValues.put("u", 21);
		letterValues.put("v", 22);
		letterValues.put("w", 23);
		letterValues.put("x", 24);
		letterValues.put("y", 25);
		letterValues.put("z", 26);
	}

}
