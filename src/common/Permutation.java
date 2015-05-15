package common;

public class Permutation {

	public static void main(String[] args) {
		System.out.println(permutations("", "1234", 0));
	}
	
	public static int permutations(String prefix, String str, int permutationsBefore) {
		int n = str.length();
		int currentPermutations = 0;
		if (n==0) {
			System.out.println(prefix);
			currentPermutations = 1;
		} else {
			for (int i = 0; i<n; i++) {
				currentPermutations += permutations(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n), permutationsBefore);
			}
		}
		return currentPermutations;
	}
	
}
