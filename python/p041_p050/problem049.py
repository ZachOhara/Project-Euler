from common import primes

def main():
	#print(followsProperty(1487, 4817, 8147))
	for p in primes.primesTo(10 ** 4):
		if p < 1000:
			continue
		if p == 1487:
			continue
		for i in range(1, 4000):
			if followsProperty(p, p + i, p + i + i):
				print(str(p) + str(p+i) + str(p+i+i))
				exit()
	
def followsProperty(a, b, c):
	if not all([len(str(i)) == 4 for i in (a, b, c)]):
		return False
	if not all([primes.isPrime(i) for i in (a, b, c)]):
		return False
	if not arePermutations(a, b, c):
		return False
	return c - b == b - a

def arePermutations(a, b, c):
	a = list(str(a))
	b = list(str(b))
	c = list(str(c))
	a.sort()
	b.sort()
	c.sort()
	return a == b == c

if __name__ == "__main__":
	main()
