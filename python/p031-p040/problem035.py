from common import primes

def main():
	print(len(circularPrimesBelow(1000000)))

def circularPrimesBelow(limit):
	primeList = []
	for i in range(limit):
		if isCircularPrime(i):
			primeList.append(i)
	return primeList

def isCircularPrime(n):
	n = str(n)
	for _ in range(len(n)):
		if not primes.isPrime(int(n)):
			return False
		n = n[1:] + n[0]
	return True

if __name__ == "__main__":
	main()