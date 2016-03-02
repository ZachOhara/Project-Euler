from common import sequence
import math

def main():
	print(squareNumsTo(46))

def squareNumbers():
	square = 1
	delta = 3
	while True:
		yield square
		square += delta
		delta += 2
		
def squareNumsTo(limit):
	return sequence.sequenceTo(squareNumbers, limit)

def squareTerms(terms):
	return sequence.sequenceTerms(squareNumbers, terms)

def isSquare(s):
	n = math.sqrt(s)
	return n == int(n)

if __name__ == "__main__":
	main()
