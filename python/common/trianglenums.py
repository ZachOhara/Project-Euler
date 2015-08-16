import sequence

def main():
	pass

def triangleNumbers():
	tri = 0
	i = 1
	while True:
		tri += i
		i += 1
		yield tri
		
def triangleNumsTo(limit):
	return sequence.sequenceTo(triangleNumbers, limit)

def triangleTerms(terms):
	return sequence.sequenceTerms(triangleNumbers, terms)

def isTriangleNum(n):
	return sequence.sequenceContains(triangleNumbers, n)

if __name__ == "__main__":
	main()
