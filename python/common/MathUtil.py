
def fibonacciTo(cap):
	fibList = [1, 2]
	while fibList[-1] < cap:
		fibList.append(fibList[-1] + fibList[-2])
	fibList = fibList[:-1]
	return fibList

def factorsOf(n):
	if n == 1:
		return [1]
	factorList = []
	div = 1
	while not div in factorList:
		if n % div == 0:
			factorList.append(div)
			if div ** 2 != n:
				factorList.append(int(n / div))
		div += 1
	return factorList

def isPrime(n):
	return len(factorsOf(n)) == 2

def primeFactorsOf(n):
	primeFactorList = factorsOf(n)
	primeFactorList.remove(1)
	primeFactorList.remove(n)
	for i in primeFactorList[::-1]:
		if not isPrime(i):
			primeFactorList.remove(i)
	return primeFactorList

def generatePrimes(n):
	primes = []
	i = 2
	while len(primes) < n:
		if not containsFactor(primes[1:], i):
			primes.append(i)
		i += 1
	return primes

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

# source: http://stackoverflow.com/a/27215801/5131653
def primesTo(limit):
	P = [2,3]
	sieve=[False]*(limit+1)
	for x in range(1,int(limit ** 0.5)+1):
		for y in range(1,int(limit ** 0.5)+1):
			n = 4*x**2 + y**2
			if n<=limit and (n%12==1 or n%12==5) : sieve[n] = not sieve[n]
			n = 3*x**2+y**2
			if n<= limit and n%12==7 : sieve[n] = not sieve[n]
			n = 3*x**2 - y**2
			if x>y and n<=limit and n%12==11 : sieve[n] = not sieve[n]
	for x in range(5,int(limit ** 0.5)):
		if sieve[x]:
			for y in range(x**2,limit+1,x**2):
				sieve[y] = False
	for p in range(5,limit):
		if sieve[p] : P.append(p)
	return P

def containsFactor(itr, n):
	for i in itr:
		if n % i == 0:
			return True
	return False

def isPalindrome(x):
	return str(x) == str(x)[::-1]

def generateTriangleNumbers():
	tri = 0
	i = 1
	while True:
		tri += i
		yield tri
		i += 1
		
def collatzSequence(n):
	seq = [n]
	while seq[-1] != 1:
		if seq[-1] % 2 == 0:
			seq.append(int(seq[-1] / 2))
		else:
			seq.append((seq[-1] * 3) + 1)
	return seq

if __name__ == "__main__":
	print(collatzSequence(13))
		
