from common import timer
from common import primes

LIMIT = 50000000

def main():
	squares = [i ** 2 for i in primes.primesTo(1 + int(LIMIT ** (1/2)))]
	cubes = [i ** 3 for i in primes.primesTo(1 + int(LIMIT ** (1/3)))]
	fourths = [i ** 4 for i in primes.primesTo(1 + int(LIMIT ** (1/4)))]
	numbers = []
	for s in squares:
		for c in cubes:
			for f in fourths:
				if s + c + f < LIMIT:
					numbers.append(s + c + f)
	print(len(set(numbers)))

if __name__ == "__main__":
	main()
