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
