package problems;

public class Problem071 {
	
	public static void main(String[] args) {
		double requiredDecimal = 3.0/7;
		int requiredNumerator = (int)(requiredDecimal * 1000000);
		System.out.println(requiredNumerator - 1); //as close as possible to 3/7

	}

}
