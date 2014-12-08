package common;

public class ProgramTimer {
	
	static long programStart = 0;
	
	public static void startTimer() {
		programStart = System.currentTimeMillis();
	}
	
	public static void displayTime() {
		long stopTime = System.currentTimeMillis();
		System.out.println(String.format("%.2f", ((double)(stopTime - programStart)/1000)) + " seconds");
	}
	
}
