from common import primes

def main():
	truncPrimes = []
	i = 10
	while len(truncPrimes) < 11:
		#if not i % 1000: print(i, sum(truncPrimes))
		if isTrucPrime(i):
			truncPrimes.append(i)
		i += 1
	print(sum(truncPrimes))

def isTrucPrime(n):
	return n >= 10 and isTrucPrimeLR(n) and isTrucPrimeRL(n)

def isTrucPrimeLR(n):
	n = str(n)
	while len(n):
		if not primes.isPrime(int(n)):
			return False
		n = n[1:]
	return True

def isTrucPrimeRL(n):
	n = str(n)
	while len(n):
		if not primes.isPrime(int(n)):
			return False
		n = n[:-1]
	return True

if __name__ == "__main__":
	main()