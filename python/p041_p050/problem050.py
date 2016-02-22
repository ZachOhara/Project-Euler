from common import primes

'''
def main():
	primeslist = primes.primesTo(1000000)
	sums = []
	current = 0
	for i, p in enumerate(primeslist):
		if not (p-1) % 1000: print(p)
		current += p
		if primes.isPrime(current):
			sums.append(current)
	sums.sort()
	print(sums)
	for i in sums[::-1]:
		if i < 1000000:
			print(i)
			break
'''

def main():
	print(longestConsecutiveUnder(1000000))

def longestConsecutiveUnder(limit):
	primeslist = primes.primesTo(limit)
	#print(primeslist)
	consecs = []
	sums = []
	for startindex in range(len(primeslist)):
		for endindex in range(startindex + 1, len(primeslist)):
			s = sum(primeslist[startindex : endindex])
			if s > limit:
				break
			if primes.isPrime(s):
				consecs.append(endindex - startindex)
				sums.append(s)
	#print(consecs)
	#print(sums)
	return sums[consecs.index(max(consecs))]

if __name__ == "__main__":
	main()
