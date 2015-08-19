from common import mathutil
from common import primes

def main():
	pands = []
	# only looking at primes up to 10^7 is sufficient for this problem
	# searching primes up to 10^9 would take forever
	for i in primes.readPrimes():
		if mathutil.isPandigital(i):
			print(i)

if __name__ == "__main__":
	main()
