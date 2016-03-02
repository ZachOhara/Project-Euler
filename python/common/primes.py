from common import fileio
from common import mathutil

PRIMES_FILE = "../../res/common/primes.txt"

def main():
	writePrimes()
	
def readPrimes():
	fileio.FILE_ADDRESS = PRIMES_FILE
	return fileio.readFileAsList()

def writePrimes():
	fileio.FILE_ADDRESS = PRIMES_FILE
	fileio.writeFileAsList(primesTo(10 ** 8))

def primes():
	i = 1
	while True:
		if isPrime(i):
			yield i
		i += 1
		
def primesTo(limit):
	# return sequence.sequenceTo(primes, limit)
	return atkinPrimes(limit)

def primeTerms(terms):
	# return sequence.sequenceTerms(primes, terms)
	return eratPrimes(terms)

def isPrime(n):
	n = abs(n)
	if n < 2 or not n == int(n):
		return False
	for i in range(2, int(n ** 0.5) + 1):
		if n % i == 0:
			return False
	return True

# source: http://stackoverflow.com/a/27215801/5131653
def atkinPrimes(limit):
	primes = [2,3]
	sieve= [False] *(limit+1)
	for x in range(1, int(limit ** 0.5) + 1):
		#if not x % 100: print(x, 'out of', int(limit ** 0.5) + 1)
		for y in range(1, int(limit ** 0.5) + 1):
			n = (4 * (x ** 2)) + (y ** 2)
			if n <= limit and (n % 12 == 1 or n % 12 == 5):
				sieve[n] = not sieve[n]
			n = (3 * (x ** 2)) + (y ** 2)
			if n <= limit and n % 12 == 7 :
				sieve[n] = not sieve[n]
			n = (3 * (x ** 2)) - (y ** 2)
			if x > y and n <= limit and n % 12 == 11:
				sieve[n] = not sieve[n]
	for x in range(5, int(limit ** 0.5)):
		if sieve[x]:
			for y in range(x ** 2, limit + 1, x ** 2):
				sieve[y] = False
	for p in range(5, limit):
		if sieve[p]:
			primes.append(p)
	return primes

'''
# Uses the Sieve of Atkin to generate primes
# Doesn't really work; currently using a code snippet from StackOverflow
# See atkinPrimes(limit)

def primesTo_old(n):
	primes = [2]
	primes.extend(list(range(3, n, 2)))
	print(primes)
	p = primes[0]
	confirmed = 1
	while p ** 2 < n:
		i = p * 2
		while i < n:
			if i in primes:
				primes.remove(i)
				print("removing", i)
			i += p 
		p = primes[confirmed]
		confirmed += 1
		print(p**2)
	return primes
'''

def eratPrimes(terms):
	primes = []
	i = 2
	while len(primes) < terms:
		if not mathutil.containsFactor(primes[1:], i):
			primes.append(i)
		i += 1
	return primes

if __name__ == "__main__":
	main()
