package common;
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
