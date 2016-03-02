from common import fileio
from common import timer
from common import primes

def main():

if __name__ == "__main__":
	main()

'''
# The maximum of any primes that will be checked
# Decrease if runtime is too long; increase if correct answer is not found.
SEARCH_RANGE = 10000

fileio.FILE_ADDRESS = "../../res/problem060/largeprimes.txt"
#ALL_PRIMES = fileio.readFileAsList()

def main():
	primeList = primes.primesTo(SEARCH_RANGE)
	passableSets = []
	
	for ia, a in enumerate(primeList):
		print(ia, "/", len(primeList))
		
		for ib in range(ia + 1, len(primeList)):
			b = primeList[ib]
			if not canConcatToEach(b, [a]):
				continue
			
			for ic in range(ib + 1, len(primeList)):
				c = primeList[ic]
				if not canConcatToEach(c, [a, b]):
					continue
				
				for id in range(ic + 1, len(primeList)):
					d = primeList[id]
					if not canConcatToEach(d, [a, b, c]):
						continue
					
					print([a, b, c, d])
					passableSets.append([a, b, c, d])
					#for ie in range(id + 1, len(primeList)):
						#e = primeList[ie]
						#if canConcatToEach(e, [a, b, c, d]):
							#passableSets.append([a, b, c, d, e])
	
	''''''
	for ia, a in enumerate(primeList):
	    print(ia, "/", len(primeList))
	    
	    for ib, b in enumerate(primeList[ia + 1:]):
	        if not canConcatToEach(b, [a]):
	            continue
	        
	        for ic, c in enumerate(primeList[ib + 1:]):
	            if not canConcatToEach(c, [a, b]):
	                continue
	            
	            for id, d in enumerate(primeList[ic + 1:]):
	                if not canConcatToEach(d, [a, b, c]):
	                    continue
	                
	                #print([a, b, c, d])
	                #passableSets.append([a, b, c, d])
	                for ie, e in enumerate(primeList[id + 1:]):
	                    if canConcatToEach(e, [a, b, c, d]):
	                        passableSets.append([a, b, c, d, e])
	''''''
	
	if len(passableSets) == 0:
		print("No solutions found. Try increasing SEARCH_RANGE")
	else:
		print(min([sum(i) for i in passableSets]))

''''''
def bruteForceMain():
    primeList = primes.primesTo(SEARCH_RANGE)
    print("Generating...")
    combSets = [i for i in itertools.combinations(primeList, 5)]
    passableSets = []
    for i, testSet in enumerate(combSets):
        if i % 100 == 0: print(i, "/", len(combSets))
        if canConcatToPrimes(testSet):
            passableSets.append(testSets)
    print(min([sum(i) for i in passableSets]))
''''''

def canConcatToAll(numList):
	for i in numList:
		for j in numList:
			if i != j and not concatenatable(i, j):
				return False
	return True

def canConcatToEach(n, numList):
	for i in numList:
		if not concatenatable(n, i):
			return False
	return True

def concatenatable(a, b):
	#return int(str(a) + str(b)) in ALL_PRIMES and int(str(b) + str(a)) in ALL_PRIMES
	#return primes.isPrime(int(str(a) + str(b))) and primes.isPrime(int(str(b) + str(a)))
	x = int(str(a) + str(b))
	y = int(str(b) + str(a))
	#print("Checking", x, y)
	t = time.time()
	result = checkIfPrime(x) and checkIfPrime(y)
	#if time.time() - t > 0.002:
		#print("Checking", x, y)
	return result

def checkIfPrime(n):
	if n > 60000000:
		return n in ALL_PRIMES
	else:
		return primes.isPrime(n)

if __name__ == "__main__":
	main()

'''