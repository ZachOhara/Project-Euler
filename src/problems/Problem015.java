package problems;

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
