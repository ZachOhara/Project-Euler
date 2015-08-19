from common import sequence
import math

def main():
	print([isTriangleNum(t + 1) for t in triangleTerms(10)])

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

def isTriangleNum(t):
	s = math.sqrt((8 * t) + 1)
	n1 = (-s - 1) / 2
	n2 = (s - 1) / 2
	return n1 == int(n1) or n2 == int(n2)

if __name__ == "__main__":
	main()
