from common import primes

def main():
	primeCount = 0
	totalCount = 1 # the center element
	nextRow = 1
	
	diagonalsList = [1]
	
	while nextRow < 3 or primeCount / totalCount >= .1:
		
		[diagonalsList.append(i) for i in getDiagonals(nextRow)]
		
		#print(getDiagonals(nextRow))
		#print(countPrimes(getDiagonals(nextRow)))
		
		primeCount += countPrimes(getDiagonals(nextRow))
		totalCount += 4 # every layer always has 4 corners
		nextRow += 1
		if nextRow % 100 == 0: print(primeCount / totalCount)		
	print(((nextRow - 1) * 2) + 1) # the length of the square that has [nextRow - 1] "layers"
	#print(percentPrimes(diagonalsList))
	
def countPrimes(numlist):
	return [primes.isPrime(i) for i in numlist].count(True)

def percentPrimes(numlist):
	primeCount = 0
	for i in numlist:
		if primes.isPrime(i):
			primeCount += 1
	return primeCount / len(numlist)

def getDiagonals(layer):
	return [1 + ((direction - 4) * layer) + (4 * (layer **2)) for direction in [2, 4, 6, 8]]
	
if __name__ == '__main__':
	main()
