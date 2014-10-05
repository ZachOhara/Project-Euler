public class problemTwo {

	private static int[] generate (int toGenerate, int[] primeList) {  //generates more prime numbers
		for(int i = 0; i < toGenerate; i++) {
			int testPrime = primeList[primeList.length - 1] + 2;
			int isPrimeConfirm = 0;
			int testPrimeCounter;
			while (isPrimeConfirm != 1) { //while no solution found

				isPrimeConfirm = 0;
				testPrimeCounter = 0;

				while (isPrimeConfirm == 0) { //while testing a given number

					if (testPrime % primeList[testPrimeCounter] == 0) { //if divisible by prime number n
						isPrimeConfirm = -1; //number is not prime
					} else { //if not divisible by prime number n
						testPrimeCounter++; //try a different prime number for n
					}

					if (testPrimeCounter == primeList.length - 1 && isPrimeConfirm == 0) { //if not divisible by any other prime
						isPrimeConfirm = 1; //number is prime
					}

				}
				if (isPrimeConfirm == -1) { //if tested number was not prime
					testPrime = testPrime + 2; //if wrong, test next odd number
				}

			}

			primeList = pushToList(primeList, testPrime);

		}
		return primeList;
	}

	public static int[] pushToList(int[] array, int toBePushed) { //simulates the array.push(int) function because I couldn't figure out how to set that up
		int[] newArray = new int[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[newArray.length - 1] = toBePushed;
		return newArray;
	}

	public static void printArray(int[] array) {
		System.out.println("");
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i + 1 < array.length) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		return;
	}

	public static void main( String[] args){

		/* Current Methods:
int[] generate(int n, primeList)
-Generates n new prime numbers and adds them to primeList

int[] pushToList(int, array)
-Simulates array.push(int)

void printArray(array)
-Prints an array to the console
		 */

		int[] primeList = new int[2];
		primeList[0] = 2;
		primeList[1] = 3;
		primeList = generate(98, primeList);
		int largestFactor = 0;
		long testingNumber = 600851475143L;
		boolean running = true;

		while (running){


			System.out.println("primeList.length = " + primeList.length);
			System.out.println();
			System.out.println("largestFactor = " + largestFactor);
			System.out.println();
			System.out.println("testingNumber = " + testingNumber);


			boolean isDivisible = false;
			for(int i = 0; i < primeList.length; i++) {
				if (testingNumber % primeList[i] == 0) {
					@SuppressWarnings("unused")
					boolean isDivisble = true;
					if (primeList[i] > largestFactor) {
						largestFactor = primeList[i];
					}
					testingNumber = testingNumber / primeList[i];
				}
			}
			if (primeList[primeList.length - 1] > testingNumber && isDivisible == false) {
				running = false;
			}
			if (isDivisible == false) {
				primeList = generate(25, primeList);
			}


		}

		System.out.println(largestFactor);

	}
}